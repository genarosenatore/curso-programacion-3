from pathlib import Path
import sqlite3
db=sqlite3.connect(":memory:")
db.executescript(Path(__file__).with_name("tienda.sql").read_text(encoding="utf-8"))
consultas={
 "Productos por precio":"SELECT nombre,precio_centavos FROM producto ORDER BY precio_centavos,id",
 "Categorías, incluyendo vacías":"SELECT c.nombre,COUNT(p.id) FROM categoria c LEFT JOIN producto p ON p.categoria_id=c.id GROUP BY c.id,c.nombre ORDER BY c.id",
 "Total de factura":"SELECT f.id,SUM(d.cantidad*d.precio_centavos) FROM factura f JOIN detalle d ON d.factura_id=f.id GROUP BY f.id"}
for nombre,sql in consultas.items():
 print(nombre)
 for fila in db.execute(sql):print(fila)
antes=db.execute("SELECT precio_centavos FROM producto WHERE id=1").fetchone()[0]
db.execute("BEGIN")
db.execute("UPDATE producto SET precio_centavos=1 WHERE id=1")
db.rollback()
despues=db.execute("SELECT precio_centavos FROM producto WHERE id=1").fetchone()[0]
print("Rollback conserva el precio:",antes==despues)
db.close()
