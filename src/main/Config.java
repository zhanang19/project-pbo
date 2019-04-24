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
            String url = "jdbc:postgresql://ec2-23-23-92-204.compute-1.amazonaws.com:5432/";
            String database = "d9ek16mludg78a";
            String username = "ttmzwvmtinzjlp";
            String password = "03d8bbf4fe174f1f3eb76ed041fc241cf90e4d1d9b158f49169c8e4295042f41";
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
