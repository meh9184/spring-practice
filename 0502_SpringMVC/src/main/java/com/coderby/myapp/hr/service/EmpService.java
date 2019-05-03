package com.coderby.myapp.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderby.myapp.hr.dao.IEmpRepository;
import com.coderby.myapp.hr.model.EmpVO;

@Service
public class EmpService implements IEmpService {

	//하나 이상의 IEmpRepository의 쿼리문을 엮어서 하나의 서비스로 구성
	@Autowired
	IEmpRepository empRepository;
	
	@Override
	public int getEmpCount() {
		return empRepository.getEmpCount();
	}

	@Override
	public int getEmpCount(int deptid) {
		return empRepository.getEmpCount(deptid);
	}

	@Override
	public List<EmpVO> getEmpList() {
		return empRepository.getEmpList();
	}

	@Override
	public EmpVO getEmpInfo(int empid) {
		return empRepository.getEmpInfo(empid);
	}

	@Override
	public void insertEmp(EmpVO emp) {
		empRepository.insertEmp(emp);
	}

	@Override
	public void updateEmp(EmpVO emp) {
		empRepository.updateEmp(emp);
	}

	@Override
	@Transactional("txManager")
	public void deleteEmp(int empid, String email) {
		empRepository.deleteJobHistory(empid);
		empRepository.deleteEmp(empid, email);
	}
}



