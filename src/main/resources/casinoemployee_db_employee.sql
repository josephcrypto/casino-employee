-- MySQL dump 10.13  Distrib 8.0.25, for Linux (x86_64)
--
-- Host: localhost    Database: casinoemployee_db
-- ------------------------------------------------------
-- Server version	8.0.28-0ubuntu0.21.10.3

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `cardno` varchar(45) DEFAULT NULL,
  `department` varchar(45) DEFAULT NULL,
  `position` varchar(45) NOT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `salary` varchar(45) DEFAULT NULL,
  `enabled` tinyint unsigned NOT NULL DEFAULT '1' COMMENT '启用 1 禁用 0',
  `facebook` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `gender` tinyint NOT NULL COMMENT '''1'' male ''0'' female',
  `join_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_d93p036ob556ldfni6by2cnnp` (`cardno`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Joseph','456','Software&Development ','developer','467894654601','12345678.00',0,'https://www.facebook.com/josephcrypto','Tachileik',1,'2022-02-04'),(2,'test','1324','testtt','test','1231564646','13215465',0,'test','test0',1,'2022-02-03'),(3,'smith','12345','Programming','developer','123456789','125478.00',0,'https://www.facebook.com/josephcrypto','Tachileik0',1,'2022-02-01'),(4,'smith','45687','Technology','developer','942831611070','1456.00',0,'https://www.facebook.com/josephcrypto','Tachileik',1,'2022-02-02'),(5,'test again','789','testerewar','test wewqe','132456498','13132.00',0,'rtetetewt','ertea',1,'2022-02-02'),(6,'jsohce','564646','Technology','ewrewareawr','132146549798','4564.00',0,'afawerew','Tachileik',1,'2022-02-04'),(7,'minutes','256','Technology','developer','4678946546','85965.00',0,'https://www.facebook.com/josephcrypto','Above The Earth',1,'2022-02-03'),(8,'Seven Fold','45','Software&Development Depa','developer','56894578121','85963.00',1,'https://www.facebook.com/sevenfold','US',1,'2022-02-03'),(9,'Jame Bound','007','CentraIntelligentAmerica','Agent','110011100010','1000000.00',1,'-','US',1,'1999-01-14');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-14 11:43:54
