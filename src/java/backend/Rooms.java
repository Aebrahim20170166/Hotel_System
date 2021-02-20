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
public class Rooms {
    
    public int roomNumber;
    public String roomType;
    public float price;
    public String Facilities;
    public int availabe;
    public int hotel_id=7;
    private Connection conn=null;
    private PreparedStatement st = null;
    
    public Rooms()
    {
        conn=DatabaseConnection.Connect();
    }
    public String insert() throws SQLException
    {
        
        out.println(conn);
        try{
            
        st=conn.prepareStatement("INSERT INTO hotel_system.rooms(type,room_number,price,hotel_id,"
                    + "Availability,Facilities	) VALUES(?,?,?,?,?,?)");
            
        st.setString(1, roomType);
        st.setInt(2, roomNumber);
        st.setFloat(3, price);
        st.setInt(4,hotel_id);
        st.setInt(5,availabe);
        st.setString(6, Facilities);
            
        if(st.executeUpdate()==1)
           return "Inserted";
        
        }catch (Exception e){
                e.printStackTrace();
                
        }
        return "not inserted";
    }
    public void dleteRoom(int id) throws SQLException{
        st=conn.prepareStatement("DELETE FROM hotel_system.rooms WHERE id=?");
        st.setInt(1,id);
        st.execute();
    }
    public ResultSet getRooms() throws SQLException{
        st=conn.prepareStatement("SELECT * FROM hotel_system.rooms") ;
        ResultSet rs=st.executeQuery();
        return rs;
    }
    public ResultSet getRoom(int id) throws SQLException{
        st=conn.prepareStatement("SELECT * FROM hotel_system.rooms WHERE id=?");
        st.setInt(1,id);
        ResultSet rs=st.executeQuery();
        
        return rs;
    }
    public void updateRoom(int id) throws SQLException{
        st=conn.prepareStatement("UPDATE hotel_system.rooms SET type=?,room_number=?"
                 + ",price=?,Availability=?,Facilities=? WHERE id=?");
         st.setString(1,roomType);
         st.setInt(2,roomNumber);
         st.setFloat(3,price);
         st.setInt(4,availabe);
         st.setString(5,Facilities);
         st.setInt(6, id);
         
         st.executeUpdate();
    }
    public boolean updateRoomType(int id,String type) throws SQLException{
        st=conn.prepareStatement("UPDATE hotel_system.rooms SET type=? WHERE id=?");
         st.setString(1,type);
         if(st.executeUpdate()>=1)
             return true;
                   
         return false;
    }
}
