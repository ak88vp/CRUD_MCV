<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Tien Dung
  Date: 11/29/2021
  Time: 3:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Sản Phẩm</h1>
<a href="/product?action=create">Thêm sản phẩm</a>

<table border="1px">
    <tr>
        <td>Tên</td>
        <td>Gía</td>
        <td>Mô tả</td>
        <td> Nhà sản xuất</td>
        <td>Sửa</td>
        <td>Xóa</td>
    </tr>
    <c:forEach items='${product}' var="pro" >
        <tr>
        <td><a href="/product?action=view">${pro.getName()}</a></td>
            <td>${pro.getPrice()}</td>
            <td>${pro.getDescription()}</td>
            <td>${pro.getProducer()}</td>
            <td><a href="/product?action=edit"> Edit</a> </td>
            <td><a href="/product?action=delete"> Delete</a> </td>

        </tr>
    </c:forEach>
</table>

</body>
</html>
