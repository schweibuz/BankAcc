<%@ page import="servlets.RegistrationServlet" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
    <title>Registration page</title>
    <link href="/resouces/style.css" rel="stylesheet">
    <script src="/resouces/chnge.js"></script>
    <script src="/resouces/validate.js"></script>
    <span id="clock"></span>
</head>
<body onload="olha()">
<%
    session.invalidate();
    System.out.println("Session close");
%>
<br>
<center>
    <h1>Registration page</h1>
    <form name="myForm" action="/RegistrationServlet" method="POST" onsubmit="return validateForm()">
        <%--onsubmit="return validate(this)"--%>
        <table>
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
                <td><input type="email" name="email" size="25"></td>
            </tr>
            <tr>
                <td>Credit card:</td>
                <td><input type="txt" name="credit_card" size="25"></td>
            </tr>
        </table>
        <br>
            <input type="submit" name="registration" value="Register">
            <input type="button" onclick="validate(this.form)" value="check">
            <input type="button" value="Quit" onclick="javascript:window.location='/jsp/LoginPage.jsp'">
            <%--<td><input type="button" value="cancel" onclick="history.back()" /></td>--%>

    </form>
</center>
</body>


<%--<body>--%>
<%--<form onsubmit="return checkForm(this)" action="index.php" method="post">--%>
    <%--<div id="contact-form">--%>
        <%--<div>--%>
            <%--<label for="fio" class="label">Ваше имя</label>--%>
            <%--<input type="text" value="" name="fio" id="fio" class="w-460" />--%>
            <%--&lt;%&ndash;<p id='err_fio' class='error'></p>&ndash;%&gt;--%>
        <%--</div>--%>
        <%--<div>--%>
            <%--<label for="phone" class="label">Телефон</label>--%>
            <%--<input type="text" value="" name="phone" id="phone" class="w-460" />--%>
        <%--</div>--%>
        <%--<input id="submit-form" type="submit" value="Оформить заказ" />--%>
    <%--</div>--%>
<%--</form>--%>

<%--<script type="text/javascript">--%>
    <%--function checkForm(form){--%>
        <%--if (document.getElementById('fio').value=="") {--%>

            <%--document.getElementById('err_fio').innerHTML='Введите имя';--%>
            <%--return false;--%>
        <%--};--%>
        <%--return true;--%>
    <%--};--%>
<%--</script>--%>
<%--</body>--%>

</html>
