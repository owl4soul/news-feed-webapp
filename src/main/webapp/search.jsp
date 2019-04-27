<%@ page import="com.github.owl4soul.models.Category" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: owl
  Date: 4/26/19
  Time: 7:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Search page</title>
</head>
<body>
Here is search


<form:form method="post" lang="en">

    <tr bgcolor="#c8d8f8">
        <td valign=top><form action="/search" method="post">
            Enter query*
            <input type="text" name="input" value="" size=50 maxlength=9999><br>



            *Category
            <select name="category" size=5>
                <c:forEach items="${Category.values()}" var="category">
                    <option value="${category}">${category}</option>
                </c:forEach>
            </select>

            <button type="submit" name="button" value="byName">Search by name</button>
            <button type="submit" name="button" value="byContent">Search by content</button>
            <button type="submit" name="button" value="byCategory">Search by category</button>

        </form></td>
    </tr>
    </table>
</form:form>
</body>
</html>
