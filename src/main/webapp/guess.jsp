<%--
  Created by IntelliJ IDEA.
  User: fieldsfury
  Date: 2018-12-11
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile");
        }
    }
%>
<html>
<head>
    <title>Guess</title>
</head>
<body>
<form action="" method="POST">
    <div class="form-group">
        <label for="number">Enter a number from 1-100:</label>
        <input id="number" name="number" class="form-control" type="text">
    </div>
    <input type="submit" class="btn btn-primary btn-block" value="Submit">
</form>
</body>
</html>
