/*
 * To change this license header, choose License HeaderesultSet in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import main.Config;

/**
 *
 * @author zha
 */
public class M_user extends Config {

    String tableName = "users";
    Connection DBConnection;
    Statement statement;
    ResultSet resultSet;
    
    public M_user() {
        try {
            DBConnection = DBConnection();
            statement = DBConnection.createStatement();
        } catch (SQLException e) {
            System.out.println("Something was wrong: Error: " + e.getMessage());
        }
    }
    
    public boolean createUser(String name, String email, String password, int level, int status) {
        
        String query = "INSERT into " + this.getTableName() + " "
                     + "(name, email, password, level, status) "
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
            System.out.println("Something was wrong. Error: " + e.getMessage());
        }
        return false;
    }
    
    public DefaultTableModel getUser(String param) {
        
        String query;
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn(new Object[] {
            "id",
            "name",
            "email",
            "password",
            "level",
            "status",
            "updated_at",
            "created_at",
            "role"
        });
        
        if(param != null) {
            query = "SELECT u.*, l.level as role FROM " + this.getTableName() + " u "
                  + "JOIN level l ON l.id = u.level "
                  + "WHERE " + param;
        } else {
            query = "SELECT u.*, l.level as role FROM " + this.getTableName() + " u "
                  + "JOIN level l ON l.id = u.level ";
        }
        
        try {
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                table.addRow(new Object[] {
                    resultSet.getString("id"),
                    resultSet.getString("name"),
                    resultSet.getString("email"),
                    resultSet.getString("password"),
                    resultSet.getString("level"),
                    resultSet.getString("status"),
                    resultSet.getString("updated_at"),
                    resultSet.getString("created_at"),
                    resultSet.getString("role")
                });
            }
            
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e.getMessage());
        }
        return table;
    }
    
    public String[] getUser(int idUser) {
        String[] user = new String[9];
        String query = "SELECT u.*, l.level as role FROM " + this.getTableName() + " u "
                     + "JOIN level l ON l.id = u.level "
                     + "WHERE u.id = " + Integer.toString(idUser);
        try {
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {                            
                user[0] = resultSet.getString("id");
                user[1] = resultSet.getString("name");
                user[2] = resultSet.getString("email");
                user[3] = resultSet.getString("password");
                user[4] = resultSet.getString("level");
                user[5] = resultSet.getString("status");
                user[6] = resultSet.getString("updated_at");
                user[7] = resultSet.getString("created_at");
                user[8] = resultSet.getString("role");
            }
            
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e.getMessage());
        }
        return user;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    
}
