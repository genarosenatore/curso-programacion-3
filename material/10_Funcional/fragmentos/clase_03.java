java.util.function.Function<String, String> mayusculas = String::toUpperCase;
java.util.function.Consumer<String> mostrar = System.out::println;
mostrar.accept(mayusculas.apply("ana"));
