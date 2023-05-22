CREATE TABLE [PERSONA] (
  [cedula] varchar(16) PRIMARY KEY NOT NULL,
  [nombres] varchar(50) NOT NULL,
  [apellidos] varchar(50) NOT NULL,
  [telefono] int NOT NULL,
  [direccion] varchar(100) NOT NULL
)
GO

CREATE TABLE [CLIENTE] (
  [codCliente] int PRIMARY KEY IDENTITY(1, 1),
  [sobrenombre] varchar(50),
  [telefono] int NOT NULL,
  [cedula] varchar(16) NOT NULL
)
GO

CREATE TABLE [USUARIO] (
  [codUsuario] int PRIMARY KEY IDENTITY(1, 1),
  [USUARIO] varchar(50),
  [CONTRASENA] VARCHAR(50) NOT NULL,
  [cedula] varchar(16) NOT NULL
)
GO

CREATE TABLE [PRESTAMO] (
  [codPrestamo] int PRIMARY KEY IDENTITY(1, 1),
  [fecha] date NOT NULL,
  [cicloPagos] varchar(50) NOT NULL,
  [interesMensual] float NOT NULL,
  [montoPrestado] float NOT NULL,
  [plazoMeses] int NOT NULL,
  [estado] int NOT NULL,
  [codCliente] int
)
GO

CREATE TABLE [ABONO] (
  [codAbono] int PRIMARY KEY IDENTITY(1, 1),
  [fechaAbono] date NOT NULL,
  [cantidadAbono] float NOT NULL,
  [codPrestamo] int
)
GO

CREATE TABLE [GARANTIA] (
  [codGaratia] int PRIMARY KEY IDENTITY(1, 1),
  [nombreGarantia] varchar(60),
  [descripcionGarantia] varchar(200),
  [codPrestamo] int
)
GO

ALTER TABLE [CLIENTE] ADD CONSTRAINT [FK_Cliente_Persona] FOREIGN KEY ([cedula]) REFERENCES [PERSONA] ([cedula])
GO

ALTER TABLE [USUARIO] ADD CONSTRAINT [FK_Usuario_Persona] FOREIGN KEY ([cedula]) REFERENCES [PERSONA] ([cedula])
GO

ALTER TABLE [PRESTAMO] ADD CONSTRAINT [FK_Prestamo_Cliente] FOREIGN KEY ([codCliente]) REFERENCES [CLIENTE] ([codCliente])
GO

ALTER TABLE [ABONO] ADD CONSTRAINT [FK_Prestamo_Abono] FOREIGN KEY ([codPrestamo]) REFERENCES [PRESTAMO] ([codPrestamo])
GO

ALTER TABLE [GARANTIA] ADD CONSTRAINT [FK_Prestamo_Garantia] FOREIGN KEY ([codPrestamo]) REFERENCES [PRESTAMO] ([codPrestamo])
GO
