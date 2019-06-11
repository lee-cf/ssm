<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello World</title>
</head>
<body>
<form:form commandName="user">

    <form:errors path="*" cssStyle="color:red"></form:errors><br/>

    username:<form:input path="username"/>
    <form:errors path="username" cssStyle="color:red"></form:errors>
    <br/>

    password:<form:password path="password"/>
    <form:errors path="password" cssStyle="color:red"></form:errors>
    <br/>
    <input type="submit" value="注册"/>
</form:form>
</body>
</html>  