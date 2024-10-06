<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 style ="color:blue;text-align:center">showBalance Page</h1>
		<b> balance::<%=new Random().nextInt(10000) %></b>
		<a href="./">Home</a>
</body>
</html>