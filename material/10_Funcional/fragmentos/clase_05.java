record Producto(String nombre, int precio, int stock) {}
var productos = java.util.List.of(new Producto("Cuaderno",2000,3), new Producto("Lapicera",800,0));
var nombres = productos.stream()
    .filter(p -> p.stock() > 0)
    .sorted(java.util.Comparator.comparingInt(Producto::precio))
    .map(Producto::nombre)
    .toList();
