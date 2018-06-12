package eubrazil.atmosphere.controller;

import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import eubrazil.atmosphere.entity.Privacy;
import eubrazil.atmosphere.repository.PrivacyRepository;

/**
* <p>PrivacyController.java</p>
* @author Jorge Luiz
* @version 1.0
 */
@RestController
@RequestMapping("/privacy")
@Controller
public class PrivacyController {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(PrivacyController.class); 
	
	@Autowired
	private PrivacyRepository repository;
	
	@RequestMapping("/list")
	public String list() {
	    //Privacy p = this.repository.findAll().iterator().next();
	    StringBuilder sb = new StringBuilder();
	    Iterator<Privacy> ip = this.repository.findAll().iterator();
	    while(ip.hasNext()){
	    	sb.append(ip.next());
	    }
	    return sb.toString();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Privacy get(@PathVariable("id") long id) {
		return this.repository.findOne(id);
	}
	
	@RequestMapping("/lastMeasure")
	public Privacy getLastMeasure() {
		List<Privacy> privacyList = this.repository.getLastMeasure();
		if (privacyList != null && !privacyList.isEmpty()) {
			return privacyList.get(0);
		}
		return null;
	}
}