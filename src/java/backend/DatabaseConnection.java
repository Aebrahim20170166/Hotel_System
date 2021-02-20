package backend;


import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Alaa_Ibrahim
 */
public class DatabaseConnection {
    /**
     *
     * @return
     */
    public static Connection Connect(){
        Connection conn=null;
        try {
            String username="root";
            String password="";
            String url="jdbc:mysql://localhost/hotel_system";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn=(Connection) DriverManager.getConnection(url,username,password);
            System.out.println("\n Dataase connection established");
            
        }
        catch(Exception e){
            e.printStackTrace();
            System.err.println("\n Cannot connect to database server");
        }
        return conn;
        
    }
}
