# Clase 14.04 · Beans, ApplicationContext e inyección de dependencias

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_03.md) · [Clase siguiente](../14_Spring/CLASE_05.md)

## Qué vas a aprender

Vamos a trabajar **beans, applicationcontext e inyección de dependencias**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un bean es un objeto gestionado por el contenedor de Spring. ApplicationContext registra y proporciona componentes. La inyección de dependencias entrega colaboradores a un objeto, en vez de que este construya todo por su cuenta. El constructor hace explícitos los requisitos.

En servicios web, los beans suelen compartirse como singleton dentro del contexto. Por eso no guardamos la lista de la compra de cada usuario en un campo mutable de un servicio compartido. El estado de una petición debe mantenerse local o en almacenamiento adecuado.

## Ejemplo

```java
@org.springframework.stereotype.Service
class ProductoService {
    private final ProductoRepository repositorio;
    ProductoService(ProductoRepository repositorio) {
        this.repositorio = repositorio;
    }
}
```

[Abrir el fragmento como archivo](fragmentos/clase_04.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los métodos y clases forman parte del proyecto Spring de apoyo, salvo que se indique el modelo FacturaVenta del campus. Los fragmentos no reemplazan pom.xml ni configuración.

## Leamos el ejemplo paso a paso

Spring crea el servicio y le entrega el repositorio gestionado. Con un único constructor no es necesario añadir @Autowired en este caso. final fija la referencia del colaborador. Crear el servicio con new por tu cuenta evita la gestión y puede omitir inyección y proxies.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Explicá por qué un Controller puede recibir ProductoService por constructor en lugar de crearlo con new.

Abrí [los ejercicios y las pistas](EJERCICIOS_04.md). Las [soluciones explicadas](SOLUCIONES_04.md) están preparadas para consultar después de intentarlo.

## Error común

Usar variables de instancia para datos de cada pedido en un singleton compartido.

## Resumen para repasar

Un bean es un objeto gestionado por el contenedor de Spring. ApplicationContext registra y proporciona componentes.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **14.04** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_03.md) · [Clase siguiente](../14_Spring/CLASE_05.md)
