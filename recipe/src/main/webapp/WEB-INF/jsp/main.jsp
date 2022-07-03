<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="preconnect" href="https://fonts.googleapis.com">
<meta charset="UTF-8">
<link href="css/main/main.css" rel="stylesheet"/>
<link href="css/footer/footer.css" rel="stylesheet">
<link href="css/header/header.css" rel="stylesheet">
<title>MainPage</title>
</head>
<body>
 <%@ include file="header.jsp" %> 
 
		<div class="wrap">
	<!-- amount start -->
		<ul class="amount">
			<li>
				<div>
					<div class="contents1">등록된 레시피 갯수</div>
					<div>갯수확인</div>
				</div>
			</li>
			<li>
				<div>
					<div class="contents1">관심 있는 레시피</div>
					<div>갯수확인</div>
				</div>			
			</li>
			<li>
				<div>
					<div class="contents1"><a href="/myboard?m_no=${member.m_no}">내 레시피</a></div>
					<div>등록된 레시피 갯수</div>
				</div>
			</li>
			<li>
				<div>
					<div class="contents1">레시피 등록</div>
					<div><button onclick="location.href='boardinsert'">등록하기</button></div>
				</div>
			</li>
		</ul>
		
		<!-- amount end -->
		
		<!-- menu insert start -->
		<div class="main_text0">
			<h1>ABOUT</h1>
				<div class="contents1">사이트 관련 옵션 내용 말로 알려준다</div>
			
			<ul class="icons">
				<li>
					<div class="icon_img">
						<img src="images/main/icon2.svg">
					</div>
					<div class="contents1_bold">오늘의 랜덤 레시피</div>
					<div class="contents2">오늘은 어떤 요리를 만들어볼까요?클릭해서 오늘의 요리를 검색해보세요.</div>
					<div class="more">more</div>	
				</li>
				<li>
					<div class="icon_img">
						<img src="images/main/icon0.svg">
					</div>
					<div class="contents1_bold">관심있는 레시피</div>
					<div class="contents2">이번 주말엔 내 레시피 모음에 있는 요리에 도전해보시는건 어떠세요?</div>
					<div class="more">more</div>	
				</li>
				<li>
					<div class="icon_img">
						<img src="images/main/icon1.svg">
					</div>
					<div class="contents1_bold">레시피 담기</div>
					<div class="contents2">평소에 관심 있는 음식이 있나요? 있다면 레시피를 검색해 보세요</div>
					<div class="more">more</div>	
					
				</li>
			</ul>
		</div>
		<!-- menu insert end -->

		<!-- menu2 insert start -->
		<div class="main_text1">
			<h1>YouTube SERVICE</h1>
			<div class="contents1">마음에 드는 레시피를 쉽고 빠르게 유튜브 동영상으로 볼 수 있어요</div>
			<div class="service">
				<div class="youtube1"><h3>레시피를 YouTube로 확인해보세요</h3></div>
					<div>
						<ul>
							<li><li>
							<li><li>
						</ul>
					</div>
				<div class="youtube2"><h3>레시피를 YouTube로 확인해보세요</h3></div>
				<div>
						<ul>
							<li><li>
							<li><li>
						</ul>
				</div>
			</div>
		</div>
		<!-- menu2 insert end -->
		<div class="footer_image"></div>
	</div>
		
 <%@ include file="footer.jsp" %> 
</body>
</html>