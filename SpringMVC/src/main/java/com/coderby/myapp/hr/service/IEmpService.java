package com.coderby.myapp.hr.service;

import java.util.List;

import com.coderby.myapp.hr.model.EmpVO;

public interface IEmpService {
	int getEmpCount();
	int getEmpCount(int deptid);
	List<EmpVO> getEmpList();
	EmpVO getEmpInfo(int empid);
	void insertEmp(EmpVO emp);
	void updateEmp(EmpVO emp);
	void deleteEmp(int empid, String email);
}
