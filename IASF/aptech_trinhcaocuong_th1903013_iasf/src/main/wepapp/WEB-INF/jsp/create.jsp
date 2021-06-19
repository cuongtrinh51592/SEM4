<%--
  Created by IntelliJ IDEA.
  User: AD
  Date: 19-Jun-21
  Time: 9:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en" xmlns:th="http://www.springframework.org/schema/data/jaxb">
<head>
    <meta charset="UTF-8">
    <title>Add Student</title>
    <link type="text/css" rel="stylesheet" href="bootstrap.min.css" th:href="@{bootstrap.min.css}"/>
</head>
<body>
<div class="col-3"></div>
<div class="container col-6">
    <h1>New Student</h1>
    <div class="col-md-auto">
        <form th:object="${employee}" th:action="@{save}" action="#" method="post">
            <div>
                <label th:text="Name" th:for="name"></label>
                <input type="text" th:field="*{name}" class="form-control" placeholder="Name"/>
            </div>
            <div style="clear: both; display: block; height: 10px"></div>
            <div>
                <label th:text="Wage" th:for="wage"></label>
                <input type="text" th:field="*{wage}" class="form-control" placeholder="Wage"/>
            </div>
            <div style="clear: both; display: block; height: 10px"></div>
            <input type="submit" class="btn btn-success" value="Save"/>
        </form>
    </div>
</div>
</body>
</html>
