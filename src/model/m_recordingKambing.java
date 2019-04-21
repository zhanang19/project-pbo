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
 * @author User
 */
public class m_recordingKambing {

    private Connection koneksi;

    public m_recordingKambing() {
        koneksi = new Config().createDBConnection();
    }

    public DefaultTableModel bacaTabel() {
        String query = "Select a.id, a.animal_name, animal_type.animal_type, a.gender, a.birth_date, users.name, a.skin_color, a.ear_type, type_pet.type_pet, a.updated_at, a.created_at From public.animal a join public.animal_type on a.animal_type = animal_type.id join public.users on a.id_user = users.id join public.type_pet on a.type_pet = type_pet.id;";
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
            PreparedStatement st = koneksi.prepareStatement(query);
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
            System.out.println("Error : "+e);
        }
        return tabel;
    }
        public boolean record(
                String nama,
                int idJenisKelamin,
                Date tglLahir,
                String jenisKambing,
                String usia,
                String jenisTelinga,
                String warnaKepala,
                String warnaBadan,
                float panjangTelinga,
                float panjangBadan,
                float lingkarDada,
                float tinggi,
                float bobot,
                String lokasiKandang,
                String penyakit,
                String Keterangan,
                Date tglKawin,
                Date perkiraanLahir,
                String laktasi,
                String produksiSusu,
                String status,
                String penjantan,
                String indukan
        ) {
        String query = "INSERT INTO `recording_kambing`"
                + "`nama`, "
                + "`idJenisKelamin`, "
                + "`tglLahir`, "
                + "`jenisKambing`, "
                + "`usia`, "
                + "`jenisTelinga`, "
                + "`warnaKepala`, "
                + "`warnaBadan`, "
                + "`panjangTelinga`, "
                + "`panjangBadan`, "
                + "`lingkarDada`, "
                + "`tinggi`, "
                + "`bobot`, "
                + "`lokasiKandang`, "
                + "`penyakit`, "
                + "`Keterangan`, "
                + "`tglKawin`, "
                + "`perkiraanLahir`, "
                + "`laktasi`, "
                + "`produksiSusu`, "
                + "`status`, "
                + "`penjantan`, "
                + "`indukan`)"
                + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        boolean hasil = false;
        try {
            PreparedStatement st = koneksi.prepareStatement(query);
            st.setString(1, nama);
            st.setInt(2, idJenisKelamin);
            st.setDate(3, new java.sql.Date(tglLahir.getTime()));
            st.setString(4, jenisKambing);
            st.setInt(5, Integer.parseInt(usia));
            st.setString(6, jenisTelinga);
            st.setString(7, warnaKepala);
            st.setString(8, warnaBadan);
            st.setFloat(9, panjangTelinga);
            st.setFloat(10, panjangBadan);
            st.setFloat(11, lingkarDada);
            st.setFloat(12, tinggi);
            st.setFloat(13, bobot);
            st.setString(14, lokasiKandang);
            st.setString(15, penyakit);
            st.setString(16, Keterangan);
            st.setDate(17, new java.sql.Date(tglKawin.getTime()));
            st.setDate(18, new java.sql.Date(perkiraanLahir.getTime()));
            st.setInt(19, Integer.parseInt(laktasi));
            st.setString(20, produksiSusu);
            st.setString(21, status);
            st.setString(22, penjantan);
            st.setString(23, indukan);
            
            int insert = st.executeUpdate();
            if (insert > 0) {
                hasil = true;
            }
        } catch (SQLException e) {
            System.out.println("Error : "+e);
        }
        return hasil;
    }
}
