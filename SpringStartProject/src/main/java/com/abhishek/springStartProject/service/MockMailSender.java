package com.abhishek.springStartProject.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("mock")
//@Primary
public class MockMailSender implements MailSender {

	Log log = LogFactory.getLog(MockMailSender.class);

	@Override
	public void sendEmail(String to, String subject, String body) {
		log.info("---------------------------");
		log.info("MockMailSender Sending SMTP mail to --" + to);
		log.info("---------------------------");
		log.info("MockMailSender with Subject --" + subject);
		log.info("---------------------------");
		log.info("MockMailSender and body --" + body);
		log.info("------------------------------");
	}

}
