package com.abhishek.springStartProject.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("mock")
public class MockMailSender implements MailSender {

	Log log = LogFactory.getLog(MockMailSender.class);

	@Override
	public void sendEmail(String to, String subject, String body) {
		log.info("---------------------------");
		log.info("Sending SMTP mail to --" + to);
		log.info("---------------------------");
		log.info("with Subject --" + subject);
		log.info("---------------------------");
		log.info("and body --" + body);
		log.info("---------------------------");
	}

}
