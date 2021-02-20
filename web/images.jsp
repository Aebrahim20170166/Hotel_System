<%-- 
    Document   : images
    Created on : Dec 31, 2020, 11:05:13 AM
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
            <h1>Photos</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">Photos</li>
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
                <h3 class="card-title">All Photos with CRUD</h3><br>
                  <a href="add-photo.jsp" class="btn btn-success">Add Photo</a>
              </div>
              <!-- /.card-header -->
              <div class="card-body">

                  <table id="database-table">
                      <tr>
                          <th>ID</th>
                          <th>Image</th>
                          <th>Delete</th>
                          <th>Update</th>
                      </tr>


                      <tr>
                          <td>1</td>
                          <td>Marie Bertrand</td>
                          <td><form method="post" action="">
                          <input type="hidden" name="photo_id" value="">
                          <input type="hidden" name="script" value="">
                          <button type="submit" name="submit_delete" class="btn btn-danger">Delete</button>
                          </form></td>
                          <td>
                              <a href="update-photo.jsp">
                          <button type="submit" name="submit_update" class="btn btn-primary">Update</button>
                              </a>
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
  <!-- /.control-sidebar -->
</div>
<jsp:include page="footer.html" />
