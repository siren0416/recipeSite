<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="css/footer/footer.css" rel="stylesheet">
<link href="css/header/header.css" rel="stylesheet">
<link href="css/board/board.css" rel="stylesheet">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>

	<form action="boardinsert" method="post" class="insert_form">
		<div class="table_box">
			<table class="table" style="border:1px solid">
				<thead>
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>작성일</th>
						<th>작성자</th>
						<th>조회수</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list }" var="list">
						<tr>
							<td>${list.r_no }</td>
							<td>
								<a href="boarddetail?r_no=${list.r_no}"><c:out value="${list.r_title}" /></a>
							</td>
							<td><fmt:formatDate value="${list.r_date}" pattern="yyyy-MM-dd"/> </td>
							<td>${list.r_writer }</td>
							<td>${list.r_viewcnt }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
				<div class="button_sec">
					<button type="button" class="insert_button1" onclick="location.href='boardinsert'">글작성</button>
				</div>	
		</div>
	</form>

	<%@ include file="footer.jsp" %> 
</body>
</html>
