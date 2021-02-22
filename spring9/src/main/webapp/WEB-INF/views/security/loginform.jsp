<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>loginform.jsp</h1>
	<c:url value="j_spring_security_check" var="loginUrl"></c:url>
	<form action="${loginUrl}" method="post">
		<c:if test="${param.ng != null }">
			Login NG!<br />
			<c:if test="${SPRING_SECURITY_LAST_EXCEPTION != NULL}">
			message : <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/><br/>
			</c:if>
		</c:if>
		ID:<input type="text" name="j_username"><br> PW:<input
			type="password" name="j_password"><br> <input
			type="submit" value="LOGIN">
	</form>

</body>
</html>
