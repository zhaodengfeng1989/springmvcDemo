<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2019/3/21
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${userList}" var="user">
        <c:out value="${user.userName}"/><br/>
        <c:out value="${user.age}"/><br/>
    </c:forEach>
</body>
</html>
