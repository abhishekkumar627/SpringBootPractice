package com.abhishek.springStartProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.springStartProject.service.MailSender;

@RestController
public class MailController {

	@Autowired
	MailSender mailSender ;

	@RequestMapping("/mail")
	public String mailSend() {
		mailSender.sendEmail("abhishek.kumar627@gmail.com", "Test email", "This is test body content");
		return "Mail Sent";
	}
}
