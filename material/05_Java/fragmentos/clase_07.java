abstract class MedioPago {
    abstract String descripcion();
}
class Efectivo extends MedioPago {
    @Override String descripcion() { return "Pago en efectivo"; }
}
class Pedido {
    private final MedioPago medio;
    Pedido(MedioPago medio) { this.medio = medio; }
}
