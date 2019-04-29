package com.coderby.myapp.hr.dao;

import java.util.List;

import com.coderby.myapp.hr.model.EmpVO;


public interface IEmpRepository {
	int getEmpCount();
	int getEmpCount(int deptId);
	List<EmpVO> getEmpList();
	EmpVO getEmpInfo(int empId);
}
