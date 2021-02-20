
<%@page import="backend.Reservations"%>
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
              <h3 class="card-title">Update check in/out</h3>
            </div>
            <!-- /.card-header -->
            <!-- form start -->
            <%
            int id=Integer.parseInt(request.getParameter("reservation_id"));
            request.setAttribute("id", id);
            
           Reservations r=new Reservations();
      
            ResultSet rs=r.find_info(id);
            if(rs.next()){
            %>
            <form method="post" action="check" >
              <div class="card-body">
                   <div class="form-group">
                  <label for="text">client check in / out</label>
                  <input type="text" class="form-control" name="client_state" value="<% out.print(rs.getString("client_state")); %>">
                   <input type="hidden" name="id" value=<% out.print(rs.getInt("id"));%>>
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


