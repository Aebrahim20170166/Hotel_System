package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import backend.Rooms;
import java.sql.ResultSet;
import backend.Reservations;

public final class reservations_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.html", out, false);
      out.write("\n");
      out.write("<!-- Content Wrapper. Contains page content -->\n");
      out.write("  <div class=\"content-wrapper\">\n");
      out.write("    <!-- Content Header (Page header) -->\n");
      out.write("    <section class=\"content-header\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row mb-2\">\n");
      out.write("          <div class=\"col-sm-6\">\n");
      out.write("            <h1>Reservations</h1>\n");
      out.write("            <br> \n");
      out.write("             <form method=\"post\" action=\"res_search.jsp\">\n");
      out.write("                     \n");
      out.write("                      <button class=\"btn btn-primary\">Search</button>\n");
      out.write("                  </form>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-sm-6\">\n");
      out.write("            <ol class=\"breadcrumb float-sm-right\">\n");
      out.write("              <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\n");
      out.write("              <li class=\"breadcrumb-item active\">Reservations</li>\n");
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
      out.write("             \n");
      out.write("              <div class=\"card-header\">\n");
      out.write("                <h3 class=\"card-title\">All Reservations with CRUD</h3><br>\n");
      out.write("        \n");
      out.write("              </div>\n");
      out.write("              <!-- /.card-header -->\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                  <table id=\"database-table\">\n");
      out.write("                      <thead>\n");
      out.write("                      <tr>\n");
      out.write("                          <th>Customer ID</th>\n");
      out.write("                          <th>Reservation Date</th>\n");
      out.write("                          <th>Check In</th>\n");
      out.write("                          <th>Check Out</th>\n");
      out.write("                          <th>Room Type</th>\n");
      out.write("                          <th>Room Number</th>\n");
      out.write("                           <th>payment</th>\n");
      out.write("                           <th>Checking</th>\n");
      out.write("                           <th>confirm payment</th>\n");
      out.write("                           <th>check in/out</th>\n");
      out.write("                          <th>Delete</th>\n");
      out.write("                          \n");
      out.write("                          \n");
      out.write("                      </tr>\n");
      out.write("                      </thead>\n");
      out.write("                      ");

                         
                          
                  Reservations r=new Reservations();
                  ResultSet rs=r.getresinfo();
                // int counter=1;
                 String room_type="";
                  int r_n=0;
                   Rooms rm=new Rooms(); 
                    //int room_number=rs.getInt("room_number");
                 // out.print(room_number);
                  
               
                  while (rs.next()) {
                  int room_number=rs.getInt("room_number");
                  //out.print(room_number);
                  ResultSet rs2=rm.getRoom( room_number);
                   
                   while(rs2.next()){
                   
               room_type=rs2.getString("type");
                   r_n=rs2.getInt("room_number");}
                
      out.write("\n");
      out.write("                  <tbody>\n");
      out.write("                      <tr>\n");
      out.write("                          <td>");
 out.println(rs.getInt("user_id"));
      out.write("</td>\n");
      out.write("                          <td>");
 out.println(rs.getTimestamp("reservation_date"));
      out.write("</td>\n");
      out.write("                          <td>");
 out.println(rs.getTimestamp("check_in"));
      out.write("</td>\n");
      out.write("                          <td>");
 out.println(rs.getTimestamp("check_out"));
      out.write("</td>\n");
      out.write("                          <td>");
 out.println(room_type); 
      out.write(" </td>\n");
      out.write("                          <td>");
out.println(r_n);
      out.write("</td>\n");
      out.write("                          ");
 if (rs.getBoolean("payment")==true){ 
      out.write("\n");
      out.write("                           <td>");
 out.println("confirmed");
      out.write("</td>\n");
      out.write("                           ");
 } else { 
      out.write("\n");
      out.write("                           <td>");
 out.println(" not confirmed");
      out.write("</td>\n");
      out.write("                           ");
 } 
      out.write("\n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                           <td>");
 out.println(rs.getString("client_state"));
      out.write("</td>\n");
      out.write("                          \n");
      out.write("                           \n");
      out.write("                           ");
 if (rs.getBoolean("payment")==false){ 
      out.write("\n");
      out.write("                          <td>\n");
      out.write("                             <form method=\"post\" action=\"confirm\">\n");
      out.write("                                 <input type=\"hidden\" name=\"reservation_id\" value=");
 out.println(rs.getInt("id"));
      out.write(">\n");
      out.write("                                  <button type=\"submit\" name=\"confirm\"   class=\"btn btn-danger\">confirm</button>\n");
      out.write("                              </form>\n");
      out.write("                              </td>\n");
      out.write("                               ");
 } else { 
      out.write("\n");
      out.write("                               \n");
      out.write("                                <td>\n");
      out.write("                             <form>\n");
      out.write("                                <button type=\"submit\" disabled name=\"confirm\"   class=\"btn btn-success\">confirm</button>\n");
      out.write("                              </form>\n");
      out.write("                               ");
 }
      out.write("\n");
      out.write("                               \n");
      out.write("                                \n");
      out.write("                                <td>\n");
      out.write("                             <form method=\"post\">\n");
      out.write("                                 <input type=\"hidden\" name=\"reservation_id\" value=");
 out.println(rs.getInt("id"));
      out.write(">\n");
      out.write("                                  <button type=\"submit\" name=\"check\"   class=\"btn btn-danger\">check in/out</button>\n");
      out.write("                              </form>\n");
      out.write("                              </td>\n");
      out.write("                           \n");
      out.write("                          <td>\n");
      out.write("                              <form method=\"post\" action=\"delete_reservation\">\n");
      out.write("                                  <input type=\"hidden\" name=\"reservation_id\" value=");
 out.println(rs.getInt("id"));
      out.write(">\n");
      out.write("                                  <button type=\"submit\" name=\"submit_delete\"   class=\"btn btn-danger\">Delete</button>\n");
      out.write("                              </form>\n");
      out.write("                              </td>\n");
      out.write("                          \n");
      out.write("                        \n");
      out.write("                      </tr>\n");
      out.write("                 \n");
      out.write("                   </tbody>\n");
      out.write("                     ");

                  }
                  
      out.write("\n");
      out.write("                  </table>\n");
      out.write("                 \n");
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
