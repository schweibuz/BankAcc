<%@ page import="first.second.classes.Clients" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <%--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />--%>
    <title>Admin</title>
        <link href="/resouces/style.css"rel="stylesheet">
        <script src="/resouces/chnge.js"></script>
        <span id="clock"></span>
    <center><h1>Welcome to admin page.</h1></center>
</head>
<body onload="olha()">

<form action="/AddSalary" method="POST">
    <table border="1">
        <caption>Add salary to Employees</caption>
        <tr>
            <td>id user:</td>
            <td><input type="txt" name="id" size="25"></td>
        </tr>
        <tr>
            <td>Salary:</td>
            <td><input type="txt" name="salary" size="25"></td>
        </tr>
        <tr>
            <td>Quarterly bonus:</td>
            <td><input type="txt" name="raise_salary" size="25"></td>
        </tr>
        <tr>
            <td>Other supply:</td>
            <td><input type="txt" name="income" size="25"></td>
        </tr>
        <tr>
            <td>Description:</td>
            <%--<td><input type="txt" name="description" size="40" height="200"></td>--%>
            <td><textarea name="description" style="display:block;width:350px;height:100px"></textarea></td>

        </tr>
    </table>
    <br/>
    <input type="submit" name="addSalary" value="Confirm">
    <input type="button" value="Quit" onclick="javascript:window.location='/jsp/LoginPage.jsp'">
</form>
<br/>
<table border="1">
    <caption>Employees</caption>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Last name</th>
        <th>Country</th>
        <th>City</th>
        <th>Address</th>
        <th>Credit card</th>
        <th>Phone number</th>
        <th>Email</th>
        <th>Login</th>
        <th>Password</th>
        <th>Registration date</th>
        <th>Salary</th>
        <th>Quarterly bonus</th>
        <th>Other supply</th>
        <th>Description</th>
    </tr>
    <c:forEach items="${requestScope.employees}" var="employee">
    <tr>
        <td>${employee.id}</td>
        <td><c:out value="${employee.name}"/></td>
        <td><c:out value="${employee.last_name}"/></td>
        <td><c:out value="${employee.land}"/></td>
        <td><c:out value="${employee.city}"/></td>
        <td><c:out value="${employee.address}"/></td>
        <td><c:out value="${employee.credit_card}"/></td>
        <td><c:out value="${employee.phone}"/></td>
        <td><c:out value="${employee.email}"/></td>
        <td><c:out value="${employee.login}"/></td>
        <td><c:out value="${employee.password}"/></td>
        <td><c:out value="${employee.reg_date}"/></td>
        <td><c:out value="${employee.salary}"/></td>
        <td><c:out value="${employee.raise_salary}"/></td>
        <td><c:out value="${employee.income}"/></td>
        <td><c:out value="${employee.description}"/></td>
        <td>
            <a href="delete?id=${employee.id}">
                <img src="delete.png">
            </a>
        </td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
