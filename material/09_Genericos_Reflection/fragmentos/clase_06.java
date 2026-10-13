record Cliente(String nombre, String correo) {}
for (var componente : Cliente.class.getRecordComponents()) {
    System.out.println(componente.getName() + ": " + componente.getType().getSimpleName());
}
