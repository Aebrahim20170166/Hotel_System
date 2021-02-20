<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

    <title>Comments</title>
  </head>
  <body>
    <div class="jumbotron">
        <h1 class="display-4">Please leave your comments and rating</h1>
    </div>
    <div class="container my-5">
        <%
         int hotel_id=0;
        if(request.getParameter("hotel_id")!=null)
        {
            hotel_id=Integer.parseInt(request.getParameter("hotel_id"));
        }
        %>
        <form method="post" action="../addReview">
          
          <h3>Comments: </h3>
          <input required type="text" id="comments" name="comments" placeholder="Comment" style="width: 1000px;height: 50px"><br><br>
          <div>
                    <h3>Ratings: </h3>
                    <input type="radio" id="1star" name="rating" value="1">
                    <label for="1star">1 star</label><br>
                    <input type="radio" id="2star" name="rating" value="2">
                    <label for="2star">2 stars</label><br>
                    <input type="radio" id="3star" name="rating" value="3">
                    <label for="3star">3 stars</label><br>
                    <input type="radio" id="4star" name="rating" value="4">
                    <label for="4star">4 stars</label><br>
                    <input type="radio" id="5star" name="rating" value="5">
                    <label for="5star">5 stars</label><br>
            </div>
          <input type="hidden" name="hotel_id" value=<%out.print(hotel_id);%>>
          
          <button type="submit" class="btn btn-primary my-5">Submit</button>
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