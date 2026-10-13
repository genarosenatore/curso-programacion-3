# Clase 15.03 · Estados de carga, error, resultado y CORS

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_02.md) · [Clase siguiente](../15_Integracion/CLASE_04.md)

## Mostrar qué etapa vive la operación

La pantalla necesita estado inicial, cargando, resultado, vacío y error. Una lista válida vacía es diferente de un servidor caído. Antes de pedir datos muestra carga; después de validar y renderizar, resultado o vacío; ante fallo, mensaje que permita intentar otra vez. No dejes resultados viejos aparentando que corresponden a una solicitud fallida nueva.

Durante escritura, deshabilitar un botón reduce repeticiones accidentales. finally lo restaura tanto en éxito como fallo, como aprendimos con [async/await](../03_JavaScript/CLASE_12.md). Conserva los datos del formulario si falla para que se puedan corregir. Eso no implementa deduplicación real de peticiones en servidor.

## Cuando el navegador cruza orígenes

Origen combina esquema, host y puerto: localhost:5173 difiere de localhost:8080 y también de127.0.0.1:8080. **CORS** es un mecanismo por el que el servidor permite al navegador leer respuestas desde otros orígenes. No identifica usuarios ni autoriza operaciones. Un cliente fuera del navegador no queda protegido por esa restricción de lectura.

Ciertas peticiones cruzadas, como POST JSON, pueden requerir una comprobación previa OPTIONS o **preflight**. El servidor debe responder permitiendo origen, método y cabeceras apropiados. `mode:"no-cors"` no es una solución para leer JSON: puede producir una respuesta opaca que el código no puede inspeccionar.

El [cliente de apoyo](../Ejemplos/spring/README.md) se sirve desde el mismo backend y usa /api/productos; así el primer flujo no necesita CORS. Si usas Vite, define un proxy de desarrollo que reenvíe /api o configura permisos para el origen local concreto. Primero mira URL y mensajes; un404 de ruta no se arregla permitiendo todos los orígenes.

El fragmento inferior requiere estado y render definidos en la página; valida además la forma de datos antes de render. No es un script autónomo sin esa estructura.

## Ejemplo de la clase

```javascript
async function cargar() {
  estado.textContent = "Cargando...";
  try {
    const respuesta = await fetch("/api/productos");
    if (!respuesta.ok) throw new Error(`HTTP ${respuesta.status}`);
    const datos = await respuesta.json();
    render(datos);
    estado.textContent = datos.length ? "" : "Sin productos";
  } catch {
    estado.textContent = "No se pudo cargar. Intentá nuevamente.";
  }
}
```

[Abrir el fragmento como archivo](fragmentos/clase_03.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

estado y render se definen en la página completa. La URL relativa apunta al mismo origen. Si movés el frontend a Vite, definí un proxy o configuración de CORS coherente y restringida al origen de práctica. Un 404 por ruta mal escrita no se corrige concediendo todos los orígenes.

## Cambiar una decisión y explorar un límite

Detener servidor debe producir error y restaurar botón. Responder [] debe mostrar Sin productos, no error. Abrir otro puerto cambia origen; localhost y127.0.0.1 son hosts distintos aunque alcancen el mismo equipo.

## Confusión que conviene evitar

Desactivar permanentemente un botón al olvidar manejar el caso de error.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_03.md). Las [soluciones razonadas](SOLUCIONES_03.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_02.md) · [Clase siguiente](../15_Integracion/CLASE_04.md)
