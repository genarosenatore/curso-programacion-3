@FunctionalInterface
interface Operacion { int aplicar(int a, int b); }
Operacion sumar = (a, b) -> a + b;
System.out.println(sumar.aplicar(2, 3));
