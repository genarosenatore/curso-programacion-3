class Saludo {
    public String texto() { return "Hola"; }
}
// Dentro de main declarado con throws ReflectiveOperationException:
Saludo saludo = new Saludo();
var metodo = Saludo.class.getMethod("texto");
System.out.println(metodo.invoke(saludo));
