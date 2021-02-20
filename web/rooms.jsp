<%

    int hotel_id = 0;
    int user_id = 0;
    HttpSession se = request.getSession(false);
    if (se.getAttribute("user_id") == null && se.getAttribute("hotel_id") == null) {
        response.sendRedirect("login.jsp");
    } else {
        hotel_id = (int) se.getAttribute("hotel_id");
        user_id = (int) se.getAttribute("user_id");

    }%>
<%@page import="java.sql.ResultSet"%>
<%@page import="backend.Rooms"%>
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
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="container-fluid">
        <div class="row">
          <div class="col-12">

            <div class="card">
              <div class="card-header">
                <h3 class="card-title">All Rooms with CRUD</h3><br>
                  <a href="add-room.jsp" class="btn btn-success">Add Room</a>
              </div>
              <!-- /.card-header -->
              <div class="card-body">
                  
                  <table id="database-table">
                      <tr>
                          <th>ID</th>
                          <th>Number</th>
                          <th>Type</th>
                          <th>Price</th>
                          <th>Availability</th>
                          <th>Facilities</th>
                          <th>Delete</th>
                          <th>Update</th>
                      </tr>
                      <%
                      Rooms room=new Rooms();
                      room.hotel_id=hotel_id;
                      ResultSet rs=room.getRooms();
                      int counter=1;
                      while(rs.next()){
                      %>
                      <tr>
                          <td><% out.print(counter++);%></td>
                          <td><% out.print(rs.getInt("room_number"));%></td>
                          <td><% out.print(rs.getString("type"));%></td>
                          <td><% out.print(rs.getFloat("price"));%></td>
                          <td>
                              <% 
                                  if(rs.getInt("Availability")==1){
                                      out.print("Yes");
                                  }
                                  else{
                                      out.print("No");
                                  }
                              %>
                          </td>
                          <td><% out.print(rs.getString("Facilities"));%></td>
                          <td><form method="post" action="deleteRoom">
                          <input type="hidden" name="room_id" value=<% out.print(rs.getInt("id"));%>>
                          <input type="hidden" name="script" value="">
                          <button type="submit" name="submit_delete" class="btn btn-danger">Delete</button>
                          </form></td>
                          <td>
                              <a href="update-room.jsp?id=<% out.print(rs.getInt("id"));%>">
                          <button type="submit" name="submit_update" class="btn btn-primary">Update</button>
                              </a>
                          </td>
                      </tr>
                      <%}%>
                      
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
  

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<!-- jQuery -->
<!-- Page specific script -->

<jsp:include page="footer.html" />
