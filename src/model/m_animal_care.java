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
 * @author User
 */
public class m_animal_care {

    private final Connection DBConnection;

    public m_animal_care() {
        DBConnection = new config().createDBConnection();
    }

    public DefaultTableModel readTable_animalCare() {
        String query = "SELECT ac.id, animal.animal_name, users.name , ac.weight, ac.body_length, \n" +
"ac.chest_size, ac.height, ac.comment, ac.timestamp\n" +
"FROM public.animal_care ac join public.animal on ac.id_animal=animal.id\n" +
"join public.users ON users.id = ac.id_user;";
        String namaKolom[] = {
            "Id",
            "Animal Name",
            "User",
            "Weight",
            "Body Length",
            "Chest Size",
            "Comment",
            "Timestamp"
        };
        DefaultTableModel tabel = new DefaultTableModel(null, namaKolom);
        try {
            PreparedStatement st = DBConnection.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                tabel.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("animal_name"),
                    rs.getString("name"),
                    rs.getDouble("weight"),
                    rs.getDouble("body_length"),
                    rs.getDouble("chest_size"),
                    rs.getDouble("height"),
                    rs.getString("comment"),
                    rs.getTimestamp("timestamp"),
                });
            }
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
        return tabel;
    }        
}
