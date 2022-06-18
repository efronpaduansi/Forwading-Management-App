/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.MDS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author efron
 */
public class koneksi {
    
    private static Connection mysqlconfig;
    
    Connection koneksi=null;
    public static Connection koneksi(){
        String driver = "com.mysql.jdbc.Driver";
        String host = "jdbc:mysql://localhost/pt_mds";
        String user = "root";
        String password = "";
        
        try {
            Class.forName(driver);
            Connection conn = (Connection) DriverManager.getConnection(host,user,password);
            return conn;
            
        }catch (Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
}
