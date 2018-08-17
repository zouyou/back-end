/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.22 : Database - db_test
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE IF NOT EXISTS `db_test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db_test`;

/*Table structure for table `tb_deptinfo` */

DROP TABLE IF EXISTS `tb_deptinfo`;

CREATE TABLE `tb_deptinfo` (
  `id` BIGINT PRIMARY KEY NOT NULL COMMENT '主键Id',
  `parentId` BIGINT DEFAULT NULL COMMENT '父级主键Id',
  `version` int(11) DEFAULT '1' COMMENT '版本',
  `code` varchar(50) DEFAULT NULL COMMENT '编码',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `remarks` varchar(150) DEFAULT NULL COMMENT '备注',
  `sortNum` int(11) DEFAULT '1' COMMENT '排序数字',
  `is_Enable` int(1) DEFAULT '1' COMMENT '是否启用',
  `is_Delete` int(1) DEFAULT '0' COMMENT '是否删除',
  `ownerId` BIGINT DEFAULT NULL COMMENT '拥有人Id',
  `createId` BIGINT NOT NULL COMMENT '创建人Id',
  `updateId` BIGINT DEFAULT NULL COMMENT '更新人Id',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  `updateTime` datetime DEFAULT NULL COMMENT '修改时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_deptinfo` */

/*Table structure for table `tb_funcinfo` */

DROP TABLE IF EXISTS `tb_funcinfo`;

CREATE TABLE `tb_funcinfo` (
  `id` BIGINT PRIMARY KEY NOT NULL COMMENT '主键Id',
  `parentId` BIGINT DEFAULT NULL COMMENT '父级主键Id',
  `version` int(11) DEFAULT '1' COMMENT '版本',
  `code` varchar(50) DEFAULT NULL COMMENT '编码',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `remarks` varchar(150) DEFAULT NULL COMMENT '备注',
  `sortNum` int(11) DEFAULT '1' COMMENT '排序数字',
  `is_Enable` int(1) DEFAULT '1' COMMENT '是否启用',
  `is_Delete` int(1) DEFAULT '0' COMMENT '是否删除',
  `ownerId` BIGINT DEFAULT NULL COMMENT '拥有人Id',
  `createId` BIGINT NOT NULL COMMENT '创建人Id',
  `updateId` BIGINT DEFAULT NULL COMMENT '更新人Id',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  `updateTime` datetime DEFAULT NULL COMMENT '修改时间',
  `routePath` varchar(150) DEFAULT NULL COMMENT '路由地址',
  `styleName` varchar(150) DEFAULT NULL COMMENT '样式名称',
  `levelVal` int(11) DEFAULT NULL COMMENT '级别（层次）'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_funcinfo` */

/*Table structure for table `tb_roleinfo` */

DROP TABLE IF EXISTS `tb_roleinfo`;

CREATE TABLE `tb_roleinfo` (
  `id` BIGINT PRIMARY KEY NOT NULL COMMENT '主键Id',
  `parentId` BIGINT DEFAULT NULL COMMENT '父级主键Id',
  `version` int(11) DEFAULT '1' COMMENT '版本',
  `code` varchar(50) DEFAULT NULL COMMENT '编码',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `remarks` varchar(150) DEFAULT NULL COMMENT '备注',
  `sortNum` int(11) DEFAULT '1' COMMENT '排序数字',
  `is_Enable` int(1) DEFAULT '1' COMMENT '是否启用',
  `is_Delete` int(1) DEFAULT '0' COMMENT '是否删除',
  `ownerId` BIGINT DEFAULT NULL COMMENT '拥有人Id',
  `createId` BIGINT NOT NULL COMMENT '创建人Id',
  `updateId` BIGINT DEFAULT NULL COMMENT '更新人Id',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  `updateTime` datetime DEFAULT NULL COMMENT '修改时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_roleinfo` */

/*Table structure for table `tb_rolejoinfunc` */

DROP TABLE IF EXISTS `tb_rolejoinfunc`;

CREATE TABLE `tb_rolejoinfunc` (
  `id` BIGINT PRIMARY KEY NOT NULL COMMENT '主键Id',
  `parentId` BIGINT DEFAULT NULL COMMENT '父级主键Id',
  `version` int(11) DEFAULT '1' COMMENT '版本',
  `code` varchar(50) DEFAULT NULL COMMENT '编码',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `remarks` varchar(150) DEFAULT NULL COMMENT '备注',
  `sortNum` int(11) DEFAULT '1' COMMENT '排序数字',
  `is_Enable` int(1) DEFAULT '1' COMMENT '是否启用',
  `is_Delete` int(1) DEFAULT '0' COMMENT '是否删除',
  `ownerId` BIGINT DEFAULT NULL COMMENT '拥有人Id',
  `createId` BIGINT NOT NULL COMMENT '创建人Id',
  `updateId` BIGINT DEFAULT NULL COMMENT '更新人Id',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  `updateTime` datetime DEFAULT NULL COMMENT '修改时间',
  `roleId` BIGINT DEFAULT NULL COMMENT '角色Id',
  `funcId` BIGINT DEFAULT NULL COMMENT '功能Id',
  `levelVal` int(11) DEFAULT NULL COMMENT '级别值域'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_rolejoinfunc` */

/*Table structure for table `tb_student` */

DROP TABLE IF EXISTS `tb_student`;

CREATE TABLE `tb_student` (
  `id` BIGINT PRIMARY KEY NOT NULL COMMENT '主键Id',
  `parentId` BIGINT DEFAULT NULL COMMENT '父级主键Id',
  `version` int(11) DEFAULT '1' COMMENT '版本',
  `code` varchar(50) DEFAULT NULL COMMENT '学号',
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `remarks` varchar(150) DEFAULT NULL COMMENT '备注',
  `sortNum` int(11) DEFAULT '1' COMMENT '排序数字',
  `is_Enable` int(1) DEFAULT '1' COMMENT '是否启用',
  `is_Delete` int(1) DEFAULT '0' COMMENT '是否删除',
  `ownerId` BIGINT DEFAULT NULL COMMENT '拥有人Id',
  `createId` BIGINT NOT NULL COMMENT '创建人Id',
  `updateId` BIGINT DEFAULT NULL COMMENT '更新人Id',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  `updateTime` datetime DEFAULT NULL COMMENT '修改时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_student` */

/*Table structure for table `tb_syslogs` */

DROP TABLE IF EXISTS `tb_syslogs`;

CREATE TABLE `tb_syslogs` (
  `id` BIGINT PRIMARY KEY NOT NULL COMMENT '主键Id',
  `parentId` BIGINT DEFAULT NULL COMMENT '父级主键Id',
  `version` int(11) DEFAULT '1' COMMENT '版本',
  `code` varchar(50) DEFAULT NULL COMMENT '编码',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `remarks` varchar(150) DEFAULT NULL COMMENT '备注',
  `sortNum` int(11) DEFAULT '1' COMMENT '排序数字',
  `is_Enable` int(1) DEFAULT '1' COMMENT '是否启用',
  `is_Delete` int(1) DEFAULT '0' COMMENT '是否删除',
  `ownerId` BIGINT DEFAULT NULL COMMENT '拥有人Id',
  `createId` BIGINT NOT NULL COMMENT '创建人Id',
  `updateId` BIGINT DEFAULT NULL COMMENT '更新人Id',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  `updateTime` datetime DEFAULT NULL COMMENT '修改时间',
  `opererType` int(11) DEFAULT NULL COMMENT '操作类型',
  `opererContent` varchar(450) DEFAULT NULL COMMENT '操作内容'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_syslogs` */

/*Table structure for table `tb_userinfo` */

DROP TABLE IF EXISTS `tb_userinfo`;

CREATE TABLE `tb_userinfo` (
  `id` BIGINT PRIMARY KEY NOT NULL COMMENT '主键Id',
  `parentId` BIGINT DEFAULT NULL COMMENT '父级主键Id',
  `version` int(11) DEFAULT '1' COMMENT '版本',
  `code` varchar(50) UNIQUE DEFAULT NULL COMMENT '编码(用户名)',
  `name` varchar(50) DEFAULT NULL COMMENT '名称(昵称)',
  `remarks` varchar(150) DEFAULT NULL COMMENT '备注',
  `sortNum` int(11) DEFAULT '1' COMMENT '排序数字',
  `is_Enable` int(1) DEFAULT '1' COMMENT '是否启用',
  `is_Delete` int(1) DEFAULT '0' COMMENT '是否删除',
  `ownerId` BIGINT DEFAULT NULL COMMENT '拥有人Id',
  `createId` BIGINT NOT NULL COMMENT '创建人Id',
  `updateId` BIGINT DEFAULT NULL COMMENT '更新人Id',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  `updateTime` datetime DEFAULT NULL COMMENT '修改时间',
  `passWord` varchar(150) DEFAULT NULL COMMENT '用户密码',
  `salt` varchar(36) DEFAULT NULL COMMENT '盐密码',
  `is_Male` int(1) DEFAULT NULL COMMENT '性别',
  `phoneNum` varchar(15) DEFAULT NULL COMMENT '手机号码',
  `roleId` BIGINT DEFAULT NULL COMMENT '角色Id',
  `deptId` BIGINT DEFAULT NULL COMMENT '部门Id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_userinfo` */

/*Table structure for table `tb_attachments` */

DROP TABLE IF EXISTS `tb_attachments`;

CREATE TABLE `tb_attachments` (
  `id` BIGINT PRIMARY KEY NOT NULL COMMENT '主键Id',
  `parentId` BIGINT DEFAULT NULL COMMENT '父级主键Id',
  `version` int(11) DEFAULT '1' COMMENT '版本',
  `code` varchar(50) DEFAULT NULL COMMENT '编码',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `remarks` varchar(150) DEFAULT NULL COMMENT '备注',
  `sortNum` int(11) DEFAULT '1' COMMENT '排序数字',
  `is_Enable` int(1) DEFAULT '1' COMMENT '是否启用',
  `is_Delete` int(1) DEFAULT '0' COMMENT '是否删除',
  `ownerId` BIGINT DEFAULT NULL COMMENT '拥有人Id',
  `createId` BIGINT NOT NULL COMMENT '创建人Id',
  `updateId` BIGINT DEFAULT NULL COMMENT '更新人Id',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  `updateTime` datetime DEFAULT NULL COMMENT '修改时间',
  `fkType` int(11) DEFAULT NULL COMMENT '外键类型',
  `fkPkId` BIGINT DEFAULT NULL COMMENT '外键Id',
  `suffix` varchar(20) DEFAULT NULL COMMENT '扩展名',
  `streamData` blob(4000) DEFAULT NULL COMMENT '文件流'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_attachments` */


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

 INSERT INTO tb_userinfo (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime, PASSWORD,is_Male, phoneNum, roleId,deptId,salt)
 VALUES (1, 0, 1,'admin', '超级用户', '超级管理员',1, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8', 'e97ab12c758201995e51635e2e78cd33',1, '15812345678', 1,1,'8b4757dc-99d6-446f-907a-d4b8f6060a8e');

  INSERT INTO tb_roleinfo (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime)
 VALUES (1, 0, 1,'1', '超级管理员', '',1, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8');

   INSERT INTO tb_roleinfo (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime)
 VALUES (2, 0, 1,'2', '管理员', '',2, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8');


 INSERT INTO tb_deptinfo (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime)
 VALUES (1, 0, 1,'1', '开发部', '',1, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8');

   INSERT INTO tb_deptinfo (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime)
 VALUES (2, 0, 1,'2', '销售部', '',2, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8');


     INSERT INTO tb_funcinfo (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime,routePath,styleName,levelVal)
 VALUES (1, 0, 1,'/index', '首页', '',1, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8','/index','el-icon-goods',1);
     INSERT INTO tb_funcinfo (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime,routePath,styleName,levelVal)
 VALUES (2, 0, 1,'2', '学生管理', '',2, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8','2','el-icon-message',1);
     INSERT INTO tb_funcinfo (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime,routePath,styleName,levelVal)
 VALUES (3, 0, 1,'3', '系统管理', '',3, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8','3','el-icon-service',1);


     INSERT INTO tb_funcinfo (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime,routePath,styleName,levelVal)
 VALUES (4, 3, 1,'/role', '角色管理', '',4, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8','/role','',2);
    INSERT INTO tb_funcinfo (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime,routePath,styleName,levelVal)
 VALUES (5, 3, 1,'/user-index', '用户管理', '',5, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8','/user-index','',2);
    INSERT INTO tb_funcinfo (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime,routePath,styleName,levelVal)
 VALUES (6, 3, 1,'/func', '功能管理', '',6, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8','/func','',2);
    INSERT INTO tb_funcinfo (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime,routePath,styleName,levelVal)
 VALUES (7, 3, 1,'/const', '常量管理', '',7, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8','/const','',2);
    INSERT INTO tb_funcinfo (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime,routePath,styleName,levelVal)
 VALUES (8, 3, 1,'/flow', '流程管理', '',8, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8','/flow','',2);
    INSERT INTO tb_funcinfo (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime,routePath,styleName,levelVal)
 VALUES (9, 3, 1,'/syslog', '日志管理', '',9, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8','/syslog','',2);

     INSERT INTO tb_funcinfo (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime,routePath,styleName,levelVal)
 VALUES (10, 2, 1,'/student', '学生列表', '',10, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8','/student','',2);

      INSERT INTO tb_rolejoinfunc (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime,roleId,funcId,levelVal)
 VALUES (1, 0, 1,'', '', '',1, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8',1,1,1);
      INSERT INTO tb_rolejoinfunc (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime,roleId,funcId,levelVal)
 VALUES (2, 0, 1,'', '', '',1, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8',1,2,1);
      INSERT INTO tb_rolejoinfunc (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime,roleId,funcId,levelVal)
 VALUES (3, 0, 1,'', '', '',1, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8',1,3,1);
      INSERT INTO tb_rolejoinfunc (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime,roleId,funcId,levelVal)
 VALUES (4, 0, 1,'', '', '',1, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8',1,4,1);
      INSERT INTO tb_rolejoinfunc (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime,roleId,funcId,levelVal)
 VALUES (5, 0, 1,'', '', '',1, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8',1,5,1);
      INSERT INTO tb_rolejoinfunc (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime,roleId,funcId,levelVal)
 VALUES (6, 0, 1,'', '', '',1, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8',1,6,1);
      INSERT INTO tb_rolejoinfunc (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime,roleId,funcId,levelVal)
 VALUES (7, 0, 1,'', '', '',1, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8',1,7,1);
      INSERT INTO tb_rolejoinfunc (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime,roleId,funcId,levelVal)
 VALUES (8, 0, 1,'', '', '',1, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8',1,8,1);
      INSERT INTO tb_rolejoinfunc (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime,roleId,funcId,levelVal)
 VALUES (9, 0, 1,'', '', '',1, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8',1,9,1);
       INSERT INTO tb_rolejoinfunc (id, parentId, VERSION, CODE, NAME, remarks,sortNum, is_Enable, is_Delete,
      ownerId, createId, updateId,createTime, updateTime,roleId,funcId,levelVal)
 VALUES (10, 0, 1,'', '', '',1, 1, 0, 1, 1, 1,'2018-8-8', '2018-8-8',1,10,1);



