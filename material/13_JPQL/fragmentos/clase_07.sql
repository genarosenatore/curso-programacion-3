select f.numeroFactura, f.importeTotal,
case when f.importeTotal > 50000 then 'ALTO VALOR'
     when f.importeTotal >= 10000 then 'MEDIO VALOR'
     else 'BAJO VALOR' end
from FacturaVenta f
order by f.importeTotal desc
