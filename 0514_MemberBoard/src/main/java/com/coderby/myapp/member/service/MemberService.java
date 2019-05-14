package com.coderby.myapp.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderby.myapp.member.dao.IMemberDao;
import com.coderby.myapp.member.vo.MemberVO;

@Service
public class MemberService implements IMemberService {
	
	@Autowired
	IMemberDao memberDao;

	@Override
	public void insertMember(MemberVO member) {
		memberDao.insertMember(member);
	}

	@Override
	public MemberVO checkId(String id) {	
		return memberDao.checkId(id);	
	}

	@Override
	public void deleteMember(String id, String pw) {
		memberDao.deleteMember(id, pw);
	}

	@Override
	public void updateMember(MemberVO member) {
		memberDao.updateMember(member);
	}
	
	
	
}





