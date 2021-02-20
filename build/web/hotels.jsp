<%-- 
    Document   : hotels
    Created on : Dec 31, 2020, 12:25:16 PM
    Author     : Alaa_Ibrahim
--%>
<%
    int hotel_id = 0;
    int user_id = 0;
    HttpSession se = request.getSession(false);
    if (se.getAttribute("user_id") == null && se.getAttribute("hotel_id") == null) {
        response.sendRedirect("login.jsp");
    } else {
        hotel_id = (int) se.getAttribute("hotel_id");
        user_id = (int) se.getAttribute("user_id");

    }
%>
<%@page import="java.sql.ResultSet"%>
<%@page import="backend.Hotel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Admin</title>

        <!-- Google Font: Source Sans Pro -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="../../plugins/fontawesome-free/css/all.min.css">
        <!-- DataTables -->
        <link rel="stylesheet" href="../../plugins/datatables-bs4/css/dataTables.bootstrap4.min.css">
        <link rel="stylesheet" href="../../plugins/datatables-responsive/css/responsive.bootstrap4.min.css">
        <link rel="stylesheet" href="../../plugins/datatables-buttons/css/buttons.bootstrap4.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="adminlte.min.css">
    </head>
    <body class="hold-transition sidebar-mini">
        <div class="wrapper">
            <!-- Navbar -->

            <!-- /.navbar -->


            <!-- Main Sidebar Container -->
            <aside class="main-sidebar sidebar-dark-primary elevation-4">
                <!-- Brand Logo -->
                <a href="../../index.php" class="brand-link">
                    <span class="brand-text font-weight-light">Admin</span>
                </a>

                <!-- Sidebar -->
                <div class="sidebar">

                    <!-- Sidebar Menu -->
                    <nav class="mt-2">
                        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">


                            <li class="nav-item">
                                <a href="hotels.jsp" class="nav-link">
                                    <i class="nav-icon fas fa-book"></i>
                                    <p>
                                        Hotels
                                    </p>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="rooms.jsp" class="nav-link">
                                    <i class="nav-icon fas fa-book"></i>
                                    <p>
                                        Rooms
                                    </p>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="reservations.jsp" class="nav-link">
                                    <i class="nav-icon fas fa-edit"></i>
                                    <p>
                                        Reservations
                                    </p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="current_reservations.jsp" class="nav-link">
                                    <i class="nav-icon fas fa-edit"></i>
                                    <p>
                                        Current Reservations
                                    </p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="users_search.jsp" class="nav-link">
                                    <i class="nav-icon fas fa-edit"></i>
                                    <p>
                                        View Users
                                    </p>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="view_reviews.jsp" class="nav-link">
                                    <i class="nav-icon fas fa-edit"></i>
                                    <p>
                                        Reviews
                                    </p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="images.jsp" class="nav-link">
                                    <i class="nav-icon fas fa-edit"></i>
                                    <p>
                                        Photos
                                    </p>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="../forms/update-about.php" class="nav-link">
                                    <i class="nav-icon fas fa-edit"></i>
                                    <p>
                                        About Us
                                    </p>
                                </a>
                            </li>

                        </ul>
                    </nav>
                    <!-- /.sidebar-menu -->
                </div>
                <!-- /.sidebar -->
            </aside>

            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h1>Hotel</h1>
                            </div>
                            <div class="col-sm-6">
                                <ol class="breadcrumb float-sm-right">
                                    <li class="breadcrumb-item"><a href="#">Home</a></li>
                                    <li class="breadcrumb-item active">Info's Hotel</li>
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
                                        <h3 class="card-title">Hotel With CRUD</h3><br>
                                        <a href="add-hotel.jsp" class="btn btn-success">Add Hotel</a>
                                    </div>
                                    <!-- /.card-header -->
                                    <div class="card-body">
                                        <table id="example1" class="table table-bordered table-striped">
                                            <thead>
                                                <tr>
                                                    <th>ID</th>
                                                    <th>Name</th>
                                                    <th>Location</th>
                                                    <th>Rooms Available</th>
                                                    <th>Phone Number</th>
                                                    <th>Stars</th>
                                                    <th>Have meals</th>
                                                    <th>Price</th>
                                                    <th>Distance</th>
                                                    <th>Facilities</th>
                                                    <th>Delete</th>
                                                    <th>Update</th>
                                                </tr>
                                            </thead>
                                            <%
                                                Hotel hotel = new Hotel();
                                                ResultSet rs = hotel.getHotel(hotel_id);
                                                int counter = 1;
                                                while (rs.next()) {
                                            %>
                                            <tbody>
                                                <tr>
                                                    <td><%out.println(counter++);%></td>
                                                    <td><% out.println(rs.getString("name"));%></td>
                                                    <td><% out.println(rs.getString("location"));%></td>
                                                    <td><% out.println(rs.getInt("rooms_available"));%></td>
                                                    <td><% out.println(rs.getString("phone_number"));%></td>
                                                    <td><% out.println(rs.getInt("hotel_stars"));%></td>
                                                    <td>
                                                        <%
                                                            if (rs.getInt("meals") == 1) {
                                                                out.println("Yes");
                                                            } else {
                                                                out.println("No");
                                                            }
                                                        %>
                                                    </td>
                                                    <td><% out.println(rs.getFloat("price"));%></td>
                                                    <td><% out.println(rs.getInt("distance"));%></td>

                                                    <td><% out.println(rs.getString("Facilities"));%></td>
                                                    <td><form method="post" action="deleteHotel">
                                                            <input type="hidden" name="hotel_id" value=<% out.println(rs.getInt("id"));%>>
                                                            <input type="hidden" name="script" value="">
                                                            <button type="submit" name="submit_delete" class="btn btn-danger">Delete</button>
                                                        </form></td>
                                                    <td>
                                                        <a href="update-hotel.jsp?id=<%out.println(rs.getInt("id"));%>"><button class="btn btn-primary">Update</button></a>
                                                    </td>
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
