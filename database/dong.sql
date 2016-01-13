/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : dong

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2016-01-14 00:52:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for address_inf
-- ----------------------------
DROP TABLE IF EXISTS `address_inf`;
CREATE TABLE `address_inf` (
  `address_id` smallint(11) NOT NULL AUTO_INCREMENT,
  `addressDetail` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of address_inf
-- ----------------------------
INSERT INTO `address_inf` VALUES ('10', '上海');
INSERT INTO `address_inf` VALUES ('11', '广州');

-- ----------------------------
-- Table structure for person_inf
-- ----------------------------
DROP TABLE IF EXISTS `person_inf`;
CREATE TABLE `person_inf` (
  `person_id` smallint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `age` int(12) DEFAULT NULL,
  `address_id` smallint(11) DEFAULT NULL,
  PRIMARY KEY (`person_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person_inf
-- ----------------------------
INSERT INTO `person_inf` VALUES ('4', 'Jack', '25', '11');

-- ----------------------------
-- Table structure for school
-- ----------------------------
DROP TABLE IF EXISTS `school`;
CREATE TABLE `school` (
  `personid` smallint(11) DEFAULT NULL,
  `school_name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of school
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(15) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `gender` varchar(15) DEFAULT NULL,
  `age` int(15) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'dong', '男', '23', '上海');
INSERT INTO `user` VALUES ('2', 'zhao', '男', '24', '北京');
INSERT INTO `user` VALUES ('3', 'qi', '女', '25', '南京');
INSERT INTO `user` VALUES ('4', 'dong', null, '24', null);
INSERT INTO `user` VALUES ('5', '1yjli', null, '2', null);
INSERT INTO `user` VALUES ('6', '1yjli', null, '2', null);
INSERT INTO `user` VALUES ('7', '1yjli', null, '2', null);
INSERT INTO `user` VALUES ('8', '1yjli', null, '2', null);
INSERT INTO `user` VALUES ('9', '1yjli', null, '2', null);
INSERT INTO `user` VALUES ('10', '1yjli', null, '2', null);
