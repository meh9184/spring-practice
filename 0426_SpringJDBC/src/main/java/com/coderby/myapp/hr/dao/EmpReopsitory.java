package com.coderby.myapp.hr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.coderby.myapp.hr.model.EmpVO;


@Repository
public class EmpReopsitory implements IEmpRepository{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	// RowMapper 인터페이스 구현
	private class EmpMapper implements RowMapper<EmpVO>{
		@Override
		public EmpVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			EmpVO emp = new EmpVO();			
			emp.setEmployeeId(rs.getInt("employee_id"));
			emp.setFirstName(rs.getString("first_name"));
			emp.setLastName(rs.getString("last_name"));
			emp.setEmail(rs.getString("email"));
			emp.setPhoneNumber(rs.getString("phone_number"));
			emp.setHireDate(rs.getDate("hire_date"));
			emp.setJobId(rs.getString("job_id"));
			emp.setSalary(rs.getDouble("salary"));
			emp.setCommissionPct(rs.getDouble("commission_pct"));
			emp.setManagerId(rs.getInt("manager_id"));
			emp.setDepartmentId(rs.getInt("department_id"));
			return emp;
		}
	}
	
	@Override
	public int getEmpCount() {
		String sql = "SELECT COUNT(*) FROM EMPLOYEES";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}
	
	@Override
	public int getEmpCount(int deptId) {
		String sql = "SELECT COUNT(*) FROM EMPLOYEES WHERE department_id=?";
		return jdbcTemplate.queryForObject(sql, Integer.class, deptId);
	}
	
	@Override
	public List<EmpVO> getEmpList(){
		String sql = "SELECT * FROM EMPLOYEES";
		return jdbcTemplate.query(sql, new EmpMapper());
	}

	@Override
	public EmpVO getEmpInfo(int empId) {
		String sql = "SELECT * FROM EMPLOYEES WHERE employee_id=?";
		return jdbcTemplate.queryForObject(sql, new EmpMapper(), empId);
	}
	
}
