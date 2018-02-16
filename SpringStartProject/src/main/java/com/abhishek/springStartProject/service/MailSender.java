package com.abhishek.springStartProject.service;

import javax.mail.MessagingException;

public interface MailSender {

	void sendEmail(String to, String subject, String body) throws MessagingException;
}
