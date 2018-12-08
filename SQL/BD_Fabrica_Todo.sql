CREATE DATABASE  IF NOT EXISTS `bd_fabricam` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `bd_fabricam`;
-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: bd_fabricam
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cliente` (
  `idClie` int(11) NOT NULL,
  `nombreEmpresaClie` varchar(45) NOT NULL,
  `nombreFantasiaClie` varchar(45) NOT NULL,
  `paisClie` varchar(45) NOT NULL,
  `direccionClie` varchar(45) NOT NULL,
  `contactoClie` varchar(100) NOT NULL,
  `isDeleted` tinyint(1) NOT NULL,
  PRIMARY KEY (`idClie`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (323321,'22','3321','321321','321','321',1),(34581645,'Argelio','Argelio SRL','Uruguay','Berna 754','1247157567',0),(37315946,'Manticho ','Manticho SRL','Uruguay','Baltazar Braum 687','4785125',0),(71245862,'Pepes','Pepes Ltd','Argentina','Simon Bolivar 78','74581234',0),(789421254,'Kukul','Kukul Ltd','Uruguay','Venezuela 987','45128647',0);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `componente`
--

DROP TABLE IF EXISTS `componente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `componente` (
  `idComp` int(11) NOT NULL AUTO_INCREMENT,
  `descripcionComp` varchar(50) NOT NULL,
  `costoComp` int(11) NOT NULL,
  `cantStockComp` int(11) NOT NULL,
  `cantMinStockComp` int(11) NOT NULL,
  `isDeleted` tinyint(1) NOT NULL,
  PRIMARY KEY (`idComp`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `componente`
--

LOCK TABLES `componente` WRITE;
/*!40000 ALTER TABLE `componente` DISABLE KEYS */;
INSERT INTO `componente` VALUES (1,'helice',500,42,30,0),(2,'tuerca',20,8,10,0),(3,'Componente basico',300,15,12,0),(4,'turbina ',1000,3,2,0);
/*!40000 ALTER TABLE `componente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `factura` (
  `idFactura` int(11) NOT NULL AUTO_INCREMENT,
  `fechaPagoFactura` date NOT NULL,
  `idPedidoFactura` int(11) NOT NULL,
  `isDeleted` tinyint(1) NOT NULL,
  PRIMARY KEY (`idFactura`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
INSERT INTO `factura` VALUES (1,'2018-12-20',2,0),(2,'2018-12-12',2,0),(3,'2018-12-14',3,0);
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `motorcomponente`
--

DROP TABLE IF EXISTS `motorcomponente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `motorcomponente` (
  `idMotorMotorComponente` int(11) NOT NULL,
  `idComponenteMotorComponente` int(11) NOT NULL,
  `cantidadMotorComponente` int(11) NOT NULL,
  PRIMARY KEY (`idMotorMotorComponente`,`idComponenteMotorComponente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `motorcomponente`
--

LOCK TABLES `motorcomponente` WRITE;
/*!40000 ALTER TABLE `motorcomponente` DISABLE KEYS */;
INSERT INTO `motorcomponente` VALUES (1000,2,3),(1001,1,1),(1001,2,3),(1001,3,4),(1002,1,1),(1002,2,6),(1003,1,2),(1003,2,3),(1003,3,1),(1003,4,3);
/*!40000 ALTER TABLE `motorcomponente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `motores`
--

DROP TABLE IF EXISTS `motores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `motores` (
  `idMotor` int(11) NOT NULL AUTO_INCREMENT,
  `nombreMotor` varchar(50) NOT NULL,
  `isDeleted` tinyint(1) NOT NULL,
  PRIMARY KEY (`idMotor`)
) ENGINE=InnoDB AUTO_INCREMENT=100000 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `motores`
--

LOCK TABLES `motores` WRITE;
/*!40000 ALTER TABLE `motores` DISABLE KEYS */;
INSERT INTO `motores` VALUES (1000,'Brex G657',0),(1001,'VGT 657-9',0),(1002,'GTX 1050 ti',0),(1003,'NJK L521',0);
/*!40000 ALTER TABLE `motores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `pedido` (
  `idPedido` int(11) NOT NULL AUTO_INCREMENT,
  `idClientePedido` int(11) NOT NULL,
  `fechaDeEntregaPedido` date NOT NULL,
  `isDeleted` tinyint(1) NOT NULL,
  `idMotorPedido` int(11) NOT NULL,
  PRIMARY KEY (`idPedido`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
INSERT INTO `pedido` VALUES (1,323321,'2018-11-08',0,1003),(2,71245862,'2018-12-10',0,1002),(3,789421254,'2018-12-10',0,1003);
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `proveedor` (
  `idProveedor` int(11) NOT NULL AUTO_INCREMENT,
  `nombreProveedor` varchar(50) NOT NULL,
  `descProveedor` varchar(60) NOT NULL,
  `IsDeleted` tinyint(1) NOT NULL,
  PRIMARY KEY (`idProveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` VALUES (1,'Jose Luis','proveedor con 10 años de experiencia ',0),(2,'Alberto ','Tel 98752156',0),(3,'Julio Garcia',' Cel: 574185',0);
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedorcomponente`
--

DROP TABLE IF EXISTS `proveedorcomponente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `proveedorcomponente` (
  `idProveedorProveedorComponente` int(11) NOT NULL,
  `idComponenteProveedorComponente` int(11) NOT NULL,
  `isDeleted` tinyint(1) NOT NULL,
  PRIMARY KEY (`idProveedorProveedorComponente`,`idComponenteProveedorComponente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedorcomponente`
--

LOCK TABLES `proveedorcomponente` WRITE;
/*!40000 ALTER TABLE `proveedorcomponente` DISABLE KEYS */;
INSERT INTO `proveedorcomponente` VALUES (1,1,0),(1,2,0),(1,3,0),(1,4,0),(2,1,0),(2,2,0),(2,3,0),(2,4,0),(3,1,0),(3,2,0),(3,4,0);
/*!40000 ALTER TABLE `proveedorcomponente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-07 20:13:58
