package com.coderby.myapp.member.dao;

import org.apache.ibatis.annotations.Param;

import com.coderby.myapp.member.vo.MemberVO;

public interface IMemberDao {
	
	void insertMember(MemberVO member);
	MemberVO checkId(String id);
	void deleteMember(@Param("id") String id, @Param("pw") String pw);
	void updateMember(MemberVO member);
}
