package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_002droom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- Main content -->\n");
      out.write("    <section class=\"content\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <!-- general form elements -->\n");
      out.write("          <div class=\"card card-primary\">\n");
      out.write("            <div class=\"card-header\">\n");
      out.write("              <h3 class=\"card-title\">Update Room</h3>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.card-header -->\n");
      out.write("            <!-- form start -->\n");
      out.write("            <form>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"name\">Name</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"name\" placeholder=\"Category\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
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
