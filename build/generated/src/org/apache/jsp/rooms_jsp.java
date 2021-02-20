package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rooms_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.html", out, false);
      out.write("\n");
      out.write("  <!-- Content Wrapper. Contains page content -->\n");
      out.write("  <div class=\"content-wrapper\">\n");
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
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- Main content -->\n");
      out.write("    <section class=\"content\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-12\">\n");
      out.write("\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <div class=\"card-header\">\n");
      out.write("                <h3 class=\"card-title\">All Rooms with CRUD</h3><br>\n");
      out.write("                  <a href=\"add-room.jsp\" class=\"btn btn-success\">Add Room</a>\n");
      out.write("              </div>\n");
      out.write("              <!-- /.card-header -->\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                  \n");
      out.write("                  <table id=\"database-table\">\n");
      out.write("                      <tr>\n");
      out.write("                          <th>ID</th>\n");
      out.write("                          <th>Number</th>\n");
      out.write("                          <th>Type</th>\n");
      out.write("                          <th>Price</th>\n");
      out.write("                          <th>Availability</th>\n");
      out.write("                          <th>Facilities</th>\n");
      out.write("                          <th>Delete</th>\n");
      out.write("                          <th>Update</th>\n");
      out.write("                      </tr>\n");
      out.write("                      \n");
      out.write("                      <tr>\n");
      out.write("                          <td>1</td>\n");
      out.write("                          <td>5</td>\n");
      out.write("                          <td>Double</td>\n");
      out.write("                          <td>1500</td>\n");
      out.write("                          <td>Yes</td>\n");
      out.write("                          <td>television,pan,vacum cleaner</td>\n");
      out.write("                          <td><form method=\"post\" action=\"\">\n");
      out.write("                          <input type=\"hidden\" name=\"room_id\" value=\"\">\n");
      out.write("                          <input type=\"hidden\" name=\"script\" value=\"\">\n");
      out.write("                          <button type=\"submit\" name=\"submit_delete\" class=\"btn btn-danger\">Delete</button>\n");
      out.write("                          </form></td>\n");
      out.write("                          <td>\n");
      out.write("                              <a href=\"update-room.jsp\">\n");
      out.write("                          <button type=\"submit\" name=\"submit_update\" class=\"btn btn-primary\">Update</button>\n");
      out.write("                              </a>\n");
      out.write("                          </td>\n");
      out.write("                      </tr>\n");
      out.write("                      \n");
      out.write("                  </table>\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("              <!-- /.card-body -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.card -->\n");
      out.write("          </div>\n");
      out.write("          <!-- /.col -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.row -->\n");
      out.write("      </div>\n");
      out.write("      <!-- /.container-fluid -->\n");
      out.write("    </section>\n");
      out.write("    <!-- /.content -->\n");
      out.write("  </div>\n");
      out.write("  <!-- /.content-wrapper -->\n");
      out.write("  \n");
      out.write("\n");
      out.write("  <!-- Control Sidebar -->\n");
      out.write("  <aside class=\"control-sidebar control-sidebar-dark\">\n");
      out.write("    <!-- Control sidebar content goes here -->\n");
      out.write("  </aside>\n");
      out.write("  <!-- /.control-sidebar -->\n");
      out.write("</div>\n");
      out.write("<!-- ./wrapper -->\n");
      out.write("\n");
      out.write("<!-- jQuery -->\n");
      out.write("<!-- Page specific script -->\n");
      out.write("\n");
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
