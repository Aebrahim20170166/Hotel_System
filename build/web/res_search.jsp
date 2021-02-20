<%-- 
    Document   : reservations
    Created on : Dec 31, 2020, 11:55:28 AM
    Author     : Alaa_Ibrahim
--%>
<%

    HttpSession se = request.getSession(false);
    if (se.getAttribute("user_id") == null) {
        response.sendRedirect("login.jsp");
    }%>
<%@page import="backend.Rooms"%>
<%@page import="backend.Reservations"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="backend.user"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="navbar.html" />
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <div class="container-fluid">
            <div class="row mb-2">
                <div class="col-sm-6">
                    <h1>Users</h1>
                </div>
                <div class="col-sm-6">
                    <ol class="breadcrumb float-sm-right">
                        <li class="breadcrumb-item"><a href="#">Home</a></li>
                        <li class="breadcrumb-item active">Search</li>
                    </ol>
                </div>
            </div>
        </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">
        <div class="container-fluid">
            <div class="row">
                <div class="col-12">

                    <div class="card">

                        <div class="card-header">
                            <form method="post" >
                                <p>From:</p>
                                <input type="search" name="date1">
                                <br> <br>
                                <p>To:</p>
                                <input type="search" name="date2">
                                <button class="btn btn-primary">Search</button>
                            </form>

                        </div>
                        <!-- /.card-header -->
                        <div class="card-body">

                            <table id="database-table">
                                <tr>
                                    <th>ID</th>
                                    <th>Customer ID</th>
                                    <th>Reservation Date</th>
                                    <th>Check In</th>
                                    <th>Check Out</th>
                                    <th>Room Type</th>
                                    <th>Room Number</th>
                                    <th>payment</th>
                                    <th>client state</th>


                                </tr>
                                <%
                                    Timestamp t1 = null;
                                    Timestamp t2 = null;
                                    if ((request.getParameter("date1") != null) && (request.getParameter("date2") != null)) {
                                        t1 = Timestamp.valueOf(request.getParameter("date1"));
                                        t2 = Timestamp.valueOf(request.getParameter("date2"));

                                    }

                                    Reservations r = new Reservations();
                                    ResultSet rs = r.search_res(t1, t2);
                                    // int counter=1;
                                    String room_type = "";
                                    int r_n = 0;
                                    Rooms rm = new Rooms();
                                    while (rs.next()) {
                                        int room_number = rs.getInt("room_number");
                                        //out.print(room_number);
                                        ResultSet rs2 = rm.getRoom(room_number);

                                        while (rs2.next()) {

                                            room_type = rs2.getString("type");
                                            r_n = rs2.getInt("room_number");
                                        }

                                %>

                                <tr>

                                    <td><%out.println(rs.getInt("id"));%></td>
                                    <td><% out.println(rs.getInt("user_id"));%></td>
                                    <td><% out.println(rs.getTimestamp("reservation_date"));%></td>
                                    <td><% out.println(rs.getTimestamp("check_in"));%></td>
                                    <td><% out.println(rs.getTimestamp("check_out"));%></td>
                                    <td><% out.println(room_type); %> </td>
                                    <td><%out.println(r_n);%></td>
                                    <% if (rs.getBoolean("payment") == true) { %>
                                    <td><% out.println("confirmed");%></td>
                                    <% } else { %>
                                    <td><% out.println(" not confirmed");%></td>
                                    <% } %>


                                    <td><% out.println(rs.getString("client_state"));%></td>



                                </tr>

                                <%
                                    }
                                %>
                            </table>

                        </div>
                        <!-- /.card-body -->
                    </div>
                    <!-- /.card -->
                </div>
                <!-- /.col -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /.container-fluid -->
    </section>
    <!-- /.content -->
</div>
<!-- /.content-wrapper -->
<jsp:include page="footer.html" />