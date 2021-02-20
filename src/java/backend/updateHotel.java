/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alaa_Ibrahim
 */
@WebServlet(name = "updateHotel", urlPatterns = {"/updateHotel"})
public class updateHotel extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            int id=Integer.parseInt(request.getParameter("hotel_id"));
            String hotelName=request.getParameter("hName");
            String Location=request.getParameter("location");
            String phoneNumber=request.getParameter("phone");
            String Facilities=request.getParameter("facilities");
            int distance=Integer.parseInt(request.getParameter("distance"));
            int roomsAvailable=Integer.parseInt(request.getParameter("noRooms"));
            float price=Float.parseFloat(request.getParameter("price"));
            int hotelStars=Integer.parseInt(request.getParameter("stars"));
            int meals=1;
            //out.println(request.getParameter("meals"));
            if( (request.getParameter("meals")).equals("yes") )
                meals=1;
            else
                meals=0;
            Hotel hotel=new Hotel();
            hotel.name=hotelName;
            hotel.location=Location;
            hotel.phoneNumber=phoneNumber;
            hotel.Facilities=Facilities;
            hotel.roomsAvailable=roomsAvailable;
            hotel.distance=distance;
            hotel.hotelStars=hotelStars;
            hotel.meals=meals;
            hotel.price=price;
            if(hotel.updateHotel(id)>=1)
            {
                response.sendRedirect("hotels.jsp");
            }
            else{
                response.sendRedirect("update-hotel.jsp?error=failed");
            }
            
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
