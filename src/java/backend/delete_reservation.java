/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.IOException;
import javax.mail.*;  
import javax.mail.internet.*;  
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Walaa Ibrahim
 */
@WebServlet(name = "delete_reservation", urlPatterns = {"/delete_reservation"})
public class delete_reservation extends HttpServlet {

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
      
            int user_id=0;
            int role=0;
       if(request.getParameter("user_id")!=null)
       {
           user_id=Integer.parseInt(request.getParameter("user_id"));
           user u=new user();
           ResultSet rs=u.getUserRole(user_id);
           if(rs.next())
           {
               role=rs.getInt("role");
           }
       }
       int res_id=Integer.parseInt(request.getParameter("res_id"));
        out.print("resv id "+res_id);
        Reservations reservation=new Reservations();
        int res=reservation.delete_res(res_id);
        if(res == 1)
        {
            //out.print("done");
            Email email=new Email();
            email.SendEmail();
            //out.print("done");
            if(role==1)
            {
                response.sendRedirect("reservations.jsp");
            }
            else{
                response.sendRedirect("user/userReservations.jsp");
            }
            
        }
        else
            out.print("error");
      //response.sendRedirect("reservations.jsp");
         
        }
        catch (Exception e)
        {
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
