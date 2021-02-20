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
@WebServlet(name = "addRoom", urlPatterns = {"/addRoom"})
public class addRoom extends HttpServlet {

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
        //PreparedStatement st = null;
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            int roomNumber=Integer.parseInt(request.getParameter("num"));
            String roomType=request.getParameter("type");
            float price=Integer.parseInt(request.getParameter("price"));
            String Facilities=request.getParameter("facilities");
            int availabe=0;
            //out.println(request.getParameter("meals"));
            if( request.getParameter("available").equals("yes") )
                availabe=1;
            else
                availabe=0;
            /*out.println(roomNumber);
            out.println(roomType);
            out.println(price);
            out.println(Facilities);
            
            Connection conn=null; 
            DatabaseConnection db=new DatabaseConnection();
            conn =db.Connect();
            out.print(conn);
            st=conn.prepareStatement("INSERT INTO hotel_system.rooms(type,room_number,price,hotel_id,"
                    + "Availability,Facilities	) VALUES(?,?,?,?,?,?)");
            
            st.setString(1, roomType);
            st.setInt(2, roomNumber);
            st.setFloat(3, price);
            st.setInt(4,3);
            st.setInt(5,availabe);
            st.setString(6, Facilities);
            
            if(st.executeUpdate()==1)
                out.println("ok");*/
            Rooms room=new Rooms();
            //out.println(room.conn);
            room.roomNumber=roomNumber;
            room.Facilities=Facilities;
            room.availabe=availabe;
            room.price=price;
            room.roomType=roomType;
            room.hotel_id=4;
            
            String ret=room.insert();
            out.println("Data is"+ret);
            
            
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
