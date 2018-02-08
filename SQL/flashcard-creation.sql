/*******************************************************************************
   Chinook Database - Version 1.4
   Script: Chinook_Oracle.sql
   Description: Creates and populates the Chinook database.
   DB Server: Oracle
   Author: Luis Rocha
   License: http://www.codeplex.com/ChinookDatabase/license
********************************************************************************/

/*******************************************************************************
   Drop database if it exists
********************************************************************************/
DROP USER flashcard CASCADE;


/*******************************************************************************
   Create database
********************************************************************************/
CREATE USER flashcard
IDENTIFIED BY p4ssw0rd
DEFAULT TABLESPACE users
TEMPORARY TABLESPACE temp
QUOTA 10M ON users;

GRANT connect to flashcard;
GRANT resource to flashcard;
GRANT create session TO flashcard;
GRANT create table TO flashcard;
GRANT create view TO flashcard;



conn flashcard/p4ssw0rd


/*******************************************************************************
   Create Tables
********************************************************************************/
CREATE TABLE flashcard
(
    flashcard_id NUMBER PRIMARY KEY,
    question VARCHAR2(200) NOT NULL,
    answer VARCHAR2(500) NOT NULL
);

CREATE TABLE cardset
(
    set_id NUMBER PRIMARY KEY,
    title VARCHAR2(20) NOT NULL,
    subject VARCHAR2(50)
);

CREATE TABLE flashcard_cardset
(
    set_id NUMBER,
    flashcard_id NUMBER,
    CONSTRAINT pk_flashcard_cardset PRIMARY KEY (set_id, flashcard_id),
    FOREIGN KEY (set_id) REFERENCES cardset (set_id),
    FOREIGN KEY (flashcard_id) REFERENCES flashcard (flashcard_id)
);




/*******************************************************************************
   Create Primary Key Unique Indexes
********************************************************************************/

/*******************************************************************************
   Create Foreign Keys
********************************************************************************/
--ALTER TABLE Album ADD CONSTRAINT FK_AlbumArtistId
--    FOREIGN KEY (ArtistId) REFERENCES Artist (ArtistId)  ;


