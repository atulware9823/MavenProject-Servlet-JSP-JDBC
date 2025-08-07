<%@page import="com.brickstone.web.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>
</head>
<body>
	<%
		Student stud = (Student)session.getAttribute("student");
		out.println(stud);
	%>
</body>
</html>