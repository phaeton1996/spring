package com.casual.service.impl;

import com.casual.service.WelcomeService;

public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public String sayHello(String name) {
		System.out.println("hello,welcome to Spring," + name + "!");
		return "suc";
	}
}
