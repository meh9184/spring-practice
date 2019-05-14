package com.coderby.myapp.member.service;

import com.coderby.myapp.member.vo.MemberVO;

public interface IMemberService {
	void insertMember(MemberVO member);
	MemberVO checkId(String id);
	void deleteMember(String id, String pw);
	void updateMember(MemberVO member);
}
