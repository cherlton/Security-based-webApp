<%-- 
    Document   : outcomeHigh
    Created on : 06 Jun 2024, 1:49:32 AM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Get Low Count Temp Employees</h1>
        <%
        Long cnt=(Long)request.getAttribute("cnt");
        %>
        <p>
            Number of employees with Low temperature is <b><%=cnt%></b>
        </p>
        <p>
            Please click <a href="index.html">here</a> to exit
            Please click <a href="menu.html">here</a> to go to menu
            Please click <a href="logoutServlet.do">here</a> to logout
        </p>
    </body>
</html>
