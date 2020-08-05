<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Directives</title>
</head>
<body>

<%@ page import="java.util.Date" %>
<%@ page errorPage = "error_page.jsp"  %>
<%@ include file= "welcome.jsp" %>

 Today is <%= new Date() %>
 Aajako Date <%= new Date() %>
 

</body>
</html>