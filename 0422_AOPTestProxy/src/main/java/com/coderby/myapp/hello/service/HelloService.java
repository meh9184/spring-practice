package com.coderby.myapp.hello.service;

public class HelloService implements IHelloService{

	@Override
	public String sayHello(String name) {
		System.out.println("HelloService.sayHello() �޼��� ����");
		String message = "Hello~~~" + name;
		return message;
	}

	public String sayGoodbye(String name) {
		String message = "Goodbye~~~" + name;
		return message;
	}

}