<%

    HttpSession se = request.getSession(false);
    if (se.getAttribute("user_id") == null) {
        response.sendRedirect("login.jsp");
    }%>
<%@page import="backend.Rooms"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="backend.Reservations"%>
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
                    <h1> Current Reservations</h1>
                </div>
                <div class="col-sm-6">
                    <ol class="breadcrumb float-sm-right">
                        <li class="breadcrumb-item"><a href="#">Home</a></li>
                        <li class="breadcrumb-item active"> Current Reservations</li>
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
                            <h3 class="card-title">All Current Reservations with CRUD</h3><br>

                        </div>
                        <!-- /.card-header -->
                        <div class="card-body">

                            <table id="database-table">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Customer ID</th>
                                        <th>Reservation Date</th>
                                        <th>Check In</th>
                                        <th>Check Out</th>
                                        <th>Room Type</th>
                                        <th>Room Number</th>
                                        <th>Checking</th>
                                        <th>payment</th>



                                    </tr>
                                </thead>
                                <%

                                    Reservations r = new Reservations();
                                    ResultSet rs = r.get_curr_resinfo();
                                    // int counter=1;
                                    String room_type = "";
                                    int r_n = 0;
                                    Rooms rm = new Rooms();
                                    //int room_number=rs.getInt("room_number");
                                    // out.print(room_number);

                                    while (rs.next()) {
                                        int room_number = rs.getInt("room_number");
                                        //out.print(room_number);
                                        ResultSet rs2 = rm.getRoom(room_number);

                                        while (rs2.next()) {

                                            room_type = rs2.getString("type");
                                            r_n = rs2.getInt("room_number");
                                        }
                                %>
                                <tbody>
                                    <tr>

                                        <td><%out.println(rs.getInt("id"));%></td>
                                        <td><% out.println(rs.getInt("user_id"));%></td>
                                        <td><% out.println(rs.getTimestamp("reservation_date"));%></td>
                                        <td><% out.println(rs.getTimestamp("check_in"));%></td>
                                        <td><% out.println(rs.getTimestamp("check_out"));%></td>
                                        <td><% out.println(room_type); %> </td>
                                        <td><%out.println(r_n);%></td>
                                        
                                        <td><% out.println(rs.getString("client_state"));%></td>
                                        
                                        <% if (rs.getBoolean("payment") == true) { %>
                                        <td><% out.println("confirmed");%></td>
                                        <% } else { %>
                                        <td><% out.println(" not confirmed");%></td>
                                        <% } %>




                                    </tr>

                                </tbody>
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