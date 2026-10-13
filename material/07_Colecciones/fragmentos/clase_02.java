java.util.List<String> nombres = new java.util.ArrayList<>(java.util.List.of("Ana", "Luis"));
nombres.add("Eva");
nombres.set(0, "Anita");
for (String nombre : nombres) System.out.println(nombre);
System.out.println(nombres.get(2));
