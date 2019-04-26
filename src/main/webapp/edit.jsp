<%@ page import="com.github.owl4soul.models.News" %>
<%@ page import="com.github.owl4soul.controllers.EditNewsController" %>
<%@ page import="com.github.owl4soul.services.NewsService" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: owl
  Date: 4/26/19
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit news</title>
</head>
<body>

<form:form method="post" modelAttribute="newsForm" lang="en">

    <tr bgcolor="#c8d8f8">

        <td valign=top>
            Name*
            <input type="text" name="name" value="${name}" size=15 maxlength=20></td>

        <td valign=top>
            Content*
            <input type="text" name="content" value="${content}" size=15 maxlength=50></td>


        *Category
        <select name="category" size=10>
            <option>${Category.IT.name()}</option>
            <option>${Category.SCIENCE.name()}</option>
            <option>${Category.SPORT.name()}</option>
            <option>${Category.POLITICS.name()}</option>
            <option>${Category.OTHER.name()}</option>
        </select>

    </tr>
    <input type="submit" value="Update news">
    </table>
</form:form>
</body>
</html>
