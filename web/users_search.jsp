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
              <li class="breadcrumb-item active">Users</li>
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
                  <form method="post" action="users_search.jsp">
                      <input type="search" name="user_id">
                      <button class="btn btn-primary">Search</button>
                  </form>
        
              </div>
              <!-- /.card-header -->
              <div class="card-body">

                  <table id="database-table">
                      <tr>
                          <th>ID</th>
                          <th>Name</th>
                          <th>Email</th>
                          <th>Phone</th>
                      </tr>
                      <%
                      if(request.getParameter("user_id")!=null)
                      {
                      int user_id=Integer.parseInt(request.getParameter("user_id"));
                      user admin=new user();
                      ResultSet rs=admin.searchOnUsers(user_id);
                      if(rs.next()){
                      %>

                      <tr>
                          <td><%out.print(rs.getInt("id"));%></td>
                          <td><%out.print(rs.getString("Fname")+" "+rs.getString("Lname"));%></td>
                          <td><%out.print(rs.getString("email"));%></td>
                          <td><%out.print(rs.getString("phone"));%></td>
                      </tr>
                      <%
                      }
}%>
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