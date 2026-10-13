class Producto {
    private final String codigo;
    Producto(String codigo) { this.codigo = codigo; }
    @Override public String toString() {
        return "Producto{codigo='" + codigo + "'}";
    }
}
// En main: System.out.println(new Producto("P01"));
