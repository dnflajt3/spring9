<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>	NEVER CAFE	</h1><br>

<s:authorize access="isAuthenticated()">
	<s:authentication property="principal.username"/>님 &nbsp
	<a href="j_spring_security_logout">로그아웃</a>
</s:authorize>



</body>
</html>