<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index Page</title>

<link rel="stylesheet" href="resources/css/style.css"/>

</head>
<body>
	<div class="container">
	<h2>회원 전용 시스템</h2>
			<form action="member.do">
			<fieldset>
			<legend>MEMBER LOGIN </legend>
			<input type="text" name="uid" placeholder="ID"/><br />
			<input type="password" name="upass" placeholder="PASSWORD"/><br /> 
			 <input type="hidden" name="cmd" value="login" />
			 <input type="hidden" name="dir" value="home" />
			 <input type="hidden" name="dest" value="welcome" />
				
			 	<div style="margin:5px;"></div>
			 <input type="submit" id="btn" value="LOGIN" />
			</fieldset>
				<a id ="admin-link" href="#">관리자</a>
				<a id ="join-link" href="#">회원가입</a>
		</form>
		<button onclick="move()"> 테스트</button>
	</div>

	<script>
/* 	location.assign('member.do?dest=join-form'); */
	/* window.onload = function(){
		
	} */
	/* 	document.getElementById('join-link')
		.addEventListener('click', function(){
			alert('회원가입 클릭!!');
			location.assign('member.do?dest=join-form');
		}); */
		//click 이벤트
		//move 이면 클릭이벤트가 리스닝되고
		//move() 이면 즉시 실행
		// 'click' function(){} 하면 콜백함수가 호출된다
		
	</script>
</body>
</html>