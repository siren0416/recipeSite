<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<h1>레시피 등록</h1>
	<section id="container" class="insert_sec">
		<form role="form" class="insert_form" method="post" action="boardinsert">
		<input type="hidden" name="r_writer">
			<table>
				<tbody>
					<tr>
						<td><label for="title">제목</label>
						<input type="text" id="r_title" name="r_title" /></td>
					</tr>
					<tr>
						<td><label for="content">내용</label>
						<textarea id="r_content" name="r_content"></textarea></td>
					</tr>
					<tr>
						<td><label for="writer">작성자</label>
						<input type="text" id="r_writer" name="r_writer" value="${member.m_id }"/></td>
					<tr>
						<td>
							<button class="insert_button" type="submit">작성</button>
						</td>
					</tr>
				</tbody>
			</table>
		</form>
	</section>
	<%@ include file="footer.jsp" %> 
</body>
</html>