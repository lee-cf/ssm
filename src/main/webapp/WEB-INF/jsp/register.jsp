<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello World</title>
</head>
<body>
<form method="post">
    username:<input type="text" name="username" value="${user.username}"><br/>
    password:<input type="password" name="password"><br/>
    city:
    <select>
    <c:forEach items="${cityList}" var="city">
        <option>${city}</option>
    </c:forEach>
    </select><br/>
    <input type="submit" value="注册"/>
    <input type="submit" name="_cancel" value="取消"/>
</form>
</body>
</html>  