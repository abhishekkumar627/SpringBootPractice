package com.abhishek.springStartProject.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@Component
public class MailConfig {

	@Bean
	@Profile("dev")
	public MockMailSender mockMailSender1() {
		return new MockMailSender();
	}

	@Bean
	@Profile("!dev")
	public MockMailSender2 mockMailSender2() {
		return new MockMailSender2();
	}
}
