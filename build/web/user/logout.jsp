<%-- 
    Document   : logout
    Created on : Jan 15, 2021, 8:57:14 AM
    Author     : Alaa_Ibrahim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        HttpSession se=request.getSession();
        se.setMaxInactiveInterval(0);
        response.sendRedirect("../login.jsp");
        %>
    </body>
</html>
