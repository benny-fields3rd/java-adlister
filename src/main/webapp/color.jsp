<%--
  Created by IntelliJ IDEA.
  User: fieldsfury
  Date: 2018-12-11
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Color</title>
</head>
<body>
<form action="/colorPicker.jsp" method="POST">
    <div class="form-group">
        <label for="color">Enter a color</label>
        <input id="color" name="color" class="form-control" type="text">
    </div>
    <input type="submit" class="btn btn-primary btn-block" value="Submit">
</form>
</body>
</html>
