CREATE TABLE producto (
  id INTEGER PRIMARY KEY,
  nombre TEXT NOT NULL,
  precio_centavos INTEGER NOT NULL CHECK (precio_centavos >= 0)
);
INSERT INTO producto VALUES (1, 'Cuaderno', 200000);
SELECT id, nombre, precio_centavos FROM producto;
