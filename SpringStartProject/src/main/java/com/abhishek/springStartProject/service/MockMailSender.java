package com.abhishek.springStartProject.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MockMailSender implements MailSender {

	Log log = LogFactory.getLog(MockMailSender.class);

	@Override
	public void sendEmail(String to, String subject, String body) {
		log.info("Sending SMTP mail to --" + to);
		log.info("with Subject --" + subject);
		log.info("and body --" + body);
	}

}
