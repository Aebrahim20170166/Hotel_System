<%-- 
    Document   : admins
    Created on : Dec 31, 2020, 12:19:04 PM
    Author     : Alaa_Ibrahim
--%>

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
            <h1>Admins</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">Admins</li>
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
                <h3 class="card-title">All Admins with CRUD</h3><br>
                  <a href="add-admin.jsp" class="btn btn-success">Add Admin</a>
              </div>
              <!-- /.card-header -->
              <div class="card-body">

                  <table id="database-table">
                      <tr>
                          <th>ID</th>
                          <th>Name</th>
                          <th>Email</th>
                          <th>Phone</th>
                          <th>Delete</th>
                          <th>Update</th>
                      </tr>


                      <tr>
                          <td>1</td>
                          <td>Alaa Ebrahim</td>
                          <td>aebrahim20170166@gmail.com</td>
                          <td>01287846322</td>
                          <td><form method="post" action="">
                    <input type="hidden" name="hotel_id" value="">
                    <button type="submit" name="submit_delete" class="btn btn-danger">Delete</button>
                    </form></td>
                    <td>
                    <a href="update-admin"><button class="btn btn-primary">Update</button></a>
                    </td>
                      </tr>
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
