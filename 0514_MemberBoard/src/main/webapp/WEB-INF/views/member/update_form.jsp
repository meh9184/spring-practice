<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원 정보 수정 창입니다.</h1>
<form action="update" method="post">
	아이디<input type="text" name="id" value="${member.id}" readonly><br/>
	비밀번호<input type="password" name="pw" placeholder="PASSWORD" required><br/>
	이름<input type="text" name="name" value="${member.name}" placeholder="NAME" required><br/>
	이메일<input type="text" name="email" value="${member.email}" placeholder="EMAIL" required><br/>
	주소<input type="text" name="address" value="${member.address}" placeholder="ADDRESS" required><br/>
	<input type="submit" value="수정">&nbsp;<input type="reset" value="초기화">
</form>
</body>
</html>