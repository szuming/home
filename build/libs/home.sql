-- MySQL dump 10.13  Distrib 5.7.18, for Win64 (x86_64)
--
-- Host: localhost    Database: home
-- ------------------------------------------------------
-- Server version	5.7.18-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `htown`
--

DROP TABLE IF EXISTS `htown`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `htown` (
  `hid` int(11) NOT NULL AUTO_INCREMENT,
  `hname` varchar(40) NOT NULL,
  `hintro` varchar(100) DEFAULT '添加具体介绍',
  `hnum` int(11) DEFAULT '0',
  PRIMARY KEY (`hid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `htown`
--

LOCK TABLES `htown` WRITE;
/*!40000 ALTER TABLE `htown` DISABLE KEYS */;
INSERT INTO `htown` VALUES (1,'深圳','欢迎加入',1),(2,'清远','清远好地方',NULL),(3,'韶关','韶关之乡',NULL),(4,'广州','美食之乡',NULL),(5,'西丽','新地方',1),(6,'东莞','东莞老乡',1),(7,'1','1',1),(8,'2','2',1),(9,'1-4-2','123456',1),(10,'4-2-1','123456 123124426535654756 1231231 78987978 12321321312',1),(11,'4-3-1','4-3-1',1),(12,'4-3-2','4-3-2',1),(13,'5-4','5-4',1);
/*!40000 ALTER TABLE `htown` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jointown`
--

DROP TABLE IF EXISTS `jointown`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jointown` (
  `jid` int(11) NOT NULL AUTO_INCREMENT,
  `hname` varchar(40) NOT NULL,
  `username` varchar(40) NOT NULL,
  `jhid` int(11) NOT NULL,
  `juid` int(11) NOT NULL,
  PRIMARY KEY (`jid`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jointown`
--

LOCK TABLES `jointown` WRITE;
/*!40000 ALTER TABLE `jointown` DISABLE KEYS */;
INSERT INTO `jointown` VALUES (1,'深圳','ming',1,1),(2,'深圳','4-3-3',1,6),(3,'深圳','4-3-4',1,7),(4,'深圳','4-3-4',1,7),(5,'深圳','4-3-5',1,8),(6,'深圳','4-3-5',1,8),(7,'深圳','4-3-10',1,10),(8,'深圳','4-3-10',1,10),(9,'深圳','4-3-11',1,11),(10,'深圳','4-3-11',1,11),(11,'深圳','4-3-12',1,12),(12,'深圳','4-3-13',1,13),(13,'深圳','4-3-15',1,14),(14,'深圳','4-3-16',1,15),(15,'深圳','2',1,3),(16,'清远','2',2,3),(18,'清远','4-15-1',2,16);
/*!40000 ALTER TABLE `jointown` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `manager`
--

DROP TABLE IF EXISTS `manager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `manager` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `hid` int(11) NOT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manager`
--

LOCK TABLES `manager` WRITE;
/*!40000 ALTER TABLE `manager` DISABLE KEYS */;
/*!40000 ALTER TABLE `manager` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  `userphone` varchar(100) NOT NULL,
  `uhid` int(11) DEFAULT NULL,
  `type` int(11) DEFAULT '0',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'ming','qq147741','13760254539',NULL,1),(2,'1','123456','13760254539',8,1),(3,'2','123456','13760254539',NULL,1),(4,'4-2-1','123456','123456798',10,2),(5,'4-3-1','123456','123456789',12,2),(6,'4-3-3','123456','123456789',NULL,NULL),(7,'4-3-4','123456','123456789',NULL,NULL),(8,'4-3-5','123456','123456789',NULL,NULL),(9,'4-3-6','123456','123456789',NULL,NULL),(10,'4-3-10','123456','123456',NULL,NULL),(11,'4-3-11','123456','123456',NULL,NULL),(12,'4-3-12','123456','123456',NULL,NULL),(13,'4-3-13','123456','123456',NULL,NULL),(14,'4-3-15','123456','123456',NULL,NULL),(15,'4-3-16','123456','123465',NULL,NULL),(16,'4-15-1','123456','123456',10,1),(17,'5-4-1','123456','132760254539',13,2);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-06 15:29:26
