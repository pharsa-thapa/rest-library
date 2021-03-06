CREATE TABLE AUTHORITY (
    ID BIGINT(20) NOT NULL AUTO_INCREMENT,
   NAME VARCHAR(255),
   PRIMARY KEY (ID)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE AUTHORITY ADD CONSTRAINT AUTHORITY_NAME UNIQUE(NAME);

CREATE TABLE USER (
   ID BIGINT(20) NOT NULL AUTO_INCREMENT,
  PASSWORD VARCHAR(255),
  USER_NAME VARCHAR(255),
  ACCOUNT_EXPIRED BOOLEAN,
  ACCOUNT_LOCKED BOOLEAN,
  CREDENTIALS_EXPIRED BOOLEAN,
  ENABLED BOOLEAN,
  PRIMARY KEY (ID)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE USER ADD CONSTRAINT USER_USER_NAME UNIQUE(USER_NAME);

CREATE TABLE USERS_AUTHORITIES (
   USER_ID BIGINT NOT NULL,
   AUTHORITY_ID BIGINT NOT NULL,
   PRIMARY KEY (USER_ID, AUTHORITY_ID)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE USERS_AUTHORITIES ADD CONSTRAINT USERS_AUTHORITIES_AUTHORITY
   FOREIGN KEY (AUTHORITY_ID) REFERENCES AUTHORITY(ID);

ALTER TABLE USERS_AUTHORITIES ADD CONSTRAINT USERS_AUTHORITIES_USER
   FOREIGN KEY (USER_ID) REFERENCES USER(ID);

