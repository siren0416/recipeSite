<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
	
	window.onload = function() {
		document.getElementById('submit').onclick = function() {
			
			if ( document.pfrm.id.value.trim() == '' ) {
				alert( 'ID를 입력해주세요' );
				return false;
			}
			if ( document.pfrm.mail.value.trim() == '' ) {
				alert( '메일을 입력해주세요' );
				return false;
			}
			document.pfrm.submit();
		}
	}
</script>

<title>비밀번호 찾기</title>
</head>
<body>
	<div class="pwFind-form">
		<form action="pwFindForm_ok" method="post" class="form-horizontal"
			name="pfrm">

			<div class="row">
				<div align="center">
					<h2>비밀번호 찾기</h2>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-form-label col-4">아이디</label>
				<div class="col-8">
					<input type="text" class="form-control" name="id"
						placeholder="아이디를 입력하세요." required="required">
				</div>
			</div>

			<div class="form-group row">
				<label class="col-form-label col-4">이메일</label>
				<div class="col-8">
					<input type="text" class="form-control" name="mail"
						placeholder="메일을 입력하세요." required="required">
				</div>
			</div>
			<div class="form-group row">
				<button type="submit" id="submit" class="btn btn-primary btn-lg">비밀번호
					찾기</button>
			</div>

		</form>
	</div>
</body>
</html>