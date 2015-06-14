-- --------------------------------------------------------
-- 호스트:                          120.100.80.208
-- 서버 버전:                        5.5.43-0ubuntu0.14.04.1 - (Ubuntu)
-- 서버 OS:                        debian-linux-gnu
-- HeidiSQL 버전:                  9.1.0.4867
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 테이블 mokjang의 구조를 덤프합니다. attend_worship
CREATE TABLE IF NOT EXISTS `attend_worship` (
  `attend_worship_seq` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '예배출석순번',
  `weeks` bigint(20) NOT NULL COMMENT '주차',
  `worship_seq` bigint(20) DEFAULT NULL COMMENT '예배구분',
  `worship_times` int(11) DEFAULT '0' COMMENT '한 주 동안 참석 횟수',
  `worship_date` varchar(10) DEFAULT NULL COMMENT '예배날짜',
  `user_id` varchar(100) NOT NULL COMMENT '구성원ID',
  `reg_id` varchar(100) NOT NULL COMMENT '등록자ID',
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '등록시간',
  PRIMARY KEY (`attend_worship_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='예배출석';

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 mokjang의 구조를 덤프합니다. department
CREATE TABLE IF NOT EXISTS `department` (
  `dept_seq` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '그룹seq',
  `dept_name` varchar(100) NOT NULL DEFAULT '0' COMMENT '그룹명',
  `dept_type` char(1) NOT NULL COMMENT '구룹구분(교회:C, 대교구:G, 교구:K, 조:J, 목장:M)',
  `leader_id` varchar(100) DEFAULT NULL COMMENT '리더ID',
  `description` varchar(100) DEFAULT NULL COMMENT '그룹설명',
  `parent_seq` bigint(20) DEFAULT NULL COMMENT '상위그룹seq',
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '등록일시',
  PRIMARY KEY (`dept_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='소속부서';

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 mokjang의 구조를 덤프합니다. department_change_hist
CREATE TABLE IF NOT EXISTS `department_change_hist` (
  `department_change_hist_seq` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '그룹변경이력seq',
  `user_id` varchar(100) DEFAULT NULL COMMENT '변경ID',
  `before_department_seq` bigint(20) DEFAULT NULL COMMENT '변경전 department_seq',
  `after_department_seq` bigint(20) DEFAULT NULL COMMENT '변경후 department_seq',
  `change_date` varchar(100) NOT NULL COMMENT '변경날짜',
  `change_resn` varchar(500) DEFAULT NULL COMMENT '변경이유',
  `reg_id` varchar(100) DEFAULT NULL COMMENT '등록자ID',
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '등록한시간',
  PRIMARY KEY (`department_change_hist_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='그룹변경이력';

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 mokjang의 구조를 덤프합니다. edu
CREATE TABLE IF NOT EXISTS `edu` (
  `edu_seq` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '교육과목seq',
  `edu_name` varchar(100) DEFAULT '0' COMMENT '교육과목명',
  `total_unit` int(11) DEFAULT NULL COMMENT '총과',
  `reg_id` varchar(100) NOT NULL COMMENT '등록자id',
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '등록시간',
  PRIMARY KEY (`edu_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='성경공부 과목정보';

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 mokjang의 구조를 덤프합니다. edu_status
CREATE TABLE IF NOT EXISTS `edu_status` (
  `edu_status_seq` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '양육현황seq',
  `user_id` varchar(100) NOT NULL DEFAULT '0' COMMENT '사용자id',
  `edu_seq` bigint(20) NOT NULL DEFAULT '0' COMMENT '양육교재seq',
  `edu_date` varchar(10) DEFAULT NULL COMMENT '양육날짜',
  `edu_unit` int(11) DEFAULT '0' COMMENT '양육내용(x과)',
  `state` char(50) NOT NULL DEFAULT '0' COMMENT '양육상태(0:진행중, 1:완료)',
  `reg_id` varchar(100) NOT NULL DEFAULT '0' COMMENT '등록id',
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '등록시간',
  PRIMARY KEY (`edu_status_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='양육현황';

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 mokjang의 구조를 덤프합니다. mission_work_status
CREATE TABLE IF NOT EXISTS `mission_work_status` (
  `mission_work_status_seq` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '전도현황seq',
  `user_id` varchar(100) NOT NULL COMMENT '전도자id(이름)',
  `new_user_id` varchar(100) NOT NULL COMMENT '전도대상자id(이름)',
  `reg_date` varchar(10) NOT NULL COMMENT '전도일',
  `reg_id` varchar(100) NOT NULL COMMENT '등록id',
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '등록시간',
  PRIMARY KEY (`mission_work_status_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='전도현황';

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 mokjang의 구조를 덤프합니다. mokjang_report
CREATE TABLE IF NOT EXISTS `mokjang_report` (
  `mokjang_report_seq` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '목장보고서seq',
  `weeks` int(11) NOT NULL COMMENT '보고서 주간번째',
  `dept_seq` bigint(20) NOT NULL COMMENT '부서seq',
  `worship_dt` varchar(10) DEFAULT NULL COMMENT '목장모임날짜',
  `worship_place` varchar(100) DEFAULT NULL COMMENT '목장모임장소',
  `next_worship_place` varchar(100) DEFAULT NULL COMMENT '다음목장모임장소',
  `offering` bigint(20) DEFAULT '0' COMMENT '목장모임 헌금',
  `welcome_user_name` varchar(100) DEFAULT NULL COMMENT '마음열기 인도자',
  `worship_user_name` varchar(100) DEFAULT NULL COMMENT '찬양인도자',
  `word_user_name` varchar(100) DEFAULT NULL COMMENT '말씀인도자',
  `work_user_name` varchar(100) DEFAULT NULL COMMENT '사역인도자',
  `etc_report_content` text COMMENT '기타보고사항',
  `point` int(11) NOT NULL DEFAULT '0' COMMENT '목장보고서 점수',
  `reg_id` varchar(100) NOT NULL COMMENT '등록id',
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '등록시간',
  `gyogu_dept_seq` bigint(20) DEFAULT NULL COMMENT '교구dept_seq',
  PRIMARY KEY (`mokjang_report_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='목장보고서';

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 mokjang의 구조를 덤프합니다. notice
CREATE TABLE IF NOT EXISTS `notice` (
  `notice_seq` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '공지사항seq',
  `title` varchar(200) NOT NULL COMMENT '제목',
  `content` longtext NOT NULL COMMENT '내용',
  `openYn` char(1) NOT NULL COMMENT '공개여부(Y:공개, N:미공개)',
  `reg_id` varchar(100) NOT NULL COMMENT '등록자id',
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '등록시간',
  PRIMARY KEY (`notice_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='공지사항';

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 mokjang의 구조를 덤프합니다. report
CREATE TABLE IF NOT EXISTS `report` (
  `report_seq` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '목장보고서seq',
  `user_id` varchar(100) DEFAULT NULL COMMENT '목장원id',
  `dept_seq` bigint(20) NOT NULL COMMENT '목장seq',
  `weeks` int(11) NOT NULL COMMENT '주간번째',
  `visit_content` varchar(5000) DEFAULT NULL COMMENT '심방내용',
  `point` int(11) NOT NULL DEFAULT '0' COMMENT '개인보고서 점수',
  `mokjang_report_seq` bigint(20) DEFAULT NULL COMMENT '목장보고서seq',
  `reg_id` varchar(100) NOT NULL COMMENT '등록자id',
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '등록시간',
  PRIMARY KEY (`report_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='개인보고서';

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 mokjang의 구조를 덤프합니다. report_item
CREATE TABLE IF NOT EXISTS `report_item` (
  `report_item_seq` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '보고서항목순번',
  `item_name` varchar(100) NOT NULL COMMENT '항목명',
  `weight` int(11) NOT NULL DEFAULT '1' COMMENT '항목점수',
  `code` varchar(50) NOT NULL COMMENT '항목코드',
  `item_desc` text COMMENT '항목설명',
  `item_type` varchar(50) NOT NULL COMMENT '항목구분',
  `item_type_desc` varchar(50) DEFAULT NULL COMMENT '항목구분설명',
  `priority` int(11) NOT NULL COMMENT '항목우선순위',
  `use_yn` char(1) NOT NULL COMMENT '항목사용유무',
  `report_item_mngr_seq` bigint(20) NOT NULL COMMENT '보고서관리순번',
  `reg_id` varchar(100) NOT NULL COMMENT '등록자ID',
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '등록시간',
  PRIMARY KEY (`report_item_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='보고서 항목';

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 mokjang의 구조를 덤프합니다. report_item_hist
CREATE TABLE IF NOT EXISTS `report_item_hist` (
  `report_item_hist_seq` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '개인보고서 항목이력순번',
  `item_code` varchar(20) NOT NULL DEFAULT '0' COMMENT '항목코드',
  `item_value` bigint(20) NOT NULL DEFAULT '0' COMMENT '항목값',
  `report_seq` bigint(20) NOT NULL COMMENT '개인보고서순번',
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '등록시간',
  PRIMARY KEY (`report_item_hist_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='개인보고서 항목이력';

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 mokjang의 구조를 덤프합니다. report_item_mngr
CREATE TABLE IF NOT EXISTS `report_item_mngr` (
  `report_item_mngr_seq` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '보고서항목관리순번',
  `mngr_name` varchar(200) NOT NULL COMMENT '관리명',
  `start_date` date NOT NULL COMMENT '보고서적용시작날짜',
  `end_date` date NOT NULL COMMENT '보고서적용종료날짜',
  `use_yn` char(1) NOT NULL DEFAULT 'N' COMMENT '사용여부',
  `desc` text COMMENT '항목설명',
  `reg_id` varchar(100) NOT NULL COMMENT '등록자ID',
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '등록시간',
  PRIMARY KEY (`report_item_mngr_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='보고서항목관리';

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 mokjang의 구조를 덤프합니다. role
CREATE TABLE IF NOT EXISTS `role` (
  `role_seq` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '권한seq',
  `role_name` varchar(50) NOT NULL DEFAULT '0' COMMENT '권한명',
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '등록일시',
  PRIMARY KEY (`role_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='권한';

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 mokjang의 구조를 덤프합니다. role_change_hist
CREATE TABLE IF NOT EXISTS `role_change_hist` (
  `role_change_hist_seq` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '역할변경이력seq',
  `user_id` varchar(100) NOT NULL COMMENT '사용자ID',
  `before_role_seq` bigint(20) NOT NULL COMMENT '이전역할seq',
  `after_role_seq` bigint(20) NOT NULL COMMENT '변경할역할seq',
  `change_date` varchar(10) NOT NULL COMMENT '변경한 날짜',
  `change_resn` varchar(500) NOT NULL COMMENT '변경이유',
  `reg_id` varchar(100) NOT NULL COMMENT '등록자ID',
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '등록날짜',
  PRIMARY KEY (`role_change_hist_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='역할변경이력';

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 mokjang의 구조를 덤프합니다. role_mapping
CREATE TABLE IF NOT EXISTS `role_mapping` (
  `user_id` varchar(100) NOT NULL COMMENT '사용자id',
  `role_seq` bigint(20) NOT NULL COMMENT '권한seq',
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '등록일시',
  `reg_id` varchar(100) NOT NULL COMMENT '등록한id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='사용자권한매핑';

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 mokjang의 구조를 덤프합니다. study
CREATE TABLE IF NOT EXISTS `study` (
  `study_seq` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '교육seq',
  `user_id` varchar(100) NOT NULL DEFAULT '0' COMMENT '사용자ID',
  `edu_seq` bigint(20) NOT NULL DEFAULT '0' COMMENT '성경공부seq',
  `status` char(1) NOT NULL DEFAULT '0' COMMENT '수료여부',
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '등록일시',
  PRIMARY KEY (`study_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='성경공부';

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 mokjang의 구조를 덤프합니다. user
CREATE TABLE IF NOT EXISTS `user` (
  `user_seq` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '사용자SEQ',
  `user_name` varchar(100) NOT NULL COMMENT '이름',
  `reg_dt` varchar(10) DEFAULT NULL COMMENT '교회등록일(예:YYYYMMDD)',
  `user_id` varchar(50) NOT NULL COMMENT '사용자ID',
  `password` varchar(50) NOT NULL COMMENT '비밀번호',
  `addr` varchar(200) DEFAULT NULL COMMENT '주소',
  `cell_phone` varchar(11) DEFAULT NULL COMMENT '휴대전화번호(''-''제외)',
  `home_phone` varchar(11) DEFAULT NULL COMMENT '집전화번호(''-''제외)',
  `job` varchar(100) DEFAULT NULL COMMENT '직업',
  `gender` char(1) DEFAULT NULL COMMENT '성별(1:남, 2:여자)',
  `birth` varchar(10) DEFAULT NULL COMMENT '생년월일(YYYYMMDD)',
  `email` varchar(100) DEFAULT NULL COMMENT '이메일',
  `dept_seq` bigint(20) DEFAULT NULL COMMENT '소속그룹SEQ',
  `academic` varchar(10) DEFAULT NULL COMMENT '최종학력',
  `major` varchar(20) DEFAULT NULL COMMENT '전공',
  `role_seq` bigint(20) DEFAULT NULL COMMENT '직분',
  `flag` varchar(3) NOT NULL COMMENT '재적상태(0:사용1:재적)',
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '등록시간',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `USER_SEQ` (`user_seq`),
  UNIQUE KEY `USER_ID` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='교인';

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 mokjang의 구조를 덤프합니다. worship
CREATE TABLE IF NOT EXISTS `worship` (
  `worship_seq` int(11) NOT NULL AUTO_INCREMENT COMMENT '예배순번',
  `worship_name` varchar(50) NOT NULL COMMENT '예배이름',
  `worship_day` varchar(100) NOT NULL COMMENT '예배요일',
  `reg_id` varchar(100) NOT NULL COMMENT '등록자ID',
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '등록시간',
  PRIMARY KEY (`worship_seq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='예배';

-- 내보낼 데이터가 선택되어 있지 않습니다.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
