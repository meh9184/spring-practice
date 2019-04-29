package com.coderby.myapp.hr.dao;

import com.coderby.myapp.hr.model.EmpVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository
public class EmpReopsitory implements IEmpRepository{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	// RowMapper 구현 클래스 설정
	private class EmpMapper implements RowMapper<EmpVO>{
		@Override
		public EmpVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			EmpVO emp = new EmpVO();			
			emp.setEmployeeId(rs.getInt("employeeId"));
			emp.setFirstName(rs.getString("firstName"));
			emp.setLastName(rs.getString("lastName"));
			emp.setEmail(rs.getString("email"));
			emp.setPhoneNumber(rs.getString("phoneNumber"));
			emp.setHireDate(rs.getDate("hireDate"));
			emp.setJobId(rs.getString("jobId"));
			emp.setSalary(rs.getDouble("salary"));
			emp.setCommissionPct(rs.getDouble("commissionPct"));
			emp.setManagerId(rs.getInt("managerId"));
			emp.setDepartmentId(rs.getInt("departmentId"));
			return emp;
		}
	}
	
	@Override
	public int getEmpCount() {
		String sql = "SELECT COUNT(*) FROM employees";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}
	
	@Override
	public int getEmpCount(int deptId) {
		String sql = "SELECT COUNT(*) FROM employees WHERE department_id=?";
		return jdbcTemplate.queryForObject(sql, Integer.class, deptId);
	}
	
	@Override
	public List<EmpVO> getEmpList(){
		String sql = "SELECT * FROM employees";
		return jdbcTemplate.query(sql, new EmpMapper());
	}
	
}
