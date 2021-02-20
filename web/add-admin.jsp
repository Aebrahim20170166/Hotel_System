<%-- 
    Document   : add-room
    Created on : Dec 31, 2020, 10:58:18 AM
    Author     : Alaa_Ibrahim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="navbar.html" />

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
<!-- Main content -->
    <section class="content">
      <div class="row">

        <div class="col-md-12">
          <!-- general form elements -->
          <div class="card card-primary">
            <div class="card-header">
              <h3 class="card-title">Add Admin</h3>
            </div>
            <!-- /.card-header -->
            <!-- form start -->
            <form method="post" action="addAdmin" >
              <div class="card-body">
                <div class="form-group">
                  <label for="number">Admin Name</label>
                  <input type="text" class="form-control" name="name" id="title" placeholder="Admin Name">
                </div>

                <div class="form-group">
                  <label for="location">Admin email</label>
                  <input type="text" class="form-control" name="email" id="price" placeholder="Admin Email">
                </div>

                <div class="form-group">
                  <label for="phone">Admin Password</label>
                  <input type="password" class="form-control" name="password" id="price" placeholder="Admin Password">
                </div>
                  
                <div class="form-group">
                  <label for="phone">Admin Phone number</label>
                  <input type="text" class="form-control" name="phone" id="price" placeholder="Admin Phone Number">
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
