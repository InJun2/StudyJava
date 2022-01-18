<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>menu list</h1>
	
	<table border="1">
		<tr>
			<td>메뉴</td>
			<td>가격</td>
		</tr>
		<c:forEach items="${list}" var="m">
			<tr>
				<td>${m.menu}</td>
				<td>${m.price}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>