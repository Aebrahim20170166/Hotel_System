package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_002droom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.html", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"content-wrapper\">\n");
      out.write("    <!-- Content Header (Page header) -->\n");
      out.write("    <section class=\"content-header\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row mb-2\">\n");
      out.write("          <div class=\"col-sm-6\">\n");
      out.write("            <h1>Rooms</h1>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-sm-6\">\n");
      out.write("            <ol class=\"breadcrumb float-sm-right\">\n");
      out.write("              <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\n");
      out.write("              <li class=\"breadcrumb-item active\">Rooms</li>\n");
      out.write("            </ol>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div><!-- /.container-fluid -->\n");
      out.write("<!-- Main content -->\n");
      out.write("    <section class=\"content\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <!-- general form elements -->\n");
      out.write("          <div class=\"card card-primary\">\n");
      out.write("            <div class=\"card-header\">\n");
      out.write("              <h3 class=\"card-title\">Add Room</h3>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.card-header -->\n");
      out.write("            <!-- form start -->\n");
      out.write("            <form method=\"post\" action=\"addRoom\" >\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"number\">Room Number</label>\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"num\" id=\"title\" placeholder=\"Room Number\">\n");
      out.write("                </div>\n");
      out.write("                  \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                      <label for=\"available\">Room Type</label>\n");
      out.write("                  <select name=\"type\" class=\"form-select\" aria-label=\"Default select example\">\n");
      out.write("                    <option selected>Choose</option>\n");
      out.write("                    <option value=\"singal\">Single</option>\n");
      out.write("                      <option value=\"double\">Double</option>\n");
      out.write("                  </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"phone\">Room Price</label>\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"price\" id=\"price\" placeholder=\"Room Price\">\n");
      out.write("                </div>\n");
      out.write("                  \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"available\">Availability</label>\n");
      out.write("                  <select name=\"available\" class=\"form-select\" aria-label=\"Default select example\">\n");
      out.write("                      <option value=\"yes\">Yes</option>\n");
      out.write("                      <option value=\"no\">No</option>\n");
      out.write("                      \n");
      out.write("                  </select>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("                  \n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                  <label for=\"room-facilities\">Room Facilities</label>\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"facilities\" id=\"price\" placeholder=\"Room Price\">\n");
      out.write("                </div>\n");
      out.write("              <!-- /.card-body -->\n");
      out.write("\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <button type=\"submit\" name=\"add_submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- ./row -->\n");
      out.write("    </section>\n");
      out.write("    <!-- /.content -->\n");
      out.write("  </div>\n");
      out.write("  <!-- /.content-wrapper -->\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write('\n');
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
