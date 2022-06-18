-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 08, 2021 at 04:05 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.4.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pt_mds`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `idmember` varchar(30) NOT NULL,
  `fullname` varchar(35) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `retypepassword` varchar(50) NOT NULL,
  `level` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`idmember`, `fullname`, `username`, `password`, `retypepassword`, `level`) VALUES
('202102001', 'MAMAN AMANDUS', 'amandus2021', 'Password', 'Password', 'Admin'),
('202102002', 'PINGKAN H. RORING', 'pingkan', 'Password', 'Password', 'Manager'),
('202102003', 'yogamartadinata', 'yogamartadinata', 'password', 'password', '--Select Level--');

-- --------------------------------------------------------

--
-- Table structure for table `tb_export`
--

CREATE TABLE `tb_export` (
  `job_no` varchar(50) NOT NULL,
  `BL` varchar(75) NOT NULL,
  `shipper` varchar(100) NOT NULL,
  `shipper_name` varchar(100) NOT NULL,
  `shipper_address` varchar(150) NOT NULL,
  `consignee` varchar(100) NOT NULL,
  `consignee_name` varchar(100) NOT NULL,
  `consignee_address` varchar(150) NOT NULL,
  `marketing` varchar(100) NOT NULL,
  `vessel` varchar(100) NOT NULL,
  `POL` varchar(100) NOT NULL,
  `place_Dlv` varchar(100) NOT NULL,
  `ETD` varchar(50) NOT NULL,
  `CY` varchar(10) NOT NULL,
  `CFS` varchar(10) NOT NULL,
  `gross_W` varchar(100) NOT NULL,
  `C_20` varchar(4) NOT NULL,
  `C_40` varchar(4) NOT NULL,
  `C_45` varchar(4) NOT NULL,
  `agen_Cd` varchar(100) NOT NULL,
  `voyage` varchar(100) NOT NULL,
  `POD` varchar(100) NOT NULL,
  `ETA` varchar(50) NOT NULL,
  `net_W` varchar(50) NOT NULL,
  `packages` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_export`
--

INSERT INTO `tb_export` (`job_no`, `BL`, `shipper`, `shipper_name`, `shipper_address`, `consignee`, `consignee_name`, `consignee_address`, `marketing`, `vessel`, `POL`, `place_Dlv`, `ETD`, `CY`, `CFS`, `gross_W`, `C_20`, `C_40`, `C_45`, `agen_Cd`, `voyage`, `POD`, `ETA`, `net_W`, `packages`) VALUES
('MDS-2021E001', 'BK-001', 'Tanjung Priok, JKT', 'PT. Spectrum Unitek', 'BSD-Tangerang Selatan Indonesia', 'PT. ETERNITI', 'PT. ETERNITI', 'AUSTRALIA', 'MAMAN', 'KM AWU', 'NIKE', 'AUS', 'null', 'true', 'false', '12', '', '', '', 'GEORGE', 'JKT-AUS', 'JKT-AUS', 'null', '11', '35');

-- --------------------------------------------------------

--
-- Table structure for table `tb_import`
--

CREATE TABLE `tb_import` (
  `job_no` varchar(50) NOT NULL,
  `BL` varchar(50) NOT NULL,
  `shipper` varchar(100) NOT NULL,
  `shipper_name` varchar(100) NOT NULL,
  `shipper_address` varchar(150) NOT NULL,
  `consignee` varchar(100) NOT NULL,
  `consignee_name` varchar(100) NOT NULL,
  `consignee_address` varchar(150) NOT NULL,
  `marketing` varchar(50) NOT NULL,
  `vessel` varchar(100) NOT NULL,
  `POL` varchar(100) NOT NULL,
  `place_Dlv` varchar(100) NOT NULL,
  `ETD` varchar(50) NOT NULL,
  `CY` varchar(10) NOT NULL,
  `CFS` varchar(10) NOT NULL,
  `Gross_W` varchar(20) NOT NULL,
  `c_20` varchar(4) NOT NULL,
  `c_40` varchar(4) NOT NULL,
  `c_45` varchar(4) NOT NULL,
  `agen_Cd` varchar(50) NOT NULL,
  `voyage` varchar(100) NOT NULL,
  `POD` varchar(100) NOT NULL,
  `ETA` varchar(50) NOT NULL,
  `net_W` varchar(50) NOT NULL,
  `packages` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_import`
--

INSERT INTO `tb_import` (`job_no`, `BL`, `shipper`, `shipper_name`, `shipper_address`, `consignee`, `consignee_name`, `consignee_address`, `marketing`, `vessel`, `POL`, `place_Dlv`, `ETD`, `CY`, `CFS`, `Gross_W`, `c_20`, `c_40`, `c_45`, `agen_Cd`, `voyage`, `POD`, `ETA`, `net_W`, `packages`) VALUES
('MDS-2021I001', 'BK-001', 'Tanjung Priok, JKT', 'PT. Spectrum Unitek', 'BSD-Tangerang Selatan Indonesia', 'PT. ETERNITI', 'PT. ETERNITI', 'SINGAPORE', 'YOGA ', 'KM. NIKI', 'NIKE', 'SINGAPORE', 'Wed Jun 30 00:00:00 ICT 2021', 'true', 'false', '2', '', '', '', 'GEORGE', 'JKT-SING', 'MDS', 'Tue Jun 29 03:30:57 ICT 2021', '2', '134'),
('MDS-2021I002', 'BK-002', 'Tanjung Priok, JKT', 'PT. Indocap', 'BSD-Tangerang Selatan Indonesia', 'SINGAPORE', 'PT. ETERNITI', 'SINGAPORE', 'MAMAN', 'KM. NIKI', 'NIKE', 'SINGAPORE', '30-06-2021', 'false', 'true', '4', '4', '', '5', 'GEORGE', 'JKT-SING', 'MDS', '10-07-2021', '2', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`idmember`);

--
-- Indexes for table `tb_export`
--
ALTER TABLE `tb_export`
  ADD PRIMARY KEY (`job_no`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
