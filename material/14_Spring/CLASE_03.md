# Clase 14.03 · Spring, Spring Boot y primer proyecto

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_02.md) · [Clase siguiente](../14_Spring/CLASE_04.md)

## Arrancar infraestructura sin construirla a mano

Spring administra componentes y colaboraciones. Spring Boot utiliza esa base para ofrecer arranque, dependencias agrupadas y configuración automática condicionada. No escribe tus reglas de stock ni convierte cualquier método en una API. Un **starter** agrupa dependencias para una capacidad, como web; el servidor embebido evita desplegar primero en un servidor externo.

El proyecto entregado fija Java21 y Spring Boot3.5.16; usá esa configuración para reproducirlo. No hace falta elegir «la última» a mitad del estudio. Necesitás Maven y las descargas iniciales que declara pom.xml. El README permite comprobar versiones, compilar y arrancar, y detalla los datos que se reinician.

## Seguir la clase de entrada

`@SpringBootApplication` reúne configuración, autoconfiguración y búsqueda de componentes. Aplicacion está en paquete curso, raíz del código del ejemplo, para encontrar componentes debajo. `SpringApplication.run(Aplicacion.class,args)` crea el contexto y arranca capacidades presentes, como servidor web cuando corresponde. Aplicacion.class es descriptor de tipo, como vimos en [Reflection](../09_Genericos_Reflection/CLASE_04.md).

Desde [la carpeta del proyecto](../Ejemplos/spring/README.md), ejecutá `mvn compile` para comprobar y `mvn spring-boot:run` para iniciar. Esperá que termine el arranque antes de abrir http://127.0.0.1:8080. Ctrl+C detiene el proceso. Un log de «puerto ocupado» no se resuelve modificando un DTO; cambiá puerto o cerrá el servicio que lo usa según tu entorno.

La clase inferior es un arranque mínimo ilustrativo. La Aplicacion real también prepara datos de ejemplo y necesita las clases del proyecto; no la reemplaces ciegamente por este bloque. Copiarla a un proyecto Java vacío no trae dependencias Spring: los imports solo hacen accesibles nombres disponibles.

Primero probá listado y una creación sin alterar configuración. Después cada clase de esta unidad identificará las piezas detrás de esa respuesta, para que no dependas de memorizar anotaciones.

## Ejemplo de la clase

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

## Qué ocurre al seguirlo

La clase se ubica en el paquete raíz curso para detectar componentes debajo. SpringApplication inicia el contexto y la aplicación web si las dependencias lo indican. En el proyecto de apoyo, pom.xml declara web, validation, data-jpa y H2. Su README explica Maven y arranque.

## Cambiar una decisión y explorar un límite

Mover Aplicacion a un paquete que no contiene los controllers puede dejar fuera su detección. El servidor podría arrancar y devolver404 para rutas esperadas. Quitar el starter web cambia las capacidades: la anotación sola no garantiza HTTP.

## Confusión que conviene evitar

Copiar una clase Spring a un proyecto Java vacío y esperar que sus imports existan.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_03.md). Las [soluciones razonadas](SOLUCIONES_03.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_02.md) · [Clase siguiente](../14_Spring/CLASE_04.md)
