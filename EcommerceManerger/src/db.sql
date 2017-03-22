CREATE DATABASE IF NOT EXISTS `launchtech`;
USE `launchtech`;


-- Table structure for table ebay customer

DROP TABLE IF EXISTS `e_customer`;
CREATE TABLE `e_customer`(
	id BIGINT NOT NULL auto_increment,
	cust_ebay_id VARCHAR(50) NOT NULL,
	cust_name VARCHAR(50) DEFAULT NULL,
	cust_addr_street VARCHAR(128) NOT NULL,
	cust_addr_city VARCHAR(50) NOT NULL,
	cust_addr_state VARCHAR(16) NOT NULL,
	cust_addre_postcode VARCHAR(10) NOT NULL,
	cust_addr_country VARCHAR(10) NOT NULL,
	cust_mobile VARCHAR(20) DEFAULT NULL,
	cust_phone VARCHAR(20)DEFAULT NULL,
	cust_email VARCHAR(128)DEFAULT NULL,	
	create_date DATE NOT NULL,
	updatetime TIMESTAMP DEFAULT CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
	PRIMARY KEY(id)
)ENGINE=InnoDB auto_increment=15 DEFAULT CHARSET=utf8;