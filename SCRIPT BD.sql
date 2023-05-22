USE MASTER 
GO
CREATE DATABASE CREDITOHNER
GO
USE CREDITOHNER
GO

CREATE TABLE PERSONA
 (cedula varchar(16) PRIMARY KEY NOT NULL,
  nombres varchar(50) NOT NULL,
  apellidos varchar(50) NOT NULL,
  telefono int NOT NULL,
  direccion varchar(100) NOT NULL);

CREATE TABLE CLIENTE
 (codCliente int PRIMARY KEY IDENTITY(1,1),
  sobrenombre varchar(50) NULL,
  cedula varchar(16) NOT NULL,
  CONSTRAINT FK_Cliente_Persona FOREIGN KEY(cedula)
    REFERENCES PERSONA(cedula));

CREATE TABLE USUARIO
 (codUsuario int PRIMARY KEY IDENTITY(1,1),
  usuario varchar(50) NULL,
  contraseña VARCHAR(50) NOT NULL,
  cedula varchar(16) NOT NULL,
  CONSTRAINT FK_Usuario_Persona FOREIGN KEY(cedula)
    REFERENCES PERSONA(cedula));

CREATE TABLE PRESTAMO
(codPrestamo int PRIMARY KEY IDENTITY(1,1),
 fecha date not null,
 cicloPagos varchar(50) not null,
 interesMensual float not null,
 montoPrestado float not null,
 plazoMeses int not null,
 estado int not null,
 codCliente int,
 CONSTRAINT FK_Prestamo_Cliente FOREIGN KEY(codCliente)
    REFERENCES Cliente(codCliente))

 CREATE TABLE ABONO
 (codAbono int PRIMARY KEY IDENTITY(1,1),
 fechaAbono date not null,
 cantidadAbono float not null,
 codPrestamo int,
 CONSTRAINT FK_Prestamo_Abono FOREIGN KEY(codPrestamo)
    REFERENCES PRESTAMO(codPrestamo))

 CREATE TABLE GARANTIA
 (codGaratia int PRIMARY KEY IDENTITY(1,1),
 nombreGarantia varchar(60),
 descripcionGarantia varchar(200),
 codPrestamo int,
 CONSTRAINT FK_Prestamo_Garantia FOREIGN KEY(codPrestamo)
    REFERENCES PRESTAMO(codPrestamo))
 


