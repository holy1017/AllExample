<%@ page contentType="text/html; charset=UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>

<head>

<title>Home</title>

</head>

<body>

	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>

	<hr />

	<form action="adder">
		첫번째 수: <input type="text" name=num1 />
		<br />
		두번째 수: <input type="text" name=num2 />
		<br />
		<input type="submit" value="더하기" />
	</form>
	<br />

	<hr />

	<form action="bbs-post" method="post">
		이름: <input type="text" name=name />
		<br />
		제목: <input type="text" name=title />
		<br />
		<textarea name="content" id="" cols="30" rows="10"></textarea>
		<br />
		<input type="submit" value="저장" /> <input type="reset" value="취소" />
	</form>

	<hr />

	<form action="info" method="post">
		이름: <input type="text" name=name />
		<br />
		아이디: <input type="text" name=id />
		<br />
		암호: <input type="password" name=pw />
		<br />
		<br />
		성별: <input type="radio" name=gender value=m id=radio_m /><label
			for="radio_m">남</label> <input type="radio" name=gender value=f
			id=radio_f /><label for="radio_f">여</label>
		<br />
		<br />
		메일 수신 여부: <input type="checkbox" name=inotice value=f id=checkbox_in /><label
			for="checkbox_in">공지메일</label> <input type="checkbox" name=cnotice
			value=f id=checkbox_cn /><label for="checkbox_cn">광고메일</label> <input
			type="checkbox" name=dnotice value=f id=checkbox_dn /><label
			for="checkbox_dn">배송메일</label>
		<br />
		<br />
		직업: <select name="job" id="">
			<option >학생</option>
			<option >회사원</option>
			<option >기타</option>
		</select>
		<br />
		<br />
		<input type="submit" value="확인" /> <input type="reset" value="지우기" />
	</form>

	<%@include file="/WEB-INF/debug/debug.jsp"%>

</body>
</html>
