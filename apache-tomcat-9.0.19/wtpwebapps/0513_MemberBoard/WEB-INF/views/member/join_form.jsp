<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form action="/member/join" method="post">
<table border="1">
	<tr>
		<th>ID</th>
		<td><input type="text" name="id" required="required"/></td>
	</tr>
	<tr>
		<th>PW</th>
		<td><input type="text" name="pw" required="required"/></td>
	</tr>
	<tr>
		<th>NAME</th>
		<td><input type="text" name="name" required="required"/></td>
	</tr>
	<tr>
		<th>EMAIL</th>
		<td><input type="text" name="email" required="required"/></td>
	</tr>
	<tr>
		<th>ADDRESS</th>
		<td><input type="text" name="address" required="required"/></td>
	</tr>
	
</table>
</form>

</body>
</html>