<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
   <head>
      <style>
          body
          {
            background-color: #f0f0f0;
            background-image: url("signin.jpg");
            background-position: center; /* Center the image */
            background-repeat: no-repeat; /* Do not repeat the image */
            background-size: cover; /* Resize the background image to cover the entire container to cover the entire container */

          }
       form
          {
              width:400px;
              height:620px;
              margin-bottom:35px;
              margin-top:22px;
              margin-left:30px;
              border:1px solid #DDD;
              background-color: initial;


          }
          form #d1
          {
              margin-top:163px;
              margin-left:30px;
              border:1px solid #00f;
              width:340px;
              height:50px;
              background-color:#4267B2;
              
              
          }
          form #d1 a
          {
              text-decoration: none;
              margin-left: 80px;
              font-weight: 810;
              color:#F7F7F7;
              font-family:sans-serif;
              margin-top:15px;
              position: absolute;
              font-weight: 700;
          }
          form #span1
          {
              margin-left:140px;
              margin-top:35px;
              text-align: center;
              color:black;
              font-size: 35px;
              position: absolute;
              font-family:sans-serif
          }
          form #span2
          {
              margin-left:130px;
              text-align: center;
               position: absolute;
              margin-top:115px;
              font-size: 25px
          }
          form #span3
          {
              width:120px;
              height:30px;
              margin-left:30px;
              border-top-style: solid;
              border-top-width: 1px;
              border-top-color: #DEDEDE;
          }
          form #span4
          {
              margin-left:150px 
          }
          form #span5
          {
              width:145px;
              border-top-style: solid;
              border-top-width: 1px;
              border-top-color: #DEDEDE;
              color:red;
          }
          form #in1,#in2
          {
              width:340px;
              border:1px solid #00f;
              margin-left: 30px;
              font-size: 16px;
              height: 46px;
              background-color:white;
              border: 1px solid #acbac7;
              border-radius: 3px;
              box-shadow: 0 0 0 1px transparent;
              color: #acbac7;
          }
          form #d2
          {
              
              width:340px;
              height:45px;
              margin-left: 30px
          }
          form #d2 #re
          {
              margin-top:18px
          }
          form #d2 a
          {
              text-decoration: none;
              color:#0087e0;
              float:right;
              margin-top:18px
          }
          form #d2 a:hover
          {
              text-decoration: underline
          }
          
          form #d3
          {
              width:335px;
              height:45px;
              margin-left: 35px;
              border-top: 1px solid #dedede;
                color: #f7f7f7;
                display: block;
                padding-top: 16px;
                text-align: center;
          }
          /*Don't have an account?*/
          form #d3 span
          {
              margin-left:15px; 
          }
          /*sign up*/
          form #d3 a
          {
              text-decoration: none;
              color: #0087e0;
          }
          form #d3 a:hover
          {
              text-decoration: underline
          }
          /*log in*/
          form button
          {
              width:340px;
              height:40px;
              border:1px solid #0087e0;
              background-color:#0087e0;
              color:#F7F7F7;
              margin-left:32px;
              text-align: center;
              font-size: 1.25rem;
              border-radius: 3px;
          }
          .error {
                color: red;
                font-size: 1.4rem;
                margin-top: 5rem;
                margin-left: 5rem;
            }
      </style>
    </head>
    <body>
        <%
            String error="";
            if(request.getParameter("error")!=null)
            {
                error=request.getParameter("error");
            }
        %>
      <form id="myform" action="validate_signin" method="post">
          <span class="error"><%out.print(error);%></span>
        <div id="d1"><a href="#d1">Login With Facebook</a></div><br>
        <span id="span3"></span>
        <span id="span4">OR</span>
        <span id="span5"></span><br><br>
        
        <input id="in1" required type="email" name="email" placeholder="   Your Email Please "><br><br>
        <input id="in2" required type="password" name="password" placeholder="   Password"><br><br>
          <div id="d2">
            <input id="re" type="checkbox"> Remember me
            <a href="xxxx">Forgot password?</a>
          </div><br>
        
        <button type="submit" name="submit">Log IN</button><br><br><br><br>
          <div id="d3">
            <span>Don't have an account? </span><a href="signup.jsp" >Sign Up</a>
          </div>
           
      </form>
    </body>
</html>
