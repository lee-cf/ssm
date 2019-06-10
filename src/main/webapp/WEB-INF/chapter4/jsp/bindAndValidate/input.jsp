<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<!-- 表单的命令对象名为dataBinderTest -->
<sf:form  commandName="dataBinderTest">
    <sf:errors path="*" cssStyle="color:red"></sf:errors><br/><br/>
    bool:<sf:input path="bool"/><br/>
    phoneNumber:<sf:input path="phoneNumber"/><br/>
    date:<sf:input path="date"/><br/>
    <input type="submit" value="提交"/>
</sf:form>
</html>