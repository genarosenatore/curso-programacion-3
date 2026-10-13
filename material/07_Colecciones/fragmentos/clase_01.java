java.util.List<String> lista = new java.util.ArrayList<>();
lista.add("A"); lista.add("A");
java.util.Set<String> conjunto = new java.util.HashSet<>(lista);
java.util.Map<String, Integer> precios = new java.util.HashMap<>();
precios.put("A", 800);
System.out.println(lista.size() + " / " + conjunto.size());
