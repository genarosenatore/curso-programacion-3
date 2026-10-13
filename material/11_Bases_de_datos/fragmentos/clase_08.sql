SELECT f.id AS factura, SUM(d.cantidad*d.precio_centavos) AS total_centavos
FROM factura f
JOIN detalle d ON d.factura_id=f.id
GROUP BY f.id
ORDER BY f.id;
