
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<html>
    <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title></title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
        <div class="container">
        <div class="content">
            <h2 class="heading">Sign Up</h2>
            <%
                String error="";
             if(request.getParameter("error")!=null)
             {
                 error=request.getParameter("error");
             }
            %>
            <form action="validate" method="POST">
                <div class="input-box">
                    <input required type="text" class="input-control" placeholder="First name" name="first_name" autocomplete="off">
                    <span class='error'></span>
                </div>
                <div class="input-box">
                    <input required type="text" class="input-control" placeholder="Last name" name="last_name" value="" autocomplete="off">
                    <span class='error'></span>
                </div>
                <div class="input-box">
                    <input required type="text" class="input-control" placeholder="Username" name="user_name" value="" autocomplete="off">
                    <span class='error'><%out.print(error);%></span>
                </div>
                <div class="input-box">
                    <input required type="email" class="input-control" placeholder="Email address" name="user_email" autocomplete="off">
                </div>
                
                <div class="input-box">
                    <input required type="text" class="input-control" placeholder="Phone number" name="phone" autocomplete="off">
                </div>
                
                <div class="g-recaptcha" data-sitekey=""></div>
                <div class="input-box">
                    <input type="submit" class="input-submit" value="SIGN UP" name="sign-up">
                </div>
                <div class="sign-up-cta"><span>Already have an account?</span> <a href="login.html">Login here</a></div>
            </form>

        </div>
    </div>
       <script src="https://www.google.com/recaptcha/api.js"></script>
</body>
</html>
