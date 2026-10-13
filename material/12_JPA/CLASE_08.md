# Clase 12.08 · Transacciones y consistencia

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_07.md) · [Clase siguiente](../12_JPA/CLASE_09.md)

## Qué vas a aprender

Vamos a trabajar **transacciones y consistencia**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una transacción de negocio reúne lecturas y escrituras que deben ser coherentes. En Spring, @Transactional en un servicio puede establecer ese límite cuando el método se invoca mediante el proxy gestionado. Una llamada interna desde la misma instancia no atraviesa ese proxy en el modo habitual.

Por defecto, Spring revierte ante RuntimeException y Error, no necesariamente cualquier excepción comprobada. Si el error se captura y se oculta, el gestor puede ver un éxito. El alcance y reglas de rollback deben ser explícitos. Ninguna transacción sustituye comprobar stock o relaciones.

## Ejemplo

```java
@org.springframework.transaction.annotation.Transactional
public void cambiarNombre(Long id, String nombre) {
    Producto p = em.find(Producto.class, id);
    if (p == null) throw new IllegalArgumentException("No existe");
    p.setNombre(nombre);
}
```

[Abrir el fragmento como archivo](fragmentos/clase_08.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Estos fragmentos requieren un proyecto JPA configurado y las entidades mencionadas. El proyecto de apoyo está enlazado en la guía de ejecución; para FacturaVenta usá el modelo del campus mapeado según su consigna.

## Leamos el ejemplo paso a paso

Este método pertenece a un servicio gestionado y se llama desde otro componente. El EntityManager se inyecta apropiadamente. Al devolver normalmente puede confirmarse el cambio; ante un fallo que cumple las reglas de rollback se revierte. El nombre también debe validarse, omitido aquí para concentrarse en el límite transaccional.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Describí una creación de factura con cabecera y detalles bajo un único límite transaccional.

Abrí [los ejercicios y las pistas](EJERCICIOS_08.md). Las [soluciones explicadas](SOLUCIONES_08.md) están preparadas para consultar después de intentarlo.

## Error común

Capturar todo error y retornar éxito aunque faltó guardar una parte.

## Resumen para repasar

Una transacción de negocio reúne lecturas y escrituras que deben ser coherentes. En Spring, @Transactional en un servicio puede establecer ese límite cuando el método se invoca mediante el proxy gestionado.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **12.08** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_07.md) · [Clase siguiente](../12_JPA/CLASE_09.md)
