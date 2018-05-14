/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.5.40 : Database - newsmanagement
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`newsmanagement` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `newsmanagement`;

/*Table structure for table `news_comment` */

DROP TABLE IF EXISTS `news_comment`;

CREATE TABLE `news_comment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `newsid` bigint(20) NOT NULL,
  `content` varchar(50) DEFAULT NULL,
  `author` varchar(50) NOT NULL,
  `createDate` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_C_D` (`newsid`),
  CONSTRAINT `FK_C_D` FOREIGN KEY (`newsid`) REFERENCES `news_detail` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `news_comment` */

insert  into `news_comment`(`id`,`newsid`,`content`,`author`,`createDate`) values (1,1,'真好，以后去光谷就方便了','小豆子','2018-05-10'),(2,2,'穿越3镇的感觉','小晴子','2018-05-10'),(3,4,'大武汉发展起来啦','豆豆','2018-05-10');

/*Table structure for table `news_detail` */

DROP TABLE IF EXISTS `news_detail`;

CREATE TABLE `news_detail` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `summary` varchar(50) DEFAULT NULL,
  `author` varchar(50) DEFAULT NULL,
  `createDate` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `news_detail` */

insert  into `news_detail`(`id`,`title`,`summary`,`author`,`createDate`) values (1,'武汉地铁2号线','武汉地铁2号线从光谷广场到天河机场线路','新闻1','2018-05-10'),(2,'武汉地铁3号线','武汉地铁3号线开通啦','新闻1','2018-05-10'),(3,'武汉地铁4号线','武汉地铁4号线开通啦','新闻1','2018-05-10'),(4,'武汉地铁5号线','武汉地铁5号线开通啦','新闻1','2018-05-10'),(5,'武汉地铁8号线','武汉地铁8号线开通啦','新闻1','2018-05-10');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
