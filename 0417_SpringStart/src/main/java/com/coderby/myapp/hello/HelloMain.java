package com.coderby.myapp.hello;

import org.springframework.context.support.GenericXmlApplicationContext;
import com.coderby.myapp.hello.controller.HelloController;

public class HelloMain {

	public static void main(String[] args) {
		// JAVA 방식의 의존성 주입 코드
		
		//IHelloService helloService = new HelloService();
		/*//1. 생성자 의존 코드
		HelloController controller = new HelloController(helloService);
		*/
		
		//2. setter 의존 코드
		//HelloController controller = new HelloController();
		//controller.setHelloService(helloService);
		
		//controller.Hello("홍길동");
		///////////////////////////////////////////////////////////////////
		//Spring 방식의 의존성 주입
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("application-config.xml");
		
		HelloController controller = 
				context.getBean("helloController", HelloController.class);
		
		controller.Hello("Eunhwan Moon");
		
		context.close();
	}

}
