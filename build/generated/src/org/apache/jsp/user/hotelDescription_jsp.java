package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import backend.Hotel;

public final class hotelDescription_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <title>Hotel description</title>\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("\n");
      out.write("    \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("  \n");
      out.write("    ");
 out.print(request.getParameter("id")); 
      out.write("\n");
      out.write("    <div class=\"jumbotron\">\n");
      out.write("        <h1 class=\"display-4\">Hotel description</h1>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"card my-5\" style=\"width: auto;\">\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <h5 class=\"card-title\">Hotel Description: </h5>\n");
      out.write("            </div>\n");
      out.write("           ");
    int id=Integer.valueOf(request.getParameter("id"));
               Hotel h= new Hotel();
            ResultSet rs=h.getHotel(id);
              while (rs.next()) { 
           
      out.write("\n");
      out.write("            <ul class=\"list-group list-group-flush\">\n");
      out.write("                <li class=\"list-group-item\">Hotel Name : ");
 out.print(rs.getString("name")); 
      out.write(" </li>\n");
      out.write("                <li class=\"list-group-item\">Location:  ");
 out.print(rs.getString("location")); 
      out.write("</li>\n");
      out.write("                <li class=\"list-group-item\">Rooms available:  ");
 out.print(rs.getInt("rooms_available")); 
      out.write(" </li>\n");
      out.write("                <li class=\"list-group-item\">Phone:  ");
 out.print(rs.getString("phone_number")); 
      out.write(" </li>\n");
      out.write("                <li class=\"list-group-item\">Stars:  ");
 out.print(rs.getInt("hotel_stars")); 
      out.write("  </li>\n");
      out.write("                <li class=\"list-group-item\">Distance from city: ");
 out.print(rs.getFloat("distance")); 
      out.write(" </li>\n");
      out.write("                <li class=\"list-group-item\">Meals:");
 
                    if(rs.getInt("meals")==1){
                    out.print(" Yes");} 
                   else{  out.print(" No");
                   }
      out.write("\n");
      out.write("                </li>\n");
      out.write("                <li class=\"list-group-item\">Facilities: ");
 out.print(rs.getString("Facilities")); 
      out.write(" </li>\n");
      out.write("                 \n");
      out.write("                     ");

                  }
                  
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <a href=\"#\" class=\"card-link\">View photos</a>\n");
      out.write("                <a href=\"makeReservation.jsp\" class=\"card-link\">Make reservation</a>\n");
      out.write("                <a href=\"comments.jsp\" class=\"card-link\">Rate hotel</a>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Optional JavaScript; choose one of the two! -->\n");
      out.write("\n");
      out.write("    <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    <!-- Option 2: jQuery, Popper.js, and Bootstrap JS\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js\" integrity=\"sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s\" crossorigin=\"anonymous\"></script>\n");
      out.write("    -->\n");
      out.write("  </body>\n");
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
