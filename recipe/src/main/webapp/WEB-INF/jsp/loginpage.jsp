<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/footer/footer.css" rel="stylesheet">
<link href="css/header/header.css" rel="stylesheet">
<link href="css/login/login.css" rel="stylesheet">
<title>Login</title>
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
						<li><a href="#">MYPAGE</a></li>
						<li><a href="login">로그인</a></li>
					</ul>
				</div>
		<div class="container">
			<section id="content">
				<form action="login" method="post">
					<h1>로그인</h1>
					<div>
						<input type="text" placeholder="UserID" name="m_id" id="m_id" />
					</div>
					<div>
						<input type="password" placeholder="Password" name="m_pw" id="m_pw" />
					</div>
					<div>
						<input type="submit" value="로그인" /> <a href="#">비밀 번호 찾기</a> <a href="register">회원가입</a>
					</div>
				</form>
				<!-- form -->

			</section>
			<!-- content -->
		</div>
		<!-- container -->
			</div>
			<!-- intro end -->
	<%@include file="footer.jsp" %>
</body>
</html>