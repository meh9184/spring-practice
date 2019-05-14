<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인 창입니다.</h1>
<form action="/member/login" method="post">
	아이디<input type="text" name="id" placeholder="ID" required><br/>
	비밀번호<input type="password" name="pw" placeholder="PASSWORD" required><br/>
	<input type="submit" value="로그인">&nbsp;<input type="reset" value="초기화">
</form>
</body>
</html>