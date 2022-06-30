<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <!-- meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0"/ -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>회원가입</title>
        <!-- Bootstrap -->
       <!--  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" type="text/css"/> -->
        <!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요한) -->
        <script src="http://code.jquery.com/jquery.js"></script>
        <!-- 모든 합쳐진 플러그인을 포함하거나 (아래) 필요한 각각의 파일들을 포함하세요 -->
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <!-- Respond.js 으로 IE8 에서 반응형 기능을 활성화하세요 (https://github.com/scottjehl/Respond) -->
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
		<link href="css/header/header.css" rel="stylesheet">
		<link href="css/mypage/mypage.css" rel="stylesheet">
		<link href="css/footer/footer.css" rel="stylesheet">
<title>mypage</title>
</head>
<body>
<!-- intro start -->
		<!-- 헤더 부분 -->
	<div class="intro_bg">
		<!-- nav 메뉴바 -->
		<div class="header">
			<!-- Search bar -->
			<div class="search_area">
				<form>
					<input type="search" placeholder="Search"> <span>검색</span>
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
		<div class="my_accountbox">
			<div class="container">
				<!-- 좌우측의 공간 확보 -->
				<!-- 헤더 들어가는 부분 -->
				<h2>마이페이지</h2>
				<br>
				<br>
				<div>
					
					<form action="nameupdate" method="POST">
						<input name="m_no" type="hidden" value="${member.m_no }">
						<p>이름 : ${member.m_name }</p>
						<input type="text" name="m_name" placeholder="수정할 이름을 적어주세요">
						<input type="submit" value="수정"> 
					</form><br>
				</div>
				<div>
					<form action="emailupdate" method="POST">
						<input name="m_no" type="hidden" value="${member.m_no }">
						<p>이메일 : ${member.m_email }</p>
						<input type="text" name="m_email" class="update_input" placeholder="수정할 이메일을 써주세요">
						<input type="submit" value="수정">
					</form><br>
				</div>
				<div>
					<form action="phoneupdate" method="POST">
						<input name="m_no" type="hidden" value="${member.m_no }">
						<p>이메일 : ${member.m_phone }</p>
						<input type="text" name="m_phone" class="update_input" placeholder="수정할 번호를 입력해주세요">
						<input type="submit" value="수정">
					</form><br>
				</div>
				<div>
					<form action="pwupdate" method="POST">
						<p>비밀번호 수정</p>
						<input name="m_no" type="hidden" value="${member.m_no }">
						<input id="password_1" type="hidden" value="${member.m_pw }"><br>
						
						<input id="password_2"	name="basicpw" type="text" placeholder="기존 비밀번호"> <input name="m_pw" type="text" placeholder="새 비밀번호">
						
						<input type="submit" value="수정">
					
					</form>
				</div>

			</div>
		</div>
	</div>
	<%@include file="footer.jsp" %>
</body>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
    $('#password_2').focusout(function () {
        var pwd1 = $("#password_1").val();
        var pwd2 = $("#password_2").val();
        console.log(pwd1);
        console.log(pwd2);
  
        if ( pwd2 == '' ) {
            
        	alert("기존비밀번호 입력하세요");
            
        } else if (pwd1 != "" || pwd2 != "") {
            if (pwd1 != pwd2) {
                alert("비밀번호가 일치하지 않습니다. 비밀번호를 재확인해주세요.");
                $("#alert-success").css('display', 'none');
                $("#alert-danger").css('display', 'inline-block');
            }
        }
    });
</script>
</html>