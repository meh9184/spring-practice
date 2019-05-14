package com.coderby.myapp.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coderby.myapp.member.service.IMemberService;


@Controller
public class MemberController {
	
	@Autowired
	IMemberService memberService;
	
	@RequestMapping(value="/member/join", method=RequestMethod.GET)
	public String joinform(Model model) {
		
		return "member/join_form";
	}
}
