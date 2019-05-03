package com.coderby.myapp.hr.dao;

import java.util.List;

import com.coderby.myapp.hr.model.EmpVO;

public interface IEmpRepository {
	int getEmpCount();
	int getEmpCount(int deptid);
	List<EmpVO> getEmpList();
	EmpVO getEmpInfo(int empid);
	void insertEmp(EmpVO emp);
	void updateEmp(EmpVO emp);
	void deleteEmp(int empid, String email);
	void deleteJobHistory(int empid);
//	List<EmpVO> getAllDeptId();
//	List<EmpVO> getAllJobId();
//	List<EmpVO> getAllManagertId();
}
