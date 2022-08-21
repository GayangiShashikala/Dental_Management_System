-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Aug 24, 2021 at 03:31 PM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dental_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `appointment_details`
--

DROP TABLE IF EXISTS `appointment_details`;
CREATE TABLE IF NOT EXISTS `appointment_details` (
  `App_ID` int(200) NOT NULL,
  `P_Name` varchar(200) NOT NULL,
  `Date` text NOT NULL,
  `Time` text NOT NULL,
  `Treatments` varchar(200) NOT NULL,
  PRIMARY KEY (`App_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `appointment_details`
--

INSERT INTO `appointment_details` (`App_ID`, `P_Name`, `Date`, `Time`, `Treatments`) VALUES
(2, 'shashi', 'Thu Aug 05 00:00:00 IST 2021', 'Fri Aug 06 02:44:29 IST 2021', 'shashi'),
(3, 'ishanka', 'Tue Nov 23 00:00:00 IST 2021', '1627938708352', 'headache');

-- --------------------------------------------------------

--
-- Table structure for table `patient_details`
--

DROP TABLE IF EXISTS `patient_details`;
CREATE TABLE IF NOT EXISTS `patient_details` (
  `P_ID` int(200) NOT NULL,
  `P_Name` varchar(200) NOT NULL,
  `Phone` int(11) NOT NULL,
  `Address` varchar(250) NOT NULL,
  `Age` int(11) NOT NULL,
  `Gender` varchar(100) NOT NULL,
  `Allergies` varchar(200) NOT NULL,
  PRIMARY KEY (`P_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient_details`
--

INSERT INTO `patient_details` (`P_ID`, `P_Name`, `Phone`, `Address`, `Age`, `Gender`, `Allergies`) VALUES
(1, 'nimal', 715468589, 'Balapitiya', 44, 'Male', 'None'),
(2, 'shashi', 21456836, 'galle ', 22, 'Female', 'none'),
(3, 'ishanka', 12346655, 'galle', 22, 'Male', 'none'),
(4, 'Kamal', 14587954, 'galle', 25, 'Male', 'none');

-- --------------------------------------------------------

--
-- Table structure for table `prescription_details`
--

DROP TABLE IF EXISTS `prescription_details`;
CREATE TABLE IF NOT EXISTS `prescription_details` (
  `Pres_ID` int(250) NOT NULL,
  `Treatment` varchar(200) NOT NULL,
  `Cost` float NOT NULL,
  `P_Name` varchar(200) NOT NULL,
  `Quentity` float NOT NULL,
  `Medicine` varchar(200) NOT NULL,
  PRIMARY KEY (`Pres_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `prescription_details`
--

INSERT INTO `prescription_details` (`Pres_ID`, `Treatment`, `Cost`, `P_Name`, `Quentity`, `Medicine`) VALUES
(1, 'Filling', 1000, 'shashi', 2, 'ghnccccc'),
(2, 'aaaa', 20000, 'nimal', 2, 'aaaaa'),
(3, 'eeee', 3333, 'nimal', 33, 'eeee');

-- --------------------------------------------------------

--
-- Table structure for table `register_details`
--

DROP TABLE IF EXISTS `register_details`;
CREATE TABLE IF NOT EXISTS `register_details` (
  `FirstName` varchar(200) NOT NULL,
  `LastName` varchar(200) NOT NULL,
  `Password` varchar(200) NOT NULL,
  `Email` varchar(200) NOT NULL,
  `Question_security` varchar(250) NOT NULL,
  `Answer_Security` varchar(250) NOT NULL,
  PRIMARY KEY (`FirstName`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `register_details`
--

INSERT INTO `register_details` (`FirstName`, `LastName`, `Password`, `Email`, `Question_security`, `Answer_Security`) VALUES
('nimal', 'silva', '456', 'n@gmail.com', 'what is your nick name?', 'nicky'),
('shashi', 'gayangi', '1234', 'g@gmail.com', 'What is your pet name?', 'rocky');

-- --------------------------------------------------------

--
-- Table structure for table `treatment_details`
--

DROP TABLE IF EXISTS `treatment_details`;
CREATE TABLE IF NOT EXISTS `treatment_details` (
  `Treat_ID` int(200) NOT NULL,
  `Treatment_Name` varchar(200) NOT NULL,
  `Cost` float NOT NULL,
  `Medicines` varchar(200) NOT NULL,
  PRIMARY KEY (`Treat_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `treatment_details`
--

INSERT INTO `treatment_details` (`Treat_ID`, `Treatment_Name`, `Cost`, `Medicines`) VALUES
(1, 'headache', 1000, 'panadol'),
(2, 'fill', 4000, 'bencil');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
