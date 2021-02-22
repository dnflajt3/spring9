<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	String contextPath = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=contextPath%>/write">
		<table border="1">
			<tr>
				<td>작성자</td>
				<td><input type="text" name="mWriter"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><input type="text" name="mContent"></td>
			</tr>
			<tr>
				<td><input type="submit" value="입력"></td>
				<td><a href="<%=contextPath%>/list">목록보기</a> </td>
			</tr>
		</table>

	</form>

</body>
</html>