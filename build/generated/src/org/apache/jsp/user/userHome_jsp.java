package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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


    HttpSession se=request.getSession(false);
    if(se.getAttribute("user_id")==null)
           response.sendRedirect("../login.jsp");
    
    
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <title>User Home</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"jumbotron\">\n");
      out.write("        <h1 class=\"display-4\">Search Hotels</h1>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container my-5\">\n");
      out.write("        <form method=\"post\" action=\"searchResults.jsp\">\n");
      out.write("              <div class=\"form-row\">\n");
      out.write("                  <p style=\"color:red\">\n");
      out.write("                ");
if(request.getParameter("result")!=null)
                {
                    out.print(request.getParameter("result"));
                }
                
                
      out.write("</p>\n");
      out.write("                  <div class=\"form-group col-md-12\">\n");
      out.write("                      <label for=\"location\">Location</label>\n");
      out.write("                      <input type=\"text\" class=\"form-control\" name=\"location\" placeholder=\"City, region or specific hotel\">\n");
      out.write("                  </div>\n");
      out.write("                  <br><br>\n");
      out.write("                <div class=\"form-group col-md-6\">\n");
      out.write("                  <label for=\"checkInDate\">Check in date</label>\n");
      out.write("                  <input type=\"date\" class=\"form-control\" id=\"checkInDate\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-6\">\n");
      out.write("                  <label for=\"checkOutDate\">Check out date</label>\n");
      out.write("                  <input type=\"date\" class=\"form-control\" id=\"checkOutDate\">\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-row\">\n");
      out.write("                <div class=\"form-group col-md-6\">\n");
      out.write("                  <label for=\"checkInTime\">Check in time</label>\n");
      out.write("                  <input type=\"time\" class=\"form-control\" id=\"checkInTime\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-6\">\n");
      out.write("                  <label for=\"checkOutTime\">Check out time</label>\n");
      out.write("                  <input type=\"time\" class=\"form-control\" id=\"checkOutTime\">\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            <span style=\"color:red\">\n");
      out.write("                ");
if(request.getParameter("error")!=null)
                {
                    out.print(request.getParameter("error"));
                }
                
                
      out.write("</span>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"nPersons\">Number of persons</label>\n");
      out.write("                <input type=\"text\" name=\"nPersons\" class=\"form-control\" id=\"nPersons\" placeholder=\"eg: '8' \">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("              </div>\n");
      out.write("              <button type=\"submit\" class=\"btn btn-primary\">Search</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- Main JS-->\n");
      out.write("    <script src=\"js/global.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>");
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
