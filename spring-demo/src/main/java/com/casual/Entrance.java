package com.casual;

import com.casual.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Entrance {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring/spring-config.xml");
		WelcomeService ws = (WelcomeService) app.getBean("welcomeService");
		WelcomeService ss = (WelcomeService) app.getBean("welcomeService");
		ws.sayHello("phaeton");
	}
}
