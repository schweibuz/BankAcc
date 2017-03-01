<%@ page import="servlets.RegistrationServlet" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
    <title>Registration page</title>
</head>
<body>
<%session.invalidate();
    System.out.println("Session close");%>
<br>
<center>
    <form action="/RegistrationServlet" method="POST">
        <table border="1">
            <caption>New User Registration</caption>
            <tr>
                <td>Login:</td>
                <td><input type="text" name="user" size="25"></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="password" size="25"></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><input type="txt" name="name" size="25"></td>
            </tr>
            <tr>
                <td>Last name:</td>
                <td><input type="txt" name="last_name" size="25"></td>
            </tr>
            <tr>
                <td>Country:</td>
                <td><input type="txt" name="country" size="25"></td>
            </tr>
            <tr>
                <td>City:</td>
                <td><input type="txt" name="city" size="25"></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><input type="txt" name="address" size="25"></td>
            </tr>
            <tr>
                <td>Phone number:</td>
                <td><input type="txt" name="phone_number" size="25"></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="txt" name="email" size="25"></td>
            </tr>
            <tr>
                <td>Credit card:</td>
                <td><input type="txt" name="credit_card" size="25"></td>
            </tr>
        </table>
        <tr><br>
            <td><input type="submit" name="registration" value="Sign up"></td>
            <%--<td><input type="button" value="cancel" onclick="history.back()" /></td>--%>

    </form>
            <form action="/jsp/LoginPage.jsp">
                <input type="submit" name="quit" value="Quit">
            </form>
        </tr>

</center>
</body>
</html>
