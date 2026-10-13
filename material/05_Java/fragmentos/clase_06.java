class Contador {
    static int creados = 0;
    int valor = 0;
    Contador() { creados++; }
}
// En main:
Contador a = new Contador();
Contador b = a;
b.valor = 7;
System.out.println(a.valor);
System.out.println(Contador.creados);
