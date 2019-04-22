package com.coderby.myapp.hello;

import org.springframework.context.support.GenericXmlApplicationContext;
import com.coderby.myapp.hello.controller.HelloController;

public class HelloMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("application-config.xml");
		
		HelloController controller = 
				context.getBean("helloController", HelloController.class);
		
		controller.Hello("¹®ÀºÈ¯");
		
		context.close();
	}

}
