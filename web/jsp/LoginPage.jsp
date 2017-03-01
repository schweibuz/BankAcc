<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
    <title>Login page</title>
</head>
<body>
<br>
<center>
    <h1>Вход в систему</h1>
    <%session.invalidate();
    System.out.println("Session close");
    %>
    <form action="/LoginServlet" method="GET">
        Пользователь:<input type="text" name="user" size="15"><br>
        Пароль:<input type="password" name="password" size="15"><br>
        <p>
            <small>
                <input type="submit" name="login" value="Войти в систему">
            </small>
    </form>
    <form action="/jsp/RegistrationPage.jsp">
        <input type="submit" name="registration" value="Зарегистрироваться">
    </form>
</center>
<br>
</body>
</html>
