-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 07, 2019 at 01:49 PM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sol_store`
--

-- --------------------------------------------------------

--
-- Table structure for table `admins`
--

CREATE TABLE `admins` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admins`
--

INSERT INTO `admins` (`id`, `name`, `email`, `username`, `password`) VALUES
(1, 'Er. Harsh Rathore', 'harshrathore976@gmail.com', 'er.harsh_rathore', 'Harsh@admin');

-- --------------------------------------------------------

--
-- Table structure for table `softwares`
--

CREATE TABLE `softwares` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `version` varchar(10) DEFAULT NULL,
  `tag` varchar(30) NOT NULL,
  `link` varchar(255) NOT NULL,
  `descript` varchar(1024) DEFAULT NULL,
  `last_update` date DEFAULT NULL,
  `logo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `softwares`
--

INSERT INTO `softwares` (`id`, `name`, `version`, `tag`, `link`, `descript`, `last_update`, `logo`) VALUES
(2, 'Sublime Text', '3', 'code editors', 'https://www.sublimetext.com/3', 'Sublime Text is a sophisticated text editor for code,\r\nmarkup and prose. You\'ll love the slick user interface,\r\nextraordinary features and amazing performance.\r\n\r\nSublime Text is available for Mac, Windows and Linux.\r\nOne license is all you need to use Sublime Text on\r\nevery computer you own, no matter what operating\r\nsystem it uses. Sublime Text uses a custom User\r\nInterface toolkit, optimized for speed and beauty,\r\nwhile taking advantage of native functionality on each\r\nplatform.', '2019-07-07', 'images/256x256/sublimeEditor.png'),
(3, 'Notepad++', 'v7.7.1', 'code editors', 'https://notepad-plus-plus.org/download/v7.7.1.html', 'Notepad++ is a free (as in \"free speech\" and also as in \"free beer\") source code editor and Notepad replacement that supports several languages. Running in the MS Windows environment, its use is governed by GPL License.\r\n\r\nBased on the powerful editing component Scintilla, Notepad++ is written in C++ and uses pure Win32 API and STL which ensures a higher execution speed and smaller program size. By optimizing as many routines as possible without losing user friendliness, Notepad++ is trying to reduce the world carbon dioxide emissions. When using less CPU power, the PC can throttle down and reduce power consumption, resulting in a greener environment.\r\n\r\nYou\'re encouraged to translate Notepad++ into your native language if there\'s not already a translation present in the Binary Translations page.', '2019-07-07', 'images/256x256/notepadppEditor.png');

-- --------------------------------------------------------

--
-- Table structure for table `tags`
--

CREATE TABLE `tags` (
  `name` varchar(30) NOT NULL,
  `icon` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tags`
--

INSERT INTO `tags` (`name`, `icon`) VALUES
('compression and backup', 'logos/backuprestore.png'),
('browsers', 'logos/browsers.png'),
('business and productivity', 'logos/businessproductivity.png'),
('code editors', 'logos/codeeditors.png'),
('development and IT', 'logos/developmentandit.png'),
('education and references', 'logos/educations.png'),
('file sharing', 'logos/filesharing.png'),
('file transfer', 'logos/filetransfer.png'),
('image editors', 'logos/imageeditors.png'),
('media players', 'logos/mediaplayers.png'),
('networking softwares and tools', 'logos/networkingtools.png'),
('office softwares', 'logos/offices.png'),
('VPN security and privacy', 'logos/system-vpnprivacy.png'),
('essential utilities and tools', 'logos/utilityandtools.png'),
('video editors', 'logos/videoeditors.png');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `country` varchar(30) DEFAULT NULL,
  `profile` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `email`, `username`, `password`, `country`, `profile`) VALUES
(1, 'Er. Harsh Rathore', 'harshrathore976@gmail.com', 'er.harsh_rathore', 'Harsh@user', 'India', NULL),
(2, 'Praneet Kumar Verma', 'praneetkumar@gmail.com', 'praneet_kumar', 'Praneet@123', 'America', NULL),
(3, 'Shruti Bhatiya', 'shrubhatiya@yahoo.com', 'bhatiya_shruti99', 'Ujjain#786', 'China', NULL),
(4, 'Rohit Parmar', 'parmarrohit112@gmail.com', 'er.rohit_parmar', 'Rohit!111', 'Russia', NULL),
(5, 'Aashish Joshi', 'aashishjoshi998@yahoo.com', 'aashish_joshi998', 'Joshi$998', 'India', NULL),
(8, 'Shubham Shinde', 'shubhamshinde775@gmail.com', 'er.shubham_shinde', 'Shinde@999', 'USA', NULL),
(9, 'Uttam Kushwah', 'kushwahuttam77@gmail.com', 'er.uttam_kushwah', 'Kushwah@77', 'England', NULL),
(10, 'Yashsvi  Parmar', 'yvparmar999@yahoo.com', 'yv_parmar999', 'Ujjain@123', 'India', NULL),
(13, 'Pankaj Khatri', 'khatripankaj456@gmail.com', 'er.pankaj_khatri456', 'Pankaj@456', 'UAE', NULL),
(14, 'Nidhi Kumawat', 'nidhikumawat123@gmail.com', 'nidhi_kumawat111', 'KumawatNidhi', 'New Zealand', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admins`
--
ALTER TABLE `admins`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `softwares`
--
ALTER TABLE `softwares`
  ADD PRIMARY KEY (`id`),
  ADD KEY `relation` (`tag`);

--
-- Indexes for table `tags`
--
ALTER TABLE `tags`
  ADD PRIMARY KEY (`name`),
  ADD UNIQUE KEY `icon` (`icon`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admins`
--
ALTER TABLE `admins`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `softwares`
--
ALTER TABLE `softwares`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `softwares`
--
ALTER TABLE `softwares`
  ADD CONSTRAINT `relation` FOREIGN KEY (`tag`) REFERENCES `tags` (`name`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
