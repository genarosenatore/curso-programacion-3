interface Envio { int costoCentavos(); }
class Retiro implements Envio {
    public int costoCentavos() { return 0; }
}
class Domicilio implements Envio {
    public int costoCentavos() { return 50000; }
}
// En main: Envio envio = new Domicilio(); System.out.println(envio.costoCentavos());
