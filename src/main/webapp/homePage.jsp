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
    <title>Title</title>
</head>
<body>
<c:choose>
    <c:when test="${identity == 'C'}">
        <p>khách hàng</p>
    </c:when>
    <c:when test="${identity == 'S'}">
        <p>người bán</p>
    </c:when>
    <c:when test="${identity == 'A'}">
        <p>admin</p>
    </c:when>
</c:choose>
</body>
</html>
