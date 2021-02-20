/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.ResultSet;
import java.sql.Timestamp;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alaa_Ibrahim
 */
@WebServlet(name = "update_res", urlPatterns = {"/update_res"})
public class update_res extends HttpServlet {

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
            int res_id=Integer.parseInt(request.getParameter("res_id"));
            out.print(res_id);
            String chin="",chout="";
            Reservations res=new Reservations();
            ResultSet rs=res.find_info(res_id);
            Timestamp check_in=null,new_check_in=null;
            Timestamp check_out=null,new_check_out=null;
            if(rs.next())
            {
                check_in=rs.getTimestamp("check_in");
                check_out=rs.getTimestamp("check_out");
                out.print(check_in);
                out.print(check_out);
                //int room_id=rs.getInt("room_number");
            }
            
            if(request.getParameter("check_in").equals("") && !request.getParameter("check_out").equals(""))
            {
                out.print("i am here1");
                new_check_in=check_in;
                chout=request.getParameter("check_out");
                chout+=":00";
                chout=chout.replace("T", " ");
                new_check_out=Timestamp.valueOf(chout);
                out.print(new_check_out);
                out.print("anything");
                
            }
            else if(!request.getParameter("check_in").equals("") && request.getParameter("check_out").equals(""))
            {
                out.print("i am here2");
                new_check_out=check_out;
                chin=request.getParameter("check_in");
                chin+=":00";
                chin=chin.replace("T", " ");
                new_check_in=Timestamp.valueOf(chin);
            }
            else if(!request.getParameter("check_in").equals("") && !request.getParameter("check_out").equals(""))
            {
                out.print("i am here3");
                chin=request.getParameter("check_in");
                out.print(chin);
                chin+=":00";
                chin=chin.replace("T", " ");
                new_check_in=Timestamp.valueOf(chin);
                out.print(new_check_in);
                chout=request.getParameter("check_out");
                out.print(chout);
                chout+=":00";
                chout=chout.replace("T", " ");
                new_check_out=Timestamp.valueOf(chout);
                out.print(new_check_out);
            }
            else{
                out.print("i am here4");
                new_check_in=check_in;
                new_check_out=check_out;
            }
            out.print(new_check_in);
            out.print(new_check_out);
            res.check_in=new_check_in;
            res.check_out=new_check_out;
            if(res.update_dates(res_id)==true)
            {
             response.sendRedirect("user/userReservations.jsp");
            }
            else{
                out.print("error");
            }
            
            
        }
        catch (Exception e) {
            out.print("error");
            //e.printStackTrace();

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
