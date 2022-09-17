<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<style type="text/css">
#left-block{
	background: skyblue;
	display: flex;
    align-items: center;
}
#right-block{
	border-top: solid skyblue;
	border-bottom: solid skyblue;
	border-right: solid skyblue; 
}

</style>
<title>TEST LOGIN</title>
</head>
<body>
<div class="container">
	<div class="row justify-content-sm-center mt-5">
		<div id="left-block" class="col-5">
			<div class="m-auto" id="innertext">
				<h1 class="display-1 font-monospace fw-bold text-white">TEST WEB</h1>
			</div>
		</div>
		<div id="right-block" class="col-5 p-5">
			<h1 class="text-center">로그인</h1>
			<form action="${pageContext.request.contextPath }/login" method="post" >
				<input type="text" class="form-control mt-2 mb-2" id="userId" name="userId" placeholder="아이디 입력">
				<input type="password" class="form-control mt-2 mb-2" id="userPw" name="userPw" placeholder="비밀번호 입력">
				<div class="d-grid gap-2">
					<input type="submit" class="btn btn-primary" id="submitBtn" value="로그인">
				</div>
			</form>
		</div>
	</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>