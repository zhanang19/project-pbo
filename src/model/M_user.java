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
public class M_user {

    private Connection DBConnection;
    private String tableName = "users";
    
    public M_user() {
        // get and set connection to local variable
        DBConnection = new Config().createDBConnection();
    }
    
    public boolean createUser(String name, String email, String password, int level, int status) {
        
        String query = "INSERT into `" + this.getTableName() + "` "
                     + "SET `name`, `email`, `password`, `level`, `status` "
                     + "VALUES(?,?,?,?,?);";
        try {
            PreparedStatement st = DBConnection.prepareStatement(query);
            st.setString(1, name);
            st.setString(2, email);
            st.setString(3, password);
            st.setInt(4, level);
            st.setInt(5, status);
            
            if (st.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
        return false;
    }
    
    public int login(String username, String password) {
        String query = "SELECT level FROM public.users WHERE name=? AND password=?;";
        int tingkatan = 0;
        try {
            PreparedStatement st = DBConnection.prepareStatement(query);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                tingkatan = rs.getInt(1);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            e.getMessage();
        }
        return tingkatan;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    
}
