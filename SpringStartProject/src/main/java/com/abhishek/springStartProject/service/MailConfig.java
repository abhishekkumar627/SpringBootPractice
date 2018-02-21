package com.abhishek.springStartProject.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
//@Component
public class MailConfig {
	
	@Bean
	public DemoBean demoBean() {
		//@Configuration cached the bean created while @Componect create new instance on call.
		return new DemoBean();
	}

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
	public SMTPMailSender smtpMailSender(JavaMailSender javaMailSender) {
		demoBean();
		return new SMTPMailSender(javaMailSender);
	}
}
