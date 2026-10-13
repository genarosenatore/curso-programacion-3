# Clase 14.04 · Beans, ApplicationContext e inyección de dependencias

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_03.md) · [Clase siguiente](../14_Spring/CLASE_05.md)

## Entregar colaboradores a un objeto

Un **bean** es un objeto que Spring crea o registra y administra en un ApplicationContext, su contenedor. La **inyección de dependencias** entrega a ese objeto los colaboradores que necesita. ProductoService declara un repositorio en su constructor en vez de construirlo por dentro con new: así sus requisitos son visibles y la configuración puede elegir la implementación.

@Service identifica una responsabilidad de servicio y participa en detección como componente. @Component es la marca general; @Repository y @Controller son especializaciones con funciones propias. @Bean en un método de configuración permite registrar el objeto devuelto cuando no conviene detectarlo por su clase. Una anotación necesita estar dentro del alcance configurado de búsqueda.

## Seguir la construcción

Al arrancar, Spring encuentra el servicio, resuelve qué bean satisface ProductoRepository y llama al constructor con él. La referencia final conserva el colaborador; no crea la implementación. Con un único constructor no se necesita @Autowired para ese caso. Si falta un bean o hay varios candidatos sin elección, el contexto puede fallar y el mensaje indica la dependencia que no pudo resolver.

El fragmento inferior es parte del [proyecto](../Ejemplos/spring/README.md). No defines otra clase ProductoService con el mismo nombre allí; inspeccioná la existente y el constructor del controller. Para una prueba pequeña, el patrón permite construir manualmente una clase ordinaria con un colaborador de prueba, pero un servicio que usa proxies transaccionales requiere considerar esa gestión.

El alcance usual singleton conserva una instancia por definición de bean en ese contexto. No significa una instancia en todo el universo ni que sea segura ante estado mutable compartido. No guardes cantidad de la compra de cada usuario en un campo de un servicio singleton: dos peticiones podrían interferir. Mantén esos datos en parámetros y variables locales o almacenamiento diseñado para el caso.

## Ejemplo de la clase

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

## Qué ocurre al seguirlo

Spring crea el servicio y le entrega el repositorio gestionado. Con un único constructor no es necesario añadir @Autowired en este caso. final fija la referencia del colaborador. Crear el servicio con new por tu cuenta evita la gestión y puede omitir inyección y proxies.

## Cambiar una decisión y explorar un límite

Hacer new ProductoService(repositorio) manualmente construye Java, pero no garantiza proxies ni la gestión de Spring. final impide reemplazar el campo, pero no vuelve inmutable el repositorio ni sus datos.

## Confusión que conviene evitar

Usar variables de instancia para datos de cada pedido en un singleton compartido.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_04.md). Las [soluciones razonadas](SOLUCIONES_04.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_03.md) · [Clase siguiente](../14_Spring/CLASE_05.md)
