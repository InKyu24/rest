-- 스키마 생성
DROP DATABASE IF EXISTS `rest`;
CREATE DATABASE `rest`;

-- 스키마 사용
use `rest`;

-- 테이블 생성
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
`member_id` bigint NOT NULL AUTO_INCREMENT,
`username` varchar(255) DEFAULT NULL,
PRIMARY KEY (`member_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
`member_id` bigint NOT NULL AUTO_INCREMENT,
`username` varchar(255) DEFAULT NULL,
PRIMARY KEY (`member_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

INSERT INTO `rest`.`member` (`username`) VALUES ("aaa");
INSERT INTO `rest`.`member` (`username`) VALUES ("bbb");
INSERT INTO `rest`.`member` (`username`) VALUES ("ccc");

DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `product_id` bigint NOT NULL AUTO_INCREMENT,
  `prodname` varchar(255) DEFAULT NULL,
  `price` int DEFAULT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `rest`.`product` (`prodname`, `price`) VALUES ("아이폰" , 20000);
INSERT INTO `rest`.`product` (`prodname`, `price`) VALUES ("에어팟" , 10000);
INSERT INTO `rest`.`product` (`prodname`, `price`) VALUES ("핸드크림" , 1000);

