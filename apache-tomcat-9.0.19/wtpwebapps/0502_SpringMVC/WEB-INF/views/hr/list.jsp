<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1">

	<tr>
		<td>EMPLOYEE_ID</td>
		<td>FIRST_NAME</td>
		<td>LAST_NAME</td>
		<td>EMAIL</td>
		<td>PHONE_NUMBER</td>
		<td>HIRE_DATE</td>
		<td>JOB_ID</td>
		<td>SALARY</td>
		<td>COMMISSION_PCT</td>
		<td>MANAGER_ID</td>
		<td>DEPARTMENT_ID</td>
	</tr>

	<c:forEach var="emp" items="${empList}">
	<tr>
		<td><a href="<c:url value='${emp.empolyeeId}'/>">
			${emp.empolyeeId}
		</a></td>
		<td>${emp.firstName}</td>
		<td>${emp.lastName}</td>
		<td>${emp.email}</td>
		<td>${emp.phoneNumber}</td>
		<td>${emp.hireDate}</td>
		<td>${emp.jobId}</td>
		<td>${emp.salary}</td>
		<td>${emp.commissionPct}</td>
		<td>${emp.managerId}</td>
		<td>${emp.departmentId}</td>
	</tr>
	</c:forEach>
</table>


</body>
</html>