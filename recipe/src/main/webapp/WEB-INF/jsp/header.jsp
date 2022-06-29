<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- intro start -->
		<!-- 헤더 부분 -->
			<div class="intro_bg">
			<!-- nav 메뉴바 -->
				<div class="header">
					<!-- Search bar -->
					<div class="search_area">
						<form >
							<input type="search" placeholder="Search">
							<span>검색</span>
						</form>
					</div>
					<!-- 오른쪽 퀵메뉴 -->
					<ul class="nav">
						<li><a href="main">HOME</a></li>
						<li><a href="/">레시피 검색</a></li>
						<li><a href="#">QNA</a></li>
						<li><a href="mypage">MYPAGE</a></li>
						
						<c:if test="${member == null }">
							<li><a href="loginpage">로그인</a></li>
						</c:if>
						
						<c:if test="${member != null }">
							<li><a href="logout">로그아웃</a></li>
						</c:if>
						
					</ul>
				</div>
			</div>
			<!-- intro end -->
</body>
</html>