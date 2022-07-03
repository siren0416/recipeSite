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
			
			$(".cancel_btn").on("click", function(){
				event.preventDefault();
				location.href = "/board";
			})
		})
	
	</script>
<body>
<%@ include file="header.jsp" %>
				<form name="update" role="form" method="post" action="update">
					<input type="hidden" name="m_no" value="${update.m_no}" readonly="readonly"/>
					<table>
						<tbody>
							<tr>
								<td>
									<label for="title">제목</label><input type="text" id="r_title" name="r_title" value="${update.r_title}"/>
								</td>
							</tr>	
							<tr>
								<td>
									<label for="content">내용</label><textarea id="r_content" name="r_content"><c:out value="${update.r_content}" /></textarea>
								</td>
							</tr>
							<tr>
								<td>
									<label for="writer">작성자</label><input type="text" id="r_writer" name="r_writer" value="${member.m_id}" readonly="readonly"/>
								</td>
							</tr>
						</tbody>			
					</table>
					<div>
						<button type="submit" class="update_btn">저장</button>
						<button type="submit" class="cancel_btn">취소</button>
					</div>
				</form>


	<%@ include file="footer.jsp" %> 
</body>
</html>
