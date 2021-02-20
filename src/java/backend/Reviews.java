/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Alaa_Ibrahim
 */
public class Reviews {
    public String comment;
    public int rating;
    public int hotel_id;
    private Connection conn=null;
    private PreparedStatement st = null;
    public Reviews(){
        conn=DatabaseConnection.Connect();
    }
    
    public boolean addReview() throws SQLException{
        st=conn.prepareStatement("INSERT INTO hotel_system.reviews(comment_content,ratin_using_stars,hotel_id) "
                + "VALUES(?,?,?)");
        st.setString(1,comment);
        st.setInt(2, rating);
        st.setInt(3,hotel_id);
        
        if(st.executeUpdate()>=1)
            return true;
        return false;
        
    }
    
    
}
