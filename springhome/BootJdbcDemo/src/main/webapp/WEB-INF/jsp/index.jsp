<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New User Insertion Page</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<c:url var="jsurl" value="/js/jquery-3.4.1.min.js" />
<script src="${jsurl}"></script>
<script>
	$(document).ready(function() {
		alert("Hello, Spring Boot!");
	});
</script>
</head>
<body>
	<h1>New User Insertion Page</h1>
	<form action="/user" method="post">
		Name : <input type="text" name="username" /><br /> 
		Age : <input type="number" name="age" /><br />
		<button type="submit">Submit</button>
	</form>
</body>
</html>