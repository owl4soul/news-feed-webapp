<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%--
  Created by IntelliJ IDEA.
  User: owl
  Date: 4/24/19
  Time: 8:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>NEWS</title>
</head>
<body>
Here is the list of all the news.

<table>
<c:forEach items="${listNews}" var="news">
    <tr>
        <td>${news.id}</td>
    </tr>
    <tr>
        <td>${news.name}</td>
    </tr>
    <tr>
        <td>${news.content}</td>
    </tr>
    <tr>
        <td>${news.date}</td>
    </tr>
    <tr>
        <td>${news.category}</td>
    </tr>
    <tr>
        <td>
        <form action="/edit" method="get">
            <input type="hidden" name="editId" value="${news.id}">
            <button type="submit" name="button" value="editButton">Edit news</button>
        </form>
        </td>

        <td><form action="/delete" method="get">
            <input type="hidden" name="editId" value="${news.id}">
            <button type="submit" name="button" value="deleteButton">Delete news</button>
        </form></td>
    </tr>
</c:forEach>
</table>

</body>
</html>
