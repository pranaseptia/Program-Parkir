-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 16, 2018 at 07:27 AM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_parkir`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`) VALUES
(1, 'aldireza', '123');

-- --------------------------------------------------------

--
-- Table structure for table `tb_parkir`
--

CREATE TABLE `tb_parkir` (
  `no_tiket` int(15) NOT NULL,
  `no_kendaraan` varchar(15) NOT NULL,
  `jenis` enum('Mobil','Motor') NOT NULL,
  `tgl_masuk` date NOT NULL,
  `tgl_keluar` date DEFAULT NULL,
  `jam_masuk` time NOT NULL,
  `jam_keluar` time DEFAULT NULL,
  `biaya` int(15) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_parkir`
--

INSERT INTO `tb_parkir` (`no_tiket`, `no_kendaraan`, `jenis`, `tgl_masuk`, `tgl_keluar`, `jam_masuk`, `jam_keluar`, `biaya`) VALUES
(5, 'AB 1123 QW', 'Mobil', '2018-12-15', '2018-12-15', '15:25:48', '15:26:34', 5000),
(6, 'Z 1111 QQ', 'Mobil', '2018-12-15', '2018-12-15', '15:26:05', '15:26:16', 5000),
(7, 'AB 1231 WW', 'Mobil', '2018-12-16', '2018-12-16', '13:05:22', '13:05:37', 5000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_pendapatan`
--

CREATE TABLE `tb_pendapatan` (
  `no_tiket` int(15) NOT NULL,
  `no_kendaraan` varchar(15) NOT NULL,
  `jenis` enum('Mobil','Motor') NOT NULL,
  `tgl_masuk` date NOT NULL,
  `tgl_keluar` date NOT NULL,
  `jam_masuk` time NOT NULL,
  `jam_keluar` time NOT NULL,
  `biaya` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_parkir`
--
ALTER TABLE `tb_parkir`
  ADD PRIMARY KEY (`no_tiket`);

--
-- Indexes for table `tb_pendapatan`
--
ALTER TABLE `tb_pendapatan`
  ADD PRIMARY KEY (`biaya`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tb_parkir`
--
ALTER TABLE `tb_parkir`
  MODIFY `no_tiket` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
