package siakad.connectivity;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static siakad.connectivity.KoneksiDB.connection;

/**
 *
 * @author fachr
 */
public class KoneksiDB {
    
    public static Connection connection = null;
    
    private final String URL = "jdbc:mysql://localhost/test";
    private final String USER = "root";
    private final String PASS = "";
    
    public Connection openConnection(){
        
        if(connection == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = (Connection) DriverManager.getConnection(URL, USER, PASS);
                System.out.println("Koneksi DB berhasil!");
            } catch (ClassNotFoundException | SQLException ex) {
                System.err.println("Koneksi DB gagal: " + ex.getMessage());
            }
        }
        
        return connection;
    }
    
}
