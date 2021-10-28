/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

CREATE TABLE `cities` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

CREATE TABLE `passenger_ride` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `passengers_id` int(11) DEFAULT NULL,
  `rides_id` int(11) DEFAULT NULL,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `passengers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

CREATE TABLE `rides` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `departure_time` datetime DEFAULT NULL,
  `departure_city_id` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `destination_city_id` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `train_id` int(11) DEFAULT NULL,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

CREATE TABLE `trains` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) CHARACTER SET utf8 NOT NULL,
  `max_speed` int(11) NOT NULL,
  `max_passengers` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

INSERT INTO `cities` (`id`, `name`) VALUES
(1, 'Halle');
INSERT INTO `cities` (`id`, `name`) VALUES
(2, 'Brussel');




INSERT INTO `passengers` (`id`, `name`) VALUES
(1, 'Axel');
INSERT INTO `passengers` (`id`, `name`) VALUES
(2, 'Jeroen');


INSERT INTO `rides` (`id`, `departure_time`, `departure_city_id`, `destination_city_id`, `train_id`) VALUES
(1, '2021-10-28 14:43:42', '1', '2', 1);
INSERT INTO `rides` (`id`, `departure_time`, `departure_city_id`, `destination_city_id`, `train_id`) VALUES
(2, '2021-10-28 15:31:09', '2', '1', 1);


INSERT INTO `trains` (`id`, `type`, `max_speed`, `max_passengers`) VALUES
(1, 'old', 50, 200);
INSERT INTO `trains` (`id`, `type`, `max_speed`, `max_passengers`) VALUES
(2, 'regular', 90, 250);
INSERT INTO `trains` (`id`, `type`, `max_speed`, `max_passengers`) VALUES
(3, 'double', 80, 400);


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;