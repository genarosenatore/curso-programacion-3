SELECT id, nombre, precio_centavos
FROM producto
WHERE precio_centavos >= 100000
ORDER BY precio_centavos DESC, id ASC;
