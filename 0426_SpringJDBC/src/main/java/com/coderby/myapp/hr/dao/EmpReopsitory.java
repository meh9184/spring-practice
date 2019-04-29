package com.coderby.myapp.hr.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmpReopsitory implements IEmpRepository{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int getEmpCount() {
		String sql = "SELECT COUNT(*) FROM employees";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}
	
	public int getEmpCount(int deptId) {
		String sql = "SELECT COUNT(*) FROM employees WHERE department_id=?";
		return jdbcTemplate.queryForObject(sql, Integer.class, deptId);
	}
	
}
