package com.coderby.myapp.hello.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceProxy extends HelloService{
	
	@Override
	public String sayHello(String name) {
		HelloLog.log();
		String message = super.sayHello(name);
		return message;
	}
	
	@Override
	public String sayGoodbye(String name) {
		String message = "Goodbye~~~" + name;
		return message;
	}
	
}