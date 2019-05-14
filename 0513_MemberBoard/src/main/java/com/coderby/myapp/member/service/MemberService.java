package com.coderby.myapp.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderby.myapp.member.dao.IMemberDao;
import com.coderby.myapp.member.vo.MemberVO;

@Service
public class MemberService implements IMemberService{

	@Autowired
	IMemberDao memberDao;
	
	@Override
	public void insertMemeber(MemberVO member) {
		memberDao.insertMember(member);
	}
	
	
	
}
