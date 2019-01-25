<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="register-form">
<p>사원 등록</p>
	<form action="employee.do">
		사원번호: <br><input type="text" name="id"  /><br>
		이 름: <br><input type="password" name="pass"  /><br >
		매니저: <br><input type="text" name="name"  /><br >
		생년월일: <br ><input type="text" name="ssn"  /><br />
		상세: <br /><input type="text" name="height" /><br />
		
	<br><input type="submit" id="btn" value="사원등록"/>
	</form>

</div>


