DROP TABLE IF EXISTS notice;

CREATE TABLE `notice` (
  `no` bigint(20) NOT NULL AUTO_INCREMENT,
  `member_no` bigint(20) NOT NULL,
  `title` varchar(50) NOT NULL,
  `content` text NOT NULL,
  `hit` bigint(20) DEFAULT 0,
  `files` varchar(100) DEFAULT NULL,
  `created_date` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_date` timestamp NULL DEFAULT NULL,
  `deleted_date` timestamp NULL DEFAULT NULL,
  `is_disclose` tinyint(4) DEFAULT 0,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

DROP TABLE IF EXISTS comment;

CREATE TABLE `comment` (
  `no` bigint(20) NOT NULL AUTO_INCREMENT,
  `member_no` bigint(20) NOT NULL,
  `notice_no` bigint(20) NOT NULL, 
  `content` text NOT NULL,
  `created_date` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_date` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

DROP TABLE IF EXISTS member;

CREATE TABLE `member` (
  `no` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL, 
  `email` varchar(100) NULL,
  `created_date` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_date` timestamp NULL,
  `deleted_date` timestamp NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

DROP TABLE IF EXISTS member_role;

CREATE TABLE `member_role` (
  `member_no` bigint(20) NOT NULL,
  `role_no`  bigint(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

DROP TABLE IF EXISTS role;

CREATE TABLE `role` (
  `no` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

SELECT * FROM notice_view;
CREATE OR replace VIEW notice_view
AS
SELECT n.no, title, hit, n.created_date AS createdDate,n.is_disclose AS isDisclose, m.name AS memberName FROM notice n
JOIN MEMBER m ON n.member_no = m.no;
