package com.coderby.myapp.hr.service;

import java.util.List;

import com.coderby.myapp.hr.model.EmpVO;


public interface IEmpService {
	int getEmpCount();
	int getEmpCount(int deptId);
	List<EmpVO> getEmpList();
	EmpVO getEmpInfo(int empId);
	void insertEmp(EmpVO emp);
	void updateEmp(EmpVO emp);
	void deleteEmp(int empId, String email);
}
