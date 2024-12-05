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
<!-- Form cho Khách hàng -->
<form action="h_store" method="POST">
    <input type="hidden" name="S" value="OK" />
    <input type="hidden" name="A" value="homePage" />
    <input type="hidden" name="I" value="C" />
    <label for="customerId">Nhập ID tài khoản khách hàng:</label>
    <input type="number" id="customerId" name="C" required />
    <button type="submit">Khách hàng</button>
</form>
<!-- Form cho Người bán -->
<form action="h_store" method="POST">
    <input type="hidden" name="S" value="OK" />
    <input type="hidden" name="A" value="homePage" />
    <input type="hidden" name="I" value="S" />
    <label for="sellerId">Nhập ID tài khoản người bán:</label>
    <input type="number" id="sellerId" name="C" required />
    <button type="submit">Người bán</button>
</form>
<!-- Form cho Admin -->
<form action="h_store" method="POST">
    <input type="hidden" name="S" value="OK" />
    <input type="hidden" name="A" value="homePage" />
    <input type="hidden" name="I" value="A" />
    <label for="adminId">Nhập ID tài khoản Admin:</label>
    <input type="number" id="adminId" name="C" required />
    <button type="submit">Admin</button>
</form>
</body>
</html>
