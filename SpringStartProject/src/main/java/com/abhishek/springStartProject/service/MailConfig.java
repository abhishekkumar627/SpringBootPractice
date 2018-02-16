package com.abhishek.springStartProject.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Component
public class MailConfig {

	@Bean
	//@Profile("dev")
	@ConditionalOnProperty(name="spring.mail.host",havingValue="foo",matchIfMissing=true)
	public MockMailSender mockMailSender1() {
		return new MockMailSender();
	}

	/*@Bean
	@Profile("!dev")
	public MockMailSender2 mockMailSender2() {
		return new MockMailSender2();
	}*/
	
	@Bean
	@ConditionalOnProperty("spring.mail.host")
	public SMTPMailSender smtpMailSender() {
		return new SMTPMailSender();
	}
}
