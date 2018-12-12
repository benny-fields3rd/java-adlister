<%--
  Created by IntelliJ IDEA.
  User: fieldsfury
  Date: 2018-12-11
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Ads</title>
</head>
<body>
    <h1>Ads Listed</h1>

    <c:forEach items="${ads}" var="ad">
    <h2>Title: ${ad.title}</h2>
    <p>Description: ${ad.description}</p>
    </c:forEach>
</body>
</html>
