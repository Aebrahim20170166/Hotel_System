package backend;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
@WebServlet(urlPatterns = {"/addHotel"})
public class addHotel extends HttpServlet {

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
            /* recieve hotel data */
            String hotelName=request.getParameter("hName");
            String Location=request.getParameter("location");
            String phoneNumber=request.getParameter("phone");
            String Facilities=request.getParameter("facilities");
            int distance=Integer.parseInt(request.getParameter("distance"));
            int roomsAvailable=Integer.parseInt(request.getParameter("noRooms"));
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
            String result=hotel.insert();
            if(!result.equals(""))
            {
                response.sendRedirect("hotels.jsp");
            }
            /*Connection conn=null; 
            DatabaseConnection db=new DatabaseConnection();
            conn =db.Connect();
            out.print(conn);
            st=conn.prepareStatement("INSERT INTO hotel_system.hotel(name,location,rooms_available,phone_number,"
                    + "hotel_stars,distance,meals) VALUES(?,?,?,?,?,?,?)");
            
            st.setString(1, hotelName);
            st.setString(2, Location);
            st.setInt(3, roomsAvailable);
            st.setString(4, phoneNumber);
            
            st.setInt(5, hotelStars);
            st.setInt(6, distance);
            st.setInt(7, meals);
            if(st.executeUpdate()==1)
                out.println("ok");*/
            
            
            }catch (Exception e){
                e.printStackTrace();
                
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet validate</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
        
            
        
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
