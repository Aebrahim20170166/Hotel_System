/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alaa_Ibrahim
 */
@WebServlet(name = "validate_reservation", urlPatterns = {"/validate_reservation"})
public class validate_reservation extends HttpServlet {

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
            throws ServletException, IOException, ParseException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.print("here");
            int user_id = Integer.parseInt(request.getParameter("user_id"));
            out.print(user_id);
            String check_in = request.getParameter("check_in");

            check_in += ":00";
            Timestamp cin = Timestamp.valueOf(check_in.replace("T", " "));
            out.print(cin);
            String check_out = request.getParameter("check_out");
            check_out += ":00";
            Timestamp cout = Timestamp.valueOf(check_out.replace("T", " "));
            out.print(cout);
            int hotel_id = Integer.parseInt(request.getParameter("hotel_id"));

            String payment = request.getParameter("payment");
            int pay = 0;
            if (payment.equals("yes")) {
                pay = 1;
            }
            out.print(pay);
            String type = request.getParameter("type");
            Hotel hotel = new Hotel();
            ResultSet rs = hotel.getHotel(hotel_id);
            int roomsAvailable = 0;
            if (rs.next()) {
                if (type.equals("single")) {
                    roomsAvailable = rs.getInt("numOfsingalRooms");
                } else {
                    roomsAvailable = rs.getInt("numOfdoubleRooms");
                }
            }
            out.print(type);
            out.print(roomsAvailable);

            if (roomsAvailable >= 1) {
                Reservations r = new Reservations();
                r.user_id = user_id;
                out.print(r.user_id);
                r.reservation_date = new Timestamp(System.currentTimeMillis());
                out.print(r.reservation_date);
                r.check_in = cin;
                out.print(r.check_in);
                r.check_out = cout;
                out.print(r.check_out);
                r.hotel_id = hotel_id;
                out.print(r.hotel_id);
                r.room_number=17;
                out.print( r.room_number);
                r.payment = pay;
                out.print(r.payment);
                r.client_state = "not comming";
                out.print(r.client_state);
                String res = "";
                if(r.make_res().equals("ok"))
                    response.sendRedirect("user/makeReservation.jsp?success=Reservation done");

            }

            //r.make_res(user_id,hotel_id);
        } catch (Exception e) {
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(validate_reservation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(validate_reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(validate_reservation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(validate_reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
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
