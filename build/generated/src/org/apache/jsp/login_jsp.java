package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("      <style>\n");
      out.write("          body\n");
      out.write("          {\n");
      out.write("            background-color: #f0f0f0;\n");
      out.write("            background-image: url(\"signin.jpg\");\n");
      out.write("            background-position: center; /* Center the image */\n");
      out.write("            background-repeat: no-repeat; /* Do not repeat the image */\n");
      out.write("            background-size: cover; /* Resize the background image to cover the entire container to cover the entire container */\n");
      out.write("\n");
      out.write("          }\n");
      out.write("       form\n");
      out.write("          {\n");
      out.write("              width:400px;\n");
      out.write("              height:620px;\n");
      out.write("              margin-bottom:35px;\n");
      out.write("              margin-top:22px;\n");
      out.write("              margin-left:30px;\n");
      out.write("              border:1px solid #DDD;\n");
      out.write("              background-color: initial;\n");
      out.write("\n");
      out.write("\n");
      out.write("          }\n");
      out.write("          form #d1\n");
      out.write("          {\n");
      out.write("              margin-top:163px;\n");
      out.write("              margin-left:30px;\n");
      out.write("              border:1px solid #00f;\n");
      out.write("              width:340px;\n");
      out.write("              height:50px;\n");
      out.write("              background-color:#4267B2;\n");
      out.write("              \n");
      out.write("              \n");
      out.write("          }\n");
      out.write("          form #d1 a\n");
      out.write("          {\n");
      out.write("              text-decoration: none;\n");
      out.write("              margin-left: 80px;\n");
      out.write("              font-weight: 810;\n");
      out.write("              color:#F7F7F7;\n");
      out.write("              font-family:sans-serif;\n");
      out.write("              margin-top:15px;\n");
      out.write("              position: absolute;\n");
      out.write("              font-weight: 700;\n");
      out.write("          }\n");
      out.write("          form #span1\n");
      out.write("          {\n");
      out.write("              margin-left:140px;\n");
      out.write("              margin-top:35px;\n");
      out.write("              text-align: center;\n");
      out.write("              color:black;\n");
      out.write("              font-size: 35px;\n");
      out.write("              position: absolute;\n");
      out.write("              font-family:sans-serif\n");
      out.write("          }\n");
      out.write("          form #span2\n");
      out.write("          {\n");
      out.write("              margin-left:130px;\n");
      out.write("              text-align: center;\n");
      out.write("               position: absolute;\n");
      out.write("              margin-top:115px;\n");
      out.write("              font-size: 25px\n");
      out.write("          }\n");
      out.write("          form #span3\n");
      out.write("          {\n");
      out.write("              width:120px;\n");
      out.write("              height:30px;\n");
      out.write("              margin-left:30px;\n");
      out.write("              border-top-style: solid;\n");
      out.write("              border-top-width: 1px;\n");
      out.write("              border-top-color: #DEDEDE;\n");
      out.write("          }\n");
      out.write("          form #span4\n");
      out.write("          {\n");
      out.write("              margin-left:150px \n");
      out.write("          }\n");
      out.write("          form #span5\n");
      out.write("          {\n");
      out.write("              width:145px;\n");
      out.write("              border-top-style: solid;\n");
      out.write("              border-top-width: 1px;\n");
      out.write("              border-top-color: #DEDEDE;\n");
      out.write("              color:red;\n");
      out.write("          }\n");
      out.write("          form #in1,#in2\n");
      out.write("          {\n");
      out.write("              width:340px;\n");
      out.write("              border:1px solid #00f;\n");
      out.write("              margin-left: 30px;\n");
      out.write("              font-size: 16px;\n");
      out.write("              height: 46px;\n");
      out.write("              background-color:white;\n");
      out.write("              border: 1px solid #acbac7;\n");
      out.write("              border-radius: 3px;\n");
      out.write("              box-shadow: 0 0 0 1px transparent;\n");
      out.write("              color: #acbac7;\n");
      out.write("          }\n");
      out.write("          form #d2\n");
      out.write("          {\n");
      out.write("              \n");
      out.write("              width:340px;\n");
      out.write("              height:45px;\n");
      out.write("              margin-left: 30px\n");
      out.write("          }\n");
      out.write("          form #d2 #re\n");
      out.write("          {\n");
      out.write("              margin-top:18px\n");
      out.write("          }\n");
      out.write("          form #d2 a\n");
      out.write("          {\n");
      out.write("              text-decoration: none;\n");
      out.write("              color:#0087e0;\n");
      out.write("              float:right;\n");
      out.write("              margin-top:18px\n");
      out.write("          }\n");
      out.write("          form #d2 a:hover\n");
      out.write("          {\n");
      out.write("              text-decoration: underline\n");
      out.write("          }\n");
      out.write("          \n");
      out.write("          form #d3\n");
      out.write("          {\n");
      out.write("              width:335px;\n");
      out.write("              height:45px;\n");
      out.write("              margin-left: 35px;\n");
      out.write("              border-top: 1px solid #dedede;\n");
      out.write("                color: #f7f7f7;\n");
      out.write("                display: block;\n");
      out.write("                padding-top: 16px;\n");
      out.write("                text-align: center;\n");
      out.write("          }\n");
      out.write("          /*Don't have an account?*/\n");
      out.write("          form #d3 span\n");
      out.write("          {\n");
      out.write("              margin-left:15px; \n");
      out.write("          }\n");
      out.write("          /*sign up*/\n");
      out.write("          form #d3 a\n");
      out.write("          {\n");
      out.write("              text-decoration: none;\n");
      out.write("              color: #0087e0;\n");
      out.write("          }\n");
      out.write("          form #d3 a:hover\n");
      out.write("          {\n");
      out.write("              text-decoration: underline\n");
      out.write("          }\n");
      out.write("          /*log in*/\n");
      out.write("          form button\n");
      out.write("          {\n");
      out.write("              width:340px;\n");
      out.write("              height:40px;\n");
      out.write("              border:1px solid #0087e0;\n");
      out.write("              background-color:#0087e0;\n");
      out.write("              color:#F7F7F7;\n");
      out.write("              margin-left:32px;\n");
      out.write("              text-align: center;\n");
      out.write("              font-size: 1.25rem;\n");
      out.write("              border-radius: 3px;\n");
      out.write("          }\n");
      out.write("          .error {\n");
      out.write("                color: red;\n");
      out.write("                font-size: 1.4rem;\n");
      out.write("                margin-top: 5rem;\n");
      out.write("                margin-left: 5rem;\n");
      out.write("            }\n");
      out.write("      </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String error="";
            if(request.getParameter("error")!=null)
            {
                error=request.getParameter("error");
            }
        
      out.write("\n");
      out.write("      <form id=\"myform\" action=\"validate_signin\" method=\"post\">\n");
      out.write("          <span class=\"error\">");
out.print(error);
      out.write("</span>\n");
      out.write("        <div id=\"d1\"><a href=\"#d1\">Login With Facebook</a></div><br>\n");
      out.write("        <span id=\"span3\"></span>\n");
      out.write("        <span id=\"span4\">OR</span>\n");
      out.write("        <span id=\"span5\"></span><br><br>\n");
      out.write("        \n");
      out.write("        <input id=\"in1\" required type=\"email\" name=\"email\" placeholder=\"   Your Email Please \"><br><br>\n");
      out.write("        <input id=\"in2\" required type=\"password\" name=\"password\" placeholder=\"   Password\"><br><br>\n");
      out.write("          <div id=\"d2\">\n");
      out.write("            <input id=\"re\" type=\"checkbox\"> Remember me\n");
      out.write("            <a href=\"xxxx\">Forgot password?</a>\n");
      out.write("          </div><br>\n");
      out.write("        \n");
      out.write("        <button type=\"submit\" name=\"submit\">Log IN</button><br><br><br><br>\n");
      out.write("          <div id=\"d3\">\n");
      out.write("            <span>Don't have an account? </span><a href=\"signup.jsp\" >Sign Up</a>\n");
      out.write("          </div>\n");
      out.write("           \n");
      out.write("      </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
