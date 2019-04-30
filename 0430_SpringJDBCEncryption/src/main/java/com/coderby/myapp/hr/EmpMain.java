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
		try {
			empService.insertEmp(emp);
			System.out.println("Insert ok");
		}catch(Exception e){
			e.printStackTrace();
		}
		EmpVO emp210 = empService.getEmpInfo(210);
		System.out.println(emp210);
		
		
		System.out.println("--- 수정된 사원의 정보를 조회 및 출력합니다.");
		emp210.setSalary(emp210.getSalary() * 1.1);
		emp210.setEmail("meh9184@naver.com");
		empService.updateEmp(emp210);
		System.out.println(emp210);

		
		System.out.println("전체 사원의 숫자");
		System.out.println(empService.getEmpCount());
		System.out.println("210 사원 삭제");
		empService.deleteEmp(210, "meh9184@naver.com");
		System.out.println("전체 사원의 숫자");
		System.out.println(empService.getEmpCount());
	}
}