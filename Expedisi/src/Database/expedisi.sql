-- phpMyAdmin SQL Dump
-- version 3.4.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Waktu pembuatan: 26. Februari 2012 jam 03:40
-- Versi Server: 5.5.16
-- Versi PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `expedisi`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_agendoor`
--

CREATE TABLE IF NOT EXISTS `t_agendoor` (
  `id_agen` int(11) NOT NULL AUTO_INCREMENT,
  `namaagen` varchar(10) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `kota` varchar(50) NOT NULL,
  `telp` varchar(15) NOT NULL,
  PRIMARY KEY (`id_agen`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data untuk tabel `t_agendoor`
--

INSERT INTO `t_agendoor` (`id_agen`, `namaagen`, `alamat`, `kota`, `telp`) VALUES
(1, 'Laut Mas', 'pengampon', 'Surabaya', '031-324693786');

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_createjob`
--

CREATE TABLE IF NOT EXISTS `t_createjob` (
  `no_job` int(11) NOT NULL AUTO_INCREMENT,
  `tanggal` varchar(100) NOT NULL,
  `customer` varchar(50) NOT NULL,
  `penerima` varchar(50) NOT NULL,
  `pelayaran` varchar(50) NOT NULL,
  `agen_door` varchar(50) NOT NULL,
  `agen_transportir` varchar(50) NOT NULL,
  `subcon` varchar(50) NOT NULL,
  `service` varchar(10) NOT NULL,
  `quantity` varchar(30) NOT NULL,
  `volume` decimal(10,0) NOT NULL,
  `comodity` varchar(30) NOT NULL,
  `t_kubik` double NOT NULL,
  `tarif` double NOT NULL,
  `discon` double NOT NULL,
  `ppn` double NOT NULL,
  `total_tarif` double NOT NULL,
  `b_freight` double NOT NULL,
  `b_door` double NOT NULL,
  `b_tracking` double NOT NULL,
  `b_lain` double NOT NULL,
  `b_total` double NOT NULL,
  PRIMARY KEY (`no_job`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_customer`
--

CREATE TABLE IF NOT EXISTS `t_customer` (
  `id_customer` int(11) NOT NULL AUTO_INCREMENT,
  `namacustomer` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `kota` varchar(10) NOT NULL,
  `telp` varchar(15) NOT NULL,
  PRIMARY KEY (`id_customer`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data untuk tabel `t_customer`
--

INSERT INTO `t_customer` (`id_customer`, `namacustomer`, `alamat`, `kota`, `telp`) VALUES
(7, 'Silvi', 'bungah', 'Surabaya', '14253645'),
(8, 'Andrew', 'simpang lima', 'Surabaya', '03452');

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_kapal`
--

CREATE TABLE IF NOT EXISTS `t_kapal` (
  `id_kapal` int(11) NOT NULL AUTO_INCREMENT,
  `namakapal` varchar(100) NOT NULL,
  `pelayaran` varchar(15) NOT NULL,
  PRIMARY KEY (`id_kapal`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data untuk tabel `t_kapal`
--

INSERT INTO `t_kapal` (`id_kapal`, `namakapal`, `pelayaran`) VALUES
(1, 'Sinar Salju', 'PT. SPIL'),
(2, 'Mahakam River', 'MERATUS LINE');

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_kota`
--

CREATE TABLE IF NOT EXISTS `t_kota` (
  `id_kota` int(11) NOT NULL AUTO_INCREMENT,
  `namakota` varchar(100) NOT NULL,
  PRIMARY KEY (`id_kota`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data untuk tabel `t_kota`
--

INSERT INTO `t_kota` (`id_kota`, `namakota`) VALUES
(1, 'Surabaya'),
(2, 'Lamongan'),
(3, 'Jakarta');

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_pelayaran`
--

CREATE TABLE IF NOT EXISTS `t_pelayaran` (
  `id_pelayaran` int(11) NOT NULL AUTO_INCREMENT,
  `namapelayaran` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `telp` varchar(15) NOT NULL,
  PRIMARY KEY (`id_pelayaran`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data untuk tabel `t_pelayaran`
--

INSERT INTO `t_pelayaran` (`id_pelayaran`, `namapelayaran`, `alamat`, `telp`) VALUES
(1, 'PT. SPIL', 'Jl. perak timur', ''),
(2, 'MERATUS LINE', 'Alon - Alon priok', ''),
(3, 'Tanto', 'Peraktimur', '031-243526');

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_penerima`
--

CREATE TABLE IF NOT EXISTS `t_penerima` (
  `id_penerima` int(11) NOT NULL AUTO_INCREMENT,
  `namapenerima` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `kota` varchar(10) NOT NULL,
  `telp` varchar(15) NOT NULL,
  PRIMARY KEY (`id_penerima`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data untuk tabel `t_penerima`
--

INSERT INTO `t_penerima` (`id_penerima`, `namapenerima`, `alamat`, `kota`, `telp`) VALUES
(1, 'Ud. Wijaya', 'kupang', 'Surabaya', '03526354767');

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_subcon`
--

CREATE TABLE IF NOT EXISTS `t_subcon` (
  `id_subcon` int(11) NOT NULL AUTO_INCREMENT,
  `namasubcon` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `kota` varchar(50) NOT NULL,
  `telp` varchar(15) NOT NULL,
  PRIMARY KEY (`id_subcon`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data untuk tabel `t_subcon`
--

INSERT INTO `t_subcon` (`id_subcon`, `namasubcon`, `alamat`, `kota`, `telp`) VALUES
(1, 'Laut MAs', 'pengampon', 'Surabaya', '031-72847463');

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_transportir`
--

CREATE TABLE IF NOT EXISTS `t_transportir` (
  `id_transportir` int(11) NOT NULL AUTO_INCREMENT,
  `namatransportir` varchar(10) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `kota` varchar(15) NOT NULL,
  `telp` varchar(15) NOT NULL,
  PRIMARY KEY (`id_transportir`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data untuk tabel `t_transportir`
--

INSERT INTO `t_transportir` (`id_transportir`, `namatransportir`, `alamat`, `kota`, `telp`) VALUES
(1, 'pak soleh', 'kenjeran', 'Surabaya', '031-765854');

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_user`
--

CREATE TABLE IF NOT EXISTS `t_user` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `namapegawai` varchar(20) NOT NULL,
  `jabatan` varchar(20) NOT NULL,
  `status_otoritas` varchar(10) NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data untuk tabel `t_user`
--

INSERT INTO `t_user` (`id_user`, `username`, `password`, `namapegawai`, `jabatan`, `status_otoritas`) VALUES
(1, 'admin', 'admin', 'Imam', 'Admin', 'Admin');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
