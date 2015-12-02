<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>

	<form action="adder">
		첫번째 수: <input type="text" name=num1 /><br />
		두번째 수: <input type="text" name=num2 /><br />
		<input type="submit" value="더하기" />
	</form>

	<%@include file="/WEB-INF/debug/debug.jsp"%>
</body>
</html>
