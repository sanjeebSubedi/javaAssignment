<%@page import="com.soch.login.loginDao.LoginDao"%>  
<jsp:useBean id="obj" class="com.soch.login.loginBean.LoginBean"/>  
  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
boolean status=LoginDao.validate(obj);  
if(status){  
out.println("You are successfully logged in!");  
session.setAttribute("session","TRUE");  
}  
else  
{  
out.print("Incorrect email or password!");  
%>  
<jsp:include page="index.jsp"></jsp:include>  
<%  
}  
%> 