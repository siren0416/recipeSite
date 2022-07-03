<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="css/footer/footer.css" rel="stylesheet">
<link href="css/header/header.css" rel="stylesheet">
<link href="css/board/board.css" rel="stylesheet">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
		$(document).ready(function(){
			var formObj = $("form[name='updateForm']");
			
			// 수정 
			$(".update_btn").on("click", function(){
				formObj.attr("action", "updateView");
				formObj.attr("method", "get");
				formObj.submit();				
			})
			
			// 삭제
			$(".delete_btn").on("click", function(){
				formObj.attr("action", "delete");
				formObj.attr("method", "post");
				formObj.submit();
			})
			
			// 취소
			$(".list_btn").on("click", function(){
				
				location.href = "/board";
			})
		})
	</script>
<body>
<%@ include file="header.jsp" %>

	<form action="updateView" class="insert_form" name="updateForm" method="post">
	
		<div class="table_box">
			<table class="table">
				<tbody>
					<tr>
						<td>
							<label for="r_no">글번호</label><input type="text" id="r_no" name="r_no" value="${boarddetail.r_no }">
						</td>
					</tr>
					<tr>
						<td>
							<label for="r_no">제목</label><input type="text" id="r_title" name="r_title" value="${boarddetail.r_title }">
						</td>
					</tr>
					<tr>
						<td>
							<label for="r_content">내용</label><textarea id="r_content" name="r_content"><c:out value="${boarddetail.r_content}" /></textarea>
						</td>
					</tr>										
				</tbody>
			</table>
				<div class="button_sec">
					<button type="button" class="insert_button1" onclick="location.href='board'">레시피 목록</button>
				</div>	
					<button type="submit" class="update_btn">수정</button>
					<button type="submit" class="delete_btn">삭제</button>
		</div>
	</form>

	<%@ include file="footer.jsp" %> 
</body>
</html>
