USE master
GO

CREATE DATABASE VarJuliesk_BD
GO

USE VarJuliesk_BD
GO

--Tabla Productos ---------------------------------------------------------------------------
CREATE TABLE [Productos] (
  [idProducto] INT PRIMARY KEY IDENTITY(1,1),
  [nombreProducto] VARCHAR(30),
  [precioCompra] INT,
  [precioVenta] INT,
  [descripcion] VARCHAR(50),
  [marca] VARCHAR(30),
  [talla] VARCHAR(5),
  [cantidadDisponible] INT,
  [idCategoria] INT
)
GO

--Tabla Proveedores ---------------------------------------------------------------------------
CREATE TABLE [Proveedores] (
  [idProveedor] INT PRIMARY KEY IDENTITY(1,1),
  [nombre] VARCHAR(30),
  [apellido] VARCHAR(30),
  [nombreEmpresa] VARCHAR(50),
  [telefono] VARCHAR(8)
)
GO

--Tabla Categorias ---------------------------------------------------------------------------
CREATE TABLE [Categorias] (
  [idCategoria] INT PRIMARY KEY IDENTITY(1,1),
  [descripcion] VARCHAR(50),
  [nombre] VARCHAR(30)
)
GO

--Tabla Empleados ---------------------------------------------------------------------------
CREATE TABLE [Empleados] (
  [idEmpleado] INT PRIMARY KEY IDENTITY(1,1),
  [nombre] VARCHAR(30),
  [apellido] VARCHAR(30),
  [cargo] VARCHAR(30),
  [telefono] VARCHAR(8)
)
GO

--Tabla Ventas ---------------------------------------------------------------------------
CREATE TABLE [Ventas] (
  [idVenta] INT PRIMARY KEY IDENTITY(1,1),
  [fecha] DATE,
  [idEmpleado] INT
)
GO

--Tabla DetalleProductosVentas ---------------------------------------------------------------------------
CREATE TABLE [DetalleProductosVentas] (
  [idDetallePV] INT PRIMARY KEY IDENTITY(1,1),
  [idVenta] INT,
  [idProducto] INT,
  [cantidadProductos] INT
)
GO

--Tabla DetalleProveedorProducto ---------------------------------------------------------------------------
CREATE TABLE [DetalleProveedorProducto] (
  [idDetallePP] INT PRIMARY KEY IDENTITY(1,1),
  [idProveedor] INT,
  [idProducto] INT
)
GO

--Relaciones ---------------------------------------------------------------------------
ALTER TABLE [DetalleProductosVentas]
ADD CONSTRAINT FK_DetalleProductosVentas_Ventas
FOREIGN KEY ([idVenta]) 
REFERENCES [Ventas] ([idVenta])
GO

ALTER TABLE [DetalleProductosVentas] 
ADD CONSTRAINT FK_DetalleProductosVentas_Productos
FOREIGN KEY ([idProducto]) 
REFERENCES [Productos] ([idProducto])
GO

ALTER TABLE [Ventas] 
ADD CONSTRAINT FK_Ventas_Empleados
FOREIGN KEY ([idEmpleado]) 
REFERENCES [Empleados] ([idEmpleado])
GO

ALTER TABLE [Productos] 
ADD CONSTRAINT FK_Productos_Categorias
FOREIGN KEY ([idCategoria]) 
REFERENCES [Categorias] ([idCategoria])
GO

ALTER TABLE [DetalleProveedorProducto] 
ADD CONSTRAINT FK_DetalleProveedorProducto_Productos
FOREIGN KEY ([idProducto]) 
REFERENCES [Productos] ([idProducto])
GO

ALTER TABLE [DetalleProveedorProducto] 
ADD CONSTRAINT FK_DetalleProveedorProducto_Proveedores
FOREIGN KEY ([idProveedor]) 
REFERENCES [Proveedores] ([idProveedor])
GO

--Procedimiento para insertar en la tabla Productos:

CREATE PROCEDURE InsertarProductos
  @nombreProducto VARCHAR,
  @precioCompra INT,
  @precioVenta INT,
  @descripcion VARCHAR(50),
  @marca VARCHAR(30),
  @talla VARCHAR(5),
  @cantidadDisponible INT,
  @idCategoria INT
AS
BEGIN
  INSERT INTO [Productos] (nombreProducto, precioCompra, precioVenta, descripcion, marca, talla, cantidadDisponible, idCategoria)
  VALUES (@nombreProducto,@precioCompra, @precioVenta, @descripcion, @marca, @talla, @cantidadDisponible, @idCategoria)
END
GO

EXEC InsertarProductos 'Pañales', 150, 200, 'Pañales extra grandes', 'BabyCrece', 'L', '50', 1
GO



select * from Productos
--Procedimiento para insertar en la tabla Proveedores:

CREATE PROCEDURE InsertarProveedor
  @nombre VARCHAR(30),
  @apellido VARCHAR(30),
  @nombreEmpresa VARCHAR(50),
  @telefono VARCHAR(8)
AS
BEGIN
  INSERT INTO [Proveedores] (nombre, apellido, nombreEmpresa, telefono)
  VALUES (@nombre, @apellido, @nombreEmpresa, @telefono)
END
GO
SELECT * FROM Proveedores

EXEC InsertarProveedor 'Franchezco', 'Virgolini', 'BabyDoll','22800756'
GO

SELECT * FROM Proveedores
GO


--Procedimiento para insertar en la tabla Categorias:

CREATE PROCEDURE InsertarCategoria
  @descripcion VARCHAR(50),
  @nombre VARCHAR(30)
AS
BEGIN
  INSERT INTO [Categorias] (descripcion, nombre)
  VALUES (@descripcion, @nombre)
END
GO

EXEC InsertarCategoria 'Ropa para niños y niñas', 'Ropa'

SELECT * FROM Categorias
GO



--Procedimiento para insertar en la tabla Empleados:

CREATE PROCEDURE InsertarEmpleado
  @nombre VARCHAR(30),
  @apellido VARCHAR(30),
  @cargo VARCHAR(30),
  @telefono VARCHAR(8)
AS
BEGIN
  INSERT INTO [Empleados] (nombre, apellido, cargo, telefono)
  VALUES (@nombre, @apellido, @cargo, @telefono)
END
GO

EXEC InsertarEmpleado 'Fernando', 'Lumbí', 'Administrador', '74185265'
EXEC InsertarEmpleado 'Julio', 'Olivas', 'Empleado', '45693658'

SELECT * FROM Empleados
GO


--Procedimiento para insertar en la tabla Ventas:

CREATE PROCEDURE InsertarVenta
  @fecha DATE,
  @idEmpleado INT
AS
BEGIN
  INSERT INTO [Ventas] (fecha, idEmpleado)
  VALUES (@fecha, @idEmpleado)
END
GO

EXEC InsertarVenta '2003-12-20', 1
EXEC InsertarVenta '2002-10-15', 1

SELECT * FROM Ventas
GO


--Procedimiento para insertar en la tabla DetalleProductosVentas:

CREATE PROCEDURE InsertarDetalleProductosVentas
  @idVenta INT,
  @idProducto INT,
  @cantidadProductos INT
AS
BEGIN
  INSERT INTO [DetalleProductosVentas] (idVenta, idProducto, cantidadProductos)
  VALUES (@idVenta, @idProducto, @cantidadProductos)
END
GO

EXEC InsertarDetalleProductosVentas 1, 9, 20
EXEC InsertarDetalleProductosVentas 1, 10, 15


--Procedimiento para insertar en la tabla DetalleProveedorProducto:

CREATE PROCEDURE InsertarDetalleProveedorProducto
  @idProveedor INT,
  @idProducto INT
AS
BEGIN
  INSERT INTO [DetalleProveedorProducto] (idProveedor, idProducto)
  VALUES (@idProveedor, @idProducto)
END


EXEC InsertarDetalleProveedorProducto 1, 2
EXEC InsertarDetalleProveedorProducto 2, 3

SELECT * FROM DetalleProveedorProducto

--Procedemientos de Actualizaciones-------------------------------------------------------------------------------------

--Procedimiento para actualizar la tabla Productos:

CREATE PROCEDURE ActualizarProductos
  @idProducto INT,
  @nombreProducto VARCHAR,
  @precioCompra INT,
  @precioVenta INT,
  @descripcion VARCHAR(50),
  @marca VARCHAR(30),
  @talla VARCHAR(5),
  @cantidadDisponible INT,
  @idCategoria INT
AS
BEGIN
  UPDATE [Productos]
  SET nombreProducto = @nombreProducto,
	  precioCompra = @precioCompra,
      precioVenta = @precioVenta,
      descripcion = @descripcion,
      marca = @marca,
      talla = @talla,
      cantidadDisponible = @cantidadDisponible,
      idCategoria = @idCategoria
  WHERE idProducto = @idProducto
END
GO

EXEC ActualizarProductos 2, 'Camiseta', 100, 150, 'Camiseta para bebes de 3 meses', 'Adidas', 'S', 11, 1


--Procedimiento para actualizar la tabla Proveedores:

CREATE PROCEDURE ActualizarProveedor
  @idProveedor INT,
  @nombre VARCHAR(30),
  @apellido VARCHAR(30),
  @nombreEmpresa VARCHAR(50),
  @telefono VARCHAR(8)
AS
BEGIN
  UPDATE [Proveedores]
  SET nombre = @nombre,
      apellido = @apellido,
      nombreEmpresa = @nombreEmpresa,
      telefono = @telefono
  WHERE idProveedor = @idProveedor
END
GO

EXEC ActualizarProveedor 1, 'Marco Antonio', 'Solis', 'BabyBuki', '57055922'

SELECT * FROM Proveedores
--Procedimiento para actualizar la tabla Categorias:

CREATE PROCEDURE ActualizarCategoria
  @idCategoria INT,
  @descripcion VARCHAR(50),
  @nombre VARCHAR(30)
AS
BEGIN
  UPDATE [Categorias]
  SET descripcion = @descripcion,
      nombre = @nombre
  WHERE idCategoria = @idCategoria
END
GO

EXEC ActualizarCategoria 1, 'Ropa para bebés de 3 meses', 'Ropa' 

SELECT * FROM Categorias

--Procedimiento para actualizar la tabla Empleados:

CREATE PROCEDURE ActualizarEmpleado
  @idEmpleado INT,
  @nombre VARCHAR(30),
  @apellido VARCHAR(30),
  @cargo VARCHAR(30),
  @telefono VARCHAR(8)
AS
BEGIN
  UPDATE [Empleados]
  SET nombre = @nombre,
      apellido = @apellido,
      cargo = @cargo,
      telefono = @telefono
  WHERE idEmpleado = @idEmpleado
END
GO

EXEC ActualizarEmpleado 1, 'Fer', 'Lumbi', 'Admin.', '55660915'

SELECT * FROM Empleados


--Procedimiento para actualizar la tabla Ventas:

CREATE PROCEDURE ActualizarVenta
  @idVenta INT,
  @fecha DATE,
  @idEmpleado INT
AS
BEGIN
  UPDATE [Ventas]
  SET fecha = @fecha,
      idEmpleado = @idEmpleado
  WHERE idVenta = @idVenta
END
GO

EXEC ActualizarVenta 1, '2023-07-05', 1

SELECT * FROM Ventas

--Procedimiento para actualizar la tabla DetalleProductosVentas:

CREATE PROCEDURE ActualizarDetalleProductosVentas
  @idDetallePV INT,
  @idVenta INT,
  @idProducto INT,
  @cantidadProductos INT
AS
BEGIN
  UPDATE [DetalleProductosVentas]
  SET idVenta = @idVenta,
      idProducto = @idProducto,
      cantidadProductos = @cantidadProductos
  WHERE idDetallePV = @idDetallePV
END
GO

EXEC ActualizarDetalleProductosVentas 4, 1, 2, 15
EXEC ActualizarDetalleProductosVentas 4, 1, 2, 30

SELECT * FROM DetalleProductosVentas
SELECT * FROM Ventas
SELECT * FROM Productos

--Procedimiento para actualizar la tabla DetalleProveedorProducto:

CREATE PROCEDURE ActualizarDetalleProveedorProducto
  @idDetallePP INT,
  @idProveedor INT,
  @idProducto INT
AS
BEGIN
  UPDATE [DetalleProveedorProducto]
  SET idProveedor = @idProveedor,
      idProducto = @idProducto
  WHERE idDetallePP = @idDetallePP
END
GO

EXEC ActualizarDetalleProveedorProducto 1, 2,3

SELECT * FROM DetalleProveedorProducto

--------------PROCEDIMIENTO ALMACENADO PARA MOSTRAR DATOS----------------------------------------------------------------------


CREATE PROCEDURE MostrarProductos
AS
BEGIN
  SELECT *
  FROM [Productos]
END
GO

EXEC MostrarProductos

------------------------------------------------------------------------------------------------------------------------------------------------------------------

CREATE PROCEDURE MostrarProveedores
AS
BEGIN
  SELECT *
  FROM [Proveedores]
END
GO

EXEC MostrarProveedores

------------------------------------------------------------------------------------------------------------------------------------------------------------------

CREATE PROCEDURE MostrarCategorias
AS
BEGIN
  SELECT *
  FROM [Categorias]
END
GO
--Ejecutando Insertar categoria.
EXEC InsertarCategoria @descripcion = 'Prueba 1',
					   @nombre = 'Addida';
					   go

--PROCEDIMINETO PARA LLENAR COMBOBOX CATEGORIA
CREATE PROCEDURE LlenarCategoria
AS
  SELECT idCategoria,nombre FROM Categorias
GO

EXEC MostrarCategorias

----------------------------
--------------------------------------------------------------------------------------------------------------------------------------
CREATE PROCEDURE MostrarEmpleados
AS
BEGIN
  SELECT *
  FROM [Empleados]
END
GO

EXEC MostrarEmpleados

------------------------------------------------------------------------------------------------------------------------------------------------------------------

CREATE PROCEDURE MostrarVentas
AS
BEGIN
  SELECT *
  FROM [Ventas]
END
GO

EXEC MostrarVentas

------------------------------------------------------------------------------------------------------------------------------------------------------------------

CREATE PROCEDURE MostrarDetalleProductosVentas
AS
BEGIN
  SELECT *
  FROM [DetalleProductosVentas]
END
GO

EXEC MostrarDetalleProductosVentas

------------------------------------------------------------------------------------------------------------------------------------------------------------------

CREATE PROCEDURE MostrarDetalleProveedorProducto
AS
BEGIN
  SELECT *
  FROM [DetalleProveedorProducto]
END
GO

EXEC MostrarDetalleProveedorProducto


------------------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------PROCEDIMIENTO ALMACENADO PARA BUSCAR DATOS--------------------------------------------------------------------------------------
CREATE PROCEDURE BuscarProductoPorNombre
  @nombreProducto VARCHAR(30)
AS
BEGIN
  SELECT *
  FROM [Productos]
  WHERE [nombreProducto] = @nombreProducto
END
GO



------------------------------------------------------------------------------------------------------------------------------------------------------------------

CREATE PROCEDURE BuscarProveedorPorNombre
  @nombreProveedor VARCHAR(30)
AS
BEGIN
  SELECT *
  FROM [Proveedores]
  WHERE [nombre] LIKE '%' + @nombreProveedor + '%'
END
GO


------------------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE PROCEDURE BuscarCategoriaPorDescripcion
  @descripcionCategoria VARCHAR(50)
AS
BEGIN
  SELECT *
  FROM [Categorias]
  WHERE [descripcion] LIKE '%' + @descripcionCategoria + '%'
END
GO



------------------------------------------------------------------------------------------------------------------------------------------------------------------

CREATE PROCEDURE BuscarEmpleadoPorApellido
  @apellidoEmpleado VARCHAR(30)
AS
BEGIN
  SELECT *
  FROM [Empleados]
  WHERE [apellido] LIKE '%' + @apellidoEmpleado + '%'
END
GO


------------------------------------------------------------------------------------------------------------------------------------------------------------------

CREATE PROCEDURE BuscarVentaPorFecha
  @fechaVenta DATE
AS
BEGIN
  SELECT *
  FROM [Ventas]
  WHERE [fecha] = @fechaVenta
END
GO



------------------------------------------------------------------------------------------------------------------------------------------------------------------

CREATE PROCEDURE BuscarDetalleVentaPorIDVenta
  @idVenta INT
AS
BEGIN
  SELECT *
  FROM [DetalleProductosVentas]
  WHERE [idVenta] = @idVenta
END
GO



------------------------------------------------------------------------------------------------------------------------------------------------------------------

CREATE PROCEDURE BuscarDetalleProveedorProductoPorIDProveedor
  @idProveedor INT
AS
BEGIN
  SELECT *
  FROM [DetalleProveedorProducto]
  WHERE [idProveedor] = @idProveedor
END
GO


------------------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------PROCEDIMIENTO ALMACENADO PARA ELIMINAR DATOS------------------------------------------------------------------------------------------------

CREATE PROCEDURE EliminarProductoPorID
  @idProducto INT
AS
BEGIN
  DELETE FROM [Productos]
  WHERE [idProducto] = @idProducto
END
GO

EXEC EliminarProductoPorID 5
SELECT * FROM Productos

------------------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE PROCEDURE EliminarProveedorPorID
  @idProveedor INT
AS
BEGIN
  DELETE FROM [Proveedores]
  WHERE [idProveedor] = @idProveedor
END
GO

EXEC EliminarProveedorPorID 4
SELECT * FROM Proveedores

------------------------------------------------------------------------------------------------------------------------------------------------------------------

CREATE PROCEDURE EliminarCategoriaPorID
  @idCategoria INT
AS
BEGIN
  DELETE FROM [Categorias]
  WHERE [idCategoria] = @idCategoria
END
GO

EXEC EliminarCategoriaPorID 2
SELECT * FROM Categorias 

------------------------------------------------------------------------------------------------------------------------------------------------------------------


CREATE PROCEDURE EliminarEmpleadoPorID
  @idEmpleado INT
AS
BEGIN
  DELETE FROM [Empleados]
  WHERE [idEmpleado] = @idEmpleado
END
GO

EXEC EliminarEmpleadoPorID 2
SELECT * FROM Empleados


------------------------------------------------------------------------------------------------------------------------------------------------------------------

CREATE PROCEDURE EliminarVentaPorID
  @idVenta INT
AS
BEGIN
  DELETE FROM [Ventas]
  WHERE [idVenta] = @idVenta
END
GO

EXEC EliminarDetalleVentaPorID 4
EXEC EliminarDetalleVentaPorID 7
SELECT * FROM Ventas

------------------------------------------------------------------------------------------------------------------------------------------------------------------

CREATE PROCEDURE EliminarDetalleVentaPorID
  @idDetallePV INT
AS
BEGIN
  DELETE FROM [DetalleProductosVentas]
  WHERE [idDetallePV] = @idDetallePV
END
GO

EXEC EliminarDetalleVentaPorID 5
SELECT * FROM DetalleProductosVentas


------------------------------------------------------------------------------------------------------------------------------------------------------------------

CREATE PROCEDURE EliminarDetalleProveedorProductoPorID
  @idDetallePP INT
AS
BEGIN
  DELETE FROM [DetalleProveedorProducto]
  WHERE [idDetallePP] = @idDetallePP
END
GO

EXEC EliminarDetalleProveedorProductoPorID 2
SELECT * FROM DetalleProveedorProducto



USE VarJuliesk_BD
GO

SELECT * FROM Productos
GO

select *
from Proveedores



CREATE PROCEDURE buscarProductos
    @Dato NVARCHAR(50)
AS
BEGIN
    SELECT *
    FROM Productos
    WHERE nombreProducto LIKE '%' + RTRIM(@Dato) + '%'
        OR descripcion LIKE '%' + RTRIM(@Dato) + '%'
        OR marca LIKE '%' + RTRIM(@Dato) + '%'
        OR talla LIKE '%' + RTRIM(@Dato) + '%'
END

GO



CREATE PROCEDURE buscarProveedores
    @Dato NVARCHAR(50)
AS
BEGIN
    SELECT Proveedor.IDProveedor, nombre1, nombre2, apellido1, apellido2, telefono, Proveedor.empresa_proveedor, direccion
    FROM Proveedor
    INNER JOIN Persona ON Proveedor.IDProveedor = Persona.IDPersona
    WHERE nombre1 LIKE '%' + RTRIM(@Dato) + '%'
        OR nombre2 LIKE '%' + RTRIM(@Dato) + '%'
        OR apellido1 LIKE '%' + RTRIM(@Dato) + '%'
        OR apellido2 LIKE '%' + RTRIM(@Dato) + '%'
        OR telefono LIKE '%' + RTRIM(@Dato) + '%'
END

GO



CREATE PROCEDURE buscarCategorias
    @Dato NVARCHAR(50)
AS
BEGIN
    SELECT *
    FROM Categorias
    WHERE descripcion LIKE '%' + RTRIM(@Dato) + '%'
        OR nombre LIKE '%' + RTRIM(@Dato) + '%'
END

GO



CREATE PROCEDURE buscarEmpleados
    @Dato NVARCHAR(50)
AS
BEGIN
    SELECT *
    FROM Empleados
    WHERE nombre LIKE '%' + RTRIM(@Dato) + '%'
        OR apellido LIKE '%' + RTRIM(@Dato) + '%'
        OR cargo LIKE '%' + RTRIM(@Dato) + '%'
        OR telefono LIKE '%' + RTRIM(@Dato) + '%'
END

GO


CREATE PROCEDURE buscarVentas
    @FechaDesde DATE,
    @FechaHasta DATE
AS
BEGIN
    SELECT *
    FROM Ventas
    WHERE fecha >= @FechaDesde
        AND fecha <= @FechaHasta
END

GO



CREATE PROCEDURE buscarDetalleProductosVentas
    @idVenta INT
AS
BEGIN
    SELECT dpv.idDetallePV, dpv.idVenta, dpv.idProducto, dpv.cantidadProductos
    FROM DetalleProductosVentas dpv
    WHERE dpv.idVenta = @idVenta
END

GO



CREATE PROCEDURE buscarDetalleProveedorProducto
    @idProveedor INT
AS
BEGIN
    SELECT dpp.idDetallePP, dpp.idProveedor, dpp.idProducto
    FROM DetalleProveedorProducto dpp
    WHERE dpp.idProveedor = @idProveedor
END

GO



--Vistas Básicas---------------------------------------------------------

CREATE VIEW vista_productos AS
SELECT idProducto, nombreProducto, precioCompra, precioVenta, descripcion, marca, talla, cantidadDisponible, idCategoria
FROM Productos;
GO

CREATE VIEW vista_proveedores AS
SELECT idProveedor, nombre, apellido, nombreEmpresa, telefono
FROM Proveedores;
GO

CREATE VIEW vista_empleados AS
SELECT idEmpleado, nombre, apellido, cargo, telefono
FROM Empleados};
GO

CREATE VIEW vista_ventas AS
SELECT idVenta, fecha, idEmpleado
FROM Ventas;
GO



--Vistas con filtro-----------------------------------------------------

CREATE VIEW vista_productos AS
SELECT idProducto, nombreProducto, precioCompra, precioVenta, descripcion, marca, talla, cantidadDisponible, idCategoria
FROM Productos
WHERE precioVenta > 100 AND cantidadDisponible > 0
GO

CREATE VIEW vista_proveedores AS
SELECT idProveedor, nombre, apellido, nombreEmpresa, telefono
FROM Proveedores
WHERE apellido = 'De las Nieves'
GO

CREATE VIEW vista_empleados AS
SELECT idEmpleado, nombre, apellido, cargo, telefono
FROM Empleados
WHERE cargo = 'Admin'
GO

CREATE VIEW vistaVentasFiltradas AS
SELECT idVenta, fecha, idEmpleado
FROM Ventas
WHERE fecha >= '2003-12-20'
GO



-- Vista con unión-------------------------------------------------------
CREATE VIEW vistaProductosCategorias AS
SELECT P.idProducto, P.nombreProducto, P.precioCompra, P.precioVenta, P.descripcion, P.marca, P.talla, P.cantidadDisponible, C.nombre AS nombreCategoria
FROM Productos P
INNER JOIN Categorias C ON P.idCategoria = C.idCategoria
GO

CREATE VIEW vistaProveedoresProductos AS
SELECT P.idProveedor, P.nombre, P.apellido, P.nombreEmpresa, P.telefono, PR.idProducto
FROM Proveedores P
LEFT JOIN Productos PR ON P.idProveedor = PR.idProveedor
GO

CREATE VIEW vistaEmpleadosVentas AS
SELECT E.idEmpleado, E.nombre, E.apellido, E.cargo, E.telefono, V.idVenta
FROM Empleados E
LEFT JOIN Ventas V ON E.idEmpleado = V.idEmpleado
GO

CREATE VIEW vistaVentasEmpleados AS
SELECT V.idVenta, V.fecha, V.idEmpleado, E.nombre, E.apellido
FROM Ventas V
INNER JOIN Empleados E ON V.idEmpleado = E.idEmpleado
GO


-- Vista con cálculos---------------------------------------------------
CREATE VIEW vistaCalculosProductos AS
SELECT idProducto, nombreProducto, precioCompra, precioVenta, descripcion, marca, talla, cantidadDisponible, idCategoria,
       (precioVenta - precioCompra) AS ganancia,
       (cantidadDisponible * (precioVenta - precioCompra)) AS valorInventario
FROM Productos
GO

CREATE VIEW vistaCalculosProveedores AS
SELECT idProveedor, nombre, apellido, nombreEmpresa, telefono,
       CONCAT(nombre, ' ', apellido) AS nombreCompleto,
       LEN(nombre) + LEN(apellido) AS longitudNombre,
       CASE WHEN LEN(nombreEmpresa) > 10 THEN 'Larga' ELSE 'Corta' END AS longitudEmpresa
FROM Proveedores
GO

CREATE VIEW vistaCalculosEmpleados AS
SELECT idEmpleado, nombre, apellido, cargo, telefono,
       CONCAT(nombre, ' ', apellido) AS nombreCompleto,
       LEN(nombre) + LEN(apellido) AS longitudNombre,
       CASE WHEN LEN(cargo) > 10 THEN 'Largo' ELSE 'Corto' END AS longitudCargo
FROM Empleados
GO

CREATE VIEW vistaCalculosVentas AS
SELECT idVenta, fecha, idEmpleado,
       YEAR(fecha) AS anioVenta,
       MONTH(fecha) AS mesVenta,
       DAY(fecha) AS diaVenta
FROM Ventas
GO





CREATE PROCEDURE ConsultarProductos
AS
BEGIN
    SELECT *
    FROM Productos
END

EXEC ConsultarProductos