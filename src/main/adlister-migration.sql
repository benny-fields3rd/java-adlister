DROP DATABASE IF EXISTS adlister_db;

CREATE DATABASE IF NOT EXISTS adlister_db;

USE adlister_db;

SHOW DATABASES;

DROP TABLE if exists users;
show tables;

CREATE TABLE users (
   id INT UNSIGNED NOT NULL AUTO_INCREMENT,
   username VARCHAR(100) NOT NULL,
   email VARCHAR(100) NOT NULL,
   password VARCHAR(100) NOT NULL,
   PRIMARY KEY (id)
);

DROP TABLE if exists ads;

CREATE TABLE ads (
   id INT UNSIGNED NOT NULL AUTO_INCREMENT,
   user_id INT UNSIGNED DEFAULT NULL,
   title VARCHAR(100) NOT NULL,
   description TEXT NOT NULL,
   PRIMARY KEY (id),
   FOREIGN KEY (user_id) REFERENCES users (id)
);
SELECT * FROM ads;