package com.coderby.myapp.hr.dao;

import com.coderby.myapp.hr.model.EmpVO;
import java.util.List;


public interface IEmpRepository {
	int getEmpCount();
	int getEmpCount(int deptId);
	List<EmpVO> getEmpList();
}
