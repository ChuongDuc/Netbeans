-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 27, 2021 at 01:24 AM
-- Server version: 8.0.17
-- PHP Version: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dlkh`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbkhachhang`
--

CREATE TABLE `tbkhachhang` (
  `SoTK` int(11) NOT NULL,
  `Hoten` varchar(30) NOT NULL,
  `GT` tinyint(1) NOT NULL,
  `Diachi` varchar(30) NOT NULL,
  `Sodu` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `tbkhachhang`
--

INSERT INTO `tbkhachhang` (`SoTK`, `Hoten`, `GT`, `Diachi`, `Sodu`) VALUES
(123456, 'A', 1, 'Ha Noi', 123456),
(234567, 'B', 0, 'TPHCM', 234567),
(345678, 'C', 1, 'Ha Noi', 345678);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
