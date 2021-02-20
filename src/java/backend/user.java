/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;;

import static java.lang.System.out;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alaa_Ibrahim
 */
public class user {
    public String firstName;
    public String lastName;
    public String username;
    public String Email;
    public String Password;
    public String phoneNumber;
    public int role=0;
    private Connection conn=null;
    private PreparedStatement st = null;
    
    public user()
    {
        conn=DatabaseConnection.Connect();
    }
    public String insertAdmin()
    {
        String res="not inserted";
        try{
            st=conn.prepareStatement("INSERT INTO hotel_system.user(Fname,Lname,username,email,password,role,phone)"
                    + " VALUES(?,?,?,?,?,?,?)");
            
            st.setString(1, firstName);
            st.setString(2, lastName);
            st.setString(3,username);
            st.setString(4, Email);
            st.setString(5, Password);
            st.setInt(6, role);
            st.setString(7, phoneNumber);
            int res2=st.executeUpdate();
            out.print(res2);
            if(res2>=1)
                res="inserted";
        }
        catch (Exception e){
                e.printStackTrace();
                
            }
       return res;
    }
    public ResultSet sign() throws SQLException{
        st=conn.prepareStatement("SELECT id,email,password,role FROM hotel_system.user WHERE email=? AND password=?");
        
        st.setString(1,Email);
        st.setString(2,Password);
        ResultSet rs=st.executeQuery();
        return rs;
    }
    public ResultSet searchOnUsers(int user_id) throws SQLException
    {
        st=conn.prepareStatement("SELECT id,Fname,Lname,email,phone FROM user WHERE id=?");
        st.setInt(1, user_id);
        ResultSet rs=st.executeQuery();
        return rs;
        
    }
    public ResultSet getAllUsers(String username) throws SQLException{
        st=conn.prepareStatement("SELECT username FROM user WHERE username=?");
        st.setString(1,username);
        ResultSet rs=st.executeQuery();
        return rs;
    }
    public ResultSet viewReviews() throws SQLException{
        st=conn.prepareStatement("SELECT * FROM reviews");
        ResultSet rs=st.executeQuery();
        return rs;
    }
    public String generatePassword(){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 8; i++) {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        String generated_password=sb.toString();
        return generated_password;
    }
    public ResultSet Find_hotel_Reviews( int id) throws SQLException{
        st=conn.prepareStatement("SELECT AVG(ratin_using_stars) FROM reviews  WHERE hotel_id=?");
        st.setInt(1, id);
        ResultSet rs=st.executeQuery();
        return rs;
    }
    public ResultSet getUserRole(int id) throws SQLException{
        st=conn.prepareStatement("SELECT role FROM hotel_system.user WHERE id=?");
        st.setInt(1, id);
        ResultSet rs=st.executeQuery();
        return rs;
        
    }
    public ResultSet getHotelId(int id) throws SQLException{
        st=conn.prepareStatement("SELECT * FROM hotel_system.admin_hotels WHERE admin_id=?");
        st.setInt(1, id);
        ResultSet rs=st.executeQuery();
        return rs;
    }
    
}
