<%--
  Created by IntelliJ IDEA.
  User: owl
  Date: 4/26/19
  Time: 5:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Success</title>
</head>
<body>
Success.<br>
Mission Complete!<br>
<br>

To create a new news, click on the button:<br>
<input type="button" value="Create news" onClick='location.href="/create"'><br>
<br>
To view the news feed, click on the button:<br>
<input type="button" value="Show feed" onClick='location.href="/list"'><br>
<br>
To search through the news feed, click on the button:<br>
<input type="button" value="Search news" onClick='location.href="/search"'><br>
</body>
</html>
