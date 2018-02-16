package com.abhishek.springStartProject.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SMTPMailSender implements MailSender {

	Log log = LogFactory.getLog(SMTPMailSender.class);

	@Override
	public void sendEmail(String to, String subject, String body) {
		log.info("------------------------------------------------");
		log.info("SMTPMailSender Sending SMTP mail to --" + to);
		log.info("------------------------------------------------");
		log.info("SMTPMailSender with Subject --" + subject);
		log.info("------------------------------------------------");
		log.info("SMTPMailSender and body --" + body);
		log.info("------------------------------------------------");
	}

}
