# Clase 05.09 · Excepciones y manejo de errores

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_08.md) · [Clase siguiente](../05_Java/CLASE_10.md)

## Separar éxito de una operación que no puede continuar

Una excepción interrumpe el camino normal y puede viajar al método que llamó. `throw` lanza un objeto de excepción; `throws` en una firma declara que un método puede propagar ciertos tipos. No devuelve un código de éxito disfrazado. Ya usamos [validación antes de modificar](CLASE_05.md); ahora aprendemos dónde manejar el rechazo.

`try` contiene operaciones intentadas. Cuando una lanza, se omiten las instrucciones restantes de ese bloque y se busca un catch compatible. `catch(NumberFormatException error)` recibe el objeto para ese tipo de fallo. `finally` realiza una acción al salir, sea por éxito o fallo en el recorrido habitual, pero no vuelve exitoso el intento. Evitá return en finally porque puede esconder el resultado o error previo.

## Conversión y validación son etapas diferentes

El ejemplo inferior va dentro de main. Integer.parseInt("dos") falla por formato; println(cantidad) no se alcanza y catch muestra el motivo comprensible. "3" se convierte, pero todavía puede incumplir un máximo de stock. Debes validar la regla después de convertir; atrapar NumberFormatException no prueba que la cantidad sea aceptable.

Una excepción **comprobada** exige capturar o declarar, como ciertas operaciones de archivos. Una **no comprobada**, subclase de RuntimeException, no impone esa declaración, pero igual requiere decidir cómo informar y conservar consistencia. Capturar Exception para continuar como si se hubiera comprado puede ocultar un error de programación.

Para recursos cerrables, try-with-resources declara el recurso dentro de paréntesis y lo cierra al salir. **AutoCloseable** es el contrato que lo permite. No necesitás un archivo o conexión para este ejemplo de números, pero aprender su propósito prepara la persistencia. Registra detalles técnicos en el lugar apropiado y muestra mensajes que expliquen la acción posible al usuario.

## Ejemplo de la clase

```java
try {
    int cantidad = Integer.parseInt("dos");
    System.out.println(cantidad);
} catch (NumberFormatException error) {
    System.out.println("La cantidad debe ser un entero");
}
```

[Abrir el fragmento como archivo](fragmentos/clase_09.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

parseInt no puede convertir dos y lanza NumberFormatException. El código salta al catch correspondiente y muestra una explicación. No ejecuta el println de cantidad. En una aplicación, distinguir errores esperados de programación ayuda a elegir qué mensaje mostrar y qué información registrar.

## Cambiar una decisión y explorar un límite

Con "3.5" parseInt de Java falla; con "3" vuelve 3; con "-1" convierte correctamente y requiere validación de cantidad. Un catch vacío evitaría ver el mensaje sin resolver el dato. No uses 0 como resultado silencioso de cualquier error si cero también puede ser un valor válido.

## Confusión que conviene evitar

Tratar una conversión válida como prueba de que el dato cumple todas las reglas.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_09.md). Las [soluciones razonadas](SOLUCIONES_09.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_08.md) · [Clase siguiente](../05_Java/CLASE_10.md)
