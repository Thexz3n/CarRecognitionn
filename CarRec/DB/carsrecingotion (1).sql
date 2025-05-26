-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 26, 2025 at 01:19 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `carsrecingotion`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `AdminID` int(11) NOT NULL,
  `EmployeeID` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Phone` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `Address` varchar(20) NOT NULL,
  `Role` varchar(5) NOT NULL,
  `SecurityCode` varchar(5) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `dateCreate` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `cars`
--
-- Error reading structure for table carsrecingotion.cars: #1932 - Table &#039;carsrecingotion.cars&#039; doesn&#039;t exist in engine
-- Error reading data for table carsrecingotion.cars: #1064 - You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near &#039;FROM `carsrecingotion`.`cars`&#039; at line 1

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `EmployeeID` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `SecurityCode` varchar(4) NOT NULL,
  `Phone` varchar(20) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Address` varchar(20) NOT NULL,
  `Role` varchar(5) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`EmployeeID`, `Name`, `username`, `password`, `SecurityCode`, `Phone`, `Email`, `Address`, `Role`, `created_at`) VALUES
(20, 'arosahand', 'aro', '1234', '', '07701111', 'aro@gmail.com', 'slemani', 'Admin', '2025-05-25 08:16:58');

-- --------------------------------------------------------

--
-- Table structure for table `plate_ocr`
--

CREATE TABLE `plate_ocr` (
  `ID` int(11) NOT NULL,
  `plate_text` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `plate_ocr`
--

INSERT INTO `plate_ocr` (`ID`, `plate_text`) VALUES
(1, '22 H 42549'),
(2, '22 H 42549'),
(3, '22 H 42549'),
(4, '22 H 42549'),
(6, '22 H 42549'),
(7, '22 H 42549'),
(8, '22 H 42549'),
(9, '22 K 70931'),
(10, '22 K 70931'),
(11, '22 K 70931'),
(12, '22 K 70931');

-- --------------------------------------------------------

--
-- Table structure for table `registerecar`
--

CREATE TABLE `registerecar` (
  `IDCars` varchar(20) NOT NULL,
  `NumberPlate` varchar(20) NOT NULL,
  `typeCar` varchar(20) NOT NULL,
  `color` varchar(10) NOT NULL,
  `year` year(4) NOT NULL,
  `name` varchar(25) NOT NULL,
  `partnership` varchar(20) NOT NULL,
  `formallted` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `registerecar`
--

INSERT INTO `registerecar` (`IDCars`, `NumberPlate`, `typeCar`, `color`, `year`, `name`, `partnership`, `formallted`) VALUES
('97', '43', 'Truck', 'Gray', '2024', 'muso', 'Yes', 'Yes');

-- --------------------------------------------------------

--
-- Table structure for table `sendassignedtasks`
--

CREATE TABLE `sendassignedtasks` (
  `TasksID` int(11) NOT NULL,
  `AdminID` varchar(50) NOT NULL,
  `UserID` varchar(50) NOT NULL,
  `typeTask` varchar(20) NOT NULL,
  `Description` text NOT NULL,
  `Date` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `test_zanyary`
--

CREATE TABLE `test_zanyary` (
  `plate_text` varchar(20) NOT NULL,
  `zanyay` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `test_zanyary`
--

INSERT INTO `test_zanyary` (`plate_text`, `zanyay`) VALUES
('22 H 42549', 'girawa'),
('22 K 70931', 'agadaryba');

-- --------------------------------------------------------

--
-- Table structure for table `truks`
--

CREATE TABLE `truks` (
  `truckID` int(11) NOT NULL,
  `Type` varchar(20) NOT NULL,
  `plateNumber` int(11) NOT NULL,
  `dateAdded` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `UserID` int(11) NOT NULL,
  `EmployeeID` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Phone` varchar(10) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `Address` varchar(25) NOT NULL,
  `Role` varchar(5) NOT NULL,
  `SecurityCode` varchar(5) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `DateCreate` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`UserID`, `EmployeeID`, `Name`, `Phone`, `Email`, `Address`, `Role`, `SecurityCode`, `Username`, `Password`, `DateCreate`) VALUES
(1, 2, 'Muslim Mahmood', '723474', 'pjxwyih@gmail.com', 'Hawler', 'user', '12sd', 'z3n', 'z3n', '2025-05-13');

-- --------------------------------------------------------

--
-- Table structure for table `vehicles`
--

CREATE TABLE `vehicles` (
  `cars_id` varchar(50) NOT NULL,
  `make` varchar(50) NOT NULL,
  `model` varchar(50) NOT NULL,
  `year` int(11) NOT NULL,
  `color` varchar(20) DEFAULT NULL,
  `price` decimal(10,2) NOT NULL,
  `dataRegister` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`AdminID`),
  ADD UNIQUE KEY `EmployeeID` (`EmployeeID`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`EmployeeID`);

--
-- Indexes for table `plate_ocr`
--
ALTER TABLE `plate_ocr`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `plate_text` (`plate_text`);

--
-- Indexes for table `registerecar`
--
ALTER TABLE `registerecar`
  ADD PRIMARY KEY (`NumberPlate`),
  ADD UNIQUE KEY `IDCars` (`IDCars`);

--
-- Indexes for table `sendassignedtasks`
--
ALTER TABLE `sendassignedtasks`
  ADD PRIMARY KEY (`TasksID`);

--
-- Indexes for table `test_zanyary`
--
ALTER TABLE `test_zanyary`
  ADD PRIMARY KEY (`plate_text`);

--
-- Indexes for table `truks`
--
ALTER TABLE `truks`
  ADD PRIMARY KEY (`truckID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`UserID`),
  ADD UNIQUE KEY `EmployeeID` (`EmployeeID`);

--
-- Indexes for table `vehicles`
--
ALTER TABLE `vehicles`
  ADD PRIMARY KEY (`cars_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `AdminID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `EmployeeID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `plate_ocr`
--
ALTER TABLE `plate_ocr`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `sendassignedtasks`
--
ALTER TABLE `sendassignedtasks`
  MODIFY `TasksID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `truks`
--
ALTER TABLE `truks`
  MODIFY `truckID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `plate_ocr`
--
ALTER TABLE `plate_ocr`
  ADD CONSTRAINT `plate_ocr_ibfk_1` FOREIGN KEY (`plate_text`) REFERENCES `test_zanyary` (`plate_text`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
