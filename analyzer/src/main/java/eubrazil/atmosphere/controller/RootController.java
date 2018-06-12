package eubrazil.atmosphere.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>RootController.java</p>
 * @author JorgeLuiz
 */
@RestController
public class RootController {
	@RequestMapping("/")
	public String onRootAccess() {
		  return "Hello Atmosphere."
	                + "<br />Welcome to <a href='https://www.atmosphere-eubrazil.eu'>atmosphere page</a></li>";
	}
}
