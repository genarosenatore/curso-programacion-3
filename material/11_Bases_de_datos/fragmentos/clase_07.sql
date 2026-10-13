BEGIN;
UPDATE producto SET precio_centavos=210000 WHERE id=1;
SELECT precio_centavos FROM producto WHERE id=1;
ROLLBACK;
SELECT precio_centavos FROM producto WHERE id=1;
