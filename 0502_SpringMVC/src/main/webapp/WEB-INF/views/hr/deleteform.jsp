<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>��� ���� ����</title>
</head>
<body>
<h1>��� ���� ����</h1>

${emp.employeeId}��� ${emp.firstName} ${emp.lastName}�� ������ �����մϴ�. ���� �� �����ʹ� ������ �� �����ϴ�. <br><br>

${emp.employeeId}����� �̸����� �Է��ϼ��� <br><br>

<form action="#" method="post">
<table border="1">
   <tr>
      <th>EMAIL</th>
      <td><input type="text" name="email" required="required"/></td>
   </tr>
</table>
</form>

</body>
</html>