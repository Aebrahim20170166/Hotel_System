<%
    HttpSession se=request.getSession(false);
    if(se.getAttribute("user_id")==null)
           response.sendRedirect("../login.jsp");
    
    %>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>User Home</title>



     <jsp:include page="navbar.jsp" />
    
    <div class="jumbotron">
        <h1 class="display-4">Search Hotels</h1>
    </div>
    <div class="container my-5">
        <form method="post" action="searchResults.jsp">
              <div class="form-row">
                  <p style="color:red">
                <%if(request.getParameter("result")!=null)
                {
                    out.print(request.getParameter("result"));
                }
                
                %></p>
                  <div class="form-group col-md-12">
                      <label for="location">Location</label>
                      <input type="text" class="form-control" name="location" placeholder="City, region or specific hotel">
                  </div>
                  <br><br>
                <div class="form-group col-md-6">
                  <label for="checkInDate">Check in date</label>
                  <input type="date" class="form-control" id="checkInDate">
                </div>
                <div class="form-group col-md-6">
                  <label for="checkOutDate">Check out date</label>
                  <input type="date" class="form-control" id="checkOutDate">
                </div>
              </div>
              <div class="form-row">
                <div class="form-group col-md-6">
                  <label for="checkInTime">Check in time</label>
                  <input type="time" class="form-control" id="checkInTime">
                </div>
                <div class="form-group col-md-6">
                  <label for="checkOutTime">Check out time</label>
                  <input type="time" class="form-control" id="checkOutTime">
                </div>
              </div>
            <span style="color:red">
                <%if(request.getParameter("error")!=null)
                {
                    out.print(request.getParameter("error"));
                }
                
                %></span>
              <div class="form-group">
                <label for="nPersons">Number of persons</label>
                <input type="text" name="nPersons" class="form-control" id="nPersons" placeholder="eg: '8' ">
              </div>
              <div class="form-group">
              </div>
              <button type="submit" class="btn btn-primary">Search</button>
        </form>
    </div>


    

    <!-- Main JS-->
    <script src="js/global.js"></script>

    <!-- Optional JavaScript -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

  </body>
</html>