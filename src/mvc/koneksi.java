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
            String url = "jdbc:postgres://ec2-23-23-92-204.compute-1.amazonaws.com:5432/";
            String database = "d9ek16mludg78a";
            String username = "ttmzwvmtinzjlp";
            String password = "03d8bbf4fe174f1f3eb76ed041fc241cf90e4d1d9b158f49169c8e4295042f41";
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
