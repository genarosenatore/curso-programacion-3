CREATE TABLE detalle (
 id INTEGER PRIMARY KEY,
 factura_id INTEGER NOT NULL REFERENCES factura(id),
 producto_id INTEGER NOT NULL REFERENCES producto(id),
 cantidad INTEGER NOT NULL CHECK(cantidad > 0)
);
