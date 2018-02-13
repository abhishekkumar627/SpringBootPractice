package com.abhishek.springStartProject.service;

public interface MailSender {

	void sendEmail(String to, String subject, String body);
}
