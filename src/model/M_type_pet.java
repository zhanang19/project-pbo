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
 * @author ASUS
 */
public class M_type_pet {

    private Connection DBConnection;

    public M_type_pet() {
        // get and set connection to local variable
        DBConnection = new Config().createDBConnection();
    }

    public DefaultTableModel readTable_typePet() {
        String query = "SELECT id, type_pet FROM public.type_pet;";
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
    
    public boolean createAnimalType(String type_pet) {

        String query = "INSERT INTO public.animal_type (id, animal_type) VALUES (?, ?);";
        try {
            PreparedStatement st = DBConnection.prepareStatement(query);
            st.setString(1, type_pet);

            if (st.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
        return false;
    }
}
