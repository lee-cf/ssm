<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello World</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user2" method="post">
    <input type="hidden" name="action" value="update"/>
    用户名： <input type="text" name="username" value="${command.username}"/><br/>
    真实姓名：<input type="text" name="realname" value="${command.realname}"/><br/>
    <input type="submit" value="更新"/>
</form>
</body>
</html>  