package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import backend.Hotel;

public final class hotels_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

    int hotel_id = 0;
    int user_id = 0;
    HttpSession se = request.getSession(false);
    if (se.getAttribute("user_id") == null && se.getAttribute("hotel_id") == null) {
        response.sendRedirect("login.jsp");
    } else {
        hotel_id = (int) se.getAttribute("hotel_id");
        user_id = (int) se.getAttribute("user_id");

    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>AdminLTE 3 | DataTables</title>\n");
      out.write("\n");
      out.write("        <!-- Google Font: Source Sans Pro -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../plugins/fontawesome-free/css/all.min.css\">\n");
      out.write("        <!-- DataTables -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../plugins/datatables-bs4/css/dataTables.bootstrap4.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../plugins/datatables-responsive/css/responsive.bootstrap4.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../plugins/datatables-buttons/css/buttons.bootstrap4.min.css\">\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"adminlte.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"hold-transition sidebar-mini\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <!-- Navbar -->\n");
      out.write("\n");
      out.write("            <!-- /.navbar -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Main Sidebar Container -->\n");
      out.write("            <aside class=\"main-sidebar sidebar-dark-primary elevation-4\">\n");
      out.write("                <!-- Brand Logo -->\n");
      out.write("                <a href=\"../../index.php\" class=\"brand-link\">\n");
      out.write("                    <span class=\"brand-text font-weight-light\">Admin</span>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <!-- Sidebar -->\n");
      out.write("                <div class=\"sidebar\">\n");
      out.write("\n");
      out.write("                    <!-- Sidebar Menu -->\n");
      out.write("                    <nav class=\"mt-2\">\n");
      out.write("                        <ul class=\"nav nav-pills nav-sidebar flex-column\" data-widget=\"treeview\" role=\"menu\" data-accordion=\"false\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a href=\"hotels.jsp\" class=\"nav-link\">\n");
      out.write("                                    <i class=\"nav-icon fas fa-book\"></i>\n");
      out.write("                                    <p>\n");
      out.write("                                        Hotels\n");
      out.write("                                    </p>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a href=\"rooms.jsp\" class=\"nav-link\">\n");
      out.write("                                    <i class=\"nav-icon fas fa-book\"></i>\n");
      out.write("                                    <p>\n");
      out.write("                                        Rooms\n");
      out.write("                                    </p>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a href=\"reservations.jsp\" class=\"nav-link\">\n");
      out.write("                                    <i class=\"nav-icon fas fa-edit\"></i>\n");
      out.write("                                    <p>\n");
      out.write("                                        Reservations\n");
      out.write("                                    </p>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a href=\"current_reservations.jsp\" class=\"nav-link\">\n");
      out.write("                                    <i class=\"nav-icon fas fa-edit\"></i>\n");
      out.write("                                    <p>\n");
      out.write("                                        Current Reservations\n");
      out.write("                                    </p>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a href=\"users_search.jsp\" class=\"nav-link\">\n");
      out.write("                                    <i class=\"nav-icon fas fa-edit\"></i>\n");
      out.write("                                    <p>\n");
      out.write("                                        View Users\n");
      out.write("                                    </p>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a href=\"view_reviews.jsp\" class=\"nav-link\">\n");
      out.write("                                    <i class=\"nav-icon fas fa-edit\"></i>\n");
      out.write("                                    <p>\n");
      out.write("                                        Reviews\n");
      out.write("                                    </p>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a href=\"images.jsp\" class=\"nav-link\">\n");
      out.write("                                    <i class=\"nav-icon fas fa-edit\"></i>\n");
      out.write("                                    <p>\n");
      out.write("                                        Photos\n");
      out.write("                                    </p>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a href=\"../forms/update-about.php\" class=\"nav-link\">\n");
      out.write("                                    <i class=\"nav-icon fas fa-edit\"></i>\n");
      out.write("                                    <p>\n");
      out.write("                                        About Us\n");
      out.write("                                    </p>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a href=\"admins.jsp\" class=\"nav-link\">\n");
      out.write("                                    <i class=\"nav-icon fas fa-edit\"></i>\n");
      out.write("                                    <p>\n");
      out.write("                                        Admins\n");
      out.write("                                    </p>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                    <!-- /.sidebar-menu -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.sidebar -->\n");
      out.write("            </aside>\n");
      out.write("\n");
      out.write("            <!-- Content Wrapper. Contains page content -->\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("                <!-- Content Header (Page header) -->\n");
      out.write("                <section class=\"content-header\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row mb-2\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <h1>Hotel</h1>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <ol class=\"breadcrumb float-sm-right\">\n");
      out.write("                                    <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\n");
      out.write("                                    <li class=\"breadcrumb-item active\">Info's Hotel</li>\n");
      out.write("                                </ol>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div><!-- /.container-fluid -->\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <!-- Main content -->\n");
      out.write("                <section class=\"content\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-header\">\n");
      out.write("                                        <h3 class=\"card-title\">Hotel With CRUD</h3><br>\n");
      out.write("                                        <a href=\"add-hotel.jsp\" class=\"btn btn-success\">Add Hotel</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /.card-header -->\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <table id=\"example1\" class=\"table table-bordered table-striped\">\n");
      out.write("                                            <thead>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <th>ID</th>\n");
      out.write("                                                    <th>Name</th>\n");
      out.write("                                                    <th>Location</th>\n");
      out.write("                                                    <th>Rooms Available</th>\n");
      out.write("                                                    <th>Phone Number</th>\n");
      out.write("                                                    <th>Stars</th>\n");
      out.write("                                                    <th>Have meals</th>\n");
      out.write("                                                    <th>Price</th>\n");
      out.write("                                                    <th>Distance</th>\n");
      out.write("                                                    <th>Facilities</th>\n");
      out.write("                                                    <th>Delete</th>\n");
      out.write("                                                    <th>Update</th>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("                                            ");

                                                Hotel hotel = new Hotel();
                                                ResultSet rs = hotel.getHotel(hotel_id);
                                                int counter = 1;
                                                while (rs.next()) {
                                            
      out.write("\n");
      out.write("                                            <tbody>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>");
out.println(counter++);
      out.write("</td>\n");
      out.write("                                                    <td>");
 out.println(rs.getString("name"));
      out.write("</td>\n");
      out.write("                                                    <td>");
 out.println(rs.getString("location"));
      out.write("</td>\n");
      out.write("                                                    <td>");
 out.println(rs.getInt("rooms_available"));
      out.write("</td>\n");
      out.write("                                                    <td>");
 out.println(rs.getString("phone_number"));
      out.write("</td>\n");
      out.write("                                                    <td>");
 out.println(rs.getInt("hotel_stars"));
      out.write("</td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        ");

                                                            if (rs.getInt("meals") == 1) {
                                                                out.println("Yes");
                                                            } else {
                                                                out.println("No");
                                                            }
                                                        
      out.write("\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>");
 out.println(rs.getFloat("price"));
      out.write("</td>\n");
      out.write("                                                    <td>");
 out.println(rs.getInt("distance"));
      out.write("</td>\n");
      out.write("\n");
      out.write("                                                    <td>");
 out.println(rs.getString("Facilities"));
      out.write("</td>\n");
      out.write("                                                    <td><form method=\"post\" action=\"deleteHotel\">\n");
      out.write("                                                            <input type=\"hidden\" name=\"hotel_id\" value=");
 out.println(rs.getInt("id"));
      out.write(">\n");
      out.write("                                                            <input type=\"hidden\" name=\"script\" value=\"\">\n");
      out.write("                                                            <button type=\"submit\" name=\"submit_delete\" class=\"btn btn-danger\">Delete</button>\n");
      out.write("                                                        </form></td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <a href=\"update-hotel.jsp?id=");
out.println(rs.getInt("id"));
      out.write("\"><button class=\"btn btn-primary\">Update</button></a>\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("\n");
      out.write("                                            </tbody>\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\n");
      out.write("                                        </table>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /.card-body -->\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.card -->\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.col -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.row -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.container-fluid -->\n");
      out.write("                </section>\n");
      out.write("                <!-- /.content -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.content-wrapper -->\n");
      out.write("\n");
      out.write("            ");
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
