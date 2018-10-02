package eubrazil.atmosphere.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import eubrazil.atmosphere.entity.Properties;
import eubrazil.atmosphere.service.DashboardService;

/**
* <p>DashboardController.java</p>
* @author Jorge Luiz
* @version 1.0
 */
@RestController
@RequestMapping("/dash")
@Controller
public class DashboardController {

public static final Logger LOGGER = LoggerFactory.getLogger(PrivacyController.class); 
	
	@Autowired
	private DashboardService dashBoardService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public Properties save(@RequestBody Properties st) {
		System.out.println("Vtest1: " + st.getVtest1());
		System.out.println("Vtest2: " + st.getVtest2());
		dashBoardService.save(st.getVtest1(), st.getVtest2());
		
		return st;
	}
	
	
}
