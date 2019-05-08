<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>사원 정보 삭제</title>
</head>
<body>
<h1>사원 정보 삭제</h1>

${emp.employeeId}사원 ${emp.firstName} ${emp.lastName}의 정보를 삭제합니다. 삭제 후 데이터는 복구될 수 없습니다. <br><br>

${emp.employeeId}사원의 이메일을 입력하세요 <br><br>

<form action="#" method="post">
<table border="1">
   <tr>
      <td><input type="text" name="email" required="required"/></td>
      <td><input type="submit" value="삭제" /></td>
   </tr>
</table>
</form>

</body>
</html>