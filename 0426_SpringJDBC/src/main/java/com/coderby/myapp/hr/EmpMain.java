package com.coderby.myapp.hr;

import org.springframework.context.support.GenericXmlApplicationContext;
import com.coderby.myapp.hr.service.IEmpService;

public class EmpMain {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("spring/application-config.xml");
		
		IEmpService empService = context.getBean("empService", IEmpService.class);
	
		System.out.println("--- ��ü ��� �� ��ȸ");
		System.out.println(empService.getEmpCount());
		
		System.out.println("--- Ư�� �μ��� ��� �� ��ȸ");
		System.out.println(empService.getEmpCount(50));
		
	}
}