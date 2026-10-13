# Clase 11.07 · Transacciones: confirmar o revertir cambios

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_06.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_08.md)

## Confirmar una operación completa

Una transacción agrupa cambios que deben aceptarse o descartarse juntos. BEGIN inicia en SQLite; COMMIT confirma; ROLLBACK descarta los cambios no confirmados de ese grupo. **Atomicidad** significa que no debe quedar solo una parte de la operación definida, como cabecera de factura sin sus detalles requeridos.

Durante el ejemplo, la conexión observa su actualización a210000; después de rollback vuelve a200000. Ejecutá el fragmento con --tienda: el lanzador carga y confirma primero los datos base para que BEGIN pueda empezar la práctica. Iniciar otra transacción dentro de una ya activa puede requerir mecanismos distintos, como savepoints; no es necesario para esta prueba.

## Error no equivale a rollback solicitado

Una restricción puede rechazar una sentencia sin descartar automáticamente todas las anteriores de la transacción. El comportamiento depende del motor y la política de errores. La aplicación debe manejar el fallo y decidir rollback del conjunto cuando el negocio lo exige. Confirmar cabecera antes de detalles impide revertir ambos como una sola operación.

**Consistencia** significa conservar reglas declaradas y de negocio; **aislamiento**, cómo interactúan transacciones simultáneas; **durabilidad**, conservar lo confirmado según el almacenamiento. Nuestra base en memoria practica confirmación y reversión, pero desaparece al cerrar: no sirve para verificar conservación después de apagar. Una base en archivo puede hacerlo.

Cuando dos personas compran el último producto, leer stock suficiente en cada una no basta por sí solo. Se necesitan restricciones y una estrategia de concurrencia además de transacción. No agregaremos un sistema de reservas a esta práctica, pero evitamos presentar @Transactional futuro como solución automática de todas las carreras.

## Ejemplo de la clase

```sql
BEGIN;
UPDATE producto SET precio_centavos=210000 WHERE id=1;
SELECT precio_centavos FROM producto WHERE id=1;
ROLLBACK;
SELECT precio_centavos FROM producto WHERE id=1;
```

[Abrir el fragmento como archivo](fragmentos/clase_07.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Dentro de la transacción se observa el valor nuevo en esa conexión. Después de ROLLBACK vuelve al valor anterior. Para conservarlo usaríamos COMMIT. La guía de ejecución SQL entrega un ejemplo con base en memoria para experimentar sin afectar datos externos.

## Cambiar una decisión y explorar un límite

Reemplazá ROLLBACK por COMMIT: el último SELECT sigue mostrando210000 dentro de la ejecución. Lanzar un error después de commit no deshace ese cambio confirmado. Elegir el límite de la operación es parte del diseño.

## Confusión que conviene evitar

Confundir una operación de múltiples sentencias con una transacción aunque no esté configurada.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_07.md). Las [soluciones razonadas](SOLUCIONES_07.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_06.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_08.md)
