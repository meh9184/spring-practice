<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원정보 입력</title>
</head>
<body>

<h1>사원정보 입력</h1>

<form action="#" method="post">
<table border="1">
   <tr>
      <th>EMPLOYEE_ID</th>
      <td><input type="number" name="employeeId" required="required"/></td>
   </tr>
   <tr>
      <th>FIRST_NAME</th>
      <td><input type="text" name="firstName" required="required"/></td>
   </tr>
   <tr>
      <th>LAST_NAME</th>
      <td><input type="text" name="lastName" required="required"/></td>
   </tr>
   <tr>
      <th>EMAIL</th>
      <td><input type="text" name="email" required="required"/></td>
   </tr>
   <tr>
      <th>PHONE_NUMBER</th>
      <td><input type="text" name="phoneNumber" required="required"/></td>
   </tr>
   <tr>
      <th>HIRE_DATE</th>
      <td><input type="date" name="hireDate" required="required"/></td>
   </tr>
   <tr>
      <th>JOB_ID</th>
      <td><input type="text" name="jobId" required="required"/></td>
   </tr>
   <tr>
      <th>SALARY</th>
      <td><input type="number" name="salary" required="required"/></td>
   </tr>
   <tr>
      <th>COMMISSION_PCT</th>
      <td><input type="number" name="commissionPct" 
               step="0.1" min="0" max="0.99" required="required"/>
      </td>
   </tr>
   <tr>
      <th>MANAGER_ID</th>
      <td><input type="number" name="managerId" required="required"/></td>
   </tr>
   <tr>
      <th>DEPARTMENT_ID</th>
      <td><input type="number" name="departmentId" required="required"/></td>
   </tr>
   <tr>
      <th>&nbsp;</th>
      <td>
         <input type="submit" value="저장" />
         <input type="reset" value="초기화" />
      </td>
   </tr>
</table>
</form>
</body>
</html>