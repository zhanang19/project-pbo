CREATE TABLE jenis_kelamin (
  idJenisKelamin integer primary key ,
  jenisKelamin varchar(10) NOT NULL
) 

INSERT INTO jenis_kelamin (idJenisKelamin, jenisKelamin) VALUES
(1, 'Jantan'),
(2, 'Betina');

CREATE TABLE recording_kambing (
  id integer NOT NULL,
  nama varchar(50) NOT NULL,
  idJenisKelamin integer NOT NULL,
  tglLahir date NOT NULL,
  jenisKambing varchar(20) NOT NULL,
  usia integer NOT NULL,
  jenisTelinga varchar(20) NOT NULL,
  warnaKepala varchar(20) NOT NULL,
  warnaBadan varchar(20) NOT NULL,
  panjangTelinga float NOT NULL,
  panjangBadan float NOT NULL,
  lingkarDada float NOT NULL,
  tinggi float NOT NULL,
  bobot float NOT NULL,
  lokasiKandang varchar(50) NOT NULL,
  penyakit varchar(50) NOT NULL,
  keterangan varchar(50) NOT NULL,
  tglKawin date NULL,
  perkiraanLahir date NULL,
  laktasi integer NULL,
  produksiSusu varchar(20) NULL,
  status varchar(20) NULL,
  penjantan varchar(20) NULL,
  indukan varchar(20)NULL
)

INSERT INTO recording_kambing (id, nama, idJenisKelamin, tglLahir, jenisKambing, usia, jenisTelinga, warnaKepala, warnaBadan, panjangTelinga, panjangBadan, lingkarDada, tinggi, bobot, lokasiKandang, penyakit, Keterangan, tglKawin, perkiraanLahir, laktasi, produksiSusu, status, penjantan, indukan) VALUES
(1, 'Jupe', 2, '2010-05-25', 'Etawa', 36, 'Koploh', 'Merah', 'Putih', 35, 100, 80, 85, 59, 'A1', '-', 'Sehat WalAfiat', '2013-04-06', '2013-09-03', 2, NULL, NULL, 'Glogor', 'Sakura'),
(2, 'Jo', 1, '2009-05-25', 'Kambing Boer', 50, 'panjang', 'hitam', 'hitam', 35, 150, 80, 100, 100, 'B1', 'belum di ketahui', 'asdf asdf asdfasdf qwerqwe rtasd asdfawerqweqwet A', '','','','','','','' );

Select * from recording_kambing