package com.coderby.myapp.hr;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.coderby.myapp.hr.model.EmpVO;
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
		
		System.out.println("--- 전체 사원 조회");
		System.out.println(empService.getEmpList());
		
		System.out.println("--- 특정 사원 조회");
		System.out.println(empService.getEmpInfo(101));
		
		System.out.println("--- 새로운 사원 정보를 입력합니다");
		EmpVO emp = new EmpVO();
		emp.setEmployeeId(210);
		emp.setFirstName("Eunhwan");
		emp.setLastName("Moon");
		emp.setEmail("meh9184@naver.com");
		emp.setPhoneNumber("010-5524-9184");
		emp.setJobId("IT_PROG");
		emp.setSalary(4200);
		emp.setCommissionPct(0.5);
		emp.setManagerId(100);
		emp.setDepartmentId(10);
		
		empService.insertEmp(emp);
		
		System.out.println(empService.getEmpInfo(210));
		
	}
}