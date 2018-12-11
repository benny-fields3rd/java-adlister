<%--
  Created by IntelliJ IDEA.
  User: fieldsfury
  Date: 2018-12-11
  Time: 09:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<h1>Name Form</h1>
<form action="/name" method="POST">
    <div class="form-group">
        <label for="firstName">Enter First Name</label>
        <input id="firstName" name="firstName" class="form-control" type="text">
    </div>
    <input type="submit" class="btn btn-primary btn-block" value="Log In">
</form>
</body>
</html>
