static double sumar(java.util.List<? extends Number> valores) {
    double total = 0;
    for (Number valor : valores) total += valor.doubleValue();
    return total;
}
// sumar(List.of(1,2)); sumar(List.of(1.5,2.5));
