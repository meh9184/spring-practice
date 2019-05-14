<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><b>${id}</b>계정을 삭제합니다.</h1>
<p>비밀번호를 정확하게 입력해주세요.</p>
<p>일단 탈퇴가 되면 계정 복구는 불가능합니다.</p>
<form action="delete" method="post">
	<input type="hidden" name="id" value="${id}">
	비밀번호<input type="password" name="pw" required/>
	<input type="submit" value="탈퇴하기" />
	<input type="reset" value="초기화" />
</form> 
</body>
</html>