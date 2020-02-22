<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User List</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<h1>User List</h1>
	<ul>
		<c:forEach var="user" items="${users}">
			<li>${user.username}(${user.age})</li>
		</c:forEach>
	</ul>
</body>
</html>