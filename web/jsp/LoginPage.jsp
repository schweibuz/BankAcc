<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
    <title>Login page</title>
    <link href="/resouces/style.css"rel="stylesheet">
    <script src="/resouces/chnge.js"></script>
    <span id="clock"></span>
    <form>
        <select name="paint" id="paint">
            <option value=""> Default</option>
            <option value="#e6ffff">White</option>
            <option value="#ffd6cc">Red</option>
            <option value="#c1f0c1">Green</option>
        </select>

        <input type="button" onclick="change_color()" value="change" />
    </form></br>

</head>
<body onload="olha()">
<center>
    <h1>Bank current account customers</h1>
    <%session.invalidate();
    System.out.println("Session close");
    %>
    <form action="/LoginServlet" method="GET">
        <span style="font-family:'Courier New', monospace; padding-right:36px;">
            Login:</span><input type="text" name="user" size="20"><br>
        <span style="font-family:'Courier New', monospace; padding-right:7px;">
            Password:</span><input type="password" name="password" size="20"><br>

            <div1 class="panel"><input type="submit" name="login" value="Log in"> or</div1>

    </form>
    <form action="/jsp/RegistrationPage.jsp">
        <div2 class="panel"><input type="submit" name="registration" value="Registration"></div2>
    </form>

</center>
<br>
</body>
</html>
