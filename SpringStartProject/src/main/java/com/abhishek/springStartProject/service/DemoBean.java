package com.abhishek.springStartProject.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DemoBean {

	Log log= LogFactory.getLog(DemoBean.class);
	
	public DemoBean() {
		log.info("------------------------------------------------");
		log.info("Demobean object created -");		
	}

	
	
}
