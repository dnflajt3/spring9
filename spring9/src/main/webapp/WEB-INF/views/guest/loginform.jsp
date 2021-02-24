<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>NEVER</h1>
	<c:url value="j_spring_security_check" var="loginUrl"></c:url>
	<form action="${loginUrl}" method="post">
		<c:if test="${SPRING_SECURITY_LAST_EXCEPTION != NULL}">
		아이디 또는 비밀번호가 틀렸습니다.<br/>
		</c:if>
		<input type="text" name="j_username" placeholder="아이디"><br> 
		<input type="password" name="j_password" placeholder="비밀번호"><br> 
		<input type="submit" value="로그인">
	</form>

</body>
</html>
