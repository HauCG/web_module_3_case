<%--
  Created by IntelliJ IDEA.
  User: maitr
  Date: 12/5/2024
  Time: 12:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Test Home Page</title>
</head>
<body>
<c:choose>
    <c:when test="${identity == 'C'}">
        <p>Khách hàng</p>
        <p>ID của tài khoản: ${accId}</p>
    </c:when>
    <c:when test="${identity == 'S'}">
        <p>Người bán</p>
        <p>ID của tài khoản: ${accId}</p>
    </c:when>
    <c:when test="${identity == 'A'}">
        <p>Admin</p>
        <p>ID của tài khoản: ${accId}</p>
    </c:when>
    <c:otherwise>
        <p>Không xác định</p>
    </c:otherwise>
</c:choose>
</body>
</html>
