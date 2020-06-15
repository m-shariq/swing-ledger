package Ledger;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CONNECTION {
    
    private static String servername="localhost";
    private static String username="root";
    private static String dbname="ledger";
    private static Integer portnumber=3306;
    private static String password="";
    
    public static Connection getConnection(){
    
        Connection cnx=null;
        MysqlDataSource data=new MysqlDataSource();
        
        data.setServerName(servername);
        data.setUser(username);
        data.setDatabaseName(dbname);
        data.setPortNumber(portnumber);
        data.setPassword(password);
        
        try {
            cnx = data.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(CONNECTION.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cnx;
    }
    
}
