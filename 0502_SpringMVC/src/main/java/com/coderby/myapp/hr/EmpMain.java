package com.coderby.myapp.hr;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.coderby.myapp.hr.model.EmpVO;
import com.coderby.myapp.hr.service.IEmpService;

public class EmpMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext context =
				new GenericXmlApplicationContext(
						"spring/application-config.xml");
		
		IEmpService empService = 
				context.getBean("empService", IEmpService.class);
	
		System.out.println("--- 전체 사원의 수 조회");
		System.out.println(empService.getEmpCount());
		
		System.out.println("--- 특정 부서의 사원 수 조회");
		System.out.println(empService.getEmpCount(50));
		
		System.out.println("--- 사원 전체 정보를 조회합니다");
		System.out.println(empService.getEmpList());
		
		System.out.println("--- 100번 사원의 정보를 조회합니다.");
		System.out.println(empService.getEmpInfo(100));
		
		//직원 입력을 위한 VO객체 생성
		System.out.println("--- 새로운 사원 정보를 입력합니다.");
		EmpVO emp = new EmpVO();
		emp.setEmployeeId(210);
		emp.setFirstName("JongHun");
		emp.setLastName("Chae");
		emp.setEmail("jh@mail.net");
		emp.setPhoneNumber("222-222");
		emp.setJobId("IT_PROG");
		emp.setSalary(30000);
		emp.setCommissionPct(0.5);
		emp.setManagerId(100);
		emp.setDepartmentId(10);
		try {
			empService.insertEmp(emp);
			System.out.println("Insert ok");
		}catch(Exception e) {
			e.printStackTrace();
		}
		//방금추가한 210번 계정 조회
		EmpVO emp210 = empService.getEmpInfo(210);
		System.out.println(emp210);
		
		//급여 인상 시키기
		emp210.setSalary(emp210.getSalary() * 1.1);
		empService.updateEmp(emp210);
		
		//업데이트 된 정보 출력하기
		System.out.println("--수정된 사원의 정보를 조회 및 출력합니다.");
		emp210 = empService.getEmpInfo(210);
		System.out.println(emp210);
		
		//210번 사원 삭제하기
		System.out.println("전체 사원의 숫자");
		System.out.println(empService.getEmpCount());
		System.out.println("210번 사원 삭제");
		empService.deleteEmp(210, "jh@mail.net");
		System.out.println("삭제 후 전체 사원의 숫자");
		System.out.println(empService.getEmpCount());
	}
}




