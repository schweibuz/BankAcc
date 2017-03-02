<%@ page import="first.second.classes.Clients" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success Registration</title>
    <link href="/resouces/style.css"rel="stylesheet">
    <script src="/resouces/chnge.js"></script>
    <span id="clock"></span>
</head>
<body onload="olha()">
<br>
<center>
<h1>Registration was successful</h1>

    <% Clients currentUser = (Clients) session.getAttribute("currentSessionUser");%>

    Welcome <%=currentUser.getName()+" "+currentUser.getLast_name()%>

    <p>Please enter your login and password on Login Page to start</p>
    <form action="/jsp/LoginPage.jsp">
        <input type="submit" name="login" value="Log in">
    </form>
</center>
</body>
</html>
