package com.coderby.myapp.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.coderby.myapp.hello.service.IHelloService;

@Controller
public class HelloController {

	// 어노테이션을 이용하여 의존성 주입 하는 순서
	// 1. application-config.xml 파일에 컴포넌트 스캔 추가
	// 2. 어노테이션을 통해 Bean 컨테이너에 객체 생성
	// 3. 의존성 주입이 필요한 객체에 @Autowired 삽입하여 의존성 주입

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
