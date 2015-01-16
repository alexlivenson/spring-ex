DROP DATABASE IF EXISTS test_db;
CREATE DATABASE test_db;
USE test_db;

CREATE TABLE `test_db`.`Test` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `person` VARCHAR(45) NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `test_db`.`person` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `test_db`.`Test` (`name`, `person`) VALUES ('alex', 'cool');
