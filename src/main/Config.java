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
 * @author zha
 */
public class Config {
    
    protected Connection DBConnection = null;
    
    protected Connection DBConnection() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found. Error: " + e.getMessage());
            System.exit(0);
        }
        try {
            String database = "d9ek16mludg78a";
            String username = "ttmzwvmtinzjlp";
            String password = "03d8bbf4fe174f1f3eb76ed041fc241cf90e4d1d9b158f49169c8e4295042f41";
            String url = "jdbc:postgresql://ec2-23-23-92-204.compute-1.amazonaws.com:5432/" + database + "?sslmode=require";
            DBConnection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println("Something was wrong on config. Error: " + e.getMessage());
        }

        return DBConnection;
    }
}
