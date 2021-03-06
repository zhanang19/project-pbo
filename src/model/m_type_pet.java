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
import main.config;

/**
 *
 * @author ASUS
 */
public class m_type_pet {

    private Connection DBConnection;

    public m_type_pet() {
        // get and set connection to local variable
        DBConnection = new config().createDBConnection();
    }

    public DefaultTableModel readTable_typePet() {
        String query = "SELECT id, type_pet FROM public.type_pet order by id;";
        String namaKolom[] = {"Id", "Tipe Gen"};
        DefaultTableModel tabel = new DefaultTableModel(null, namaKolom);
        try {
            PreparedStatement st = DBConnection.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Object data[] = new Object[2];

                data[0] = rs.getInt(1);
                data[1] = rs.getString(2);

                tabel.addRow(data);
            }
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
        return tabel;
    }
    
    public boolean create_TypePet(String type_pet) {

        String query = "INSERT INTO public.type_pet (type_pet) VALUES (?);";
        boolean hasil = false;
        try {
            PreparedStatement st = DBConnection.prepareStatement(query);
            st.setString(1,type_pet);
            int insert = st.executeUpdate();
            if (insert > 0) {
                hasil = true;
            }
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
        return hasil;
    }
    
    public boolean update_TypePet(String type_pet,int id) {
        String query = "UPDATE public.type_pet SET type_pet=? WHERE id=?";
        boolean hasil = false;
        try {
            PreparedStatement st = DBConnection.prepareStatement(query);
            st.setString(1, type_pet);
            st.setInt(2, id);
            int insert = st.executeUpdate();
            if (insert > 0) {
                hasil = true;
            }
        } catch (SQLException e) {            
            System.out.println("Something was wrong. Error: " + e);
        }
        return hasil;
    }
}
