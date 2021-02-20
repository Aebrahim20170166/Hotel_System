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
<%@page import="java.sql.ResultSet"%>
<%@page import="backend.Hotel"%>
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
              <h3 class="card-title">Update Hotel</h3>
            </div>
            <!-- /.card-header -->
            <!-- form start -->
            
            <%
            int id=Integer.parseInt(request.getParameter("id"));
            Hotel hotel=new Hotel();
            ResultSet rs=hotel.getHotel(id);
            if(rs.next()){
            %>
            <form method="post" action="updateHotel">
              <div class="card-body">
                <div class="form-group">
                  <label for="name">Hotel name</label>
                  <input type="text" class="form-control" name="hName" id="title" value="<% out.print(rs.getString("name"));%>">
                </div>

                <div class="form-group">
                  <label for="location">Location</label>
                  <input type="text" class="form-control" name="location" id="price" value="<% out.print(rs.getString("location"));%>">
                </div>

                <div class="form-group">
                  <label for="phone">Phone number</label>
                  <input type="text" class="form-control" name="phone" id="price" value="<% out.print(rs.getInt("phone_number"));%>">
                </div>


                <!-- /.card-header -->
                <div class="form-group">
                  <label for="distance">Distance</label>
                  <input type="text" class="form-control" name="distance" id="price" value="<% out.print(rs.getInt("distance"));%>">
                </div>
          
                <div class="form-group">
                  <label for="rooms">Rooms available</label>
                  <input type="text" class="form-control" name="noRooms" id="price" value="<% out.print(rs.getInt("rooms_available"));%>">
                </div>
                
                <div class="form-group">
                  <label for="rooms">Hotel Price</label>
                  <input type="text" class="form-control" name="price" id="price" value="<% out.print(rs.getFloat("price"));%>">
                </div>
                
                <div class="form-group">
                  <label for="stars">Hotel's Stars</label>
                  <input type="text" class="form-control" name="stars" id="price" value="<% out.print(rs.getInt("hotel_stars"));%>">
                </div>
                
                <div class="form-group">
                  <label for="phone">Facilities</label>
                  <input type="text" class="form-control" name="facilities" id="price" value="<% out.print(rs.getString("Facilities"));%>">
                </div>
                
                <div class="form-group">
                  <label for="meals">Have Meals</label>
                  <select name="meals">
                  <%
                  if(rs.getInt("meals")==1)
                  {
                  %>
                      <option selected value="yes">Yes</option>
                      <option value="no">No</option>
                  <%}
                 else{
                  %>
                  <option selected value="no">No</option>
                  <option selected value="yes">Yes</option>
                  <%}%>
                  </select>
                </div>
                  <input type="hidden" name="hotel_id" value="<% out.print(rs.getInt("id"));%>">

              </div>
              <!-- /.card-body -->

              <div class="card-footer">
                <button type="submit" name="add_submit" class="btn btn-primary">Submit</button>
              </div>
            </form>
             <%}%>
          </div>

        </div>


      </div>
      <!-- ./row -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
<jsp:include page="footer.html" />