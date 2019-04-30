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
public class M_animal_type {

    private final Connection DBConnection;

    public M_animal_type() {
        // get and set connection to local variable
        DBConnection = new Config().createDBConnection();
    }
    
    public String[] dataCMB(){
        String data[] = null;
        String query = "SELECT animal_type FROM public.animal_type order by id;";
        
        try {
            PreparedStatement st = DBConnection.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            rs.last();
            int lastIndex = rs.getRow();
            rs.beforeFirst();
            data = new String[lastIndex];
            int i = 0;
            while (rs.next()) {
                data[i] = rs.getString("Name");
                i++;
            }
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
        return data;
    }
    
    public DefaultTableModel readTable_animalType() {
        String query = "SELECT id, animal_type FROM public.animal_type order by id;";
        String namaKolom[] = {"Id", "Tipe Hewan"};
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
    
    public boolean create_AnimalType(String animal_type) {

        String query = "INSERT INTO public.animal_type (animal_type) VALUES (?);";
        boolean hasil = false;
        try {
            PreparedStatement st = DBConnection.prepareStatement(query);
            st.setString(1, animal_type);
            int insert = st.executeUpdate();
            if (insert > 0) {
                hasil = true;
            }
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
        return hasil;
    }
    public boolean update_AnimalType(String animal_type,int id) {
        String query = "UPDATE public.animal_type SET animal_type=? WHERE id=?";
        boolean hasil = false;
        try {
            PreparedStatement st = DBConnection.prepareStatement(query);
            st.setString(1, animal_type);
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
