java.util.List<String> nombres = new java.util.ArrayList<>(java.util.List.of("Eva", "Ana", "Luis"));
nombres.sort(java.util.Comparator.naturalOrder());
System.out.println(nombres);
nombres.sort(java.util.Comparator.comparingInt(String::length).thenComparing(java.util.Comparator.naturalOrder()));
