package com.coderby.myapp.hr.service;

import java.util.List;
import com.coderby.myapp.hr.model.EmpVO;

public interface IEmpService {
	int getEmpCount();
	int getEmpCount(int deptId);
	List<EmpVO> getEmpList();
}
