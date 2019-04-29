package com.coderby.myapp.hr;

import org.springframework.context.support.GenericXmlApplicationContext;
import com.coderby.myapp.hr.service.IEmpService;

public class EmpMain {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("spring/application-config.xml");
		
		IEmpService empService = context.getBean("empService", IEmpService.class);
	
		System.out.println("--- 전체 사원 수 조회");
		System.out.println(empService.getEmpCount());
		
		System.out.println("--- 특정 부서의 사원 수 조회");
		System.out.println(empService.getEmpCount(50));
		
	}
}