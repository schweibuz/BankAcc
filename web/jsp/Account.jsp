<%@ page import="servlets.RegistrationServlet" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success Registration</title>
</head>
<body>
<center>
<h1>Hello. It's your personal account</h1>
<%
    System.out.println(session.getAttribute("currentSessionUser"));
%>
<table border ="1">
    <c:forEach items="${requestScope.clients}" var="employee">
        <tr><td><c:out value="${employee.name}">guest></c:out></td></tr>
        <tr><td><c:out value="${employee.last_name}"/></td></tr>
        <tr><td><c:out value="${employee.land}"/></td></tr>
        <tr><td><c:out value="${employee.city}"/></td></tr>
        <tr><td><c:out value="${employee.address}"/></td></tr>
        <tr><td><c:out value="${employee.credit_card}"/></td></tr>
        <tr><td><c:out value="${employee.phone}"/></td></tr>
        <tr><td><c:out value="${employee.email}"/></td></tr>
        <tr><td><c:out value="${employee.login}"/></td></tr>
        <tr><td><c:out value="${employee.password}"/></td></tr>
        <tr><td><c:out value="${employee.reg_date}"/></td></tr>
        <tr><td><c:out value="${employee.salary}"/></td></tr>
        <tr><td><c:out value="${employee.raise_salary}"/></td></tr>
        <tr><td><c:out value="${employee.income}"/></td></tr>
        <tr><td><c:out value="${employee.description}"/></td></tr>
    </c:forEach>
</table>
<form action="/jsp/LoginPage.jsp">
    <input type="submit" name="LOGOUT" value="LOG OUT">
</form>
</center>
</body>
</html>
