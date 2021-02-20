<%-- 
    Document   : update_reservation
    Created on : Jan 15, 2021, 10:08:35 AM
    Author     : Alaa_Ibrahim
--%>

<%@page import="backend.Rooms"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="backend.Reservations"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

    <body>
        <%
            int res_id = Integer.parseInt(request.getParameter("res_id"));
            
            Reservations res = new Reservations();
            ResultSet rs = res.find_info(res_id);
            if (rs.next()) {
        %>
        <div class="jumbotron">
            <h1 class="display-4">Update reservation</h1>
        </div>
        <div class="container my-5">
            <form method="post" action="../update_res">
            <div class="form-row">

                <div class="form-group col-md-6">
                    <label for="checkInDate">Check in date</label>
                    <input type="datetime-local" name="check_in" class="form-control" >

                </div>
                <div class="form-group col-md-6">
                    <label for="checkOutDate">Check out date</label>
                    <input type="datetime-local" name="check_out" class="form-control" >
                </div>
            </div>

                        <input type="hidden" name="res_id" value=<%out.print(res_id);%>>
            <button type="submit" class="btn btn-primary">Submit</button>
            <%}%>
        </form>
        </div>
    </body>
</html>
