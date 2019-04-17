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
import mvc.koneksi;

/**
 *
 * @author User
 */
public class m_recordingKambing {

    private Connection koneksi;

    public m_recordingKambing() {
        koneksi = new koneksi().getKoneksi();
    }

    public DefaultTableModel bacaTabel() {
        String query = "SELECT rk.id, rk.nama, jk.jenisKelamin, rk.tglLahir, rk.jenisKambing, rk.usia, rk.tinggi, rk.bobot, rk.lokasiKandang, rk.penyakit, rk.Keterangan\n"
                + "FROM recording_kambing rk JOIN jenis_kelamin jk\n"
                + "ON rk.idJenisKelamin = jk.idJenisKelamin;";
        String namaKolom[] = {
            "Id",
            "Nama",
            "Jenis Kelamin",
            "Tanggal Lahir",
            "Jenis Kambing",
            "Usia Kambing",
            "Tinggi",
            "Bobot",
            "Lokasi Kandang",
            "Penyakit",
            "Keterangan"
        };
        DefaultTableModel tabel = new DefaultTableModel(null, namaKolom);
        try {
            PreparedStatement st = koneksi.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {

                tabel.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("nama"),
                    rs.getString("jenisKelamin"),
                    rs.getDate("tglLahir"),
                    rs.getString("jenisKambing"),
                    rs.getInt("usia"),
                    rs.getFloat("tinggi"),
                    rs.getFloat("bobot"),
                    rs.getString("lokasiKandang"),
                    rs.getString("penyakit"),
                    rs.getString("keterangan")
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
