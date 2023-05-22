
IF OBJECT_ID('CrearCliente') IS NOT NULL
BEGIN 
DROP PROC CrearCliente
END
GO

CREATE PROCEDURE CrearCliente
	   @Cedula varchar(16),
	   @Nombres varchar(50),
	   @Apellidos	varchar(50),
	   @Telefono int,
	   @Direccion varchar(100),
	   @Sobrenombre varchar(50)	 
AS
BEGIN
INSERT INTO PERSONA(cedula, nombres, apellidos, telefono, direccion)
VALUES (@Cedula, @Nombres, @Apellidos, @Telefono, @Direccion)
INSERT INTO CLIENTE(sobrenombre, cedula)
    VALUES ( @Sobrenombre, @Cedula)

 
END