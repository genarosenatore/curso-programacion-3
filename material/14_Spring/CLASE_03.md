# Clase 14.03 · Spring, Spring Boot y primer proyecto

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_02.md) · [Clase siguiente](../14_Spring/CLASE_04.md)

## Qué vas a aprender

Vamos a trabajar **spring, spring boot y primer proyecto**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Spring organiza componentes y dependencias. Spring Boot añade configuración automática, starters y un arranque práctico. Un starter reúne dependencias coherentes para una capacidad. El servidor web embebido permite iniciar una aplicación sin desplegar manualmente en un servidor externo.

El proyecto de apoyo fija Java 21 y Spring Boot 3.5.16 para mantener coherencia con Jakarta y los ejemplos. Su documentación requiere al menos Java 17. Una versión nueva no obliga a cambiar el curso a mitad del estudio. La configuración declarada es el contrato reproducible del ejemplo.

## Ejemplo

```java
package curso;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aplicacion {
    public static void main(String[] args) {
        SpringApplication.run(Aplicacion.class, args);
    }
}
```

[Abrir el fragmento como archivo](fragmentos/clase_03.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los métodos y clases forman parte del proyecto Spring de apoyo, salvo que se indique el modelo FacturaVenta del campus. Los fragmentos no reemplazan pom.xml ni configuración.

## Leamos el ejemplo paso a paso

La clase se ubica en el paquete raíz curso para detectar componentes debajo. SpringApplication inicia el contexto y la aplicación web si las dependencias lo indican. En el proyecto de apoyo, pom.xml declara web, validation, data-jpa y H2. Su README explica Maven y arranque.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Identificá la clase de inicio, archivo de dependencias y configuración del proyecto de apoyo.

Abrí [los ejercicios y las pistas](EJERCICIOS_03.md). Las [soluciones explicadas](SOLUCIONES_03.md) están preparadas para consultar después de intentarlo.

## Error común

Copiar una clase Spring a un proyecto Java vacío y esperar que sus imports existan.

## Resumen para repasar

Spring organiza componentes y dependencias. Spring Boot añade configuración automática, starters y un arranque práctico.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **14.03** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_02.md) · [Clase siguiente](../14_Spring/CLASE_04.md)
