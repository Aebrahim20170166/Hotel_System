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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alaa_Ibrahim
 */
@WebServlet(name = "validate_signin", urlPatterns = {"/validate_signin"})
public class validate_signin extends HttpServlet {

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
            String email=request.getParameter("email");
            String password=request.getParameter("password");
            
            user u=new user();
            u.Email=email;
            u.Password=password;
            ResultSet rs=null;
            rs=u.sign();
            if(rs.next())
            {
                HttpSession session = request.getSession();
                //out.print("user id "+rs.getInt("id"));
                session.setAttribute("user_id", rs.getInt("id")); 
                if(rs.getInt("role")==1)
                {
                    int user_id=rs.getInt("id");
                    //out.print(user_id);
                    ResultSet rs2;
                    rs2 = u.getHotelId(user_id);
                    if(rs2.next())
                    {
                        
                        session.setAttribute("hotel_id", rs2.getInt("hotel_id")); 
                        response.sendRedirect("hotels.jsp");
                        
                    }
                    
                }
              response.sendRedirect("user/userHome.jsp");  
            }
            else
               response.sendRedirect("login.jsp?error=Invalid email or password"); 
            
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
