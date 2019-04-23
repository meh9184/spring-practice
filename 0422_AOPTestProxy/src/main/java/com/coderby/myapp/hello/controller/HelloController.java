package com.coderby.myapp.hello.controller;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Controller;

import com.coderby.myapp.hello.service.HelloService;
import com.coderby.myapp.hello.service.IHelloService;

@Controller
public class HelloController {
	
	@Resource(name="helloServiceProxy")
	IHelloService helloService;
	
	/*// 1. 생성자 의존성 주입
	public HelloController(IHelloService helloService) {
		this.helloService = helloService;
	}*/
	

	/*//2. setter 의존성 주입
	public void setHelloService(IHelloService helloService) {
		this.helloService = helloService;
	}*/
	
	
	public void Hello(String name) {
		System.out.println("HelloController : " + helloService.sayHello(name));
	}
}
