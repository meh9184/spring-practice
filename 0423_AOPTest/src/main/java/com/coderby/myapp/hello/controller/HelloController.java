package com.coderby.myapp.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.coderby.myapp.hello.service.IHelloService;

@Controller
public class HelloController {

	// ������̼��� �̿��Ͽ� ������ ���� �ϴ� ����
	// 1. application-config.xml ���Ͽ� ������Ʈ ��ĵ �߰�
	// 2. ������̼��� ���� Bean �����̳ʿ� ��ü ����
	// 3. ������ ������ �ʿ��� ��ü�� @Autowired �����Ͽ� ������ ����

	@Autowired
//	@Qualifier("helloServiceProxy")
	IHelloService helloService;

	public void Hello(String name) {
		System.out.println("HelloController : " + helloService.sayHello(name));
	}
	
	public void Goodbye(String name) {
		System.out.println("HelloController : " + helloService.sayGoodbye(name));
	}
}