package com.abhishek.springStartProject.controller;

import javax.mail.MessagingException;

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
	/*public MailController(@Qualifier("mockMailSender1") MailSender mailSender) {
		this.mailSender = mailSender;
	}*/

	//Using profile thus only one bean is there
	public MailController(MailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	@RequestMapping("/mail")
	public String mailSend() throws MessagingException {
		mailSender.sendEmail("xdfsdfsdfsdfs@gmail.com", "Test email", "This is test body content");
		return "Mail Sent";
	}
}
