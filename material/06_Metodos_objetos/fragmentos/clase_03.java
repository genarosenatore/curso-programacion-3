final class Producto {
    private final String codigo;
    Producto(String codigo) { this.codigo = java.util.Objects.requireNonNull(codigo); }
    @Override public boolean equals(Object otro) {
        if (this == otro) return true;
        if (!(otro instanceof Producto producto)) return false;
        return codigo.equals(producto.codigo);
    }
    @Override public int hashCode() { return codigo.hashCode(); }
}
