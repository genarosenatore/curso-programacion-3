# Clase 14.06 · Capas: Controller, Service y Repository

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_05.md) · [Clase siguiente](../14_Spring/CLASE_07.md)

## Seguir una responsabilidad por capa

Controller convierte HTTP en una llamada de aplicación y el resultado en respuesta. Service coordina reglas y operaciones. Repository obtiene o modifica persistencia. El dominio puede conservar invariantes, como stock no negativo. Son límites para entender cambios: una regla de cálculo no necesita saber qué botón la inició.

@RestController indica que los retornos de sus métodos se escriben al cuerpo mediante conversores configurados, como JSON con Jackson para DTO. @RequestMapping da ruta base; @GetMapping selecciona método/ruta de consulta. El fragmento llama servicio.listar(null): null aquí significa sin filtro de nombre, una política del servicio, no producto inexistente.

## Recorrer una respuesta

El servidor recibe GET /api/productos, encuentra el mapping, llama controller, este delega en service, el repository recupera entidades y service prepara DTO. Al retornar lista, el conversor escribe JSON y HTTP entrega200. Una lista vacía se escribe como [], manteniendo un resultado válido.

En [el proyecto](../Ejemplos/spring/README.md) leé ProductoController, ProductoService y ProductoRepository en ese orden para una consulta concreta. La interfaz de repositorio tiene implementación proporcionada por Spring Data; no es un archivo oculto que debas escribir por ensayo. 14.11 desarrolla cómo se conecta a JPA.

La **validación estructural** de un request puede activarse en controller con @Valid; las reglas de existencia y venta pertenecen al servicio o dominio coordinado por él. No dupliques la misma condición en varias capas sin saber qué garantía da cada una. Crear archivos con sufijos adecuados no basta si todas hacen lo mismo.

Las capas agregan colaboración y archivos. Para una tarea diminuta se puede usar menos estructura, pero el proyecto de aprendizaje conserva esos límites porque después cambian almacenamiento, reglas y presentación por separado. No inventamos capas vacías para sumar complejidad.

## Ejemplo de la clase

```java
@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping("/api/productos")
class ProductoController {
    private final ProductoService servicio;
    ProductoController(ProductoService servicio) { this.servicio = servicio; }
    @org.springframework.web.bind.annotation.GetMapping
    java.util.List<ProductoDTO> listar() { return servicio.listar(null); }
}
```

[Abrir el fragmento como archivo](fragmentos/clase_06.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

RestController escribe el retorno en la respuesta mediante conversión configurada. El controlador delega en el servicio y no arma SQL aquí. ProductoDTO y listar deben existir en el proyecto; el ejemplo completo incluye ambos y un repositorio.

## Cambiar una decisión y explorar un límite

Si service devuelve entidad con relaciones lazy y controller intenta serializarla fuera de contexto, se puede fallar o cargar lo no previsto. Preparar DTO dentro de service hace explícita la salida. Cambiar el color de un botón no requiere tocar repository.

## Confusión que conviene evitar

Suponer que crear archivos con sufijos Controller y Service basta si todos duplican la misma lógica.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_06.md). Las [soluciones razonadas](SOLUCIONES_06.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_05.md) · [Clase siguiente](../14_Spring/CLASE_07.md)
