DROP DATABASE IF EXISTS test_db;
CREATE DATABASE test_db;
USE test_db;

CREATE TABLE IF NOT EXISTS `test_db`.`person` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `ssn` VARCHAR(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

INSERT INTO `employee` (`id`, `first_name`, `last_name`, `email`, `phone`) VALUES
  (10, 'Virat', 'Kohli', 'virat@beingjavaguys.com', '89876787890', 'adsfadfadsfasdfas1'),
  (11, 'Sachin', 'Tendulkar', 'sachin@india.com', '89898989898', 'adsfadfadsfasdfas2'),
  (12, 'Virendra', 'Sehwag', 'viru@delhi.com', '8976778789', 'adsfadfadsfasdfas3');

INSERT INTO `test_db`.`Test` (`name`, `person`) VALUES ('alex', 'cool');
