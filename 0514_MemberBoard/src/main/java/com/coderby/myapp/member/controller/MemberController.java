package com.coderby.myapp.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coderby.myapp.member.service.IMemberService;
import com.coderby.myapp.member.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	IMemberService memberService;
	
	@RequestMapping(value="/member/main")
	public String maincheck(HttpSession session, Model model) {
		if(session.getAttribute("id") != null) {
			model.addAttribute("id", session.getAttribute("id"));
			model.addAttribute("name", session.getAttribute("name"));
			return "/member/main_login";
		}else {
			return "/member/main_logout";
		}
	}

	@RequestMapping(value="/member/join", method=RequestMethod.GET)
	public String joinform(Model model) {
		return "/member/join_form";
	}

	@RequestMapping(value="/member/join", method=RequestMethod.POST)
	public String joinform(MemberVO member , Model model) {
		MemberVO uinfo = memberService.checkId(member.getId());
		if(uinfo != null) {
			model.addAttribute("id", member.getId());
			return "/member/join_fail";
		}	
		
		memberService.insertMember(member);
		
		model.addAttribute("memberId", member.getId());
		model.addAttribute("memberName", member.getName());
		return "/member/join_ok";
	}	
	
	@RequestMapping(value="member/login", method=RequestMethod.GET)
	public String memberLogin(Model model) {
		return "member/login_form";
	}
	
	@RequestMapping(value="member/login", method=RequestMethod.POST)
	public String memberLogin(String id, String pw, HttpSession session, Model model) {
		MemberVO uinfo = memberService.checkId(id);
		if(uinfo != null) {
			if(pw.equals(uinfo.getPw())) {
				session.setAttribute("id", id);
				session.setAttribute("pw", pw);
				session.setAttribute("name", uinfo.getName());
				return "member/login_ok";
			}
				return "member/login_pw_fail";
			}
		return "member/login_id_fail";
	}
	
	@RequestMapping(value="member/logout")
	public String logout(HttpSession session, Model model) {
		session.invalidate();
		return "redirect:/member/main";
	}
	
	@RequestMapping(value="member/delete", method=RequestMethod.GET)
	public String memberdelete(HttpSession session, Model model) {
		if(session.getAttribute("id") == null) {
			return "redirect:/member/main";
		}
		model.addAttribute("id", session.getAttribute("id"));
		return "member/delete_form";
	}
	
	@RequestMapping(value="member/delete", method=RequestMethod.POST)
	public String memberdelete(String pw, HttpSession session, Model model) {
		if(pw.equals(session.getAttribute("pw"))) {
			String id = (String)session.getAttribute("id");
			session.invalidate();
			memberService.deleteMember(id, pw);
			return "member/delete_ok";
		}else {
			return "member/delete_fail";
		}
	}
	
	@RequestMapping(value="/member/update", method=RequestMethod.GET)
	public String updateMember(HttpSession session, Model model) {
		if(session.getAttribute("id") != null) {
			MemberVO member = memberService.checkId((String)session.getAttribute("id"));
			model.addAttribute("member", member);
			return "member/update_form";
		}
		else {
			return "redirect:member/main";
		}
	}
	
	@RequestMapping(value="/member/update", method=RequestMethod.POST)
	public String updateMember(MemberVO member ,HttpSession session, Model model) {
		if(session.getAttribute("id") != null) {
			memberService.updateMember(member);
			return "redirect:member/main";
		}
		else {
			return "redirect:member/main";
		}
	}
	
}











