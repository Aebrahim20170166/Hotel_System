
<%@page import="backend.Rooms"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="backend.Reservations"%>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>User Reservations</title>
        <!-- Bootstrap CSS -->
        <jsp:include page="navbar.jsp" />
    <div class="jumbotron my-5">
        <h1 class="display-4">User reservations</h1>
    </div>

    <div class="container ">
        <table class="table my-5">
            <thead>
                <tr>
                    <th scope="col">Reservation ID</th>
                    <th scope="col">Reservation time</th>
                    <th scope="col">Check in date</th>
                    <th scope="col">Check out date</th>
                    <th scope="col">Room type</th>
                    <th scope="col">Update</th>
                    <th scope="col">Cancel</th>
                </tr>
            </thead>
            <tr>
            <%
                HttpSession se = request.getSession(false);
                int user_id = 0;
                if (se.getAttribute("user_id") != null) {

                    user_id = (int) se.getAttribute("user_id");
                    //out.print(user_id);
                }
                Reservations res = new Reservations();
                ResultSet rs = res.getreservation(user_id);
                while (rs.next()) {
                    Rooms room=new Rooms();
                    ResultSet rs2=room.getRoom(rs.getInt("room_number"));
                    
            %>
            <td><% out.println(rs.getInt("id"));%></td>
            <td><% out.println(rs.getTimestamp("reservation_date"));%></td>
            <td><% out.println(rs.getTimestamp("check_in"));%></td>
            <td><% out.println(rs.getTimestamp("check_out"));%></td>
            <td><% if(rs2.next()){out.println(rs2.getString("type"));} %> </td>
            <td>
                <a href="update_reservation.jsp?res_id=<%out.print(rs.getInt("id"));%>"><button>Update</button></a>
                
            </td>
            <td>
                <form method="post" action="../delete_reservation">
                    <input type="hidden" name="res_id" value=<%out.print(rs.getInt("id"));%>>
                     <input type="hidden" name="user_id" value=<%out.print(rs.getInt("user_id"));%>>
                     <button class="success">Cancel</button>
                </form>
               
                
            </td>
            </tr>
<%
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