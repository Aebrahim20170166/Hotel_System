-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 15, 2021 at 09:45 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_hotels`
--

CREATE TABLE `admin_hotels` (
  `id` int(11) NOT NULL,
  `admin_id` int(11) NOT NULL,
  `hotel_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin_hotels`
--

INSERT INTO `admin_hotels` (`id`, `admin_id`, `hotel_id`) VALUES
(1, 1, 7),
(2, 2, 7);

-- --------------------------------------------------------

--
-- Table structure for table `hotel`
--

CREATE TABLE `hotel` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `location` varchar(255) NOT NULL,
  `rooms_available` int(11) NOT NULL,
  `numOfsingalRooms` int(11) NOT NULL,
  `numOfdoubleRooms` int(11) NOT NULL,
  `phone_number` varchar(255) NOT NULL,
  `hotel_stars` int(11) NOT NULL,
  `distance` int(11) NOT NULL,
  `meals` int(11) NOT NULL,
  `Facilities` varchar(255) NOT NULL,
  `price` float NOT NULL,
  `location_on_map` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hotel`
--

INSERT INTO `hotel` (`id`, `name`, `location`, `rooms_available`, `numOfsingalRooms`, `numOfdoubleRooms`, `phone_number`, `hotel_stars`, `distance`, `meals`, `Facilities`, `price`, `location_on_map`) VALUES
(7, 'ElAhlam', 'cairo', 5, 2, 3, '01220537383', 5, 100, 1, 'facilty10,facilty11,facilty12,facilty13,facilty14', 1200, 'https://www.google.com/maps/place/Le+Caire,+Gouvernorat+du+Caire/@30.0596185,31.1884232,12z/data=!3m1!4b1!4m5!3m4!1s0x14583fa60b21beeb:0x79dfb296e8423bba!8m2!3d30.0453216!4d31.2341309?hl=fr'),
(8, 'The lion', 'giza', 350, 0, 0, '1145454545', 5, 150, 1, 'facilty4,facilty5,facilty6', 1100, 'https://www.google.com/maps/place/Nasr+City,+Al+Manteqah+Al+Oula,+Nasr+City,+Gouvernorat+du+Caire/@30.0566282,31.3213528,15z/data=!3m1!4b1!4m13!1m7!3m6!1s0x14583fa60b21beeb:0x79dfb296e8423bba!2sLe+Caire,+Gouvernorat+du+Caire!3b1!8m2!3d30.0453216!4d31.2341309!3m4!1s0x14583e5d94c66301:0xddddf100de42206c!8m2!3d30.0566142!4d31.3300896?hl=fr'),
(9, 'hotel3', 'Alexandria', 250, 0, 0, '01025285745', 4, 200, 1, 'facility1,facility2,facility7', 1200, 'https://www.google.com/maps/place/Nasr+City,+Al+Manteqah+Al+Oula,+Nasr+City,+Gouvernorat+du+Caire/@30.0566282,31.3213528,15z/data=!3m1!4b1!4m13!1m7!3m6!1s0x14583fa60b21beeb:0x79dfb296e8423bba!2sLe+Caire,+Gouvernorat+du+Caire!3b1!8m2!3d30.0453216!4d31.2341309!3m4!1s0x14583e5d94c66301:0xddddf100de42206c!8m2!3d30.0566142!4d31.3300896?hl=fr'),
(10, 'Pyramids View Inn', 'cairo', 5, 2, 3, '01078895699', 5, 300, 1, 'Walking tours,Free High Speed Internet (WiFi),Free public parking nearby', 307, 'https://www.google.com/maps/place/Nasr+City,+Al+Manteqah+Al+Oula,+Nasr+City,+Gouvernorat+du+Caire/@30.0566282,31.3213528,15z/data=!3m1!4b1!4m13!1m7!3m6!1s0x14583fa60b21beeb:0x79dfb296e8423bba!2sLe+Caire,+Gouvernorat+du+Caire!3b1!8m2!3d30.0453216!4d31.2341309!3m4!1s0x14583e5d94c66301:0xddddf100de42206c!8m2!3d30.0566142!4d31.3300896?hl=fr');

-- --------------------------------------------------------

--
-- Table structure for table `hotel_photos`
--

CREATE TABLE `hotel_photos` (
  `id` int(11) NOT NULL,
  `photo_name` varchar(255) NOT NULL,
  `hotel_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `reservations`
--

CREATE TABLE `reservations` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `reservation_date` timestamp(3) NULL DEFAULT NULL,
  `check_in` timestamp(3) NULL DEFAULT NULL,
  `check_out` timestamp(3) NULL DEFAULT NULL,
  `hotel_id` int(11) NOT NULL,
  `room_number` int(11) NOT NULL,
  `payment` int(1) NOT NULL,
  `client_state` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reservations`
--

INSERT INTO `reservations` (`id`, `user_id`, `reservation_date`, `check_in`, `check_out`, `hotel_id`, `room_number`, `payment`, `client_state`) VALUES
(14, 1, '2021-01-10 13:28:15.000', '2021-01-14 13:28:15.000', '2021-01-19 13:28:15.000', 7, 17, 0, 'checked in'),
(16, 2, '2021-01-14 10:30:03.000', '2021-01-20 10:30:03.000', '2021-01-23 10:30:03.000', 7, 17, 0, 'not comming'),
(48, 5, '2021-01-15 17:43:47.000', '2021-01-18 19:36:00.000', '2021-01-22 19:36:00.000', 7, 17, 1, 'not comming'),
(55, 5, '2021-01-15 17:55:48.000', '2021-01-16 17:52:00.000', '2021-01-20 17:52:00.000', 7, 17, 1, 'not comming');

-- --------------------------------------------------------

--
-- Table structure for table `reviews`
--

CREATE TABLE `reviews` (
  `id` int(11) NOT NULL,
  `comment_content` text NOT NULL,
  `ratin_using_stars` int(11) NOT NULL,
  `hotel_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reviews`
--

INSERT INTO `reviews` (`id`, `comment_content`, `ratin_using_stars`, `hotel_id`) VALUES
(1, 'very nice hotel', 5, 7),
(2, 'it has very good services', 5, 7),
(3, 'very good hotel', 4, 7),
(6, 'very nice hotel', 5, 10);

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE `rooms` (
  `id` int(11) NOT NULL,
  `type` varchar(255) NOT NULL,
  `room_number` int(11) NOT NULL,
  `price` float NOT NULL,
  `hotel_id` int(11) NOT NULL,
  `Availability` int(11) NOT NULL,
  `Facilities` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rooms`
--

INSERT INTO `rooms` (`id`, `type`, `room_number`, `price`, `hotel_id`, `Availability`, `Facilities`) VALUES
(17, 'double', 25, 1200, 7, 0, 'facility1,facility2,facility3'),
(19, 'double', 2, 800, 7, 0, 'facility11,facility21,facility31\r\n'),
(20, 'double', 3, 900, 7, 0, 'facility13,facility23,facility33\r\n'),
(21, 'single', 4, 300, 7, 0, 'facility14,facility24,facility34\r\n'),
(22, 'single', 5, 350, 7, 0, 'facility15,facility25,facility35\r\n'),
(23, 'double', 1, 850, 10, 0, 'facility1,facility2,facility3\r\n'),
(24, 'double', 2, 900, 10, 0, 'facility12,facility22,facility33\r\n'),
(25, 'double', 3, 900, 10, 0, 'facility14,facility24,facility34\r\n'),
(26, 'single', 4, 250, 10, 0, 'facility5,facility2,facility4'),
(27, 'single', 5, 300, 10, 0, 'facility11,facility12,facility13\r\n');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `Fname` varchar(255) NOT NULL,
  `Lname` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` int(11) NOT NULL,
  `phone` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `Fname`, `Lname`, `username`, `email`, `password`, `role`, `phone`) VALUES
(1, 'Alaa', 'Ebrahim', 'aebrahim2525', 'aebrahim20170166@gmail.com', 'test555', 1, '01287846322'),
(2, 'ahmed', 'shaker', 'ashaker142', 'ahmedshaker@gmail.com', 'admin5656', 1, '01023241516'),
(3, 'aaa', 'bbb', 'ababab', 'a@gmail.com', 'vnvnvvn', 0, '01147454846'),
(5, 'Alaa', 'Ebrahim', 'aebrahim1452678', 'aebrahim20170166@gmail.com', 'BP2OJknO', 0, '01287846322'),
(6, 'ramadan', 'magdy', 'rmagdy1452', 'ramadanmagdy0111@gmail.com', '076iZGtk', 0, '01125895229');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_hotels`
--
ALTER TABLE `admin_hotels`
  ADD PRIMARY KEY (`id`),
  ADD KEY `admin_id` (`admin_id`),
  ADD KEY `hotel_id` (`hotel_id`);

--
-- Indexes for table `hotel`
--
ALTER TABLE `hotel`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `hotel_photos`
--
ALTER TABLE `hotel_photos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `hotelId` (`hotel_id`);

--
-- Indexes for table `reservations`
--
ALTER TABLE `reservations`
  ADD PRIMARY KEY (`id`),
  ADD KEY `room_number` (`room_number`),
  ADD KEY `hotel_id` (`hotel_id`);

--
-- Indexes for table `reviews`
--
ALTER TABLE `reviews`
  ADD PRIMARY KEY (`id`),
  ADD KEY `hotel_id` (`hotel_id`);

--
-- Indexes for table `rooms`
--
ALTER TABLE `rooms`
  ADD PRIMARY KEY (`id`),
  ADD KEY `hotel_id` (`hotel_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin_hotels`
--
ALTER TABLE `admin_hotels`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `hotel`
--
ALTER TABLE `hotel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `hotel_photos`
--
ALTER TABLE `hotel_photos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `reservations`
--
ALTER TABLE `reservations`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;

--
-- AUTO_INCREMENT for table `reviews`
--
ALTER TABLE `reviews`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `rooms`
--
ALTER TABLE `rooms`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `admin_hotels`
--
ALTER TABLE `admin_hotels`
  ADD CONSTRAINT `admin_hotels_ibfk_1` FOREIGN KEY (`admin_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `admin_hotels_ibfk_2` FOREIGN KEY (`hotel_id`) REFERENCES `hotel` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `hotel_photos`
--
ALTER TABLE `hotel_photos`
  ADD CONSTRAINT `hotelId` FOREIGN KEY (`hotel_id`) REFERENCES `hotel` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `reservations`
--
ALTER TABLE `reservations`
  ADD CONSTRAINT `reservations_ibfk_1` FOREIGN KEY (`room_number`) REFERENCES `rooms` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reservations_ibfk_2` FOREIGN KEY (`hotel_id`) REFERENCES `hotel` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `reviews`
--
ALTER TABLE `reviews`
  ADD CONSTRAINT `hotel_id` FOREIGN KEY (`hotel_id`) REFERENCES `hotel` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `rooms`
--
ALTER TABLE `rooms`
  ADD CONSTRAINT `rooms_ibfk_1` FOREIGN KEY (`hotel_id`) REFERENCES `hotel` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
