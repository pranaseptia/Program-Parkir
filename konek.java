/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
        
/**
 *
 * @author aldireza
 */
public class konek {
    public Connection con;
    public Statement st;
    public ResultSet rs;

    
    public void konek()
    {   
        konek("localhost","db_parkir","root","");
    }
    
    public void konek(String server, String db, String user,String passwd){
        System.out.println("Keterangan");
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Terkonek Gan");
            return;
        }
        System.out.println("Konek Gan");
        con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://"+server+":3306/"+db,user,passwd);
        } catch (SQLException e) {
            System.out.println("Tidak bisa koneksi ke database");
            return;
        }
        if (con != null)
            System.out.println("Berhasil Koneksi!");
        else
            System.out.println("Koneksi Gagal........ !");
        }

 public void config(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/db_parkir", "root", "");
            st = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
 }
}
  

