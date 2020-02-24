CREATE TABLE COMPANY (
  ID BIGINT(20) NOT NULL AUTO_INCREMENT,
  NAME VARCHAR(255),
  PRIMARY KEY (ID),
  UNIQUE KEY COMPANY_NAME (NAME)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;