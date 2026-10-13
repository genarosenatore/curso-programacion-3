record Venta(String categoria, int importeCentavos) {}
var ventas = java.util.List.of(new Venta("Útiles",10000),new Venta("Útiles",20000),new Venta("Libros",50000));
var totales = ventas.stream().collect(java.util.stream.Collectors.groupingBy(
    Venta::categoria, java.util.stream.Collectors.summingInt(Venta::importeCentavos)));
