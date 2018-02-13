package com.abhishek.springStartProject.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Component
public class MailConfig {

	@Bean
	public MockMailSender mockMailSender1() {
		return new MockMailSender();
	}

	@Bean
	public MockMailSender2 mockMailSender2() {
		return new MockMailSender2();
	}
}
