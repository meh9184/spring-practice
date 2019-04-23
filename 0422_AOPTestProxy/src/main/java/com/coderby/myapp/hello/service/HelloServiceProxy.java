package com.coderby.myapp.hello.service;

import org.springframework.stereotype.Component;

@Component("helloServiceProxy")
public class HelloServiceProxy extends HelloService {
	
	@Override
	public String sayHello(String name) {
		HelloLog.log();
		return super.sayHello(name);
	}
	
	@Override
	public String sayGoodbye(String name) {
		return "Goodbye~" + name;
	}
}
