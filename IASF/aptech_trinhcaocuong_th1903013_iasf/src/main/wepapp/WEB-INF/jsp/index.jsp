<%--
  Created by IntelliJ IDEA.
  User: AD
  Date: 19-Jun-21
  Time: 9:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<h1>Index</h1>

<div class="w3-container">

    <table class="w3-table w3-striped">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Wage</th>
        </tr>
        <c:forEach var="e" items="${employees}">
            <tr>
                <td>${e.id}</td>
                <td>${e.name}</td>
                <td>${e.wage}</td>
            </tr>
        </c:forEach>

    </table>
</div>
