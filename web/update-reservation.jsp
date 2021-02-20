<%-- 
    Document   : add-room
    Created on : Dec 31, 2020, 10:58:18 AM
    Author     : Alaa_Ibrahim
--%>
<%

    HttpSession se = request.getSession(false);
    if (se.getAttribute("user_id") == null) {
        response.sendRedirect("login.jsp");
    }%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="navbar.html" />

<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>Reservations</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">Reservations</li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
<!-- Main content -->
    <section class="content">
      <div class="row">

        <div class="col-md-12">
          <!-- general form elements -->
          <div class="card card-primary">
            <div class="card-header">
              <h3 class="card-title">Update Reservation</h3>
            </div>
            <!-- /.card-header -->
            <!-- form start -->
            <form method="post" action="" >
              <div class="card-body">
                <div class="form-group">
                  <label for="check-in">Check In</label>
                  <input type="text" class="form-control" name="check-in" id="check-in" >
                </div>

                <div class="form-group">
                  <label for="check-out">Check Out</label>
                  <input type="text" class="form-control" name="check-out" id="check-out" >
                </div>

                <div class="form-group">
                  <label for="room-type">Room Type</label>
                  <input type="password" class="form-control" name="room-type" id="room-type" >
                </div>
                  
                <div class="form-group">
                  <label for="room-number">Room Number</label>
                  <input type="text" class="form-control" name="room-number" id="room-number" >
                </div>
              <!-- /.card-body -->

              <div class="card-footer">
                <button type="submit" name="add_submit" class="btn btn-primary">Submit</button>
              </div>
            </form>
          </div>

        </div>


      </div>
      </div>
      <!-- ./row -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  <jsp:include page="footer.html" />
