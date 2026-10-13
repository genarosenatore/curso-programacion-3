var nombres = java.util.List.of("Ana", "Eva", "Luis");
var conteos = nombres.stream().collect(java.util.stream.Collectors.groupingBy(
    String::length, java.util.stream.Collectors.counting()));
String elegido = nombres.stream().filter(n -> n.startsWith("Z")).findFirst().orElse("Sin coincidencia");
System.out.println(conteos);
System.out.println(elegido);
