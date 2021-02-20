package backend;

import static java.lang.System.out;
import javax.mail.*;
import javax.mail.internet.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Walaa Ibrahim
 */
public class Reservations {

    public int user_id;
    public Timestamp reservation_date;
    public Timestamp check_in;
    public Timestamp check_out;
    public int hotel_id ;
    public int room_number=0;
    public int payment;
    public String client_state;
    private Connection conn = null;
    private PreparedStatement st = null;

    public Reservations() {
        conn = DatabaseConnection.Connect();
    }

    public ResultSet getresinfo() throws SQLException {

        st = conn.prepareStatement("SELECT * FROM hotel_system.reservations");
        ResultSet rs = st.executeQuery();

        return rs;
    }
    public ResultSet getreservation(int id) throws SQLException {

        st = conn.prepareStatement("SELECT * FROM hotel_system.reservations WHERE user_id=?");
        st.setInt(1,id);
        ResultSet rs = st.executeQuery();

        return rs;
    } 
    public ResultSet get_curr_resinfo() throws SQLException {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        // out.print(timestamp);
        //Statement st2 = conn.createStatement();
        //String sql = "SELECT * FROM hotel_system.reservations WHERE check_in > ?";
        st = conn.prepareStatement("SELECT * FROM hotel_system.reservations WHERE check_in >?");
        st.setTimestamp(1, timestamp);
        ResultSet rs = st.executeQuery();

        return rs;
    }

    public int delete_res(int id) throws SQLException {
        st = conn.prepareStatement("DELETE FROM hotel_system.reservations WHERE id=?");
        st.setInt(1, id);
        int res = 0;
        if (st.executeUpdate() == 1) {
            res = 1;
        }
        return res;
    }

    public String update_pay(int id) throws SQLException {   //  out.print("hehehehsdsds");
        st = conn.prepareStatement("UPDATE hotel_system.reservations SET payment=? WHERE id=?");

        st.setBoolean(1, true);
        st.setInt(2, id);
        if (st.executeUpdate() == 1) {
            return "yes";
        }

        return "no";
        //out.println("her"); 

    }

    public String update_check(int id) throws SQLException {   
        st = conn.prepareStatement("UPDATE hotel_system.reservations SET client_state=? WHERE id=?");
        st.setString(1,client_state);
        st.setInt(2, id);
        if (st.executeUpdate() == 1) {
            return "yes";
        }

        return "no";
        //out.println("her"); 

    }

    public ResultSet search_res(Timestamp t1, Timestamp t2) throws SQLException {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        st = conn.prepareStatement("SELECT * FROM hotel_system.reservations WHERE reservation_date >=?  AND reservation_date <= ? ");
        st.setTimestamp(1, t1);
        st.setTimestamp(2, t2);
        ResultSet rs = st.executeQuery();

        return rs;
    }

    public boolean update_dates(int id) throws SQLException {
        try {
            st = conn.prepareStatement("UPDATE hotel_system.reservations SET check_in=?,check_out=? WHERE id=?");
            st.setTimestamp(1, check_in);
            st.setTimestamp(2, check_out);
            st.setInt(3, id);

            if(st.executeUpdate()>=1)
                return true;
        } catch (Exception e) {
            e.printStackTrace();

        }
     return false;
    }

    public ResultSet find_info(int id) throws SQLException {

        st = conn.prepareStatement("SELECT * FROM hotel_system.reservations where id=?");
        st.setInt(1, id);
        ResultSet rs = st.executeQuery();

        return rs;

    }
    /*public String make_res() throws SQLException {

        //st=conn.prepareStatement("INSERT INTO hotel_system.reservations (user_id,reservation_date,check_in,check_out,hotel_id,"
               // + "room_number,payment,client_state) VALUES (?,?,?,?,?,?,?,?)");
        //st.setInt(1, user_id);
         out.print(user_id+"<br>");
         //st.setTimestamp(2, reservation_date);
         out.print(reservation_date+"<br>");
         //st.setTimestamp(3, check_in);
         out.print(check_in+"<br>");
         //st.setTimestamp(4, check_out);
         out.print(check_out+"<br>");
         //st.setInt(5, hotel_id);
         out.print(hotel_id +"<br>");
         //st.setInt(6, room_number);
         out.print(room_number+"<br>");
         //st.setInt(7, payment);
         out.print(payment+"<br>");
         //st.setString(8, client_state);
         out.print(client_state+"<br>");
         //if(st.executeUpdate()>=1)
         out.print("ok");
        

      return "error";
    }*/
    public String make_res() throws SQLException {
      out.print("heheheeeeeeeeeeeeeeeeeeeeee");
        st=conn.prepareStatement("INSERT INTO hotel_system.reservations (user_id,reservation_date,check_in,check_out,hotel_id,"
                + "room_number,payment,client_state) VALUES(?,?,?,?,?,?,?,?)");
        st.setInt(1, user_id);
         st.setTimestamp(2, reservation_date);
         st.setTimestamp(3, check_in);
         st.setTimestamp(4, check_out);
         st.setInt(5, hotel_id);
         st.setInt(6, room_number);
         st.setInt(7, payment);
         st.setString(8, client_state);
         if(st.executeUpdate()==1)
             return "ok";

      return "error";
      
    }

}
