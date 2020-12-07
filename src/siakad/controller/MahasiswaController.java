package siakad.controller;

import siakad.dao.MahasiswaInterface;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import siakad.connectivity.KoneksiDB;

/**
 *
 * @author fachr
 */
public class MahasiswaController implements MahasiswaInterface{

    private static KoneksiDB kdb = new KoneksiDB();
    
    @Override
    public void create(String nim, String nama){
        try {
            String insert = "INSERT INTO mahasiswa VALUE(5,'"+nim+"', '"+nama+"', 'Lohbener')";
            Statement st = (Statement) kdb.openConnection().createStatement();
            st.execute(insert);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        
    }

    @Override
    public void read() {
        
    }

    @Override
    public void update() {
        
    }

    @Override
    public void delete() {
        
    }
    
    
    
}
