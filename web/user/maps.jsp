<%-- 
    Document   : maps
    Created on : Jan 14, 2021, 2:00:19 PM
    Author     : Walaa Ibrahim
--%>

<%@page import="java.net.URI"%>
<%@page import="java.awt.Desktop"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="backend.Hotel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%  Hotel h=new Hotel();
        // out.print(request.getParameter("id"));
           int id=Integer.parseInt(request.getParameter("hotel_id"));
           out.print(id);
            ResultSet rs= h.find_map(id);
           //out.print(id);
            //out.print(request.getParameter("id"));
           
            if(rs.next()){
                 String location=rs.getString("location_on_map");
                 
                 response.sendRedirect(location);
           // out.print(location);
         //   Desktop desktop = java.awt.Desktop.getDesktop();
       //  URI oURL = new URI(location);
       //  desktop.browse(oURL);
            }
           
        %>
    </head>
    <body>
        
    </body>
</html>
