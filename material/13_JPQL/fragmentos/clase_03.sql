select f from FacturaVenta f
where f.fechaEmision >= :desde and f.fechaEmision < :hastaExclusiva
and f.fechaAnulacion is null
order by f.fechaEmision, f.id
