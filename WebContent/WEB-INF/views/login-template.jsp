<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:getAsString name="title"/></title>
</head>
<body>
<div id = "left" style="height:60%;width:40%;float:left;text-align:left">
<tiles:insertAttribute name = "left"/>
</div>
<div id = "right" style="height:60%;width:40%;float:right;text-align:right">
<tiles:insertAttribute name = "right"/>
</div>
</body>
</html>