-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 17, 2016 at 05:53 AM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `exammodule`
--

-- --------------------------------------------------------

--
-- Table structure for table `player`
--

CREATE TABLE `player` (
  `playerName` varchar(30) NOT NULL,
  `playerCountry` varchar(30) NOT NULL,
  `matchesPlayed` int(5) NOT NULL,
  `battingAverage` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `player`
--

INSERT INTO `player` (`playerName`, `playerCountry`, `matchesPlayed`, `battingAverage`) VALUES
('Adam Gilchrist', 'Australia', 143, 52),
('Andrew Flintoff', 'England', 89, 32),
('Bret Lee', 'Australia', 167, 26),
('Brian Lara', 'WestIndies', 111, 49),
('Jacques Kallis', 'South Africa', 254, 58),
('Mahendra Singh Dhoni', 'India', 100, 42),
('Sachin Tendulkar', 'India', 200, 53),
('Shane Bond', 'New Zealand', 126, 12),
('Virender Sehwag', 'India', 168, 41),
('Wasim Akram', 'Pakistan', 189, 27);

-- --------------------------------------------------------

--
-- Table structure for table `song`
--

CREATE TABLE `song` (
  `Title` varchar(50) NOT NULL,
  `Artist` varchar(50) NOT NULL,
  `Album` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `song`
--

INSERT INTO `song` (`Title`, `Artist`, `Album`) VALUES
('Humdard', 'Arijit', 'Ek Villian'),
('Jeene Laga Hu', 'Sherya', 'Ramaya Vastvaiya'),
('Maa Tujhe Salam', 'Reheman', 'Vande Mataram'),
('Manwa Lage', 'Shreya', 'Happy New Year'),
('Matargashti', 'Mohit', 'Tamasha'),
('Rabba', 'Mohit', 'Heropanti'),
('Rabta', 'Arijit', 'Agent Vinod'),
('Sun sathiya', 'Shreya', 'abcd2'),
('Teri Meri', 'Shreya', 'Bodygaurd'),
('Tu Hi Re', 'Reheman', 'Bombay'),
('Tum Bin', 'sonu', 'Tum Bin'),
('Tum Hi Ho', 'Arijit', 'Ashiqui 2'),
('Tune Jo Na Kaha', 'Mohit', 'New York');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `rno` int(5) NOT NULL,
  `marks` int(3) NOT NULL,
  `grade` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`rno`, `marks`, `grade`) VALUES
(121, 70, 'B'),
(122, 90, 'A'),
(123, 40, 'C'),
(124, 60, 'B');

-- --------------------------------------------------------

--
-- Table structure for table `studentauthentication`
--

CREATE TABLE `studentauthentication` (
  `rno` int(5) NOT NULL,
  `name` varchar(50) NOT NULL,
  `userId` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studentauthentication`
--

INSERT INTO `studentauthentication` (`rno`, `name`, `userId`, `password`) VALUES
(121, 'Akash', 'ask123', '1234'),
(122, 'Anoop', 'ano123', '1234'),
(123, 'Ankita', 'ank123', '1234'),
(124, 'Sagar', 'sag123', '1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `player`
--
ALTER TABLE `player`
  ADD PRIMARY KEY (`playerName`);

--
-- Indexes for table `song`
--
ALTER TABLE `song`
  ADD PRIMARY KEY (`Title`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`rno`);

--
-- Indexes for table `studentauthentication`
--
ALTER TABLE `studentauthentication`
  ADD PRIMARY KEY (`rno`),
  ADD UNIQUE KEY `userId` (`userId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `studentauthentication`
--
ALTER TABLE `studentauthentication`
  MODIFY `rno` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=125;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
