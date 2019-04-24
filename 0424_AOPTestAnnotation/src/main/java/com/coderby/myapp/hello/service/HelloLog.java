package com.coderby.myapp.hello.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HelloLog{
	
	@Pointcut(value="execution(* com.coderby..*.sayHello(..))")
	private void helloPointcut() {}
	
	@Pointcut(value="execution(* com.coderby..*.sayGoodbye(..))")
	private void goodbyePointcut() {}

	public static void log() {
		System.out.println(">>>LOG : " + new java.util.Date());
		System.out.println("정상적으로 로딩 완료되었습니다.");
	}
	
	
}