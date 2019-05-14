package com.coderby.myapp;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.coderby.myapp.member.service.MemberService;
import com.coderby.myapp.member.vo.MemberVO;

public class testMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("spring/application-config.xml");
		
		MemberService s1 = context.getBean("memberService", MemberService.class);
		
		MemberVO m1 = new MemberVO();
		m1.setId("dak");
		m1.setPw("1234");
		m1.setName("닭강정");
		m1.setEmail("email");
		m1.setAddress("주소");
		
		s1.insertMember(m1);
		
		
	}

}
