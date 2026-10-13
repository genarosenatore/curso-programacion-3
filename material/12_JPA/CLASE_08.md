# Clase 12.08 · Transacciones y consistencia

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_07.md) · [Clase siguiente](../12_JPA/CLASE_09.md)

## El límite de negocio va más allá de un método de repositorio

Crear factura con detalles, o descontar stock y registrar pedido, reúne operaciones relacionadas. La transacción debe abarcar todo el conjunto coherente. Una transacción por cada llamada de guardado puede confirmar una parte antes de detectar que otra falla.

En JPA independiente, EntityTransaction permite begin, commit y rollback. En [el laboratorio](../Ejemplos/persistencia/README.md) está explícito: ante RuntimeException, si sigue activa se revierte y se propaga la causa. Así podés estudiar el límite antes de Spring. Confirmar no garantiza que tus cálculos fueran correctos; las reglas se verifican antes de escritura.

## Qué anuncia el fragmento de Spring

El ejemplo inferior adelanta @Transactional de Spring, que desarrollaremos en [14.11](../14_Spring/CLASE_11.md). Un **bean** es un objeto administrado por su contenedor; un **proxy** es un objeto intermediario que envuelve llamadas para añadir comportamiento. En modo habitual, otro componente llama al proxy del servicio y este abre o participa en la transacción.

Una llamada interna con this al propio método no cruza ese intermediario y puede no activar la anotación. Por defecto el rollback se aplica a RuntimeException y Error, no a toda excepción comprobada; rollbackFor permite configurar casos adicionales. Capturar y ocultar la excepción dentro puede hacer que el gestor perciba salida normal.

El fragmento requiere un servicio administrado, em obtenido del contexto y Producto con setter: no es código autónomo de consola. Para estudiar hoy ejecutá la versión explícita del laboratorio y compará las responsabilidades; al llegar a Spring reemplazaremos preparación manual por configuración gestionada.

Aislamiento y concurrencia siguen siendo importantes. Dos operaciones pueden leer disponibilidad antigua; una transacción sola no define reserva ni estrategia de bloqueo. Usa restricciones, condiciones de actualización o control de versión cuando el caso lo requiera, sin convertir esta práctica en un sistema completo de ventas.

## Ejemplo de la clase

```java
@org.springframework.transaction.annotation.Transactional
public void cambiarNombre(Long id, String nombre) {
    Producto p = em.find(Producto.class, id);
    if (p == null) throw new IllegalArgumentException("No existe");
    p.setNombre(nombre);
}
```

[Abrir el fragmento como archivo](fragmentos/clase_08.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Este método pertenece a un servicio gestionado y se llama desde otro componente. El EntityManager se inyecta apropiadamente. Al devolver normalmente puede confirmarse el cambio; ante un fallo que cumple las reglas de rollback se revierte. El nombre también debe validarse, omitido aquí para concentrarse en el límite transaccional.

## Cambiar una decisión y explorar un límite

Lanzar un fallo después de guardar un primer dato pero antes de commit debe revertir ese conjunto. Capturarlo y devolver éxito sin rollback puede conservar cambios parciales. Llamar un método anotado por this no es equivalente a entrar por un proxy.

## Confusión que conviene evitar

Capturar todo error y retornar éxito aunque faltó guardar una parte.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_08.md). Las [soluciones razonadas](SOLUCIONES_08.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_07.md) · [Clase siguiente](../12_JPA/CLASE_09.md)
