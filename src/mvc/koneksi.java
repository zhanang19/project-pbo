/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class koneksi {
    Connection koneksi;
    
    public koneksi() {
        
    }
    
    public Connection getKoneksi() {
        if (koneksi == null) {
            String url = "jdbc:mysql://localhost:3306/";
            String database = "penitipanhewan";
            String username = "root";
            String password = "";
            try {
                koneksi = (Connection) DriverManager.getConnection(url+database, username, password);
                System.out.println("Koneksi Berhasil");
            } catch (SQLException e) {
                System.out.println("Koneksi Gagal");
            }
        }
        return koneksi;
    }
}
