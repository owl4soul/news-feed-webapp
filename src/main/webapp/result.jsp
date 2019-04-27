<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: owl
  Date: 4/26/19
  Time: 9:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result of searching</title>
</head>
<body>
Results here:

<table>

    <c:forEach items="${filteredList}" var="news">
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

