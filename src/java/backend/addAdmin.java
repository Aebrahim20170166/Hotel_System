/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alaa_Ibrahim
 */
@WebServlet(name = "addAdmin", urlPatterns = {"/addAdmin"})
public class addAdmin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PreparedStatement st = null;
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String adminName=request.getParameter("name");
            String Email=request.getParameter("email");
            String Password=request.getParameter("password");
            String phoneNumber=request.getParameter("phone");
            
            /*Connection conn=null; 
            DatabaseConnection db=new DatabaseConnection();
            conn =db.Connect();
            out.print(conn);
            st=conn.prepareStatement("INSERT INTO hotel_system.user(name,email,password,role,phone) VALUES(?,?,?,?,?)");
            
            st.setString(1, adminName);
            st.setString(2, Email);
            st.setString(3, Password);
            st.setInt(4, 1);
            st.setString(5, phoneNumber);
            if(st.executeUpdate()==1)
                out.println("ok");*/
           user admin=new user();
           admin.firstName=adminName;
           admin.Email=Email;
           admin.phoneNumber=phoneNumber;
           admin.Password=Password;
           
           String ret=admin.insertAdmin();
           out.println("Data is "+ret);
            
            
            }catch (Exception e){
                e.printStackTrace();
                
            }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
