-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 18, 2018 at 01:45 AM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 5.5.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `wisata`
--

-- --------------------------------------------------------

--
-- Table structure for table `airterjunbenangkelambu`
--

CREATE TABLE `airterjunbenangkelambu` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `airterjunbenangsetokel`
--

CREATE TABLE `airterjunbenangsetokel` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `airterjungeripak`
--

CREATE TABLE `airterjungeripak` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `airterjunjerukmanis`
--

CREATE TABLE `airterjunjerukmanis` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `airterjunkelep`
--

CREATE TABLE `airterjunkelep` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `airterjunotakkokoh`
--

CREATE TABLE `airterjunotakkokoh` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `airterjunpupas`
--

CREATE TABLE `airterjunpupas` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `airterjuntiuteja`
--

CREATE TABLE `airterjuntiuteja` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `gunungbarujari`
--

CREATE TABLE `gunungbarujari` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `gunungrinjani`
--

CREATE TABLE `gunungrinjani` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(50) NOT NULL,
  `rating` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `kolamrenagputriduyung`
--

CREATE TABLE `kolamrenagputriduyung` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `kolamrenangaiqbukak`
--

CREATE TABLE `kolamrenangaiqbukak` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `kolamrenangjoben`
--

CREATE TABLE `kolamrenangjoben` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `kolamrenanglembahhijau`
--

CREATE TABLE `kolamrenanglembahhijau` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `kolamrenanglemor`
--

CREATE TABLE `kolamrenanglemor` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `kolamrenangnarmada`
--

CREATE TABLE `kolamrenangnarmada` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pantaicemara`
--

CREATE TABLE `pantaicemara` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pantaiekas`
--

CREATE TABLE `pantaiekas` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pantaifink`
--

CREATE TABLE `pantaifink` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pantaifink`
--

INSERT INTO `pantaifink` (`ID`, `Email`, `coment`, `rating`) VALUES
(15, 'Jumawalgbk@gmail.com', 'Aku kasih 3.5 bintang, pantai pink sangat bagus,  aku pernah kesana', '3.5');

-- --------------------------------------------------------

--
-- Table structure for table `pantaikuta`
--

CREATE TABLE `pantaikuta` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` int(11) NOT NULL,
  `rating` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pantailabuan`
--

CREATE TABLE `pantailabuan` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pantairambang`
--

CREATE TABLE `pantairambang` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pantaisenggigi`
--

CREATE TABLE `pantaisenggigi` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pantaisurga`
--

CREATE TABLE `pantaisurga` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `coment` varchar(1000) NOT NULL,
  `rating` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `rating`
--

CREATE TABLE `rating` (
  `ID` int(11) NOT NULL,
  `Jumlah` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rating`
--

INSERT INTO `rating` (`ID`, `Jumlah`) VALUES
(10, 5),
(11, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `airterjunbenangkelambu`
--
ALTER TABLE `airterjunbenangkelambu`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `airterjunbenangsetokel`
--
ALTER TABLE `airterjunbenangsetokel`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `airterjungeripak`
--
ALTER TABLE `airterjungeripak`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `airterjunjerukmanis`
--
ALTER TABLE `airterjunjerukmanis`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `airterjunkelep`
--
ALTER TABLE `airterjunkelep`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `airterjunotakkokoh`
--
ALTER TABLE `airterjunotakkokoh`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `airterjunpupas`
--
ALTER TABLE `airterjunpupas`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `airterjuntiuteja`
--
ALTER TABLE `airterjuntiuteja`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `gunungbarujari`
--
ALTER TABLE `gunungbarujari`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `gunungrinjani`
--
ALTER TABLE `gunungrinjani`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `kolamrenagputriduyung`
--
ALTER TABLE `kolamrenagputriduyung`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `kolamrenangaiqbukak`
--
ALTER TABLE `kolamrenangaiqbukak`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `kolamrenangjoben`
--
ALTER TABLE `kolamrenangjoben`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `kolamrenanglembahhijau`
--
ALTER TABLE `kolamrenanglembahhijau`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `kolamrenanglemor`
--
ALTER TABLE `kolamrenanglemor`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `kolamrenangnarmada`
--
ALTER TABLE `kolamrenangnarmada`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `pantaicemara`
--
ALTER TABLE `pantaicemara`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `pantaiekas`
--
ALTER TABLE `pantaiekas`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `pantaifink`
--
ALTER TABLE `pantaifink`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `pantaikuta`
--
ALTER TABLE `pantaikuta`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `pantailabuan`
--
ALTER TABLE `pantailabuan`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `pantairambang`
--
ALTER TABLE `pantairambang`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `pantaisenggigi`
--
ALTER TABLE `pantaisenggigi`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `pantaisurga`
--
ALTER TABLE `pantaisurga`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `rating`
--
ALTER TABLE `rating`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `airterjunbenangkelambu`
--
ALTER TABLE `airterjunbenangkelambu`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `airterjunbenangsetokel`
--
ALTER TABLE `airterjunbenangsetokel`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `airterjungeripak`
--
ALTER TABLE `airterjungeripak`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `airterjunjerukmanis`
--
ALTER TABLE `airterjunjerukmanis`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `airterjunkelep`
--
ALTER TABLE `airterjunkelep`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `airterjunotakkokoh`
--
ALTER TABLE `airterjunotakkokoh`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `airterjunpupas`
--
ALTER TABLE `airterjunpupas`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `airterjuntiuteja`
--
ALTER TABLE `airterjuntiuteja`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `gunungbarujari`
--
ALTER TABLE `gunungbarujari`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `gunungrinjani`
--
ALTER TABLE `gunungrinjani`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `kolamrenagputriduyung`
--
ALTER TABLE `kolamrenagputriduyung`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `kolamrenangaiqbukak`
--
ALTER TABLE `kolamrenangaiqbukak`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `kolamrenangjoben`
--
ALTER TABLE `kolamrenangjoben`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `kolamrenanglembahhijau`
--
ALTER TABLE `kolamrenanglembahhijau`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `kolamrenanglemor`
--
ALTER TABLE `kolamrenanglemor`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `kolamrenangnarmada`
--
ALTER TABLE `kolamrenangnarmada`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `pantaicemara`
--
ALTER TABLE `pantaicemara`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `pantaiekas`
--
ALTER TABLE `pantaiekas`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `pantaifink`
--
ALTER TABLE `pantaifink`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `pantaikuta`
--
ALTER TABLE `pantaikuta`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `pantailabuan`
--
ALTER TABLE `pantailabuan`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `pantairambang`
--
ALTER TABLE `pantairambang`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `pantaisenggigi`
--
ALTER TABLE `pantaisenggigi`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `pantaisurga`
--
ALTER TABLE `pantaisurga`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `rating`
--
ALTER TABLE `rating`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
