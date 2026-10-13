try {
    int cantidad = Integer.parseInt("dos");
    System.out.println(cantidad);
} catch (NumberFormatException error) {
    System.out.println("La cantidad debe ser un entero");
}
