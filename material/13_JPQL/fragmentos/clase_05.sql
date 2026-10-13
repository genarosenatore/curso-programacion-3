select f.puntoVenta.descripcion, count(f), sum(f.importeTotal)
from FacturaVenta f
group by f.puntoVenta.id, f.puntoVenta.descripcion
having count(f) > :minimo
