<%
    HttpSession sess=request.getSession(false);
    int user_id=0;
    if(sess.getAttribute("user_id")!=null)
          user_id=(int) sess.getAttribute("user_id");
    
%>
<%@page import="java.util.ArrayList"%>
<%@page import="backend.Hotel"%>
<%@page import="backend.user"%>
<%@page import="java.sql.ResultSet"%>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Filters</title>
        <!-- Bootstrap CSS -->
        <jsp:include page="navbar.jsp" />
    <div class="jumbotron my-5">
        <h1 class="display-4">Hotels After Filters</h1>
    </div>

    <div class="container ">
        <table class="table my-5">
            <thead>
                <tr>
                    <th scope="col">Hotel Name</th>
                    <th scope="col">Location</th>
                    <th scope="col">Rooms available</th>
                    <th scope="col">Hotel rating</th>
                    <th scope="col">price</th>
                    <th scope="col">Room type</th>
                    <th scope="col">Hotel stars</th>
                    <th scope="col">Phone number</th>
                    <th scope="col">View Details</th>
                </tr>
            </thead>
            <%
                HttpSession se = request.getSession(false);
                if(se.getAttribute("hotels")!=null)
                {
                ArrayList<Hotel> hotels=new ArrayList<Hotel>();
                hotels=(ArrayList) se.getAttribute("hotels");
                
                user u=new user();
                int h_stars = Integer.parseInt(request.getParameter("H_stars"));
                String meals = request.getParameter("meals");
                int have_meals;
                if (meals.equals("yes")) {
                    have_meals = 1;
                } else {
                    have_meals = 0;
                }
                float price = Float.parseFloat(request.getParameter("price"));
                int distance = Integer.parseInt(request.getParameter("distance"));
                float rate=0;
                for(int i=0;i<hotels.size();i++) {
                    Hotel hotel=new Hotel();
                    hotel=hotels.get(i);
                    if (hotel.hotelStars == h_stars && hotel.distance == distance
                            && hotel.meals == have_meals && hotel.price == price) 
                        {
               ResultSet rs2 = u.Find_hotel_Reviews(hotel.id);
               if(rs2.next())
               {
                   rate=rs2.getFloat(1);
               }
              %>
            <td><% out.println(hotel.name);%></td>
            <td><% out.println(hotel.location);%></td>
            <td><% out.println(hotel.roomsAvailable);%></td>
            <td><% out.println(rate);%></td>
            <td><% out.println(hotel.price); %> </td>
            <td><select>
                    <option>Single</option>
                    <option>Double</option>
                </select></td>
            <td><% out.println(hotel.hotelStars);%></td>
            <td><% out.println(hotel.phoneNumber);%></td>
            <td>
            <form method="post" action="hotelDescription.jsp">
                            <input type="hidden" name="hotel_id" value=<% out.println(hotel.id);%>>
                             <input type="hidden" name="user_id" value=<% out.println(user_id);%>>
                            <button type="submit" name="check"   class="form-control mr-sm-2">view </button>
                        </form>
            <td>
            
            <%
            }
           }
           }
          
            %>
        </table>
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