<%@page import="com.sun.rowset.internal.Row"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="backend.user"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="backend.Hotel"%>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Search results</title>

        <!-- Bootstrap CSS -->

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top mb-5">
            <a class="navbar-brand" href="#">Search results</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="userHome.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="topHotels.jsp">Top hotels</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../login.jsp">Sign in</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="logout.jsp">Logout</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="aboutUs.jsp">About us</a>
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0" method="post" action="filterHotels.jsp">

                    <div style="margin-top: -10px">
                        <label style="color: white;margin-right: 15px">Hotel stars</label>
                        <select name="H_stars" class="form-control mr-sm-2">
                            <option value="1" class="dropdown-item" >1 star</option>
                            <option value="2" class="dropdown-item" >2 stars</option>
                            <option value="3" class="dropdown-item" >3 stars</option>
                            <option value="4" class="dropdown-item" >4 stars</option>
                            <option value="5" class="dropdown-item" >5 stars</option>
                        </select>
                    </div>
                    <div style="margin-top: -10px">
                        <label style="color: white;margin-right: 15px">Have meals</label>
                        <select class="form-control mr-sm-2" name="meals">
                            <option value="yes" class="dropdown-item" >Yes</option>
                            <option value="no" class="dropdown-item" >No</option>
                        </select>
                    </div>
                    <div style="margin-top: 15px">
                    <input name="price" class="form-control mr-sm-2" type="text" placeholder="Price" aria-label="Search">
                    <input name="distance" class="form-control mr-sm-2" type="text" placeholder="Distance" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                    </div>
                </form>
            </div>
        </nav>

        <div class="container " style="margin-top: 70px">
            <table class="table my-5">
                <thead>
                    <tr>
                        <th scope="col">Name</th>
                        <th scope="col">Location</th>
                        <th scope="col">Hotel stars</th>
                        <th scope="col">Phone number</th>
                        <th scope="col">Price</th>
                        <th scope="col">Rating</th>
                    </tr>
                </thead>
                <%
                    String location = request.getParameter("location");
                    if (request.getParameter("nPersons") != "") {
                        int numOfpersons = Integer.parseInt(request.getParameter("nPersons"));
                        if (numOfpersons != 0) {
                            int singalRooms = 0;
                            int doubleRooms = 0;
                            if (numOfpersons % 2 == 0) {
                                doubleRooms = numOfpersons / 2;
                            } else {
                                if (numOfpersons == 1) {
                                    singalRooms = numOfpersons;
                                } else {
                                    doubleRooms = (numOfpersons - 1) / 2;
                                    singalRooms = 1;
                                }

                            }
                            Hotel h = new Hotel();
                            ResultSet rs = h.search_hotels(location, singalRooms, doubleRooms);
                             HttpSession sess = request.getSession();
                             
                            user u = new user();
                            float rate = 0;
                            int counter = 0;
                            ArrayList<Hotel> hotels=new ArrayList<Hotel>();
                            while (rs.next()) {
                                Hotel hotel=new Hotel();
                                hotel.id=rs.getInt("id");
                                hotel.name=rs.getString("name");
                                hotel.location=rs.getString("location");
                                hotel.roomsAvailable=rs.getInt("rooms_available");
                                hotel.price=rs.getFloat("price");
                                hotel.hotelStars=rs.getInt("hotel_stars");
                                hotel.phoneNumber=rs.getString("phone_number");
                                hotel.distance=rs.getInt("distance");
                                hotel.meals=rs.getInt("meals");
                                hotels.add(hotel);
                                counter++;
                                int id = rs.getInt("id");
                                //out.print(room_number);
                                ResultSet rs2 = u.Find_hotel_Reviews(id);

                                while (rs2.next()) {

                                    rate = rs2.getFloat(1);
                                }
                %>
                <tr>
                    <td><% out.println(rs.getString("name"));%></td>
                    <td><% out.println(rs.getString("location"));%></td>
                    <td><% out.println(rs.getInt("hotel_stars"));%></td>
                    <td><% out.println(rs.getString("phone_number"));%></td>
                    <td><% out.println(rs.getFloat("price")); %> </td>
                    <td><% out.println(rate); %> </td>
                    <td>
                        <form method="post" action="hotelDescription.jsp">
                            <input type="hidden" name="hotel_id" value=<% out.println(rs.getInt("id"));%>>
                            <button type="submit" name="check"   class="form-control mr-sm-2">view </button>
                        </form>
                    </td>
                </tr>
                </tbody>
                <%

                    }
                    sess.setAttribute("hotels", hotels);
                    if (counter == 0) {
                        response.sendRedirect("userHome.jsp?result=Sorry there is no results for your search");
                    }
                %>
                <%   } else {
                            response.sendRedirect("userHome.jsp?error=please enter number of persons");

                        }

                    } else {
                        response.sendRedirect("userHome.jsp?error=please enter number of persons");
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