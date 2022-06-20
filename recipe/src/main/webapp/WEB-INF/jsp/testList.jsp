<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>mariadb 연동 확인</h1>
	
	<table style="border:1px solid;">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>나이</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${list }" var="result">
				<tr>
					<td>${result.no }</td>
					<td>${result.name }</td>
					<td>${result.age }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	
	
	
</body>
</html>