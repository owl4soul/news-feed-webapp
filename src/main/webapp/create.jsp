<%@ page import="com.github.owl4soul.models.Category" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: owl
  Date: 4/25/19
  Time: 1:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create news</title>
</head>
<body>
Create news
<form:form method="post" modelAttribute="createForm" lang="en">

    <tr bgcolor="#c8d8f8">
        <td valign=top>
            Name*
            <input type="text" name="name" value="" size=15 maxlength=255></td>
        <td valign=top>

            Content*
            <input type="text" name="content" value="" size=15></td>


            *Category
            <select name="category" size=5>
                <option>${Category.IT.name()}</option>
                <option>${Category.SCIENCE.name()}</option>
                <option>${Category.SPORT.name()}</option>
                <option>${Category.POLITICS.name()}</option>
                <option>${Category.OTHER.name()}</option>
            </select>

    </tr>
    <input type="submit" value="Create new news">
    </table>
</form:form>
</body>
</html>
