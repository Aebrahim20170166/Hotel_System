<%
    HttpSession se = request.getSession(false);

%>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

        <title>Make reservation</title>
    </head>
    <body>

        <div class="jumbotron">
            <h1 class="display-4">Make reservation</h1>
        </div>
        <div class="container my-5">
            <%if(request.getParameter("success")!=null)
                    {%>
                    <p style="color:red"><%out.print(request.getParameter("success"));%></p><br>
 <%                       
}%>
            <form method="post" action="../validate_reservation">
                <div class="form-row">
                    
                    <div class="form-group col-md-6">
                        <label for="checkInDate">Check in date</label>
                        <input type="datetime-local" name="check_in" class="form-control" id="checkInDate">

                    </div>
                    <div class="form-group col-md-6">
                        <label for="checkOutDate">Check out date</label>
                        <input type="datetime-local" name="check_out" class="form-control" id="checkOutDate">
                    </div>
                </div>
                
                <div class="form-group">
                    <div class="form-check">
                        <p>Room type:</p>
                        <select name="type" form-group>
                            <option value="singel">Single</option>
                            <option value="double">Double</option>
                        </select>

                        </label>
                    </div>
                    
                </div>
                
                <div class="form-group">
                    <div class="form-check">
                        <p>Payment:</p>
                        <select name="payment" form-group>
                            <option value="yes">Yes</option>
                            <option value="no">No</option>
                        </select>

                        </label>
                    </div>
                    
                </div>
                <%  
                        int user_id = 0;
                        int hotel_id=0;
                        if (se.getAttribute("user_id") != null && request.getParameter("hotel_id")!=null) {
                            hotel_id=Integer.parseInt(request.getParameter("hotel_id"));
                            user_id = (int) se.getAttribute("user_id");
                             //out.print("hotel id "+hotel_id);
                             //out.print("user id "+user_id);

                        }
                    %>
                <input type="hidden" name="hotel_id" value=<%out.print(hotel_id);%>>
                <input type="hidden" name="user_id" value=<%out.print(user_id);%>>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
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