<%@ page import="com.github.owl4soul.models.Category" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: owl
  Date: 4/25/19
  Time: 1:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Create news</title>
</head>
<body>
Create news
<br>
<form:form method="post" modelAttribute="createForm" lang="en">

    <tr bgcolor="#c8d8f8">
        <td valign=top>
            Name*
            <input type="text" name="name" value="" size=25 maxlength=255></td>
        <td valign=top>

            Content*
            <input type="text" name="content" value="" size=50></td>


        *Category
        <select name="category" size=5>
            <c:forEach items="${Category.values()}" var="category">
                <option value="${category}">${category}</option>
            </c:forEach>
        </select>

    </tr>
    <input type="submit" value="Create new news">
    </table>
</form:form>
</body>
</html>
