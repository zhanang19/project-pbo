/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import main.Config;

/**
 *
 * @author zha
 */
public class M_animal_type extends Config {

    String tableName = "animal_type";
    Connection DBConnection;
    Statement statement;
    ResultSet resultSet;
    
    public M_animal_type() {
        try {
            DBConnection = DBConnection();
            statement = DBConnection.createStatement();
        } catch (Exception e) {
            System.out.println("Something was wrong: Error: " + e.getMessage());
        }
    }
    
    public boolean createAnimalType(String animal_type) {
        
        String query = "INSERT into `" + this.getTableName() + "` "
                     + "SET `animal_type` "
                     + "VALUES(?);";
        try {
            PreparedStatement st = DBConnection.prepareStatement(query);
            st.setString(1, animal_type);
            
            if (st.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
        return false;
    }
    
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
}
