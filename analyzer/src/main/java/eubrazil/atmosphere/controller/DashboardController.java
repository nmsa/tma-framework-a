package eubrazil.atmosphere.controller;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import eubr.atmosphere.tma.entity.qualitymodel.CompositeAttribute;
import eubr.atmosphere.tma.entity.qualitymodel.Metric;
import eubr.atmosphere.tma.entity.qualitymodel.MetricData;
import eubr.atmosphere.tma.entity.qualitymodel.Preference;

import eubrazil.atmosphere.repository.CompositeAttributeRepository;
import eubrazil.atmosphere.service.impl.CompositeAttributeService;
import eubrazil.atmosphere.repository.MetricRepository;
import eubrazil.atmosphere.service.impl.MetricService;
import eubrazil.atmosphere.repository.MetricDataRepository;
import eubrazil.atmosphere.service.impl.MetricDataService;
import eubrazil.atmosphere.repository.PreferenceRepository;
import eubrazil.atmosphere.service.impl.PreferenceService;
import eubrazil.atmosphere.config.appconfig.PropertiesManager;

/**
 * Dashboard Controller
 * @author JorgeLuiz
 * @version 1.0
 * @author Felipe Gaia
 */
@RestController
@RequestMapping("/dash")
@Controller
public class DashboardController {

public static final Logger LOGGER = LoggerFactory.getLogger(DashboardController.class); 

	@Autowired
	private CompositeAttributeService compositeAttributeService;
	
	@Autowired
	private MetricService metricService;

	@Autowired
	private MetricDataService metricDataService;

	@Autowired
	private PreferenceService preferenceService;
	
	@CrossOrigin
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public void save(@RequestBody String input) {
	
		// load json values into object	
		JSONObject json = new JSONObject(input);
		JSONArray properties = json.getJSONArray("json");
		
		JSONObject item;
		Preference p;
		
		// for each property (metric)
		for(int i=0; i < properties.length(); i++) {
    		// recover json object
    		item = properties.getJSONObject(i);
            
            // update value into db
            p = preferenceService.getPreferenceById(item.getInt("Id"));
            p.setThreshold(item.getDouble("Threshold"));
            p.setWeight(item.getDouble("Relevance"));
            preferenceService.save(p);
        }
 	}
	
	@CrossOrigin
	@RequestMapping(value = "/get", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String get() {

		JSONArray properties = new JSONArray();
		JSONObject item;
		Preference p;
		Integer jobTime;

		// for each property (also called attribute or metric)
		for(Metric m : metricService.getAllMetrics()) {
			// recover other values by Preference db table
			p = preferenceService.getPreferenceById(m.getMetricId());
			
			if(p != null) // show only metrics with Preference
			{
				// create a json object and include metric (id, name)
				item = new JSONObject();
				item.put("Id", m.getMetricId());
				item.put("Name", m.getMetricName());
			
				// recover job time by config.properties file
				jobTime = Integer.parseInt(PropertiesManager.getInstance().getProperty("trigger.job.time").split("/")[1]);

				// include other values
				item.put("Relevance", p.getWeight());
				item.put("Threshold", p.getThreshold());
				item.put("Periodicity", jobTime);
			
				// add json object into array
				properties.put(item);
			}
		}

		return properties.toString();
	}
	
	@CrossOrigin
	@RequestMapping(value = "/getroot", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String getroot() {

		JSONArray properties = new JSONArray();
		JSONObject item;
		Metric	m;

		// for each root property (also called attribute or metric)
		for(CompositeAttribute ca : compositeAttributeService.getAllRootCompositeAttributes()) {		
			// recover metric data
			m = metricService.getMetricById(ca.getId().getParentMetric());

			// create a json object and include metric (id, name)
			item = new JSONObject();
			item.put("Id", m.getMetricId());
			item.put("Name", m.getMetricName());

			// add json object into array
			properties.put(item);
		}

		return properties.toString();
	}
	
	@CrossOrigin
	@RequestMapping(value = "/scores", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String scores() {

		JSONArray properties = new JSONArray();

		// for each root property (also called attribute or metric)
		for(CompositeAttribute ca : compositeAttributeService.getAllRootCompositeAttributes()) {
		
			int metricId = ca.getId().getParentMetric();

			// add json object into array and include children
			properties.put(createItem(metricId, getChildren(metricId)));
		}

		return properties.toString();
	}
	
	private JSONArray getChildren(int id) {
		List<CompositeAttribute> ccas = compositeAttributeService.getAllChildrenCompositeAttributes(id);
		
		// base case
		if(ccas.isEmpty())
			return null;
	
		JSONArray pChildren = new JSONArray();
		
		for(CompositeAttribute ca : ccas) {
			// recover metric data and create the item
			int metricId = ca.getId().getChildMetric();

			// recursive call
			JSONArray recursive = getChildren(metricId);
			pChildren.put(createItem(metricId, recursive));
		}

		return pChildren;
	}
	
	private JSONObject createItem(int metricId, JSONArray children) {
		Metric	m = metricService.getMetricById(metricId);
		MetricData md = metricDataService.getLastMetricDataById(metricId);
		
		// create a json object and include metric (id, name, score, children)
		JSONObject item = new JSONObject();
		item.put("Id", m.getMetricId());
		item.put("Name", m.getMetricName());

		if(md != null)
			item.put("Score", md.getValue());
		else
			item.put("Score", "NA");
		
		// if is not base case, add results
		if(children != null)
			item.put("Children", children);
		else
			item.put("Children", new JSONArray()); // insert an empty array

		return item;
	}
}