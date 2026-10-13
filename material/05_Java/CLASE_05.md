# Clase 05.05 · Encapsulamiento, getters y setters

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_04.md) · [Clase siguiente](../05_Java/CLASE_06.md)

## Qué vas a aprender

Vamos a trabajar **encapsulamiento, getters y setters**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Encapsular significa controlar cómo se accede al estado y preservar sus reglas. private limita acceso directo. Un getter consulta y un método o setter puede modificar tras validar. No todo atributo necesita un setter; dar acceso a todo puede permitir estados inválidos.

Para un stock no negativo, la regla debe mantenerse al construir y al modificar. Una operación con nombre del negocio, como descontarStock, puede expresar mejor la intención que permitir cualquier número por setStock.

## Ejemplo

```java
class Producto {
    private int stock;
    Producto(int stock) { setStock(stock); }
    int getStock() { return stock; }
    void setStock(int stock) {
        if (stock < 0) throw new IllegalArgumentException("Stock negativo");
        this.stock = stock;
    }
}
```

[Abrir el fragmento como archivo](fragmentos/clase_05.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las declaraciones de clases y métodos van dentro o fuera de main según indica la explicación. Los fragmentos no son todos archivos autónomos; el ejemplo completo de la unidad muestra la estructura ejecutable.

## Leamos el ejemplo paso a paso

El constructor reutiliza la validación. Intentar un valor negativo lanza una excepción y no actualiza el atributo. La firma permite saber qué se puede consultar o cambiar. El nivel de acceso de los métodos de este ejemplo es de paquete; si se usan desde otro paquete, se decide si deben ser public.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Añadí descontarStock(cantidad) que rechace cero, negativos y cantidades superiores al disponible.

Abrí [los ejercicios y las pistas](EJERCICIOS_05.md). Las [soluciones explicadas](SOLUCIONES_05.md) están preparadas para consultar después de intentarlo.

## Error común

Cambiar el atributo primero y comprobar la regla después, dejando un estado inválido al fallar.

## Resumen para repasar

Encapsular significa controlar cómo se accede al estado y preservar sus reglas. private limita acceso directo.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **05.05** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_04.md) · [Clase siguiente](../05_Java/CLASE_06.md)
