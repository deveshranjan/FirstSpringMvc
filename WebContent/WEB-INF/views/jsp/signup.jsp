<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
${msg}
<sf:form id="SignUpForm" action = "SignUp" method = "post" modelAttribute="users">
<sf:label id="userlabel" path="username">
UserName
<span>*</span>
</sf:label>
<br/>
<sf:input id="username" path="username" name="username"/>
<br/>
<sf:errors path="username"/>
<br/>
<sf:label id="passlevel" path="password">
Password
<span>*</span>
</sf:label>
<br/>
<sf:input id="password" path="password" name="password"/>
<br/>
<sf:errors path="password"/>
<input type="submit" value = "SignUp"/>
</sf:form>
</body>
</html>



    
