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
<%@page import="java.sql.ResultSet"%>
<%@page import="backend.Rooms"%>
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
              <h3 class="card-title">Update Room</h3>
            </div>
            <!-- /.card-header -->
            <!-- form start -->
            <%
            int id=Integer.parseInt(request.getParameter("id"));
            Rooms room=new Rooms();
            ResultSet rs=room.getRoom(id);
            if(rs.next()){
            %>
            <form method="post" action="updateRoom" >
              <div class="card-body">
                   <div class="form-group">
                  <label for="number">Room Number</label>
                  <input type="text" class="form-control" name="number" value="<%out.print(rs.getInt("room_number"));%>">
                </div>
                  
                <div class="form-group">
                  <label for="available">Room Type</label>
                  <select name="type">
                      <%
                          if(rs.getString("type").equals("singal"))
                          {
                      %>
                      <option selected value="singal">Singal</option>
                      <option value="double">Double</option>
                      <%}
                     else{
                      %>
                      <option selected value="double">Double</option>
                      <option value="singal">Singal</option>
                      <%}%>
                      
                  </select>
                  
                </div>

                <div class="form-group">
                  <label for="location">Room Price</label>
                  <input type="text" class="form-control" name="price" value="<%out.print(rs.getFloat("price"));%>">
                </div>

                <div class="form-group">
                  <label for="phone">Room Facilities</label>
                  <input type="text" class="form-control" name="facilities" value="<%out.print(rs.getString("Facilities"));%>">
                </div>
                  
                <div class="form-group">
                  <label for="available">Availability</label>
                  <select name="available">
                      <%
                          if(rs.getInt("Availability")==1)
                          {
                      %>
                      <option selected value="yes">Yes</option>
                      <option value="no">No</option>
                      <%}
                     else{
                      %>
                      <option selected value="no">No</option>
                      <option value="yes">Yes</option>
                      <%}%>
                      
                  </select>
                      <input type="hidden" name="room_id" value="<%out.print(rs.getInt("id"));%>">
                  
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
      </div>
      <!-- ./row -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  <jsp:include page="footer.html" />
