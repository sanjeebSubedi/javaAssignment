<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome .jsp</title>
</head>
<body>
<!-- scriplet Tag (scripting element) -->

<% out.print("Welcome " +request.getParameter("name")); %>

<br/>
<!-- expression tag (scripting element-->
<%= "welcome from expression "+ request.getParameter("name") %>

<br/>
<!--  Declarative Tag (Scripting Element -->
<%! String getName() {
	return "Jack";
}
%>
<%= getName() %>

</body>
</html>