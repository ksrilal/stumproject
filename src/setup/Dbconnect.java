package setup;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ksril
 */
public class Dbconnect {
    
    public static Connection connector() {
        
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/stmdb", "root", "");
        }
        catch (Exception e){
            System.out.println(e);
        }
        
        return conn;
    }
    
}
