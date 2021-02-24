<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>번호</td>
			<td>작성자</td>
			<td>내용</td>
			<td>삭제</td>
		</tr>

		<c:forEach items="${dtos}" var="dto">
			<tr> 
				<td>${dto.mId}</td>
				<td>${dto.mWriter}</td>
				<td>${dto.mContent}</td>
				<td><a href="${pageContext.request.contextPath}/delete?mId=${dto.mId}">X</a></td>
				
			</tr>
		</c:forEach>
	</table>
	<p>
		<a href="${pageContext.request.contextPath}/writeForm">글작성</a>
	</p>

</body>
</html>