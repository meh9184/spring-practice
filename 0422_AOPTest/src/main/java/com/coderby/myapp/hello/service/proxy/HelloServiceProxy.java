package com.coderby.myapp.hello.service.proxy;

import org.springframework.stereotype.Service;

import com.coderby.myapp.hello.service.HelloLog;
import com.coderby.myapp.hello.service.HelloService;

@Service
public class HelloServiceProxy extends HelloService{
	@Override
	public String sayHello(String name) {
		HelloLog.log();
		
		super.sayHello("¹®ÀºÈ¯");
		
		return null;
	}
	
}