-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema ecommerce_aurum_designers
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ecommerce_aurum_designers
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ecommerce_aurum_designers` DEFAULT CHARACTER SET utf8 ;
USE `ecommerce_aurum_designers` ;

-- -----------------------------------------------------
-- Table `ecommerce_aurum_designers`.`privileges`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecommerce_aurum_designers`.`privileges` (
  `id_privilege` BIGINT NOT NULL AUTO_INCREMENT,
  `privilege_name` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id_privilege`),
  UNIQUE INDEX `privilege_name_UNIQUE` (`privilege_name` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ecommerce_aurum_designers`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecommerce_aurum_designers`.`users` (
  `id_user` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(150) NOT NULL,
  `email` VARCHAR(254) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `phone` VARCHAR(20) NULL,
  `address` TEXT NULL,
  PRIMARY KEY (`id_user`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ecommerce_aurum_designers`.`user_has_privilege`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecommerce_aurum_designers`.`user_has_privilege` (
  `id_privilege` BIGINT NOT NULL,
  `id_user` BIGINT NOT NULL,
  PRIMARY KEY (`id_privilege`, `id_user`),
  INDEX `fk_privileges_has_users_users1_idx` (`id_user` ASC) VISIBLE,
  INDEX `fk_privileges_has_users_privileges_idx` (`id_privilege` ASC) VISIBLE,
  CONSTRAINT `fk_privileges_has_users_privileges`
    FOREIGN KEY (`id_privilege`)
    REFERENCES `ecommerce_aurum_designers`.`privileges` (`id_privilege`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_privileges_has_users_users1`
    FOREIGN KEY (`id_user`)
    REFERENCES `ecommerce_aurum_designers`.`users` (`id_user`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ecommerce_aurum_designers`.`categories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecommerce_aurum_designers`.`categories` (
  `id_category` BIGINT NOT NULL AUTO_INCREMENT,
  `category_name` VARCHAR(100) NULL,
  PRIMARY KEY (`id_category`),
  UNIQUE INDEX `category_name_UNIQUE` (`category_name` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ecommerce_aurum_designers`.`stones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecommerce_aurum_designers`.`stones` (
  `id_stone` BIGINT NOT NULL AUTO_INCREMENT,
  `stone_name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id_stone`),
  UNIQUE INDEX `stone_name_UNIQUE` (`stone_name` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ecommerce_aurum_designers`.`jewelry_pieces`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecommerce_aurum_designers`.`jewelry_pieces` (
  `id_jewelry` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `description` TEXT NULL,
  `price` DECIMAL(10,2) NOT NULL,
  `material` VARCHAR(50) NOT NULL,
  `image_url` TEXT NOT NULL,
  `stock` INT NOT NULL DEFAULT 0,
  `id_category` BIGINT NOT NULL,
  `id_stone` BIGINT NOT NULL,
  PRIMARY KEY (`id_jewelry`),
  INDEX `fk_jewelry_pieces_categories1_idx` (`id_category` ASC) VISIBLE,
  INDEX `fk_jewelry_pieces_stones1_idx` (`id_stone` ASC) VISIBLE,
  CONSTRAINT `fk_jewelry_pieces_categories1`
    FOREIGN KEY (`id_category`)
    REFERENCES `ecommerce_aurum_designers`.`categories` (`id_category`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_jewelry_pieces_stones1`
    FOREIGN KEY (`id_stone`)
    REFERENCES `ecommerce_aurum_designers`.`stones` (`id_stone`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ecommerce_aurum_designers`.`orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecommerce_aurum_designers`.`orders` (
  `id_order` BIGINT NOT NULL AUTO_INCREMENT,
  `order_date` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `total_amount` DECIMAL(10,2) NOT NULL,
  `id_user` BIGINT NOT NULL,
  PRIMARY KEY (`id_order`),
  INDEX `fk_orders_users1_idx` (`id_user` ASC) VISIBLE,
  CONSTRAINT `fk_orders_users1`
    FOREIGN KEY (`id_user`)
    REFERENCES `ecommerce_aurum_designers`.`users` (`id_user`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ecommerce_aurum_designers`.`order_has_jewelry`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecommerce_aurum_designers`.`order_has_jewelry` (
  `id_jewelry` BIGINT NOT NULL,
  `id_order` BIGINT NOT NULL,
  `quantity` INT NOT NULL,
  INDEX `fk_jewelry_pieces_has_orders_orders1_idx` (`id_order` ASC) VISIBLE,
  INDEX `fk_jewelry_pieces_has_orders_jewelry_pieces1_idx` (`id_jewelry` ASC) VISIBLE,
  CONSTRAINT `fk_jewelry_pieces_has_orders_jewelry_pieces1`
    FOREIGN KEY (`id_jewelry`)
    REFERENCES `ecommerce_aurum_designers`.`jewelry_pieces` (`id_jewelry`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_jewelry_pieces_has_orders_o`
    FOREIGN KEY (`id_order`)
    REFERENCES `ecommerce_aurum_designers`.`orders` (`id_order`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
