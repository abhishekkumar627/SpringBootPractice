package com.abhishek.springStartProject.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class SMTPMailSender implements MailSender {

	Log log = LogFactory.getLog(SMTPMailSender.class);
	
	private JavaMailSender javaMailSender;

	public SMTPMailSender(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	@Override
	public void sendEmail(String to, String subject, String body) throws MessagingException {
		
		log.info("------------------------------------------------");
		log.info("SMTPMailSender Sending SMTP mail to --" + to);
		log.info("------------------------------------------------");
		log.info("SMTPMailSender with Subject --" + subject);
		log.info("------------------------------------------------");
		log.info("SMTPMailSender and body --" + body);
		log.info("------------------------------------------------");
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper;

		helper = new MimeMessageHelper(message, true); // true indicates
 					  				                   // multipart message
		helper.setSubject(subject);
		helper.setTo(to);
		helper.setText(body, true); // true indicates html

		// continue using helper for more functionalities
        // like adding attachments, etc.  
		
		javaMailSender.send(message);
		
		log.info("SMTPMailSender Mail sent successfully");
		log.info("------------------------------------------------");
		
	}

}
