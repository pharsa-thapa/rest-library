CREATE TABLE ADDRESS (
  ID BIGINT(20) NOT NULL AUTO_INCREMENT,
  HOUSE_NUMBER VARCHAR(255),
  STREET VARCHAR(255),
  ZIP_CODE VARCHAR(255),
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;