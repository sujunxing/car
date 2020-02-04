/*
SQLyog Ultimate v12.4.1 (64 bit)
MySQL - 5.7.18-log : Database - car
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`car` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `car`;

/*Table structure for table `adjunct` */

DROP TABLE IF EXISTS `adjunct`;

CREATE TABLE `adjunct` (
  `adtid` varchar(20) NOT NULL,
  `adtname` varchar(20) DEFAULT NULL,
  `adtcla` varchar(20) DEFAULT NULL,
  `adtprice` int(11) DEFAULT NULL,
  `adtremake` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`adtid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `adjunct` */

/*Table structure for table `artisan` */

DROP TABLE IF EXISTS `artisan`;

CREATE TABLE `artisan` (
  `arnid` varchar(20) NOT NULL,
  `arnname` varchar(20) DEFAULT NULL,
  `arnsex` varchar(20) DEFAULT NULL,
  `arnfalg` int(11) DEFAULT NULL,
  `temid` varchar(20) DEFAULT NULL,
  `arnphone` varchar(20) DEFAULT NULL,
  `arnusername` varchar(20) DEFAULT NULL,
  `arnaddress` varchar(20) DEFAULT NULL,
  `arndate` varchar(20) DEFAULT NULL,
  `arnwechat` varchar(20) DEFAULT NULL,
  `arncard` varchar(20) DEFAULT NULL,
  `arncardaddress` varchar(50) DEFAULT NULL,
  `arnbank` varchar(20) DEFAULT NULL,
  `arnbanknumber` varchar(20) DEFAULT NULL,
  `arngrade` varchar(20) DEFAULT NULL,
  `arntype` varchar(20) DEFAULT NULL,
  `arnbrand` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`arnid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `artisan` */

/*Table structure for table `artisangrade` */

DROP TABLE IF EXISTS `artisangrade`;

CREATE TABLE `artisangrade` (
  `areid` int(11) NOT NULL AUTO_INCREMENT,
  `arename` varchar(20) DEFAULT NULL,
  `areweight` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`areid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `artisangrade` */

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `cayid` varchar(20) NOT NULL,
  `cayname` varchar(20) DEFAULT NULL,
  `ineid` int(11) DEFAULT NULL,
  PRIMARY KEY (`cayid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `category` */

/*Table structure for table `city` */

DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `cityid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `cityname` varchar(20) DEFAULT NULL COMMENT '市名',
  `provinceid` int(11) DEFAULT NULL COMMENT '省表',
  PRIMARY KEY (`cityid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='市表';

/*Data for the table `city` */

/*Table structure for table `client` */

DROP TABLE IF EXISTS `client`;

CREATE TABLE `client` (
  `cltid` varchar(20) NOT NULL,
  `cltname` varchar(20) DEFAULT NULL,
  `cltlinkman` varchar(20) DEFAULT NULL,
  `cltphone` varchar(20) DEFAULT NULL,
  `cltaddress` varchar(50) DEFAULT NULL,
  `cltbirthday` varchar(20) DEFAULT NULL,
  `cltpayment` varchar(20) DEFAULT NULL,
  `cltlimit` int(11) DEFAULT NULL,
  `cltcounselor` varchar(20) DEFAULT NULL,
  `cltcouphone` varchar(20) DEFAULT NULL,
  `provinceid` int(4) DEFAULT NULL,
  `cityid` int(4) DEFAULT NULL,
  `districtid` int(4) DEFAULT NULL,
  `cltremake` varchar(50) DEFAULT NULL,
  `cltdiscern` varchar(20) DEFAULT NULL,
  `cltregister` varchar(20) DEFAULT NULL,
  `cltaccount` varchar(20) DEFAULT NULL,
  `cltregistered` varchar(20) DEFAULT NULL,
  `cltconaddress` varchar(50) DEFAULT NULL,
  `cltelse` varchar(20) DEFAULT NULL,
  `cltelses` varchar(20) DEFAULT NULL,
  `cltelsess` varchar(20) DEFAULT NULL,
  `cltelsesss` varchar(20) DEFAULT NULL,
  `me2berid` int(4) DEFAULT NULL,
  `keyid` varchar(20) DEFAULT NULL,
  `bei1` varchar(20) DEFAULT NULL,
  `bei2` varchar(30) DEFAULT NULL,
  `bei3` varchar(40) DEFAULT NULL,
  `bei4` varchar(50) DEFAULT NULL,
  `bei5` int(4) DEFAULT NULL,
  PRIMARY KEY (`cltid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `client` */

/*Table structure for table `communication` */

DROP TABLE IF EXISTS `communication`;

CREATE TABLE `communication` (
  `conid` int(11) NOT NULL,
  `sid` int(11) DEFAULT NULL,
  PRIMARY KEY (`conid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `communication` */

/*Table structure for table `dataqx` */

DROP TABLE IF EXISTS `dataqx`;

CREATE TABLE `dataqx` (
  `daxid` int(11) NOT NULL AUTO_INCREMENT,
  `daxname` varchar(20) DEFAULT NULL,
  `daxtype` int(11) DEFAULT NULL,
  PRIMARY KEY (`daxid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `dataqx` */

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `detid` int(11) NOT NULL,
  `detname` varchar(20) DEFAULT NULL,
  `detclassify` varchar(20) DEFAULT NULL,
  `shpid` int(11) DEFAULT NULL,
  PRIMARY KEY (`detid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `department` */

/*Table structure for table `dimission` */

DROP TABLE IF EXISTS `dimission`;

CREATE TABLE `dimission` (
  `dinid` int(11) NOT NULL,
  `sid` int(11) DEFAULT NULL,
  `dindate` varchar(50) DEFAULT NULL,
  `dincause` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`dinid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `dimission` */

/*Table structure for table `district` */

DROP TABLE IF EXISTS `district`;

CREATE TABLE `district` (
  `districtid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `districtname` varchar(20) DEFAULT NULL COMMENT '区名',
  `cityid` int(11) DEFAULT NULL COMMENT '市表',
  PRIMARY KEY (`districtid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='区表';

/*Data for the table `district` */

/*Table structure for table `enginebrand` */

DROP TABLE IF EXISTS `enginebrand`;

CREATE TABLE `enginebrand` (
  `endid` varchar(20) NOT NULL,
  `endname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`endid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `enginebrand` */

/*Table structure for table `income` */

DROP TABLE IF EXISTS `income`;

CREATE TABLE `income` (
  `ineid` int(11) NOT NULL,
  `inename` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ineid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `income` */

/*Table structure for table `juese` */

DROP TABLE IF EXISTS `juese`;

CREATE TABLE `juese` (
  `jueid` int(11) NOT NULL AUTO_INCREMENT,
  `Juename` varchar(20) DEFAULT NULL,
  `resid` int(11) DEFAULT NULL,
  `daxid` int(11) DEFAULT NULL,
  `waeid` int(11) DEFAULT NULL,
  PRIMARY KEY (`jueid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `juese` */

/*Table structure for table `keclassify` */

DROP TABLE IF EXISTS `keclassify`;

CREATE TABLE `keclassify` (
  `keyid` varchar(20) NOT NULL,
  `keyketype` varchar(20) DEFAULT NULL,
  `keypricetype` varchar(20) DEFAULT NULL,
  `keyyxq` varchar(20) DEFAULT NULL,
  `keyhf` int(11) DEFAULT NULL,
  `keytype` varchar(20) DEFAULT NULL,
  `bei1` varchar(20) DEFAULT NULL,
  `bei2` varchar(30) DEFAULT NULL,
  `bei3` varchar(40) DEFAULT NULL,
  `bei4` varchar(50) DEFAULT NULL,
  `bei5` int(4) DEFAULT NULL,
  PRIMARY KEY (`keyid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `keclassify` */

/*Table structure for table `linkman` */

DROP TABLE IF EXISTS `linkman`;

CREATE TABLE `linkman` (
  `linid` int(11) NOT NULL AUTO_INCREMENT,
  `linname` varchar(20) DEFAULT NULL,
  `linphone` varchar(20) DEFAULT NULL,
  `linjob` varchar(20) DEFAULT NULL,
  `lindh` varchar(20) DEFAULT NULL,
  `linemail` varchar(20) DEFAULT NULL,
  `marid` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`linid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `linkman` */

/*Table structure for table `maintainxf` */

DROP TABLE IF EXISTS `maintainxf`;

CREATE TABLE `maintainxf` (
  `mafid` varchar(20) NOT NULL,
  `orrid` varchar(20) DEFAULT NULL,
  `cayid` varchar(20) DEFAULT NULL,
  `mafptype` varchar(20) DEFAULT NULL,
  `mafavoid` varchar(20) DEFAULT NULL,
  `sid` varchar(20) DEFAULT NULL,
  `mafbefore` int(11) DEFAULT NULL,
  `maflater` int(11) DEFAULT NULL,
  `mafdescribe` varchar(20) DEFAULT NULL,
  `mafcause` varchar(20) DEFAULT NULL,
  `temid` varchar(20) DEFAULT NULL,
  `mafwork` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`mafid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `maintainxf` */

/*Table structure for table `manufacturer` */

DROP TABLE IF EXISTS `manufacturer`;

CREATE TABLE `manufacturer` (
  `marid` varchar(20) NOT NULL,
  `marname` varchar(20) DEFAULT NULL,
  `maraddress` varchar(50) DEFAULT NULL,
  `marmanage` varchar(50) DEFAULT NULL,
  `marurl` varchar(20) DEFAULT NULL,
  `maropen` varchar(20) DEFAULT NULL,
  `maraccount` varchar(20) DEFAULT NULL,
  `marway` varchar(20) DEFAULT NULL,
  `marlevel` varchar(20) DEFAULT NULL,
  `marbrand` varchar(20) DEFAULT NULL,
  `maeid` int(11) DEFAULT NULL,
  `marrelation` varchar(20) DEFAULT NULL,
  `marphone` varchar(20) DEFAULT NULL,
  `marcard` varchar(20) DEFAULT NULL,
  `maremail` varchar(20) DEFAULT NULL,
  `marpayment` varchar(20) DEFAULT NULL,
  `maremark` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`marid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `manufacturer` */

/*Table structure for table `manufacturertype` */

DROP TABLE IF EXISTS `manufacturertype`;

CREATE TABLE `manufacturertype` (
  `maeid` int(11) NOT NULL AUTO_INCREMENT,
  `maename` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`maeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `manufacturertype` */

/*Table structure for table `material` */

DROP TABLE IF EXISTS `material`;

CREATE TABLE `material` (
  `maiid` varchar(20) NOT NULL,
  `orrid` varchar(20) DEFAULT NULL,
  `mainame` varchar(20) DEFAULT NULL,
  `maibrand` varchar(20) DEFAULT NULL,
  `maitype` varchar(20) DEFAULT NULL,
  `maiunit` varchar(20) DEFAULT NULL,
  `maiptype` varchar(20) DEFAULT NULL,
  `maientrepot` varchar(20) DEFAULT NULL,
  `maiavoid` varchar(20) DEFAULT NULL,
  `maibefore` int(11) DEFAULT NULL,
  `mailater` int(11) DEFAULT NULL,
  `mainum` int(11) DEFAULT NULL,
  `maiproject` varchar(20) DEFAULT NULL,
  `maiinventory` int(11) DEFAULT NULL,
  `maimaterial` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`maiid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `material` */

/*Table structure for table `me2ber` */

DROP TABLE IF EXISTS `me2ber`;

CREATE TABLE `me2ber` (
  `me2berid` int(4) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `me2bername` varchar(20) DEFAULT NULL COMMENT '会员账号',
  `me2berpwd` varchar(20) DEFAULT NULL COMMENT '会员密码',
  `me2berusername` varchar(20) DEFAULT NULL COMMENT '会员姓名',
  `cltid` varchar(20) DEFAULT NULL COMMENT '客户编号',
  `me2berbalance` float DEFAULT NULL COMMENT '账号余额',
  `Me2ber1` float DEFAULT NULL COMMENT '挂账',
  `Me2ber2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `Me2ber3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `Me2ber4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `Me2ber5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  `Me2ber6` varchar(50) DEFAULT NULL COMMENT '备用字段6',
  PRIMARY KEY (`me2berid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `me2ber` */

/*Table structure for table `me2water` */

DROP TABLE IF EXISTS `me2water`;

CREATE TABLE `me2water` (
  `me2waterid` int(4) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `me2berid` int(4) DEFAULT NULL COMMENT '会员表主键',
  `Me2ber1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `Me2ber2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `Me2ber3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `Me2ber4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `Me2ber5` float DEFAULT NULL COMMENT '消费金额',
  `Me2ber6` int(4) DEFAULT NULL COMMENT '挂账金额',
  PRIMARY KEY (`me2waterid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `me2water` */

/*Table structure for table `module` */

DROP TABLE IF EXISTS `module`;

CREATE TABLE `module` (
  `moeid` int(11) NOT NULL AUTO_INCREMENT,
  `moename` varchar(20) DEFAULT NULL,
  `monid` int(11) DEFAULT NULL,
  `moetype` int(11) NOT NULL,
  `path` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`moeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `module` */

/*Table structure for table `moduledetails` */

DROP TABLE IF EXISTS `moduledetails`;

CREATE TABLE `moduledetails` (
  `mosid` int(11) NOT NULL AUTO_INCREMENT,
  `jueid` int(4) DEFAULT NULL,
  `moeid` int(4) DEFAULT NULL,
  PRIMARY KEY (`mosid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `moduledetails` */

/*Table structure for table `motorcycle` */

DROP TABLE IF EXISTS `motorcycle`;

CREATE TABLE `motorcycle` (
  `moeid` varchar(20) NOT NULL,
  `trkid` varchar(20) DEFAULT NULL,
  `moename` varchar(20) DEFAULT NULL,
  `moesource` varchar(20) DEFAULT NULL,
  `moeprice` int(11) DEFAULT NULL,
  `moeyear` varchar(20) DEFAULT NULL,
  `moepower` varchar(20) DEFAULT NULL,
  `moegrade` varchar(20) DEFAULT NULL,
  `moeload` varchar(20) DEFAULT NULL,
  `endid` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`moeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `motorcycle` */

/*Table structure for table `order` */

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `orrid` varchar(20) NOT NULL,
  `orrplate` varchar(20) DEFAULT NULL,
  `orrframe` varchar(20) DEFAULT NULL,
  `orrmodel` varchar(20) DEFAULT NULL,
  `orrbrand` varchar(20) DEFAULT NULL,
  `orrengine` varchar(20) DEFAULT NULL,
  `endid` varchar(20) DEFAULT NULL,
  `sid` varchar(20) DEFAULT NULL,
  `cltid` varchar(20) DEFAULT NULL,
  `orrdrive` varchar(20) DEFAULT NULL,
  `orrphone` varchar(20) DEFAULT NULL,
  `orrmillings` varchar(20) DEFAULT NULL,
  `orrmass` varchar(20) DEFAULT NULL,
  `orrlast` varchar(20) DEFAULT NULL,
  `orrmilling` varchar(20) DEFAULT NULL,
  `cayid` varchar(20) DEFAULT NULL,
  `orrroad` varchar(20) DEFAULT NULL,
  `orrjoin` varchar(20) DEFAULT NULL,
  `orrpredict` varchar(20) DEFAULT NULL,
  `orrclose` varchar(20) DEFAULT NULL,
  `orrreparations` varchar(20) DEFAULT NULL,
  `orrcomplete` varchar(20) DEFAULT NULL,
  `orrmill` varchar(20) DEFAULT NULL,
  `orresprice` varchar(20) DEFAULT NULL,
  `orrremake` varchar(50) DEFAULT NULL,
  `orrdescribe` varchar(50) DEFAULT NULL,
  `orrbills` varchar(20) DEFAULT NULL,
  `orrzt` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`orrid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order` */

insert  into `order`(`orrid`,`orrplate`,`orrframe`,`orrmodel`,`orrbrand`,`orrengine`,`endid`,`sid`,`cltid`,`orrdrive`,`orrphone`,`orrmillings`,`orrmass`,`orrlast`,`orrmilling`,`cayid`,`orrroad`,`orrjoin`,`orrpredict`,`orrclose`,`orrreparations`,`orrcomplete`,`orrmill`,`orresprice`,`orrremake`,`orrdescribe`,`orrbills`,`orrzt`) values 
('aaaa11111','b001','aaaa1512','宝马6系','宝马','baoma5','1','1','朱','朱洪亮','12345678','1000','1000','500','2020/1/1','1','白天','大兵','2020/1/3','现结','阳光保险公司',NULL,'500',NULL,NULL,'爆胎','接车','维修'),
('aaaa11112','b002','aaaa1513','奥迪8L','奥迪','aodi8','1','1','陈','陈艺峰','12345678','900','900','450','2020/1/2','1','晚上','大炮','2020/1/4','现结','阳光保险公司',NULL,'450',NULL,NULL,'爆胎','作业中','救援'),
('aaaa11113','b003','aaaa1514','奔驰E系','奔驰','benchie','1','1','苏','苏俊兴','12345789','800','800','400','2020/1/3','1','白天','打枪','2020/1/5','现结','阳光保险公司',NULL,'400',NULL,NULL,'爆胎','完工','维修');

/*Table structure for table `ownership` */

DROP TABLE IF EXISTS `ownership`;

CREATE TABLE `ownership` (
  `ownershipid` int(11) NOT NULL AUTO_INCREMENT COMMENT '车辆归属编号',
  `ownershipname` varchar(20) DEFAULT NULL COMMENT '名称',
  PRIMARY KEY (`ownershipid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车辆归属表';

/*Data for the table `ownership` */

/*Table structure for table `payoff` */

DROP TABLE IF EXISTS `payoff`;

CREATE TABLE `payoff` (
  `pafid` varchar(20) NOT NULL,
  `paftype` varchar(20) DEFAULT NULL,
  `pafagoprice` float DEFAULT NULL,
  `paftotalprice` float DEFAULT NULL,
  `pafmaterials` float DEFAULT NULL,
  `pafcost` float DEFAULT NULL,
  `pafaddition` float DEFAULT NULL,
  `pafclose` varchar(20) DEFAULT NULL,
  `pafperson` varchar(20) DEFAULT NULL,
  `pafcash` float DEFAULT NULL,
  `pafbank` varchar(20) DEFAULT NULL,
  `pafbill` varchar(20) DEFAULT NULL,
  `pafbuyer` float DEFAULT NULL,
  `pafsavings` float DEFAULT NULL,
  `pafearnest` float DEFAULT NULL,
  `paftaxes` float DEFAULT NULL,
  `pafvoucher` float DEFAULT NULL,
  `pafend` float DEFAULT NULL,
  `pafinterior` float DEFAULT NULL,
  `pafintegral` float DEFAULT NULL,
  `pafaccount` float DEFAULT NULL,
  `pafkind` varchar(20) DEFAULT NULL,
  `pafinvoice` varchar(20) DEFAULT NULL,
  `pafvalue` float DEFAULT NULL,
  `orrid` varchar(20) DEFAULT NULL,
  `me2ber` int(4) DEFAULT NULL,
  `me2ber11` varchar(50) DEFAULT NULL,
  `me2ber22` varchar(50) DEFAULT NULL,
  `me2ber33` varchar(50) DEFAULT NULL,
  `me2ber44` varchar(50) DEFAULT NULL,
  `me2ber55` varchar(50) DEFAULT NULL,
  `me2ber66` int(4) DEFAULT NULL,
  PRIMARY KEY (`pafid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `payoff` */

/*Table structure for table `province` */

DROP TABLE IF EXISTS `province`;

CREATE TABLE `province` (
  `provinceid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `provincename` varchar(20) DEFAULT NULL COMMENT '省名',
  PRIMARY KEY (`provinceid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='省表';

/*Data for the table `province` */

/*Table structure for table `receipts` */

DROP TABLE IF EXISTS `receipts`;

CREATE TABLE `receipts` (
  `resid` int(11) NOT NULL AUTO_INCREMENT,
  `resname` varchar(20) DEFAULT NULL,
  `ressfq` int(11) DEFAULT NULL,
  `resfsfq` int(11) DEFAULT NULL,
  PRIMARY KEY (`resid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `receipts` */

/*Table structure for table `serve` */

DROP TABLE IF EXISTS `serve`;

CREATE TABLE `serve` (
  `seeid` varchar(20) NOT NULL,
  `seename` varchar(20) DEFAULT NULL,
  `ineid` int(11) DEFAULT NULL,
  `cayid` varchar(20) DEFAULT NULL,
  `seeremark` varchar(20) DEFAULT NULL,
  `seestandard` int(11) DEFAULT NULL,
  `seemember` int(11) DEFAULT NULL,
  `seevip` int(11) DEFAULT NULL,
  `seedeal` int(11) DEFAULT NULL,
  `seeclaim` int(11) DEFAULT NULL,
  `seeinsurance` int(11) DEFAULT NULL,
  PRIMARY KEY (`seeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `serve` */

/*Table structure for table `shop` */

DROP TABLE IF EXISTS `shop`;

CREATE TABLE `shop` (
  `shpid` int(11) NOT NULL,
  `shpname` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`shpid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `shop` */

/*Table structure for table `shopbroad` */

DROP TABLE IF EXISTS `shopbroad`;

CREATE TABLE `shopbroad` (
  `shdid` varchar(20) NOT NULL,
  `shdname` varchar(20) DEFAULT NULL,
  `sheid` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`shdid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `shopbroad` */

/*Table structure for table `shopcentre` */

DROP TABLE IF EXISTS `shopcentre`;

CREATE TABLE `shopcentre` (
  `sheid` varchar(20) NOT NULL,
  `shename` varchar(20) DEFAULT NULL,
  `shlid` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`sheid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `shopcentre` */

/*Table structure for table `shopdatum` */

DROP TABLE IF EXISTS `shopdatum`;

CREATE TABLE `shopdatum` (
  `shmid` varchar(20) NOT NULL,
  `shmname` varchar(20) DEFAULT NULL,
  `shmbrand` varchar(20) DEFAULT NULL,
  `shmtype` varchar(20) DEFAULT NULL,
  `shmnum` varchar(20) DEFAULT NULL,
  `shlid` varchar(20) DEFAULT NULL,
  `ineid` int(11) DEFAULT NULL,
  `shmchang` varchar(20) DEFAULT NULL,
  `shmlevl` varchar(20) DEFAULT NULL,
  `shmplace` varchar(20) DEFAULT NULL,
  `marid` varchar(20) DEFAULT NULL,
  `shmcoding` varchar(20) DEFAULT NULL,
  `shmcode` varchar(20) DEFAULT NULL,
  `shmspecification` varchar(20) DEFAULT NULL,
  `shmbulk` varchar(20) DEFAULT NULL,
  `shmrough` int(11) DEFAULT NULL,
  `shmnet` int(11) DEFAULT NULL,
  `shmstock` int(11) DEFAULT NULL,
  `shmselling` varchar(20) DEFAULT NULL,
  `shmraise` int(11) DEFAULT NULL,
  `shmexchange` varchar(20) DEFAULT NULL,
  `shmstandard` int(11) DEFAULT NULL,
  `shmmember` int(11) DEFAULT NULL,
  `shmvip` int(11) DEFAULT NULL,
  `shmdeal` int(11) DEFAULT NULL,
  `shmclaim` int(11) DEFAULT NULL,
  `shminsurance` int(11) DEFAULT NULL,
  PRIMARY KEY (`shmid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `shopdatum` */

/*Table structure for table `shopsmall` */

DROP TABLE IF EXISTS `shopsmall`;

CREATE TABLE `shopsmall` (
  `shlid` varchar(20) NOT NULL,
  `shlname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`shlid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `shopsmall` */

/*Table structure for table `staff` */

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `sid` varchar(20) NOT NULL,
  `sname` varchar(20) DEFAULT NULL,
  `ssex` varchar(20) DEFAULT NULL,
  `shpid` int(11) DEFAULT NULL,
  `detid` int(11) DEFAULT NULL,
  `susername` varchar(20) DEFAULT NULL,
  `stnid` int(11) DEFAULT NULL,
  `sbody` varchar(50) DEFAULT NULL,
  `sheight` varchar(20) DEFAULT NULL,
  `snative` varchar(20) DEFAULT NULL,
  `snation` varchar(20) DEFAULT NULL,
  `smarriage` varchar(20) DEFAULT NULL,
  `seducation` varchar(20) DEFAULT NULL,
  `sschool` varchar(20) DEFAULT NULL,
  `smajor` varchar(20) DEFAULT NULL,
  `sstatus` varchar(20) DEFAULT NULL,
  `sproperty` varchar(20) DEFAULT NULL,
  `sdegree` varchar(20) DEFAULT NULL,
  `sauthorized` varchar(20) DEFAULT NULL,
  `sidentity` varchar(20) DEFAULT NULL,
  `sregistered` varchar(50) DEFAULT NULL,
  `spresent` varchar(50) DEFAULT NULL,
  `sphone` varchar(20) DEFAULT NULL,
  `snumber` varchar(20) DEFAULT NULL,
  `semail` varchar(20) DEFAULT NULL,
  `sbank` varchar(20) DEFAULT NULL,
  `sbankaccount` varchar(20) DEFAULT NULL,
  `surgency` varchar(20) DEFAULT NULL,
  `surgencyphone` varchar(20) DEFAULT NULL,
  `shiredate` varchar(20) DEFAULT NULL,
  `sexpiration` varchar(20) DEFAULT NULL,
  `sbirth` varchar(20) DEFAULT NULL,
  `sstart` varchar(20) DEFAULT NULL,
  `sfinish` varchar(20) DEFAULT NULL,
  `sselfmotion` varchar(20) DEFAULT NULL,
  `sinterior` varchar(20) DEFAULT NULL,
  `sreferrer` varchar(20) DEFAULT NULL,
  `selement` varchar(20) DEFAULT NULL,
  `stime` varchar(20) DEFAULT NULL,
  `scommodity` varchar(20) DEFAULT NULL,
  `mitigate` varchar(20) DEFAULT NULL,
  `sphotopath` varchar(20) DEFAULT NULL,
  `smitigate` varchar(50) DEFAULT NULL,
  `seducations` varchar(50) DEFAULT NULL,
  `sfamily` varchar(50) DEFAULT NULL,
  `sreward` varchar(50) DEFAULT NULL,
  `sopinion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `staff` */

insert  into `staff`(`sid`,`sname`,`ssex`,`shpid`,`detid`,`susername`,`stnid`,`sbody`,`sheight`,`snative`,`snation`,`smarriage`,`seducation`,`sschool`,`smajor`,`sstatus`,`sproperty`,`sdegree`,`sauthorized`,`sidentity`,`sregistered`,`spresent`,`sphone`,`snumber`,`semail`,`sbank`,`sbankaccount`,`surgency`,`surgencyphone`,`shiredate`,`sexpiration`,`sbirth`,`sstart`,`sfinish`,`sselfmotion`,`sinterior`,`sreferrer`,`selement`,`stime`,`scommodity`,`mitigate`,`sphotopath`,`smitigate`,`seducations`,`sfamily`,`sreward`,`sopinion`) values 
('dzw001','01','1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('dzw002','02','1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('dzw003','03','1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `station` */

DROP TABLE IF EXISTS `station`;

CREATE TABLE `station` (
  `stnid` int(11) NOT NULL,
  `stnname` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`stnid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `station` */

/*Table structure for table `team` */

DROP TABLE IF EXISTS `team`;

CREATE TABLE `team` (
  `temid` varchar(20) NOT NULL,
  `temname` varchar(20) DEFAULT NULL,
  `temcalssify` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`temid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `team` */

/*Table structure for table `trademark` */

DROP TABLE IF EXISTS `trademark`;

CREATE TABLE `trademark` (
  `trkid` varchar(20) NOT NULL,
  `trkname` varchar(20) DEFAULT NULL,
  `trkzimu` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`trkid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `trademark` */

/*Table structure for table `vehicle` */

DROP TABLE IF EXISTS `vehicle`;

CREATE TABLE `vehicle` (
  `veeid` varchar(20) DEFAULT NULL,
  `veebrand` varchar(20) DEFAULT NULL,
  `veetype` varchar(20) DEFAULT NULL,
  `veedriver` varchar(20) DEFAULT NULL,
  `veedriverphone` varchar(20) DEFAULT NULL,
  `veedate` varchar(20) DEFAULT NULL,
  `veeaffiliation` varchar(50) DEFAULT NULL,
  `veeexpires` varchar(20) DEFAULT NULL,
  `veeframe` varchar(20) DEFAULT NULL,
  `veeengine` varchar(20) DEFAULT NULL,
  `veeyear` varchar(20) DEFAULT NULL,
  `veemileage` varchar(20) DEFAULT NULL,
  `endid` varchar(20) DEFAULT NULL,
  `veeload` int(11) DEFAULT NULL,
  `veepurchase` varchar(20) DEFAULT NULL,
  `veeregistered` varchar(20) DEFAULT NULL,
  `veevehicle` varchar(20) DEFAULT NULL,
  `veecategory` varchar(20) DEFAULT NULL,
  `veeseries` varchar(20) DEFAULT NULL,
  `veeinsurance` varchar(20) DEFAULT NULL,
  `veeexpire` varchar(20) DEFAULT NULL,
  `veeflag` varchar(20) DEFAULT NULL,
  `veebusiness` varchar(20) DEFAULT NULL,
  `veebusexp` varchar(20) DEFAULT NULL,
  `veeupkeep` varchar(20) DEFAULT NULL,
  `veeupdate` varchar(20) DEFAULT NULL,
  `cltid` varchar(20) DEFAULT NULL,
  `bei1` varchar(20) DEFAULT NULL,
  `bei2` varchar(30) DEFAULT NULL,
  `bei3` varchar(40) DEFAULT NULL,
  `bei4` varchar(50) DEFAULT NULL,
  `bei5` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `vehicle` */

/*Table structure for table `warehouse` */

DROP TABLE IF EXISTS `warehouse`;

CREATE TABLE `warehouse` (
  `waeid` int(11) NOT NULL AUTO_INCREMENT,
  `waename` varchar(20) DEFAULT NULL,
  `waekd` int(11) DEFAULT NULL,
  `waecx` int(11) DEFAULT NULL,
  PRIMARY KEY (`waeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `warehouse` */

/*Table structure for table `workcard` */

DROP TABLE IF EXISTS `workcard`;

CREATE TABLE `workcard` (
  `wodid` int(11) NOT NULL AUTO_INCREMENT,
  `wodlicense` varchar(20) DEFAULT NULL,
  `wodbrand` varchar(20) DEFAULT NULL,
  `wodtype` varchar(20) DEFAULT NULL,
  `wodmileage` int(11) DEFAULT NULL,
  `temid` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`wodid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `workcard` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
