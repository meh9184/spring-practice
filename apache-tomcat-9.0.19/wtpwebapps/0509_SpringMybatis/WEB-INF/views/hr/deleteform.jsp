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

<form action="./delete" method="post">
<input type="text" name="email" required="required"/>
<input type="hidden" name="empid" value="${emp.employeeId}"/>
<input type="submit" value="����" />
</form>

</body>
</html>