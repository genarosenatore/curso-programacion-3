var nombres = java.util.List.of("Ana", "Luis", "Eva");
var cortos = nombres.stream()
    .filter(nombre -> nombre.length() <= 3)
    .toList();
System.out.println(cortos);
