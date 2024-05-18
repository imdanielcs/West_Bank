USE westbank;
CREATE TABLE cliente (
    rut VARCHAR(12) PRIMARY KEY,
    dv VARCHAR(1),
    contrasena VARCHAR(50),
	nombre VARCHAR (50),
    apellido_paterno VARCHAR (50),
    apellido_materno VARCHAR (50),
    domicilio VARCHAR (50),
    comuna VARCHAR (50),
    telefono int,
    numero int, 
    saldo int,
    tipo_cuenta VARCHAR (50)
);
CREATE TABLE transferencia (
	id_transaccion INT auto_increment PRIMARY KEY,
    cuenta_origen VARCHAR (9),
    monto int,
    cuenta_destino VARCHAR (9),
    fecha_hora datetime,
    rut VARCHAR (12),
    FOREIGN KEY (rut) REFERENCES cliente(rut)
);

INSERT INTO cliente VALUES (17564021, 1, 1234, 'Camila', 'Contreras', 'Ponce', 'Pedro Montt 714', 'Balmaceda', 912345678, 123456789, 230000, 'corriente');
INSERT INTO cliente VALUES (27054522, 'k', 4321, 'Daniel', 'Casas', 'Mayenties', 'Lord Cochrane 732', 'Santiago', 941147474, 789456123, 8500, 'corriente');
INSERT INTO cliente VALUES (12345678, '1', 5678, 'Alejandro', 'Saavedra', 'null', 'Av. Las Condes 120', 'Las Condes', 12345678, 147258369, 200000, 'ahorro');
commit;
SELECT * FROM CLIENTE;
SELECT * FROM TRANSFERENCIA;
