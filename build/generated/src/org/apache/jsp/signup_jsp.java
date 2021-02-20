package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title></title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <h2 class=\"heading\">Sign Up</h2>\n");
      out.write("            ");

          
            
      out.write("\n");
      out.write("            <form action=\"validate\" method=\"POST\">\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <input required type=\"text\" class=\"input-control\" placeholder=\"First name\" name=\"first_name\" autocomplete=\"off\">\n");
      out.write("                    <span class='error'></span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <input required type=\"text\" class=\"input-control\" placeholder=\"Last name\" name=\"last_name\" value=\"\" autocomplete=\"off\">\n");
      out.write("                    <span class='error'></span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <input required type=\"text\" class=\"input-control\" placeholder=\"Username\" name=\"user_name\" value=\"\" autocomplete=\"off\">\n");
      out.write("                    <span class='error'></span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <input required type=\"email\" class=\"input-control\" placeholder=\"Email address\" name=\"user_email\" autocomplete=\"off\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <input required type=\"text\" class=\"input-control\" placeholder=\"Phone number\" name=\"phone\" autocomplete=\"off\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"g-recaptcha\" data-sitekey=\"\"></div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <input type=\"submit\" class=\"input-submit\" value=\"SIGN UP\" name=\"sign-up\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sign-up-cta\"><span>Already have an account?</span> <a href=\"login.html\">Login here</a></div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("       <script src=\"https://www.google.com/recaptcha/api.js\"></script>\n");
      out.write("</body>\n");
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
