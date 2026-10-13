# Clase 05.05 · Encapsulamiento, getters y setters

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_04.md) · [Clase siguiente](../05_Java/CLASE_06.md)

## Preservar una regla a través de todas las entradas

**Encapsular** es controlar cómo se consulta y modifica el estado. private evita escribir directamente el campo desde otras clases. Un getter lo consulta; un setter puede validar, pero dar un setter a todo no asegura un buen modelo. Una operación como descontarStock expresa qué cambio se permite y por qué.

Una **invariante** es una regla que debe mantenerse en cada estado válido: stock nunca negativo. Se verifica al construir y en cada cambio. Si validás solo en la pantalla, otra clase puede crear o modificar un producto inválido. Si validás después de asignar, un fallo puede dejar el campo corrupto.

## Rechazar antes de cambiar

El fragmento usa `throw new IllegalArgumentException("Stock negativo")`. Una **excepción** interrumpe el camino normal para indicar un fallo; throw la lanza, new construye el objeto y el mensaje explica su causa. En [05.09](CLASE_09.md) aprenderemos a manejarla con try/catch. Aquí importa que el lanzamiento ocurra antes de `this.stock = stock`, así el valor anterior se conserva.

El constructor llama setStock para reutilizar la regla. `getStock()` devuelve el estado y no lo modifica; `setStock(...)` tiene retorno void porque la operación no entrega un valor. El acceso sin modificador es de paquete; public se decide cuando otras partes requieren usarlo.

Para ejecutar el caso válido, colocá Producto después de Hola como en [05.04](CLASE_04.md), creá uno con stock 5 y mostrá getStock después de setStock(3). Para observar el error, probá setStock(-1) como última operación en una ejecución separada: sin manejo, termina con el mensaje. No necesitás adelantar un bloque try/catch para comprobar la validación.

Descontar requiere reglas adicionales: cantidad entera por su tipo int, positiva y no mayor al stock. Un getter que entregara una colección mutable interna necesitaría cuidado distinto; private de una referencia no impide cambios por alias.

## Ejemplo de la clase

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

## Qué ocurre al seguirlo

El constructor reutiliza la validación. Intentar un valor negativo lanza una excepción y no actualiza el atributo. La firma permite saber qué se puede consultar o cambiar. El nivel de acceso de los métodos de este ejemplo es de paquete; si se usan desde otro paquete, se decide si deben ser public.

## Cambiar una decisión y explorar un límite

Descontá 2 sobre 5: queda 3. Pedí 6 sobre 5: debe fallar antes de la resta. Asignar stock-=cantidad y recién comprobar permite observar un estado negativo si el error se maneja más afuera. La regla debe proteger la operación completa.

## Confusión que conviene evitar

Cambiar el atributo primero y comprobar la regla después, dejando un estado inválido al fallar.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_05.md). Las [soluciones razonadas](SOLUCIONES_05.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_04.md) · [Clase siguiente](../05_Java/CLASE_06.md)
