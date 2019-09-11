package eubrazil.atmosphere.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eubrazil.atmosphere.service.impl.MetricService;
import eubrazil.atmosphere.service.impl.PreferenceService;

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
	private MetricService attributeService;

	@Autowired
	private PreferenceService preferenceService;
	
//	@CrossOrigin
//	@RequestMapping(value = "/save", method = RequestMethod.POST)
//	@ResponseBody
//	public void save(@RequestBody String input) {
//	
//		// load json values into object	
//		JSONObject json = new JSONObject(input);
//		JSONArray properties = json.getJSONArray("json");
//		
//		JSONObject item;
//		Preference p;
//		
//		// for each property (metric)
//		for(int i=0; i < properties.length(); i++) {
//    		// recover json object
//    		item = properties.getJSONObject(i);
//            
//            // update value into db
//            p = preferenceService.getPreferenceById(item.getInt("Id"));
//            p.setThreshold(item.getDouble("Threshold"));
//            p.setWeight(item.getDouble("Relevance"));
//            preferenceService.save(p);
//        }
// 	}
//	
//	@CrossOrigin
//	@RequestMapping(value = "/get", method = RequestMethod.GET, produces = "application/json")
//	@ResponseBody
//	public String get() {
//
//		JSONArray properties = new JSONArray();
//		JSONObject item;
//		Preference p;
//		Integer jobTime;
//
//		// for each property (also called attribute or metric)
//		for(Attribute a : attributeService.getAllAttributes()) {
//			// create a json object and include metric (id, name)
//			item = new JSONObject();
//			item.put("Id", a.getAttributeId());
//			item.put("Name", a.getName());
//			
//			// recover other values by Preference db table
//			p = preferenceService.getPreferenceById(a.getAttributeId());
//			
//			// recover job time by config.properties file
//			jobTime = Integer.parseInt(PropertiesManager.getInstance().getProperty("trigger.job.time").split("/")[1]);
//
//			// include other values
//			item.put("Relevance", p.getWeight());
//			item.put("Threshold", p.getThreshold());
//			item.put("Periodicity", jobTime);
//			
//			// add json object into array
//			properties.put(item);
//		}
//
//		return properties.toString();
//	}
}