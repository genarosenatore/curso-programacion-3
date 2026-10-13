static int sumar(int[] valores) {
    int total = 0;
    for (int valor : valores) {
        total += valor;
    }
    return total;
}
// Dentro de main: System.out.println(sumar(new int[]{100, 200, 300}));
