package com.coderby.myapp.hr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coderby.myapp.hr.dao.IEmpRepository;

@Service
public class EmpService implements IEmpService{
	
	@Autowired
	IEmpRepository empRepository;
	
	@Override
	public int getEmpCount() {
		return empRepository.getEmpCount();
	}
	
}
