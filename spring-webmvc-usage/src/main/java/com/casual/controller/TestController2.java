package com.casual.controller;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test2")
public class TestController2 implements InitializingBean {

	@RequestMapping("m1")
	@ResponseBody
	public String m1(@RequestParam("param")String param){
		System.out.println(param);
		return "aaa";
	}

	@RequestMapping("m2")
	@ResponseBody
	public String m2(){
		return "bbb";
	}

	@RequestMapping("m3")
	@ResponseBody
	public String m3(){
		return "ccc";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("interface InitializingBean test----------------------------------");
	}
}
