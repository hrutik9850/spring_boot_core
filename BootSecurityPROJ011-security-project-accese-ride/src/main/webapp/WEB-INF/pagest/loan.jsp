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

		<h1 style =" color:red;text-align:center">Loan Approval Page</h1><br>
		<b> u rapproved for loan amount ::<%=new Random().nextInt(1000000) %></b>
		<a href="./">Home</a>
</body>
</html>