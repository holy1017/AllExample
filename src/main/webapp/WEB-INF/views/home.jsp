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

	<ul>
		<li><a href="spring4-mvc-ajax-example/">spring4-mvc-ajax-example/</a></li>
		<li><a href="JspServlet/">JspServlet</a></li>
	</ul>
	
	<%@include file="/WEB-INF/debug/debug.jsp" %>
</body>
</html>
