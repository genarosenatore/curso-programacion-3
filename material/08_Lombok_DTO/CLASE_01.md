# Clase 08.01 · Anotaciones y código repetitivo

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_07.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_02.md)

## Información que una herramienta interpreta

Una anotación Java agrega **metadatos**, información sobre el código. Se escribe con @ y un nombre reconocido, como @Override. No es una llamada ejecutada desde main. Una herramienta debe conocerla y hacer algo con ella: el compilador comprueba Override; un procesador de Lombok puede generar código; un framework puede consultar otras en ejecución.

En [05.05](../05_Java/CLASE_05.md) escribimos getter y constructor manualmente. Esa repetición es el problema que Lombok intenta reducir. Antes de automatizar, identificá el comportamiento exacto: getter retorna un campo y constructor lo inicializa. Si el constructor también valida un nombre, esa regla no es mera repetición.

## Distinguir generación de lógica

El ejemplo inferior es Java puro: colocá ProductoManual fuera de main y construí uno dentro para llamar getNombre. La asignación recibe el argumento y el getter lo devuelve. No agrega validación de null ni vacío. Podés compilar sin bibliotecas porque ninguna anotación externa participa.

Para Lombok hacen falta biblioteca y procesamiento de anotaciones al compilar. El editor puede necesitar configuración para reconocer los miembros generados; que subraye un getter no prueba por sí solo que el proyecto sea correcto o incorrecto. Comprobá la construcción real. Importar lombok.Getter no descarga Lombok automáticamente.

Una anotación no convierte por sí sola una clase en DTO, una entidad o un servicio funcional. Esas funciones dependen de diseño, código y configuración. Usá automatización para reducir una tarea comprendida, y revisá qué miembros genera antes de confiar en ellos.

## Ejemplo de la clase

```java
class ProductoManual {
    private final String nombre;
    ProductoManual(String nombre) { this.nombre = nombre; }
    String getNombre() { return nombre; }
}
```

[Abrir el fragmento como archivo](fragmentos/clase_01.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Este ejemplo no necesita Lombok y permite ver qué se automatiza. Una anotación no es una llamada que se ejecuta al recorrer main. En el proyecto de Spring preparado, Lombok se declara como dependencia y procesador; las clases de esta unidad distinguen fragmentos de Java puro y fragmentos que la necesitan.

## Cambiar una decisión y explorar un límite

Agregá validación de nombre antes de asignar: cambia una regla real que un getter generado no sustituye. Quitar el procesamiento de Lombok puede dejar sus métodos inexistentes en la compilación, aun con anotaciones escritas.

## Confusión que conviene evitar

Agregar una anotación esperando que el IDE descargue y configure cualquier dependencia.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_01.md). Las [soluciones razonadas](SOLUCIONES_01.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_07.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_02.md)
