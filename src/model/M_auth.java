/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import main.Config;


/**
 *
 * @author zha
 */
public class M_auth extends Config {

    String tableName = "users";
    Connection DBConnection;
    Statement statement;
    ResultSet resultSet;
    
    public M_auth() {
        try {
            DBConnection = DBConnection();
            statement = DBConnection.createStatement();
        } catch (Exception e) {
            System.out.println("Something was wrong: Error: " + e.getMessage());
        }
    }
    
    public int[] authenticate(String email, String password) throws SQLException {
        
        int[] data = new int[2];
        String query = "SELECT id, level, status FROM " + tableName + " WHERE email = ? AND password = ? AND status = 1";
        PreparedStatement ps = DBConnection.prepareStatement(query);
        ps.setString(1, email);
        ps.setString(2, password);
        resultSet = ps.executeQuery();
        resultSet.next();
        data[0] = resultSet.getInt("id");
        data[1] = resultSet.getInt("level");
        return data;
    }
    
}
