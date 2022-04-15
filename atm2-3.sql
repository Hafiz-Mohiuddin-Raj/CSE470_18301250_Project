-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 01, 2021 at 09:42 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `atm2`
--

-- --------------------------------------------------------

--
-- Table structure for table `accounts`
--

CREATE TABLE `accounts` (
  `account_number` int(10) NOT NULL,
  `total_amount` int(15) DEFAULT NULL,
  `date_checked` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`account_number`, `total_amount`, `date_checked`) VALUES
(123004, 1500, '0000-00-00'),
(123005, 10250, '0000-00-00'),
(1239001, 1200, '0000-00-00'),
(1239002, 5000, '0000-00-00'),
(1239005, 20000, '0000-00-00'),
(1239006, 100, '0000-00-00'),
(1239010, 600, '0000-00-00');

-- --------------------------------------------------------

--
-- Table structure for table `atm`
--

CREATE TABLE `atm` (
  `total_customers` int(15) DEFAULT NULL,
  `valid_pin_no` int(6) DEFAULT NULL,
  `valid_unique_username` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `atm`
--

INSERT INTO `atm` (`total_customers`, `valid_pin_no`, `valid_unique_username`) VALUES
(15, 50939, '44'),
(15, 50990, 'jH1'),
(15, 50993, 'random'),
(15, 50998, 'ZR'),
(15, 50999, 'HMR123'),
(15, 55999, 'jH1345'),
(12, 985005, 'saziaS');

-- --------------------------------------------------------

--
-- Table structure for table `bank`
--

CREATE TABLE `bank` (
  `name` varchar(15) DEFAULT NULL,
  `numberofcustomers` int(100) DEFAULT NULL,
  `brancheslocated` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `branches`
--

CREATE TABLE `branches` (
  `location` varchar(15) DEFAULT NULL,
  `name` varchar(15) DEFAULT NULL,
  `number` int(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `name` varchar(15) DEFAULT NULL,
  `NID` int(8) DEFAULT NULL,
  `pin_no` int(6) NOT NULL,
  `account_num` int(7) DEFAULT NULL,
  `username` varchar(15) DEFAULT NULL,
  `balance_availability` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`name`, `NID`, `pin_no`, `account_num`, `username`, `balance_availability`) VALUES
('Barrack Obama', 12345679, 50939, 1239010, '44', '400'),
('JH Muhit', 12345672, 50990, 1239002, 'jH1', NULL),
('some guy', 12345331, 50993, 1239006, 'random', NULL),
('Zamiur Rahman', 12345673, 50998, 123004, 'ZR', NULL),
('Hafiz Mohiuddin', 12345671, 50999, 1239001, 'HMR123', NULL),
('Ibrahim Siddiqu', 12345675, 55999, 1239005, 'jH1345', NULL),
('sazia shahreen', 12345678, 985005, 123005, 'saziaS', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `deposit`
--

CREATE TABLE `deposit` (
  `account_number` int(10) DEFAULT NULL,
  `amountDeposited` int(10) DEFAULT NULL,
  `transaction_id` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `deposit`
--

INSERT INTO `deposit` (`account_number`, `amountDeposited`, `transaction_id`) VALUES
(123004, 400, 0),
(123005, 400, 0),
(1239001, 400, 0),
(1239002, 400, 0),
(1239005, 400, 0),
(1239006, 400, 0),
(1239010, 400, 0);

-- --------------------------------------------------------

--
-- Table structure for table `transactions`
--

CREATE TABLE `transactions` (
  `transaction_id` int(10) DEFAULT NULL,
  `amount` int(10) DEFAULT NULL,
  `toAccount` int(10) DEFAULT NULL,
  `fromAccount` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transactions`
--

INSERT INTO `transactions` (`transaction_id`, `amount`, `toAccount`, `fromAccount`) VALUES
(22, 50, 123004, 123005),
(22, 50, 123004, 123005),
(22, 50, 123004, 123005),
(22, 50, 123004, 123005),
(22, 50, 123004, 123005),
(22, 50, 123004, 123005),
(22, 50, 123004, 123005),
(22, 50, 123004, 123005);

-- --------------------------------------------------------

--
-- Table structure for table `transfer`
--

CREATE TABLE `transfer` (
  `account_number` int(10) DEFAULT NULL,
  `amountTransferred` int(10) DEFAULT NULL,
  `transaction_id` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transfer`
--

INSERT INTO `transfer` (`account_number`, `amountTransferred`, `transaction_id`) VALUES
(123004, 100, 0),
(123005, 100, 22),
(1239001, 100, 0),
(1239002, 100, 0),
(1239005, 100, 0),
(1239006, 100, 0),
(1239010, 100, 22);

-- --------------------------------------------------------

--
-- Table structure for table `withdrawal`
--

CREATE TABLE `withdrawal` (
  `account_number` int(10) DEFAULT NULL,
  `amountWithdrawn` int(10) DEFAULT NULL,
  `transaction_id` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `withdrawal`
--

INSERT INTO `withdrawal` (`account_number`, `amountWithdrawn`, `transaction_id`) VALUES
(123004, 0, 0),
(123005, 0, 0),
(1239001, 0, 0),
(1239002, 0, 0),
(1239005, 0, 0),
(1239006, 0, 0),
(1239010, 0, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `accounts`
--
ALTER TABLE `accounts`
  ADD PRIMARY KEY (`account_number`);

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`pin_no`),
  ADD KEY `account_num` (`account_num`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `customers`
--
ALTER TABLE `customers`
  ADD CONSTRAINT `customers_ibfk_1` FOREIGN KEY (`account_num`) REFERENCES `accounts` (`account_number`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
