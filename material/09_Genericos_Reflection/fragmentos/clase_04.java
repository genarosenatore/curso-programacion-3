Class<?> tipo = String.class;
System.out.println(tipo.getSimpleName());
for (java.lang.reflect.Method metodo : tipo.getDeclaredMethods()) {
    if (metodo.getName().equals("length")) System.out.println(metodo.getName());
}
