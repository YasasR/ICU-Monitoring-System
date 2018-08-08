-- phpMyAdmin SQL Dump
-- version 4.7.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Oct 03, 2017 at 09:43 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotlmngsys`
--

-- --------------------------------------------------------

--
-- Table structure for table `airporthire`
--

DROP TABLE IF EXISTS `airporthire`;
CREATE TABLE IF NOT EXISTS `airporthire` (
  `AirportID` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `VehicleType` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Price` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `airporthire`
--

INSERT INTO `airporthire` (`AirportID`, `VehicleType`, `Price`) VALUES
('HTLA1', 'null', 0);

-- --------------------------------------------------------

--
-- Table structure for table `checkin`
--

DROP TABLE IF EXISTS `checkin`;
CREATE TABLE IF NOT EXISTS `checkin` (
  `RegNo` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ReservationID` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `RoomNo` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`RegNo`),
  UNIQUE KEY `ReservationID` (`ReservationID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `customerdetails`
--

DROP TABLE IF EXISTS `customerdetails`;
CREATE TABLE IF NOT EXISTS `customerdetails` (
  `CustomerID` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Fnamr` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `Lname` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `Passport/ID` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Nationality` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ContactNo` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Country` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `City` text COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`CustomerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `laundry`
--

DROP TABLE IF EXISTS `laundry`;
CREATE TABLE IF NOT EXISTS `laundry` (
  `LaundryID` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `LaundryItem` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Price` int(20) NOT NULL,
  PRIMARY KEY (`LaundryID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `laundry`
--

INSERT INTO `laundry` (`LaundryID`, `LaundryItem`, `Price`) VALUES
('HTLL1', 'null', 0);

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
CREATE TABLE IF NOT EXISTS `payment` (
  `BillNo` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ReservationID` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `CustomerID` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `PaymentMethod` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `RoomCharges` int(20) NOT NULL,
  `ServiceCharges` int(20) NOT NULL,
  `AdvancePayment` int(20) NOT NULL,
  `AmountDuePayment` int(20) NOT NULL,
  PRIMARY KEY (`BillNo`),
  UNIQUE KEY `CustomerID` (`CustomerID`),
  KEY `payment_ibfk_1` (`ReservationID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `rentdetail`
--

DROP TABLE IF EXISTS `rentdetail`;
CREATE TABLE IF NOT EXISTS `rentdetail` (
  `RentID` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `VehicleType` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Price` int(20) NOT NULL,
  PRIMARY KEY (`RentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `rentdetail`
--

INSERT INTO `rentdetail` (`RentID`, `VehicleType`, `Price`) VALUES
('HTLREN1', 'null', 0);

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
CREATE TABLE IF NOT EXISTS `reservation` (
  `ReservationID` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `CutomerID` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `UserID` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `CheckInDate` date NOT NULL,
  `CheckOutDate` date NOT NULL,
  `RoomID` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NoOfRooms` int(40) NOT NULL DEFAULT '0',
  `NoOfAdults` int(40) NOT NULL DEFAULT '0',
  `NoOfChildren` int(20) NOT NULL DEFAULT '0',
  `NoOfInfant` int(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ReservationID`),
  UNIQUE KEY `RoomID` (`RoomID`),
  KEY `fk1` (`CutomerID`),
  KEY `fk2` (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `restaurantdetail`
--

DROP TABLE IF EXISTS `restaurantdetail`;
CREATE TABLE IF NOT EXISTS `restaurantdetail` (
  `FoodID` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `FoodItem` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Price` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`FoodID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `restaurantdetail`
--

INSERT INTO `restaurantdetail` (`FoodID`, `FoodItem`, `Price`) VALUES
('HTLF1', 'null', '0');

-- --------------------------------------------------------

--
-- Table structure for table `roomavailability`
--

DROP TABLE IF EXISTS `roomavailability`;
CREATE TABLE IF NOT EXISTS `roomavailability` (
  `RoomNo` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `CheckInDate` date NOT NULL,
  `CheckOutDate` date NOT NULL,
  `Availability` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `roomavailability`
--

INSERT INTO `roomavailability` (`RoomNo`, `CheckInDate`, `CheckOutDate`, `Availability`) VALUES
('HTLROOM1', '2017-08-01', '2017-08-09', 'null');

-- --------------------------------------------------------

--
-- Table structure for table `roomdetail`
--

DROP TABLE IF EXISTS `roomdetail`;
CREATE TABLE IF NOT EXISTS `roomdetail` (
  `RoomID` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `RoomType` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ACType` varchar(5) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MealType` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `Price` int(20) NOT NULL,
  PRIMARY KEY (`RoomID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `roomdetail`
--

INSERT INTO `roomdetail` (`RoomID`, `RoomType`, `ACType`, `MealType`, `Price`) VALUES
('SARO', 'Single Room', 'AC', 'Room Only', 0);

-- --------------------------------------------------------

--
-- Table structure for table `servicerequest`
--

DROP TABLE IF EXISTS `servicerequest`;
CREATE TABLE IF NOT EXISTS `servicerequest` (
  `SerReqID` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ReservationID` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `CustomerID` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ServiceType` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Price` int(20) NOT NULL,
  PRIMARY KEY (`SerReqID`),
  UNIQUE KEY `ReservationID` (`ReservationID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tourdetail`
--

DROP TABLE IF EXISTS `tourdetail`;
CREATE TABLE IF NOT EXISTS `tourdetail` (
  `TourID` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TourType` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Price` int(20) NOT NULL,
  PRIMARY KEY (`TourID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tourdetail`
--

INSERT INTO `tourdetail` (`TourID`, `TourType`, `Price`) VALUES
('HTLT1', 'null', 0);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `UserID` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `UserType` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `UserName` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `Password` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`UserID`, `UserType`, `UserName`, `Password`) VALUES
('HTLU1', 'null', 'null', 'null');

-- --------------------------------------------------------

--
-- Table structure for table `vehiclerequirement`
--

DROP TABLE IF EXISTS `vehiclerequirement`;
CREATE TABLE IF NOT EXISTS `vehiclerequirement` (
  `Date` date NOT NULL,
  `VehicleType` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Quantity` int(50) NOT NULL,
  `Description` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`Date`,`VehicleType`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `vehiclerequirement`
--

INSERT INTO `vehiclerequirement` (`Date`, `VehicleType`, `Quantity`, `Description`) VALUES
('2017-08-09', 'null', 0, 'null');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `checkin`
--
ALTER TABLE `checkin`
  ADD CONSTRAINT `checkin_ibfk_1` FOREIGN KEY (`RegNo`) REFERENCES `reservation` (`ReservationID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`ReservationID`) REFERENCES `reservation` (`ReservationID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `payment_ibfk_2` FOREIGN KEY (`CustomerID`) REFERENCES `customerdetails` (`CustomerID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `fk1` FOREIGN KEY (`CutomerID`) REFERENCES `customerdetails` (`CustomerID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk2` FOREIGN KEY (`UserID`) REFERENCES `user` (`UserID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk3` FOREIGN KEY (`RoomID`) REFERENCES `roomdetail` (`RoomID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `servicerequest`
--
ALTER TABLE `servicerequest`
  ADD CONSTRAINT `servicerequest_ibfk_1` FOREIGN KEY (`ReservationID`) REFERENCES `reservation` (`ReservationID`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
