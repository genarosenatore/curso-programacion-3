var cantidades = java.util.List.of(2, 3, 4);
int total = cantidades.stream().reduce(0, Integer::sum);
int otroTotal = cantidades.stream().mapToInt(Integer::intValue).sum();
System.out.println(total + " / " + otroTotal);
