package com.coderby.myapp.hello;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.coderby.myapp.hello.controller.HelloController;
import com.coderby.myapp.hello.service.HelloService;
import com.coderby.myapp.hello.service.IHelloService;

public class HelloMain {

	public static void main(String[] args) {
		// JAVA ����� ������ ���� �ڵ�
		
		//IHelloService helloService = new HelloService();
		/*//1. ������ ���� �ڵ�
		HelloController controller = new HelloController(helloService);
		*/
		
		//2. setter ���� �ڵ�
		//HelloController controller = new HelloController();
		//controller.setHelloService(helloService);
		
		//controller.Hello("ȫ�浿");
		///////////////////////////////////////////////////////////////////
		//Spring ����� ������ ���� �ڵ�
		
		String[] path = {"application-config.xml", "application-config1.xml"};
		
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext(path);
		
		HelloController controller = 
				context.getBean("helloController", HelloController.class);
		
		controller.Hello("ä����");
		
		context.close();
	}

}
