<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원 가입 창입니다.</h1>
<form action="/member/join" method="post">
	아이디<input type="text" name="id" placeholder="ID" required><br/>
	비밀번호<input type="password" name="pw" placeholder="PASSWORD" required><br/>
	이름<input type="text" name="name" placeholder="NAME" required><br/>
	이메일<input type="text" name="email" placeholder="EMAIL" required><br/>
	주소<input type="text" name="address" placeholder="ADDRESS" required><br/>
	<input type="submit" value="가입">&nbsp;<input type="reset" value="초기화">
</form>
</body>
</html>