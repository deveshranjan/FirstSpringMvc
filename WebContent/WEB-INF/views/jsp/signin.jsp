<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign In</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
${inv_msg}
<sf:form id="loginForm" action = "login" method = "post" modelAttribute="users">
<sf:label id="userlabel" path="username">
UserName
<span>*</span>
</sf:label>
<br/>
<sf:input id="username" path="username" name="username"/>
<br/>
<sf:label id="userlevel" path="password">
Password
<span>*</span>
</sf:label>
<br/>
<sf:input id="password" path="password" name="password"/>
<br/>
<input type="submit" value = "login"/>
</sf:form>
</body>
</html>



    
