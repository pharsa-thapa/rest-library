CREATE TABLE DEPARTMENT (
  ID BIGINT(20) NOT NULL AUTO_INCREMENT,
  NAME VARCHAR(255),
  COMPANY_ID BIGINT,
  PRIMARY KEY (ID)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE DEPARTMENT ADD CONSTRAINT DEPARTMENT_COMPANY FOREIGN KEY (COMPANY_ID) REFERENCES COMPANY(ID);