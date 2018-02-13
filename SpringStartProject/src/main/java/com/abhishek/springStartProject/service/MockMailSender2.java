package com.abhishek.springStartProject.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mockMailSender2")
public class MockMailSender2 implements MailSender {

	Log log = LogFactory.getLog(MockMailSender2.class);

	@Override
	public void sendEmail(String to, String subject, String body) {
		log.info("------------------------------------------------");
		log.info("MockMailSender2 Sending SMTP mail to --" + to);
		log.info("------------------------------------------------");
		log.info("MockMailSender2 with Subject --" + subject);
		log.info("------------------------------------------------");
		log.info("MockMailSender2 and body --" + body);
		log.info("------------------------------------------------");
	}

}
