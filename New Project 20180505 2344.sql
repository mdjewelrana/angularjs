-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.41-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema angularjs
--

CREATE DATABASE IF NOT EXISTS angularjs;
USE angularjs;

--
-- Definition of table `acde`
--

DROP TABLE IF EXISTS `acde`;
CREATE TABLE `acde` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `institute` varchar(45) NOT NULL,
  `grp` varchar(45) NOT NULL,
  `major` varchar(45) NOT NULL,
  `result` varchar(45) NOT NULL,
  `respub` varchar(45) NOT NULL,
  `duration` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `acde`
--

/*!40000 ALTER TABLE `acde` DISABLE KEYS */;
INSERT INTO `acde` (`id`,`institute`,`grp`,`major`,`result`,`respub`,`duration`) VALUES 
 (7,'Honours','Govt Rajendro College','Mathematics','3.00','2016','4'),
 (8,'M.Sc','Govt Titumir college','Mathematics','3.00','2018','1'),
 (9,'H.S.C','Aminur Rahman College','Science','4.00','2010','2008-2009'),
 (10,'S.S.C','Digha Intaz Molla High School','Science','4.19','2008','2006-2007');
/*!40000 ALTER TABLE `acde` ENABLE KEYS */;


--
-- Definition of table `bankac`
--

DROP TABLE IF EXISTS `bankac`;
CREATE TABLE `bankac` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `bank` varchar(45) NOT NULL,
  `accnum` varchar(45) NOT NULL,
  `branch` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bankac`
--

/*!40000 ALTER TABLE `bankac` DISABLE KEYS */;
INSERT INTO `bankac` (`id`,`bank`,`accnum`,`branch`) VALUES 
 (1,'Islami bank','155584','kakrail'),
 (3,'Prime bank','234564','gulshan');
/*!40000 ALTER TABLE `bankac` ENABLE KEYS */;


--
-- Definition of table `cv`
--

DROP TABLE IF EXISTS `cv`;
CREATE TABLE `cv` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `a` varchar(45) NOT NULL,
  `b` varchar(45) NOT NULL,
  `c` varchar(45) NOT NULL,
  `d` varchar(45) NOT NULL,
  `e` varchar(45) NOT NULL,
  `f` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cv`
--

/*!40000 ALTER TABLE `cv` DISABLE KEYS */;
/*!40000 ALTER TABLE `cv` ENABLE KEYS */;


--
-- Definition of table `editpd`
--

DROP TABLE IF EXISTS `editpd`;
CREATE TABLE `editpd` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `fname` varchar(45) NOT NULL,
  `mname` varchar(45) NOT NULL,
  `dob` varchar(45) NOT NULL,
  `nid` varchar(45) NOT NULL,
  `nationality` varchar(45) NOT NULL,
  `gen` varchar(45) NOT NULL,
  `religion` varchar(45) NOT NULL,
  `phone` varchar(11) default NULL,
  `add` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `editpd`
--

/*!40000 ALTER TABLE `editpd` DISABLE KEYS */;
INSERT INTO `editpd` (`id`,`name`,`email`,`fname`,`mname`,`dob`,`nid`,`nationality`,`gen`,`religion`,`phone`,`add`) VALUES 
 (1,'jhgjhg','hjhg','ghjghjg','hjghj','jhjhg','hjhgjhg','hjjjjj','jjjjjjjjjjjjjjjj','hjhjh','01937745755','jhjhgjh');
/*!40000 ALTER TABLE `editpd` ENABLE KEYS */;


--
-- Definition of table `monthr`
--

DROP TABLE IF EXISTS `monthr`;
CREATE TABLE `monthr` (
  `sl` int(10) unsigned NOT NULL auto_increment,
  `edate` varchar(45) NOT NULL,
  `des` varchar(45) NOT NULL,
  `eve` varchar(45) NOT NULL,
  `statust` varchar(45) NOT NULL,
  PRIMARY KEY  (`sl`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `monthr`
--

/*!40000 ALTER TABLE `monthr` DISABLE KEYS */;
INSERT INTO `monthr` (`sl`,`edate`,`des`,`eve`,`statust`) VALUES 
 (2,'03/01/2018','86','46','passed'),
 (8,'05/02/2018','67','47','failed'),
 (9,'02/03/2018','82','46','passed'),
 (10,'05/02/2018','80','45','passed');
/*!40000 ALTER TABLE `monthr` ENABLE KEYS */;


--
-- Definition of table `perde`
--

DROP TABLE IF EXISTS `perde`;
CREATE TABLE `perde` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `t_id` int(10) unsigned NOT NULL,
  `name` varchar(45) NOT NULL,
  `b_id` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `con` varchar(11) NOT NULL,
  `fname` varchar(45) NOT NULL,
  `add` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `perde`
--

/*!40000 ALTER TABLE `perde` DISABLE KEYS */;
INSERT INTO `perde` (`id`,`t_id`,`name`,`b_id`,`gender`,`email`,`con`,`fname`,`add`) VALUES 
 (3,1238971,'jewel','esad/j2ee-m-34','male','jewel@gmail.com','01937745755','abdul kaium molla','magura'),
 (4,1238970,'rana','database','male','rana@gmail.com','01745068074','ab kaium molla','jesssore');
/*!40000 ALTER TABLE `perde` ENABLE KEYS */;


--
-- Definition of table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  `price` varchar(45) NOT NULL,
  `qty` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`id`,`name`,`price`,`qty`) VALUES 
 (8,'Abid','TCLD','tcld@gmail.com'),
 (9,'Jewel Rana','Trident Shipping Line','jewel@gmail.com'),
 (10,'Mr. Rana','Dot Com System','rana@gmail.com');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;


--
-- Definition of table `refer`
--

DROP TABLE IF EXISTS `refer`;
CREATE TABLE `refer` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  `org` varchar(45) NOT NULL,
  `designa` varchar(45) NOT NULL,
  `mobile` varchar(11) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `refer`
--

/*!40000 ALTER TABLE `refer` DISABLE KEYS */;
INSERT INTO `refer` (`id`,`name`,`org`,`designa`,`mobile`,`email`) VALUES 
 (1,'Abdul Bari','The computer Limited','yyytrrryr','0174506807','bari@gmail.com'),
 (6,'Md Mosahidul Islam','show & tell idb-bisew.org','Consultant','01745068074','moshahidul@gmail.com');
/*!40000 ALTER TABLE `refer` ENABLE KEYS */;


--
-- Definition of table `reg`
--

DROP TABLE IF EXISTS `reg`;
CREATE TABLE `reg` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `tid` varchar(45) NOT NULL,
  `dob` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reg`
--

/*!40000 ALTER TABLE `reg` DISABLE KEYS */;
INSERT INTO `reg` (`id`,`tid`,`dob`) VALUES 
 (4,'1238974','04/12/1994'),
 (5,'1239875','01/02/2018'),
 (6,'546546','01/10/2010'),
 (7,'5011245','02/11/1995'),
 (8,'12545687','05/10/1995');
/*!40000 ALTER TABLE `reg` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
