<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" 
               pageEncoding="UTF-8"%>
<c:set var="list" value="${memberlist}" />
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<ul>
	<c:forEach items="${list}" var="member">
		<li>${member}</li>
	</c:forEach>
</ul>
</body>
</html>
