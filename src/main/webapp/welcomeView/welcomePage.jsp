<%--
  Created by IntelliJ IDEA.
  User: maitr
  Date: 12/4/2024
  Time: 9:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>

<h2>Chào mừng đến với hệ thống!</h2>

<form action="h_store" method="POST">
    <input type="hidden" name="S" value="OK" />
    <input type="hidden" name="A" value="homePage" />
    <input type="hidden" name="I" value="C" />
    <button type="submit">Khách hàng</button>
</form>

<form action="h_store" method="POST">
    <input type="hidden" name="S" value="OK" />
    <input type="hidden" name="A" value="homePage" />
    <input type="hidden" name="I" value="S" />
    <button type="submit">Người bán</button>
</form>

<form action="h_store" method="POST">
    <input type="hidden" name="S" value="OK" />
    <input type="hidden" name="A" value="homePage" />
    <input type="hidden" name="I" value="A" />
    <button type="submit">Admin</button>
</form>

</body>
</html>
