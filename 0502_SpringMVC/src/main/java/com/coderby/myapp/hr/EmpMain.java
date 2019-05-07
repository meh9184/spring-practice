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

		System.out.println(empService.getAllDeptId());
		System.out.println(empService.getAllJobId());
		System.out.println(empService.getAllManagerId());
		
		
//		System.out.println("--- �쟾泥� �궗�썝�쓽 �닔 議고쉶");
//		System.out.println(empService.getEmpCount());
//		
//		System.out.println("--- �듅�젙 遺��꽌�쓽 �궗�썝 �닔 議고쉶");
//		System.out.println(empService.getEmpCount(50));
//		
//		System.out.println("--- �궗�썝 �쟾泥� �젙蹂대�� 議고쉶�빀�땲�떎");
//		System.out.println(empService.getEmpList());
//		
//		System.out.println("--- 100踰� �궗�썝�쓽 �젙蹂대�� 議고쉶�빀�땲�떎.");
//		System.out.println(empService.getEmpInfo(100));
//		
//		//吏곸썝 �엯�젰�쓣 �쐞�븳 VO媛앹껜 �깮�꽦
//		System.out.println("--- �깉濡쒖슫 �궗�썝 �젙蹂대�� �엯�젰�빀�땲�떎.");
//		EmpVO emp = new EmpVO();
//		emp.setEmployeeId(210);
//		emp.setFirstName("JongHun");
//		emp.setLastName("Chae");
//		emp.setEmail("jh@mail.net");
//		emp.setPhoneNumber("222-222");
//		emp.setJobId("IT_PROG");
//		emp.setSalary(30000);
//		emp.setCommissionPct(0.5);
//		emp.setManagerId(100);
//		emp.setDepartmentId(10);
//		try {
//			empService.insertEmp(emp);
//			System.out.println("Insert ok");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		//諛⑷툑異붽��븳 210踰� 怨꾩젙 議고쉶
//		EmpVO emp210 = empService.getEmpInfo(210);
//		System.out.println(emp210);
//		
//		//湲됱뿬 �씤�긽 �떆�궎湲�
//		emp210.setSalary(emp210.getSalary() * 1.1);
//		empService.updateEmp(emp210);
//		
//		//�뾽�뜲�씠�듃 �맂 �젙蹂� 異쒕젰�븯湲�
//		System.out.println("--�닔�젙�맂 �궗�썝�쓽 �젙蹂대�� 議고쉶 諛� 異쒕젰�빀�땲�떎.");
//		emp210 = empService.getEmpInfo(210);
//		System.out.println(emp210);
//		
//		//210踰� �궗�썝 �궘�젣�븯湲�
//		System.out.println("�쟾泥� �궗�썝�쓽 �닽�옄");
//		System.out.println(empService.getEmpCount());
//		System.out.println("210踰� �궗�썝 �궘�젣");
//		empService.deleteEmp(210, "jh@mail.net");
//		System.out.println("�궘�젣 �썑 �쟾泥� �궗�썝�쓽 �닽�옄");
//		System.out.println(empService.getEmpCount());
	}
}




