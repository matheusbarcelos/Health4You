-- MySQL dump 10.13  Distrib 5.6.24, for Win32 (x86)
--
-- Host: localhost    Database: health4you
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.25-MariaDB

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
-- Table structure for table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paciente` (
  `CODIGO` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(100) NOT NULL,
  `CPF` varchar(20) NOT NULL,
  `DATANASCIMENTO` varchar(45) NOT NULL,
  `RUA` varchar(80) NOT NULL,
  `NUMERO` varchar(100) NOT NULL,
  `BAIRRO` varchar(100) NOT NULL,
  `ESTADO` varchar(2) NOT NULL,
  `CIDADE` varchar(45) NOT NULL,
  `TELEFONE` varchar(45) NOT NULL,
  `CELULAR` varchar(45) NOT NULL,
  `EMAIL` varchar(45) NOT NULL,
  PRIMARY KEY (`CODIGO`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` VALUES (1,'Matheus Barcelos','12024991637','210994','210994','229','Trevo','SP','Bom Despacho','3735234628','37998416803','ma-the-us39@hotmail.com'),(2,'Teste','','','','','','SP','Bom Despacho','','',''),(3,'Carlos','','','','','','SP','Bom Despacho','','',''),(4,'Cristovão','','','','','','SP','Bom Despacho','','',''),(5,'Gigabyte','','','','','','SP','Bom Despacho','','asfa','asf'),(6,'Carlos Henrique Gomes','456879753','50/20/2018','Rua Teste','','','SP','Bom Despacho','','',''),(7,'Teste','545646','12412','Teste','121','124124','','','asfa','asffas','asfasf'),(8,'Teste','Teste','210994','Teste','Teste','124124','MG','Pompéu','','',''),(9,'Matheus Barcelos','120.249.916-37','21/09/1994','Rua Teste','Teste','Tre','MG','Carlos','(37) 3523-1234','(37) 99841-6803','teste@gmail.com'),(10,'Carlos Andre','120.055.451-13','21/09/9944','Teste','Teste','Teste','Te','Teste','(37) 9411-1132','(51) 21313-5131','Teste'),(11,'IAshiuAHSI','131.937.398-13','13/78/9137','ASHGDHASJGDJHAS','IASDH','ISHDIAS','IS','ASHJDOAS','(  )     -','(  )      -','ASJIDHOSAIHDSOAIHDASHDO');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-10 20:53:31
