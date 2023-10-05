<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>STT</th>
        <th>ID</th>
        <th>Price</th>
        <th>Description</th>
        <th>Cate code</th>
        <th>Cate name</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="ct" varStatus="i">
        <tr>
            <td>${i.index}</td>
            <td>${ct.id}</td>
            <td>${ct.price}</td>
            <td>${ct.description}</td>
            <td>${ct.category.categoryCode}</td>
            <td>${ct.category.categoryName}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>