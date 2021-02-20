/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alaa_Ibrahim
 */
@WebServlet(name = "validate", urlPatterns = {"/validate"})
public class validate extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
                String Fname=request.getParameter("first_name");
                String Lname=request.getParameter("last_name");
                String Username=request.getParameter("user_name");
                String Email=request.getParameter("user_email");
                String Phone=request.getParameter("phone");
                user u=new user();
                ResultSet rs=u.getAllUsers(Username);
                if(rs.next())
                    response.sendRedirect("signup.jsp?error=username is already existed");
                else{
                    String password=u.generatePassword();
                    Email email=new Email();
                    email.receiver=Email;
                    email.subject="Regesteration in hotel system";
                    email.content="Thank you for you regesteration \n and this is your password to used it in sign in"
                            + "\nPassword: "+password;
                    email.SendEmail();
                    u.firstName=Fname;
                    u.lastName=Lname;
                    u.username=Username;
                    u.Email=Email;
                    u.Password=password;
                    u.phoneNumber=Phone;
                    if(u.insertAdmin().equals("inserted"))
                        response.sendRedirect("login.jsp");
                    
                }
                
                //Email email=new Email();
                
                
                
        }
        catch (Exception e){
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
