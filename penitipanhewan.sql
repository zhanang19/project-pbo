-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 14 Apr 2019 pada 04.05
-- Versi server: 10.1.36-MariaDB
-- Versi PHP: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penitipanhewan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `jenis_kelamin`
--

CREATE TABLE `jenis_kelamin` (
  `idJenisKelamin` int(5) NOT NULL,
  `jenisKelamin` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `jenis_kelamin`
--

INSERT INTO `jenis_kelamin` (`idJenisKelamin`, `jenisKelamin`) VALUES
(1, 'Jantan'),
(2, 'Betina');

-- --------------------------------------------------------

--
-- Struktur dari tabel `recording_kambing`
--

CREATE TABLE `recording_kambing` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `idJenisKelamin` int(5) NOT NULL,
  `tglLahir` date NOT NULL,
  `jenisKambing` varchar(20) NOT NULL,
  `usia` int(11) NOT NULL,
  `jenisTelinga` varchar(20) NOT NULL,
  `warnaKepala` varchar(20) NOT NULL,
  `warnaBadan` varchar(20) NOT NULL,
  `panjangTelinga` float NOT NULL,
  `panjangBadan` float NOT NULL,
  `lingkarDada` float NOT NULL,
  `tinggi` float NOT NULL,
  `bobot` float NOT NULL,
  `lokasiKandang` varchar(50) NOT NULL,
  `penyakit` varchar(50) NOT NULL,
  `Keterangan` varchar(50) NOT NULL,
  `tglKawin` date DEFAULT NULL,
  `perkiraanLahir` date DEFAULT NULL,
  `laktasi` int(5) DEFAULT NULL,
  `produksiSusu` varchar(20) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `penjantan` varchar(20) DEFAULT NULL,
  `indukan` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `recording_kambing`
--

INSERT INTO `recording_kambing` (`id`, `nama`, `idJenisKelamin`, `tglLahir`, `jenisKambing`, `usia`, `jenisTelinga`, `warnaKepala`, `warnaBadan`, `panjangTelinga`, `panjangBadan`, `lingkarDada`, `tinggi`, `bobot`, `lokasiKandang`, `penyakit`, `Keterangan`, `tglKawin`, `perkiraanLahir`, `laktasi`, `produksiSusu`, `status`, `penjantan`, `indukan`) VALUES
(1, 'Jupe', 2, '2010-05-25', 'Etawa', 36, 'Koploh', 'Merah', 'Putih', 35, 100, 80, 85, 59, 'A1', '-', 'Sehat Wal \'Afiat', '2013-04-06', '2013-09-03', 2, NULL, NULL, 'Glogor', 'Sakura'),
(6, 'Jo', 1, '2009-05-25', 'Kambing Boer', 50, 'panjang', 'hitam', 'hitam', 35, 150, 80, 100, 100, 'B1', 'belum di ketahui', 'asdf asdf asdfasdf qwerqwe rtasd asdfawerqweqwet A', NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `jenis_kelamin`
--
ALTER TABLE `jenis_kelamin`
  ADD PRIMARY KEY (`idJenisKelamin`);

--
-- Indeks untuk tabel `recording_kambing`
--
ALTER TABLE `recording_kambing`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `FOREIGN` (`idJenisKelamin`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `jenis_kelamin`
--
ALTER TABLE `jenis_kelamin`
  MODIFY `idJenisKelamin` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT untuk tabel `recording_kambing`
--
ALTER TABLE `recording_kambing`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
