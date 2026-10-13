# Clase 09.05 · Inspección de campos, métodos y anotaciones

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_04.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_06.md)

## Buscar una firma y luego invocarla

Un descriptor de método puede ejecutar sobre un receptor. `getMethod("texto")` busca un método público sin parámetros; para otro con parámetros se indican sus clases, como getMethod("saludar",String.class). La cadena del nombre debe coincidir exactamente. invoke(receptor,argumentos) realiza la llamada y devuelve Object.

En el ejemplo, Saludo se declara fuera de main; main puede declarar `throws ReflectiveOperationException` después de sus parámetros para propagar errores de reflexión durante esta práctica. Esa política deja terminar el programa mostrando el error; no es manejo para una interfaz de usuario. En [05.09](../05_Java/CLASE_09.md) aprendiste a capturar cuando corresponde.

## Distinguir metadatos de acciones

Obtener el descriptor no muestra Hola. invoke(saludo) ejecuta texto sobre la instancia y retorna el String, que println presenta. Si el método no existe, falla la búsqueda. Si no se permite acceso, falla la invocación. Si el cuerpo lanza una excepción, puede envolverse en InvocationTargetException: inspeccionar la causa evita atribuir todo a Reflection.

Una anotación propia se declara con `@interface Marca`. `@Retention(RetentionPolicy.RUNTIME)` dice que debe permanecer disponible en ejecución y `@Target(ElementType.TYPE)` permite usarla en tipos. Esas anotaciones se importan de java.lang.annotation. Al aplicar @Marca a Cliente, `Cliente.class.isAnnotationPresent(Marca.class)` consulta presencia; no ejecuta un comportamiento de Cliente.

Sin retención adecuada, escribir @Marca puede servir a otra etapa, pero no a esa consulta runtime. Leer una anotación requiere que una herramienta la interprete; no todas son instrucciones mágicas. No fuerces acceso privado con setAccessible solo para evitar usar una API pública: las restricciones son parte del diseño y del entorno.

## Ejemplo de la clase

```java
class Saludo {
    public String texto() { return "Hola"; }
}
// Dentro de main declarado con throws ReflectiveOperationException:
Saludo saludo = new Saludo();
var metodo = Saludo.class.getMethod("texto");
System.out.println(metodo.invoke(saludo));
```

[Abrir el fragmento como archivo](fragmentos/clase_05.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

getMethod busca el método público sin parámetros. invoke lo ejecuta sobre saludo y devuelve Object. Si el método lanza una excepción, Reflection puede envolverla en InvocationTargetException. Una llamada directa saludo.texto() es más clara cuando conocemos la operación al compilar.

## Cambiar una decisión y explorar un límite

Cambiá texto por texxto en getMethod: falla en ejecución en vez de detectarse como una llamada directa mal escrita. Quitar RUNTIME puede hacer que la consulta de anotación dé false. Son errores diferentes de nombre y retención.

## Confusión que conviene evitar

Suponer que todas las anotaciones están disponibles mediante Reflection.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_05.md). Las [soluciones razonadas](SOLUCIONES_05.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_04.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_06.md)
