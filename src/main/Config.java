/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class Config {
    Connection DBConnection;
    
    public Config() {
        
    }
    
    public Connection createDBConnection() {
        if (DBConnection == null) {
            String url = "jdbc:postgresql://localhost:5432/";
            String database = "penitipanHewan";
            String username = "postgres";
            String password = "1234";
            try {
                DBConnection = (Connection) DriverManager.getConnection(url+database, username, password);
                System.out.println("Connection Successful");
            } catch (SQLException e) {
                System.out.println("Connection Failed");
            }
        }
        return DBConnection;
    }
}
