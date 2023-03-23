-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema pruebaCB
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema pruebaCB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `pruebaCB` DEFAULT CHARACTER SET utf8 ;
USE `pruebaCB` ;

-- -----------------------------------------------------
-- Table `pruebaCB`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pruebaCB`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NULL,
  `Apellidos` VARCHAR(70) NULL,
  `Correo` TEXT(45) NULL,
  `Contraseña` TEXT(20) NULL,
  `Nombre_Usuario` TEXT(25) NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pruebaCB`.`Libro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pruebaCB`.`Libro` (
  `idLibro` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(70) NULL,
  `Precio` FLOAT NULL,
  `Editorial` VARCHAR(100) NULL,
  `Autor` VARCHAR(70) NULL,
  `Stock` INT(100) NULL,
  `Edicion` TEXT(50) NULL,
  `Categoria` VARCHAR(60) NULL,
  PRIMARY KEY (`idLibro`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pruebaCB`.`DatosEnvio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pruebaCB`.`DatosEnvio` (
  `idDatosEnvio` INT NOT NULL AUTO_INCREMENT,
  `Direccion` TEXT(150) NULL,
  `Instrucciones` TEXT(200) NULL,
  `Pais` VARCHAR(45) NULL,
  `Estado` VARCHAR(45) NULL,
  `C.P.` INT(15) NULL,
  PRIMARY KEY (`idDatosEnvio`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pruebaCB`.`Pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pruebaCB`.`Pago` (
  `idPago` INT NOT NULL AUTO_INCREMENT,
  `NombreTarjeta` VARCHAR(100) NULL,
  `NumeroTarjeta` INT NULL,
  `FechaVencimiento` TEXT NULL,
  `CVV` INT(3) NULL,
  PRIMARY KEY (`idPago`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pruebaCB`.`Transacciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pruebaCB`.`Transacciones` (
  `idTransacciones` INT NOT NULL AUTO_INCREMENT,
  `FechaCompra` DATE NULL,
  `CantidadLibros` INT NULL,
  PRIMARY KEY (`idTransacciones`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pruebaCB`.`Transacciones_has_Libro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pruebaCB`.`Transacciones_has_Libro` (
  `Transacciones_idTransacciones` INT NOT NULL,
  `Libro_idLibro` INT NOT NULL,
  PRIMARY KEY (`Transacciones_idTransacciones`, `Libro_idLibro`),
  INDEX `fk_Transacciones_has_Libro_Libro1_idx` (`Libro_idLibro` ASC) VISIBLE,
  INDEX `fk_Transacciones_has_Libro_Transacciones_idx` (`Transacciones_idTransacciones` ASC) VISIBLE,
  CONSTRAINT `fk_Transacciones_has_Libro_Transacciones`
    FOREIGN KEY (`Transacciones_idTransacciones`)
    REFERENCES `pruebaCB`.`Transacciones` (`idTransacciones`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Transacciones_has_Libro_Libro1`
    FOREIGN KEY (`Libro_idLibro`)
    REFERENCES `pruebaCB`.`Libro` (`idLibro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
