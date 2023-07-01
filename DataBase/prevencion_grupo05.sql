CREATE DATABASE prevencion;
USE prevencion;

-- Tabla "Usuarios"
CREATE TABLE usuario (
 id INT PRIMARY KEY AUTO_INCREMENT,
 nombre VARCHAR(50) NOT NULL,
 username varchar(100) not null,
 password varchar(500) not null
);

CREATE TABLE administrativo (
  id int primary key AUTO_INCREMENT,
  run varchar(11) not null,
  nombre VARCHAR(50) not null,
  apellido varchar(50) not null,
  correo varchar(100) not null,
  area varchar(100),
  usuario_id int,
  FOREIGN key (usuario_id) REFERENCES usuario(id)
);

create table cliente (
  id int primary key AUTO_INCREMENT,
  rut varchar(11) not null,
  nombre VARCHAR(50) not null,
  apellido varchar(50) not null,
  correo varchar(100) not null,
  telefono varchar(20) not null,
  afp varchar(50),
  sistema_salud enum('isapre', 'fonasa'),
  direccion varchar(100),
  comuna varchar(50),
  edad smallint,
  usuario_id int,
  FOREIGN key (usuario_id) REFERENCES usuario(id)
);

create table profesional (
  id int primary key AUTO_INCREMENT,
  run varchar(11) not null,
  nombre VARCHAR(50) not null,
  apellido varchar(50) not null,
  correo varchar(100) not null,
  telefono varchar(20) not null,
  cargo varchar(50),
  usuario_id int,
  FOREIGN key (usuario_id) REFERENCES usuario(id)
);

-- Tabla "Capacitaciones"
CREATE TABLE capacitacion (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(100) NOT NULL,
  detalle TEXT,
  fecha date,
  hora time,
  lugar varchar(500),
  duracion float,
  cantidad int,
  cliente_id int,
  foreign key (cliente_id) references cliente(id)
);

-- Tabla "Visitas"
CREATE TABLE visita (
  id INT PRIMARY KEY AUTO_INCREMENT,
  cliente_id INT,
  fecha DATE,
  hora time,
  lugar varchar(500),
  realizado boolean,
  detalle TEXT,
  profesional_id INT,
  FOREIGN KEY (cliente_id) REFERENCES cliente(id),
  FOREIGN KEY (profesional_id) REFERENCES profesional(id)
);

-- Tabla "Chequeos"
CREATE TABLE chequeo (
  id INT PRIMARY KEY AUTO_INCREMENT,
  visita_id INT,
  detalle TEXT,
  estado ENUM('Pendiente', 'Completado'),
  FOREIGN KEY (visita_id) REFERENCES visita(id)
);

-- Tabla "Pagos"
CREATE TABLE pago (
  id INT PRIMARY KEY AUTO_INCREMENT,
  cliente_id INT,
  monto DECIMAL(10,2),
  fecha_pago DATE,
  FOREIGN KEY (cliente_id) REFERENCES cliente(id)
);

-- Tabla "Asesorias"
CREATE TABLE asesoria (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(100) NOT NULL,
  detalle TEXT,
  profesional_id INT,
  cliente_id int,
  FOREIGN KEY (profesional_id) REFERENCES profesional(id),
  foreign key (cliente_id) references cliente(id)
);

-- Tabla "Accidentes"
CREATE TABLE accidente (
  id INT PRIMARY KEY AUTO_INCREMENT,
  cliente_id INT,
  fecha_accidente DATE,
  detalle TEXT,
  FOREIGN KEY (cliente_id) REFERENCES cliente(id)
);

-- Tabla "Asistentes"
CREATE TABLE asistente (
  capacitacion_id INT,
  usuario_id INT,
  FOREIGN KEY (capacitacion_id) REFERENCES capacitacion(id),
  FOREIGN KEY (usuario_id) REFERENCES usuario(id),
  PRIMARY KEY (capacitacion_id, usuario_id)
);

-- Insertar registros en la tabla "usuario"
INSERT INTO usuario (nombre, username, password) VALUES
('Alejandro', 'alejandro123', '123456'),
('Carolina', 'carolina456', '987657'),
('Eduardo', 'eduardo789', '246813'),
('Fernanda', 'fernanda321', '135680'),
('Gabriel', 'gabriel654', '567234'),
('Isabella', 'isabella987', '098765'),
('Javier', 'javier234', '345678'),
('Laura', 'laura567', '678901'),
('Miguel', 'miguel890', '012345'),
('Natalia', 'natalia321', '987654'),
('Oscar', 'oscar654', '543210'),
('Paula', 'paula987', '890123'),
('Roberto', 'roberto234', '234560'),
('Sofía', 'sofia567', '567890'),
('Tomás', 'tomas890', '890123');

-- Insertar registros en la tabla "administrativo"
INSERT INTO administrativo (run, nombre, apellido, correo, area, usuario_id) VALUES
  ('12333444-2', 'Alejandro', 'Torremar', 'Alejandro22@gmail.com', 'Interna1', 1),
  ('13000444-1', 'Carolina', 'Gato', 'Carolina33@gmail.com', 'Interna2', 2),
  ('14000222-5', 'Eduardo', 'Amigo', 'AmigoEd2@gmail.com', 'Interna1', 3),
  ('15666888-9', 'Fernanda', 'Sepúlveda', 'Ferboni@gmail.com', 'Interna2', 4),
  ('16999000-1', 'Gabriel', 'Suazo', 'GabiSuazo@gmail.com', 'Interna2', 5);

-- Insertar registros en la tabla "cliente"
INSERT INTO cliente (rut, nombre, apellido, correo, telefono, afp, sistema_salud, direccion, comuna, edad, usuario_id) VALUES
  ('17999888-2', 'Isabella', 'Gallardo', 'Isa3322@gmail.com', '123456789', 'Modelo', 'isapre', 'Las Ollas 23', 'Valparaiso', 30, 6),
  ('18333888-5', 'Javier', 'Mardones', 'Javier44@gmail.com', '987654321', 'Modelo', 'fonasa', 'Minerva 09', 'Algarrobo', 35, 7),
  ('19444999-1', 'Laura', 'Pérez', 'Laura33@gmail.com', '111222333', 'Coprum', 'isapre', 'Los Álamos 34', 'El Bosque', 40, 8),
  ('20111222-3', 'Miguel', 'Ponce', 'MiguelPonce44@gmail.com', '444555666', 'Coprum', 'fonasa', 'Tres Poniente 45', 'San Miguel', 45, 9),
  ('21888333-3', 'Natalia', 'Olea', 'Nataliao1@gmail.com', '777888999', 'Habitat', 'isapre', 'Piedra del Trueno', 'El Quisco', 50, 10);

-- Insertar registros en la tabla "profesional"
INSERT INTO profesional (run, nombre, apellido, correo, telefono, cargo, usuario_id) VALUES
  ('22444555-2', 'Oscar', 'Pérez', 'Oscar45perez@gmail.com', '561111000', 'Cargo1', 11),
  ('23555444-8', 'Paula', 'Guajardo', 'PauGua12@gmail.com', '562222000', 'Cargo2', 12),
  ('24999888-2', 'Roberto', 'Piert', 'RobertPier34@gmail.com', '563333000', 'Cargo3', 13),
  ('25000111-3', 'Sofía', 'Espinoza', 'Sofia990es@gmail.com', '564444000', 'Cargo4', 14),
  ('26333555-2', 'Tomás', 'Bravo', 'tomasbravo78@gmail.com', '565555000', 'Cargo5', 15);
  
  -- Insertar registros en la tabla "capacitacion"
INSERT INTO capacitacion (nombre, detalle, fecha, hora, lugar, duracion, cantidad, cliente_id)
VALUES
  ('Recursos Minerales', 'Detalle de la capacitación 1', '2023-07-01', '09:00:00', 'Santiago', 60, 20, 1),
  ('Construcciones', 'Detalle de la capacitación 2', '2023-07-05', '14:30:00', 'Concepción', 90, 15, 2),
  ('Desarrollo Web', 'Detalle de la capacitación 3', '2023-07-10', '10:00:00', 'Hotel Sheraton', 120, 25, 3),
  ('Venta de Libros', 'Detalle de la capacitación 4', '2023-07-15', '13:00:00', 'Feria del Libro', 120, 30, 4),
  ('Shows en vivo', 'Detalle de la capacitación 5', '2023-07-19', '11:30:00', 'Parque Bustamante', 90, 18, 5);
  
-- Insertar registros en la tabla "asistente"
INSERT INTO asistente (capacitacion_id, usuario_id) VALUES
  (1, 6),
  (2, 7),
  (3, 8),
  (4, 9),
  (5, 10);
  
  -- SELECT * FROM cliente;
