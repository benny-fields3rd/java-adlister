<%--
  Created by IntelliJ IDEA.
  User: fieldsfury
  Date: 2018-12-10
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Login Page</title>
    </head>
    <body>
        <h1>Please Login</h1>
        <%
        if (request.getMethod().equalsIgnoreCase("POST")) {
        String uname = request.getParameter("username");
        String pwd = request.getParameter("password");
        if(uname!= null && pwd != null)
        if(uname.equals("admin") && pwd.equals("password"))
            response.sendRedirect("profile.jsp");
        }
        %>
        <form method="POST" action="">
            <div class="container">
                <label for="uname"><b>Username</b></label>
                <input type="text" placeholder="Enter Username" name="uname" required>

                <label for="pwd"><b>Password</b></label>
                <input type="password" placeholder="Enter Password" name="pwd" required>

                <button type="submit">Login</button>
            </div>
        </form>
    </body>
</html>
