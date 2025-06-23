USE ecommerce_aurum_designers;
INSERT INTO users (name, email, password, phone, address) VALUES
('María López', 'maria@example.com', 'hashedpass1', '5512345678', 'Calle Luna 123, CDMX'),
('Carlos Ruiz', 'carlos@example.com', 'hashedpass2', '5523456789', 'Av. Sol 456, Guadalajara'),
('Ana Torres', 'ana@example.com', 'hashedpass3', '5534567890', 'Blvd. Estrella 789, Monterrey'),
('Luis Pérez', 'luis@example.com', 'hashedpass4', '5545678901', 'Calle Río 321, Puebla'),
('Diana Gómez', 'diana@example.com', 'hashedpass5', '5556789012', 'Col. Centro 147, Mérida');

--- Tabla de privilegios de usuario ---

INSERT INTO privileges (privilege_name) VALUES
('cliente'),
('administrador'),
('diseñador'),
('almacenista'),
('soporte');

INSERT INTO user_has_privilege (id_user, id_privilege) VALUES
(1, 1),
(2, 1),
(3, 3),
(4, 2),
(5, 1);

SELECT * FROM categories;
INSERT INTO categories (category_name) VALUES
('Tennis Bracelets'),
('Tennis'),
('Bracelets'),
('Climbers'),
('Arracadas'),
('Churumbelas'),
('Broqueles');

INSERT INTO stones (stone_name) VALUES
('Diamante'),
('Rubí'),
('Esmeralda'),
('Zafiro'),
('Topacio');

SELECT * FROM categories;
SELECT * FROM stones;

INSERT INTO jewelry_pieces (name, description, price, id_category, id_stone, material, image_url, stock) VALUES
('Arracadas de oro con diamantes', 'Elegantes arracadas hechas a mano', 3200.00, 3, 1, 'Oro 14k', 'img/arracadas1.jpg', 10),
('Pulsera tennis rubí', 'Pulsera delicada con rubíes naturales', 4500.00, 4, 2, 'Oro blanco', 'img/tennis1.jpg', 5),
('Broqueles topacio', 'Broqueles pequeños con topacio azul', 1500.00, 5, 5, 'Plata .925', 'img/broqueles1.jpg', 20),
('Tennis zafiro', 'Pulsera estilo tennis con zafiros reales', 4100.00, 4, 4, 'Oro amarillo', 'img/tennis2.jpg', 7),
('Arracadas esmeralda', 'Arracadas con piedras esmeralda colombiana', 3800.00, 3, 3, 'Oro rosa', 'img/arracadas2.jpg', 6);

INSERT INTO orders (id_user, order_date, total_amount) VALUES
(1, '2025-06-01', 3200.00),
(2, '2025-06-02', 4500.00),
(3, '2025-06-03', 1500.00),
(1, '2025-06-05', 4100.00),
(5, '2025-06-06', 3800.00);

INSERT INTO order_has_jewelry (id_order, id_jewelry, quantity) VALUES
(1, 1, 1),
(2, 2, 1),
(3, 3, 2),
(4, 4, 1),
(5, 5, 1);

SHOW TABLES;

