DROP DATABASE IF EXISTS library;
CREATE DATABASE library;
USE library;

DROP TABLE IF EXISTS reader;
CREATE TABLE `reader` (
  `user_id`               SMALLINT(6) NOT NULL AUTO_INCREMENT,
  `username`              VARCHAR(50) NOT NULL,
  `password`              VARCHAR(50) NOT NULL,
  `nickname`              VARCHAR(50)          DEFAULT NULL,
  `registration_time`     DATE                 DEFAULT NULL,
  `last_updated_time`     DATE                 DEFAULT NULL,
  `whether_administrator` TINYINT(4)           DEFAULT NULL,
  `validity`              TINYINT(4)           DEFAULT NULL,
  PRIMARY KEY (`user_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
INSERT INTO reader VALUES (DEFAULT ,'admin','admin','管理员01',curdate(),curdate(),1,1);
INSERT INTO reader VALUES (DEFAULT ,'xiaoming','xiaoming','小明',curdate(),curdate(),0,1);
INSERT INTO reader VALUES (DEFAULT ,'xiaohua','xiaohua','小花',curdate(),curdate(),0,1);
INSERT INTO reader VALUES (DEFAULT ,'xiaobai','xiaobai','小白',curdate(),curdate(),0,1);

DROP TABLE IF EXISTS book;
CREATE TABLE `book` (
  `book_id`           SMALLINT(6) NOT NULL AUTO_INCREMENT,
  `title`             VARCHAR(50) NOT NULL,
  `author`            VARCHAR(50) NOT NULL,
  `press`             VARCHAR(50) NOT NULL,
  `type_id`           TINYINT(4)  NOT NULL,
  `amount`            SMALLINT(6)          DEFAULT NULL,
  `stock`             SMALLINT(6)          DEFAULT NULL,
  `last_updated_time` DATE                 DEFAULT NULL,
  `validity`          TINYINT(4)           DEFAULT NULL,
  PRIMARY KEY (`book_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
INSERT INTO book VALUE (DEFAULT, '《你一定爱读的极简欧洲史》', '约翰·赫斯特', '广西师范大学出版社', 3, 6, 5, curdate(), 1);
INSERT INTO book VALUE (DEFAULT, '《乌合之众：大众心理研究》', '古斯塔夫·勒庞 ', '中央编译出版社', 3, 4, 2, curdate(), 1);
INSERT INTO book VALUE (DEFAULT, '《天生变态狂:TED心理学家的脑犯罪之旅》', '詹姆斯·法隆', '群言出版社', 5, 5, 4, curdate(), 1);
INSERT INTO book VALUE (DEFAULT, '《过的刚好》', '郭德纲', '北京联合出版公司', 3, 11, 9, curdate(), 1);
INSERT INTO book VALUE (DEFAULT, '《最好的告别：关于衰老与死亡，你必须知道的常识》', '阿图•葛文德', '浙江人民出版社', 7, 12, 12, curdate(), 1);
INSERT INTO book VALUE (DEFAULT, '《世界兵器大百科》', '《图说天下：珍藏版》编委会', '吉林出版集团有限责任公司', 2, 7, 6, curdate(), 1);
INSERT INTO book VALUE (DEFAULT, '《世界地理知识百科》', '陈君慧', '吉林出版集团有限责任公司', 4, 5, 4, curdate(), 1);
INSERT INTO book VALUE (DEFAULT, '《耶鲁大学公开课：政治哲学》', '史蒂芬·B·斯密什', '北京联合出版公司', 3, 11, 9, curdate(), 1);
INSERT INTO book VALUE (DEFAULT, '《智能时代:大数据与智能革命重新定义未来》', '吴军', '中信出版社', 11, 15, 13, curdate(), 1);


DROP TABLE IF EXISTS book_type;
CREATE TABLE `book_type` (
  `type_id` TINYINT(4)  NOT NULL AUTO_INCREMENT,
  `type`    VARCHAR(50) NOT NULL,
  PRIMARY KEY (`type_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
INSERT INTO book_type VALUE (DEFAULT, '科学');
INSERT INTO book_type VALUE (DEFAULT, '军事');
INSERT INTO book_type VALUE (DEFAULT, '人文');
INSERT INTO book_type VALUE (DEFAULT, '地理');
INSERT INTO book_type VALUE (DEFAULT, '法律');
INSERT INTO book_type VALUE (DEFAULT, '生物');
INSERT INTO book_type VALUE (DEFAULT, '医学');
INSERT INTO book_type VALUE (DEFAULT, '政治');
INSERT INTO book_type VALUE (DEFAULT, '农业');
INSERT INTO book_type VALUE (DEFAULT, '娱乐');
INSERT INTO book_type VALUE (DEFAULT, '科技');

DROP TABLE IF EXISTS borrow_info;
CREATE TABLE `borrow_info` (
  `info_id`                 SMALLINT(6) NOT NULL AUTO_INCREMENT,
  `name`                    VARCHAR(50)          DEFAULT NULL,
  `title`                   VARCHAR(50) NOT NULL,
  `administrator`           VARCHAR(50)          DEFAULT NULL,
  `apply_borrowing_time`    DATE                 DEFAULT NULL,
  `approval_borrowing_time` DATE                 DEFAULT NULL,
  `return_time`             DATE                 DEFAULT NULL,
  `borrowing_status`        VARCHAR(10) NOT NULL,
  PRIMARY KEY (`info_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
INSERT INTO borrow_info VALUE (DEFAULT, '小明', '《乌合之众：大众心理研究》', '管理员01', curdate(), NULL, NULL, '待审核');
INSERT INTO borrow_info VALUE (DEFAULT, '小明', '《过的刚好》', '管理员01', curdate(), NULL, NULL, '待审核');
INSERT INTO borrow_info VALUE (DEFAULT, '小花', '《耶鲁大学公开课：政治哲学》', '管理员01', curdate(), NULL, NULL, '待审核');
INSERT INTO borrow_info VALUE (DEFAULT, '小花', '《过的刚好》', '管理员01', curdate(), NULL, NULL, '待审核');
INSERT INTO borrow_info VALUE (DEFAULT, '小花', '《智能时代:大数据与智能革命重新定义未来》', '管理员01', curdate(), NULL, NULL, '待审核');
INSERT INTO borrow_info VALUE (DEFAULT, '小白', '《你一定爱读的极简欧洲史》', '管理员01', curdate(), NULL, NULL, '待审核');
INSERT INTO borrow_info VALUE (DEFAULT, '小白', '《天生变态狂:TED心理学家的脑犯罪之旅》', '管理员01', curdate(), NULL, NULL, '待审核');
INSERT INTO borrow_info VALUE (DEFAULT, '小白', '《世界兵器大百科》', '管理员01', curdate(), NULL, NULL, '待审核');
INSERT INTO borrow_info VALUE (DEFAULT, '小白', '《世界地理知识百科》', '管理员01', curdate(), NULL, NULL, '待审核');
INSERT INTO borrow_info VALUE (DEFAULT, '小白', '《耶鲁大学公开课：政治哲学》', '管理员01', curdate(), NULL, NULL, '待审核');
INSERT INTO borrow_info VALUE (DEFAULT, '小白', '《智能时代:大数据与智能革命重新定义未来》', '管理员01', curdate(), NULL, NULL, '待审核');
INSERT INTO borrow_info VALUE (DEFAULT, '小白', '《乌合之众：大众心理研究》', '管理员01', curdate(), NULL, NULL, '待审核');
