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
        <th>Code</th>
        <th>Name</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listCategory}" var="ct" varStatus="i">
        <tr>
            <td>${i.index}</td>
            <td>${ct.id1}</td>
            <td>${ct.categoryCode}</td>
            <td>${ct.categoryName}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>