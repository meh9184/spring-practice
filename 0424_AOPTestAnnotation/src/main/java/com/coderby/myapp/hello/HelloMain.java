package com.coderby.myapp.hello;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.coderby.myapp.hello.controller.HelloController;
import com.coderby.myapp.hello.service.HelloService;
import com.coderby.myapp.hello.service.IHelloService;

public class HelloMain {

	public static void main(String[] args) {

		
		String[] path = {"application-config.xml"};
		
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext(path);
		
		HelloController controller = 
				context.getBean("helloController", HelloController.class);
		
		controller.Hello("문은환");
		
		System.out.println("===================");
		
		controller.Goodbye("문은환");
		
		context.close();
	}

}
