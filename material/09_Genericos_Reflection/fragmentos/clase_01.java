class Caja<T> {
    private final T contenido;
    Caja(T contenido) { this.contenido = contenido; }
    T obtener() { return contenido; }
}
static <T> T identidad(T valor) { return valor; }
// Caja<String> caja = new Caja<>("Hola");
