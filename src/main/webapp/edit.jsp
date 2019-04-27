
<%@ page import="com.github.owl4soul.models.Category" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: owl
  Date: 4/26/19
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Edit news</title>
</head>
<body>

<form:form method="post" modelAttribute="newsForm" lang="en">

    <tr bgcolor="#c8d8f8">

        <td valign=top>
            Name*
            <input type="text" name="name" value="${name}" size=15 maxlength=255></td>

        <td valign=top>
            Content*
            <input type="text" name="content" value="${content}" size=15></td>


        *Category
        <select name="category" size=5>
            <c:forEach items="${Category.values()}" var="category">
                <option value="${category}">${category}</option>
            </c:forEach>
        </select>

    </tr>
    <input type="submit" value="Update news">
    </table>
</form:form>
</body>
</html>
