java.util.function.Predicate<Integer> positivo = n -> n > 0;
java.util.function.Function<Integer, String> etiqueta = n -> "Stock: " + n;
java.util.function.Consumer<String> mostrar = System.out::println;
java.util.function.Supplier<Integer> inicial = () -> 0;
mostrar.accept(etiqueta.apply(inicial.get()));
