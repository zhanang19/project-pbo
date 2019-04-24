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
 * @author User
 */
public class M_recording_animal {

    private final Connection DBConnection;

    public M_recording_animal() {
        DBConnection = new Config().createDBConnection();
    }

    public DefaultTableModel readTable_RecordingAnimal() {
        String query = "Select a.id, a.animal_name, animal_type.animal_type, a.gender, a.birth_date, "
                + "users.name, a.skin_color, a.ear_type, type_pet.type_pet, a.updated_at, a.created_at "
                + "From public.animal a join public.animal_type on a.animal_type = animal_type.id "
                + "join public.users on a.id_user = users.id join public.type_pet on a.type_pet = type_pet.id;";
        String namaKolom[] = {
            "Id",
            "Animal Name",
            "Animal Type",
            "Gender",
            "Birthdate",
            "User",
            "Skin Color",
            "Ear Type",
            "Type Pet",
            "Updated at",
            "Created at"
        };
        DefaultTableModel tabel = new DefaultTableModel(null, namaKolom);
        try {
            PreparedStatement st = DBConnection.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {

                tabel.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("animal_name"),
                    rs.getString("animal_type"),
                    rs.getString("gender"),
                    rs.getDate("birth_date"),
                    rs.getString("name"),
                    rs.getString("skin_color"),
                    rs.getString("ear_type"),
                    rs.getString("type_pet"),
                    rs.getDate("updated_at"),
                    rs.getDate("created_at")
                });
            }
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
        return tabel;
    }        
}
