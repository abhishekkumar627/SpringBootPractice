package com.abhishek.springStartProject.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.springStartProject.service.MailSender;

@RestController
public class MailController {

	MailSender mailSender;

	// using setter injection
	// @Autowired
	// public void setMailSender(MailSender mock) {
	// this.mailSender = mock;
	// }

	// Using constructor injection
	// @Autowired
	// public MailController(MailSender mockMailSender2) {
	// this.mailSender=mockMailSender2;
	// }

	// Using Qualifier annotation
	// @Autowired
	// public MailController(@Qualifier("mockMailSender2") MailSender mockMailSe2) {
	// this.mailSender=mockMailSe2;
	// }

	// Using @Primary Annotation for injection
	public MailController(@Qualifier("mockMailSender1") MailSender mailSender) {
		this.mailSender = mailSender;
	}

	@RequestMapping("/mail")
	public String mailSend() {
		mailSender.sendEmail("abhishek.kumar627@gmail.com", "Test email", "This is test body content");
		return "Mail Sent";
	}
}
