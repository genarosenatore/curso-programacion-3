select a.denominacion, m.denominacion
from Articulo a left join a.marca m
order by a.denominacion
