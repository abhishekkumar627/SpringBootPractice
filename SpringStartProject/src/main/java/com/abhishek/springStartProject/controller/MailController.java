package com.abhishek.springStartProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.springStartProject.service.MailSender;
import com.abhishek.springStartProject.service.MockMailSender;

@RestController
public class MailController {

	MailSender mailSender = new MockMailSender();

	@RequestMapping("/mail")
	public String mailSend() {
		mailSender.sendEmail("abhishek.kumar627@gmail.com", "Test email", "This is test body content");
		return "Mail Sent";
	}
}
