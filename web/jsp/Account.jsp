<%@ page import="servlets.RegistrationServlet" %>
<%@ page import="first.second.classes.Clients" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success Registration</title>
</head>
<body>
<center>
    <% Clients currentUser = (Clients) session.getAttribute("currentSessionUser");%>
<h1>Hello <%=currentUser.getName()%>. It's your personal account</h1>
<%
    System.out.println(session.getAttribute("currentSessionUser"));
%>
<table border ="1">
    <c:forEach items="${requestScope.clients}" var="employee">
        <tr><td>Your Login:</td><td><c:out value="${employee.login}"/></td></tr>
        <tr><td>Name:</td><td><c:out value="${employee.name}"/></td></tr>
        <tr><td>Last Name:</td><td><c:out value="${employee.last_name}"/></td></tr>
        <tr><td>Country:</td><td><c:out value="${employee.land}"/></td></tr>
        <tr><td>City:</td><td><c:out value="${employee.city}"/></td></tr>
        <tr><td>Address:</td><td><c:out value="${employee.address}"/></td></tr>
        <tr><td>Credit card:</td><td><c:out value="${employee.credit_card}"/></td></tr>
        <tr><td>Phone number:</td><td><c:out value="${employee.phone}"/></td></tr>
        <tr><td>Email:</td><td><c:out value="${employee.email}"/></td></tr>
        <tr><td>Registration date:</td><td><c:out value="${employee.reg_date}"/></td></tr>
    </c:forEach>
    <c:forEach items="${requestScope.account}" var="employee">
        <tr><td>Salary:</td><td><c:out value="${employee.salary}"/></td></tr>
        <tr><td>Quarterly bonus:</td><td><c:out value="${employee.raise_salary}"/></td></tr>
        <tr><td>Other supply:</td><td><c:out value="${employee.income}"/></td></tr>
        <tr><td>Description:</td><td><c:out value="${employee.description}"/></td></tr>
    </c:forEach>
</table>
<form action="/jsp/LoginPage.jsp">
    <input type="submit" name="LOGOUT" value="Quit">
</form>
</center>
</body>
</html>
