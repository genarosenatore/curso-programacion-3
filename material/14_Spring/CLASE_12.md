# Clase 14.12 · Práctica: CRUD de cursos y facturación

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_11.md) · [Clase siguiente](../15_Integracion/CLASE_01.md)

## Verificar un CRUD por recorrido y estado

Un CRUD completo no es solo cinco métodos con anotaciones. Debe definir entrada, reglas, existencia, persistencia, salida y errores. Empezá con el proyecto pequeño de productos; después trasladá la misma estructura a cursos o facturación sin asumir que sus reglas son idénticas.

La ficha de POST incluye JSON recibido, validación, construcción, transacción, identidad creada y respuesta201. La de PUT incluye id existente, todos los campos editables y consulta posterior. La de DELETE incluye política de relaciones y204 sin cuerpo. Los casos inválidos son parte del contrato, no tareas opcionales para el final.

## Ejecutar una prueba progresiva

Seguí [el README](../Ejemplos/spring/README.md) y [peticiones.http](../Ejemplos/spring/peticiones.http). Primero lista los datos iniciales. Crea un recurso, conserva id y Location y vuelve a obtenerlo. Cambia precio o stock y consulta otra vez. Elimina y confirma ausencia. Luego prueba nombre vacío, precio negativo y ruta con id no numérico.

Registra acción, HTTP, cuerpo y estado posterior. Si una petición inválida no cambia la lista, verifica la coherencia que la validación prometía. Una captura de pantalla de «Guardado» no comprueba ni código ni cambio posterior.

Para cursos, define sus campos reales sin reutilizar stock por comodidad. Para factura, resolver cliente y artículos, calcular detalles y total en backend y guardar bajo una transacción. El DTO del navegador no determina importe final. Una política fiscal o anulación debe proceder de la consigna, no de una extrapolación del CRUD de productos.

El bloque inferior es un guion de prueba, no programa autónomo. Los proyectos originales del campus pueden requerir ajustes y sus dependencias propias; el ejemplo de apoyo define un entorno limitado y conocido para estudiar cada mecanismo primero.

## Ejemplo de la clase

```text
Caso 1: POST válido → 201 y producto con id
Caso 2: GET del id → 200 y datos guardados
Caso 3: PUT del id → 200 y datos cambiados
Caso 4: DELETE del id → 204 sin cuerpo
Caso 5: GET del id borrado → 404
Caso 6: POST con nombre vacío → 400
```

[Abrir el fragmento como archivo](fragmentos/clase_12.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Ejecutá el proyecto de apoyo siguiendo su README. Los comandos de prueba HTTP están en un archivo .http y también se describen en la guía. Cuando cierres y reinicies el proyecto, los datos de H2 se reconstruyen. Después trasladá estas ideas al CRUD de cursos y a la consigna de facturas.

## Cambiar una decisión y explorar un límite

Reiniciar H2 vuelve a datos iniciales por configuración. Consultar después de crear en el mismo arranque verifica persistencia del proceso; conservar datos entre arranques requiere otro entorno. Esa diferencia debe aparecer en tu registro.

## Confusión que conviene evitar

Tomar la confirmación visual de una pantalla como prueba suficiente de que el backend guardó los datos.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_12.md). Las [soluciones razonadas](SOLUCIONES_12.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_11.md) · [Clase siguiente](../15_Integracion/CLASE_01.md)
