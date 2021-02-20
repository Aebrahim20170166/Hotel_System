 <%
        HttpSession se=request.getSession(false);
       %>
<%@page import="java.sql.ResultSet"%>
<%@page import="backend.Hotel"%>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Hotel description</title>
        <!-- Bootstrap CSS -->


        <jsp:include page="navbar.jsp" />
         
    <div class="jumbotron">
        <h1 class="display-4">Hotel description</h1>
    </div>
    <div class="container">
        <div class="card my-5" style="width: auto;">
            <div class="card-body">
                <h5 class="card-title">Hotel Description: </h5>
            </div>
            <%
                int hotel_id=0;
                int user_id=0;
            if(request.getParameter("hotel_id")!=null)
            {
                hotel_id=Integer.parseInt(request.getParameter("hotel_id"));
                user_id=(int)se.getAttribute("user_id");
                //HttpSession session2 = request.getSession();
                //session.setAttribute("user_id", user_id); 
                //session.setAttribute("hotel_id",hotel_id); 
                     
            }
            %>
            <%
                //int id = Integer.valueOf(request.getParameter("hotel_id"));
                Hotel h = new Hotel();
                ResultSet rs = h.getHotel(hotel_id);
                while (rs.next()) {
            %>
            <ul class="list-group list-group-flush">
                <li class="list-group-item">Hotel Name : <% out.print(rs.getString("name")); %> </li>
                <li class="list-group-item">Location:  <% out.print(rs.getString("location")); %></li>
                <li class="list-group-item">Rooms available:  <% out.print(rs.getInt("rooms_available")); %> </li>
                <li class="list-group-item">Phone:  <% out.print(rs.getString("phone_number")); %> </li>
                <li class="list-group-item">Stars:  <% out.print(rs.getInt("hotel_stars")); %>  </li>
                <li class="list-group-item">Distance from city: <% out.print(rs.getFloat("distance")); %> </li>
                <li class="list-group-item">Meals:<%
                    if (rs.getInt("meals") == 1) {
                        out.print(" Yes");
                    } else {
                        out.print(" No");
                    }%>
                </li>
                <li class="list-group-item">Facilities: <% out.print(rs.getString("Facilities")); %> </li>

                <%
                    }
                %>
            </ul>
             
            <div class="card-body">
                <!--<form method="post" action="photos.jsp" >
                    <input type="hidden" name="hotel_id" value=<%out.print(hotel_id);%>>
                    <button >View photos</button>
                </form>
                <form method="post" action="makeReservation.jsp">
                    <input type="hidden" name="user_id" value=<%out.print(user_id);%>>
                    <input type="hidden" name="hotel_id" value=<%out.print(hotel_id);%>>
                    <button >Make reservation</button>
                </form>
                <form method="post" action="comments.jsp" >
                    <input type="hidden" name="hotel_id" value=<%out.print(hotel_id);%>>
                    <button >Rate hotel</button>
                </form>-->
                <a href="hotelPhotos.jsp?hotel_id=<%out.print(hotel_id);%>" class="card-link">View photos</a>
                <a href="makeReservation.jsp?hotel_id=<%out.print(hotel_id);%>" class="card-link">Make reservation</a>
                <a href="comments.jsp?hotel_id=<%out.print(hotel_id);%>" class="card-link">Rate hotel</a>
                <a href="maps.jsp?hotel_id=<%out.print(hotel_id);%>" class="card-link">View on google map</a>

            </div>
        </div>
    </div>

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>

    <!-- Option 2: jQuery, Popper.js, and Bootstrap JS
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
    -->
</body>
</html>
