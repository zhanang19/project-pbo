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
import javax.swing.table.DefaultTableModel;
import main.Config;

/**
 *
 * @author zha
 */
public class M_user {

    private final Connection DBConnection;
    
    public M_user() {
        // get and set connection to local variable
        DBConnection = new Config().createDBConnection();
    }
    
    public DefaultTableModel readTableUsers() {
        String query = "SELECT u.id, u.name, u.email, u.password, level.level, u.status, u.updated_at, u.created_at FROM public.users u join public.level on u.level = level.id;";
        String namaKolom[] = {"ID", "Nama", "E-Mail", "Password", "Level", "Status", "Updated at", "Created at"};
        DefaultTableModel tabel = new DefaultTableModel(null, namaKolom);
        try {
            PreparedStatement st = DBConnection.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Object data[] = new Object[8];
                
                data[0] = rs.getInt(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                data[4] = rs.getString(5);
                data[5] = rs.getInt(6);
                data[6] = rs.getDate(7);
                data[7] = rs.getDate(8);
                
                tabel.addRow(data);
            }
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
        return tabel;
    }
    
    public boolean createUser(String name, String email, String password, int level, int status) {
        
        String query = "INSERT into public.users SET `name`, `email`, `password`, `level`, `status` "
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
            System.out.println("Something was wrong. Error: " + e);
        }
        return tingkatan;
    }   
    
}
