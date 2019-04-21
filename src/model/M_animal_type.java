/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import main.Config;

/**
 *
 * @author zha
 */
public class M_animal_type {

    private Connection DBConnection;
    private String tableName = "animal_type";
    
    public M_animal_type() {
        // get and set connection to local variable
        DBConnection = new Config().createDBConnection();
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
