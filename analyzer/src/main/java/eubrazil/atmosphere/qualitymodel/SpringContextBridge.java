package eubrazil.atmosphere.qualitymodel;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import eubrazil.atmosphere.service.spec.PrivacyService;
import eubrazil.atmosphere.service.spec.SpringContextBridgedServices;

@Component
public class SpringContextBridge implements SpringContextBridgedServices, ApplicationContextAware {

	private static ApplicationContext applicationContext;

	@Autowired
	private PrivacyService privacyService; //Autowire the PrivacyService

	@SuppressWarnings("static-access")
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public static SpringContextBridgedServices services() {
		return applicationContext.getBean(SpringContextBridgedServices.class);
	}

	
	@Override
	public PrivacyService getPrivacyService() {
		return privacyService;
	}

}
