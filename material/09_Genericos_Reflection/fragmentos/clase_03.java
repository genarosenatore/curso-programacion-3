interface Contenedor<T> { void guardar(T valor); T obtener(); }
class ContenedorSimple<T> implements Contenedor<T> {
    private T valor;
    public void guardar(T valor) { this.valor = valor; }
    public T obtener() { return valor; }
}
