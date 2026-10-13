INSERT INTO producto (id,nombre,precio_centavos,categoria_id) VALUES (3,'Mochila',500000,1);
UPDATE producto SET precio_centavos=480000 WHERE id=3;
SELECT * FROM producto WHERE id=3;
DELETE FROM producto WHERE id=3;
