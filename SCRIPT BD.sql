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
  telefono varchar(9),
  direccion varchar(100) NOT NULL);

CREATE TABLE CLIENTE
 (cedula varchar(16) NOT NULL PRIMARY KEY,
  sobrenombre varchar(50) NULL,
  CONSTRAINT FK_Cliente_Persona FOREIGN KEY(cedula)
    REFERENCES PERSONA(cedula));

CREATE TABLE USUARIO
 (cedula varchar(16) NOT NULL PRIMARY KEY,
  usuario varchar(50) NULL,
  contraseña VARCHAR(50) NOT NULL,
  CONSTRAINT FK_Usuario_Persona FOREIGN KEY(cedula)
    REFERENCES PERSONA(cedula));

CREATE TABLE CREDITO
(codPrestamo int PRIMARY KEY IDENTITY(1,1),
 fecha date not null,
 cicloPagos varchar(50) not null,
 interesMensual float not null,
 montoPrestado float not null,
 estado int not null,
 moneda varchar(16) not null,
 cantidadPagos int not null,
 cedula varchar(16) not null,
 CONSTRAINT FK_Prestamo_Cliente FOREIGN KEY(cedula)
    REFERENCES Cliente(cedula))

 CREATE TABLE ABONO
 (codAbono int PRIMARY KEY IDENTITY(1,1),
 fechaAbono date not null,
 cantidadAbono float not null,
 codPrestamo int not null,
 CONSTRAINT FK_Prestamo_Abono FOREIGN KEY(codPrestamo)
    REFERENCES CREDITO(codPrestamo))

 CREATE TABLE GARANTIA
 (codGarantia int PRIMARY KEY IDENTITY(1,1),
 nombreGarantia varchar(60) not null,
 descripcionGarantia varchar(200) null,
 estadoPrenda varchar(15)
)
 
 CREATE TABLE CREDITOGARANTIA
 (codCreditoGarantia int PRIMARY KEY IDENTITY(1,1),
 codGarantia int NOT NULL,
 codCredito int not null,
 CONSTRAINT FK_Credito_Garantia FOREIGN KEY(codCredito)
    REFERENCES CREDITO(codPrestamo),
CONSTRAINT FK_Garantia_Credito FOREIGN KEY(codGarantia)
    REFERENCES GARANTIA(codGarantia)
 )

