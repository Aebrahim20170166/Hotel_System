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
            <h1>Rooms</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">Rooms</li>
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
              <h3 class="card-title">Add Room</h3>
            </div>
            <!-- /.card-header -->
            <!-- form start -->
            <form method="post" action="addRoom" >
              <div class="card-body">
                <div class="form-group">
                  <label for="number">Room Number</label>
                  <input type="text" class="form-control" name="num" id="title" placeholder="Room Number">
                </div>
                  
                <div class="form-group">
                      <label for="available">Room Type</label>
                  <select name="type" class="form-select" aria-label="Default select example">
                    <option selected>Choose</option>
                    <option value="singal">Single</option>
                      <option value="double">Double</option>
                  </select>
                </div>
                <div class="form-group">
                  <label for="phone">Room Price</label>
                  <input type="text" class="form-control" name="price" id="price" placeholder="Room Price">
                </div>
                  
                <div class="form-group">
                  <label for="available">Availability</label>
                  <select name="available" class="form-select" aria-label="Default select example">
                      <option value="yes">Yes</option>
                      <option value="no">No</option>
                      
                  </select>
                  
                </div>
                  
               <div class="form-group">
                  <label for="room-facilities">Room Facilities</label>
                  <input type="text" class="form-control" name="facilities" id="price" placeholder="Room Price">
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
