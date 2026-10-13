select f from FacturaVenta f
where f.importeTotal > (select avg(otra.importeTotal) from FacturaVenta otra)
