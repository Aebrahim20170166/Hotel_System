package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_002dhotel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("              <h3 class=\"card-title\">Add Course</h3>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.card-header -->\n");
      out.write("            <!-- form start -->\n");
      out.write("            <form>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"title\">Course Title</label>\n");
      out.write("                  <input type=\"text\" class=\"form-control\" id=\"title\" placeholder=\"Enter Title\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"price\">Course Price</label>\n");
      out.write("                  <input type=\"text\" class=\"form-control\" id=\"price\" placeholder=\"Enter Price\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"exampleInputFile\">File input</label>\n");
      out.write("                  <div class=\"input-group\">\n");
      out.write("                    <div class=\"custom-file\">\n");
      out.write("                      <input type=\"file\" class=\"custom-file-input\" id=\"exampleInputFile\">\n");
      out.write("                      <label class=\"custom-file-label\" for=\"exampleInputFile\">Choose file</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- /.card-header -->\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"title\">Course Body</label>\n");
      out.write("                  <textarea id=\"summernote\">\n");
      out.write("                    Place <em>some</em> <u>text</u> <strong>here</strong>\n");
      out.write("                  </textarea>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("<!--                  <div class=\"card-footer\">-->\n");
      out.write("<!--                    Visit <a href=\"https://github.com/summernote/summernote/\">Summernote</a> documentation for more examples and information about the plugin.-->\n");
      out.write("<!--                  </div>-->\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("              <!-- /.card-body -->\n");
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
