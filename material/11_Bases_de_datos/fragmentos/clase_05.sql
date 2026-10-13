INSERT INTO producto (id,nombre,precio_centavos,categoria_id) VALUES (10,'Mochila',500000,1);
UPDATE producto SET precio_centavos=480000 WHERE id=10;
SELECT * FROM producto WHERE id=10;
DELETE FROM producto WHERE id=10;
