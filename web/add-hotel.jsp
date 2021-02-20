<%-- 
    Document   : add-hotel
    Created on : Dec 31, 2020, 10:53:30 AM
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
            <h1>Hotels</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">Hotels</li>
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
              <h3 class="card-title">Add Hotel</h3>
            </div>
            <!-- /.card-header -->
            <!-- form start -->
            <form method="post" action="addHotel">
              <div class="card-body">
                <div class="form-group">
                  <label for="name">Hotel name</label>
                  <input type="text" class="form-control" name="hName" id="title" placeholder="Enter Hotel Name">
                </div>

                <div class="form-group">
                  <label for="location">Location</label>
                  <input type="text" class="form-control" name="location" id="price" placeholder="Enter Location">
                </div>

                <div class="form-group">
                  <label for="phone">Phone number</label>
                  <input type="text" class="form-control" name="phone" id="price" placeholder="Enter Phone number">
                </div>


                <!-- /.card-header -->
                <div class="form-group">
                  <label for="distance">Distance</label>
                  <input type="text" class="form-control" name="distance" id="price" placeholder="Enter Distance From It To Governorate City Center">
                </div>
          
                <div class="form-group">
                  <label for="rooms">Rooms available</label>
                  <input type="text" class="form-control" name="noRooms" id="price" placeholder="Enter Number Of Available Rooms">
                </div>
                
                <div class="form-group">
                  <label for="stars">Hotel's Stars</label>
                  <input type="text" class="form-control" name="stars" id="price" placeholder="Enter Number Of Stars">
                </div>
                
                <div class="form-group">
                  <label for="phone">Facilities</label>
                  <input type="text" class="form-control" name="facilities" id="price" placeholder="Enter Phone number">
                </div>
                
                <div class="form-group">
                  <label for="meals">Have Meals</label>
                  <select name="meals">
                      <option value="yes">Yes</option>
                      <option value="no">No</option>
                  </select>
                </div>

              </div>
              <!-- /.card-body -->

              <div class="card-footer">
                <button type="submit" name="add_submit" class="btn btn-primary">Submit</button>
              </div>
            </form>
          </div>

        </div>


      </div>
      <!-- ./row -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
<jsp:include page="footer.html" />