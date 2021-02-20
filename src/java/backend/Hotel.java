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
import java.sql.SQLException;

/**
 *
 * @author Alaa_Ibrahim
 */
public class Hotel {
    //public int id;
    public String name;
    public String location;
    public String phoneNumber;
    public String Facilities;
    public int distance;
    public int roomsAvailable;
    public int numOfsignalRooms=0;
    public int numOfdoubleRooms=0;
    public int hotelStars;
    public int meals;
    public float price=1400;
    Connection conn=null;
    private PreparedStatement st = null;
    public Hotel(){
        conn=DatabaseConnection.Connect();
    }
    public String insert() throws SQLException{
        String result="";
        try{
        st=conn.prepareStatement("INSERT INTO hotel_system.hotel(name,location,rooms_available,numOfsingalRooms,numOfdoubleRooms,phone_number,"
                    + "hotel_stars,distance,meals,Facilities,price) VALUES(?,?,?,?,?,?,?,?,?)");
        st.setString(1,name);
        st.setString(2,location);
        st.setInt(3,roomsAvailable);
        st.setInt(4,numOfsignalRooms);
        st.setInt(5,numOfdoubleRooms);
        st.setString(6,phoneNumber);
        st.setInt(7,hotelStars);
        st.setInt(8,distance);
        st.setInt(9,meals);
        st.setString(10,Facilities);
        st.setFloat(11,price);
        
        if(st.executeUpdate()==1)
                result="ok";
        }
       catch (Exception e){
                e.printStackTrace();
                
            }
        return result;
    }
    public ResultSet getHotelinfo() throws SQLException{
        ResultSet rs=null;
        try{
        st=conn.prepareStatement("SELECT * FROM hotel_system.hotel");
        rs=st.executeQuery();
        }
       catch (Exception e){
                e.printStackTrace();
                
            }
        return rs;
    }
    public ResultSet getHotel(int id) throws SQLException{
        ResultSet rs=null;
        try{
        st=conn.prepareStatement("SELECT * FROM hotel_system.hotel WHERE id=?");
        st.setInt(1, id);
        rs=st.executeQuery();
        }
       catch (Exception e){
                e.printStackTrace();
                
            }
        return rs;
    }
    public ResultSet search_hotels(String location,int sRooms,int dRooms) throws SQLException{
        ResultSet rs=null;
        try{
        st=conn.prepareStatement("SELECT * FROM hotel_system.hotel WHERE location=? AND numOfsingalRooms>=? AND numOfdoubleRooms>=?");
        st.setString(1, location);
        st.setInt(2, sRooms);
        st.setInt(3, dRooms);
        rs=st.executeQuery();
        }
       catch (Exception e){
                e.printStackTrace();
                
            }
        return rs;
    }
    
    
    /*public ResultSet getTopHotels(){
        //st=conn.prepareStatement("SELECT name,location,hotel_stars,phone_number,price FROM hotel_system.hotel");
        
    }*/
    public int deleteHotel(int id) throws SQLException
    {   
        try{
        st=conn.prepareStatement("DELETE FROM hotel_system.hotel WHERE id=?");
        st.setInt(1,id);
        //out.print(id);
         }
       catch (Exception e){
                e.printStackTrace();
                
            }
        return st.executeUpdate();
    }
     public int updateHotel(int id) throws SQLException
     {
         int res=0;
          try{
         st=conn.prepareStatement("UPDATE hotel_system.hotel SET name=?,location=?,rooms_available=?"
                 + ",phone_number=?,hotel_stars=?,distance=?,meals=?,Facilities=?,price=? WHERE id=?");
         st.setString(1,name);
         st.setString(2,location);
         st.setInt(3,roomsAvailable);
         st.setString(4,phoneNumber);
         st.setInt(5,hotelStars);
         st.setInt(6,distance);
         st.setInt(7,meals);
         st.setString(8, Facilities);
         st.setFloat(9,price);
         st.setInt(10,id);
         
         res=st.executeUpdate();
         }
       catch (Exception e){
                e.printStackTrace();
                
            }
          return res;
            
     }
     public ResultSet find_map(int id) throws SQLException{
        ResultSet rs=null;
        try{
        st=conn.prepareStatement("SELECT location_on_map FROM hotel_system.hotel WHERE id=?");
        st.setInt(1, id);
        rs=st.executeQuery();
        }
       catch (Exception e){
                e.printStackTrace();
                
            }
        return rs;
    }
    
    
}
