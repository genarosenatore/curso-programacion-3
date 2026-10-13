# Clase 15.01 · Seguir una petición del frontend al backend

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_12.md) · [Clase siguiente](../15_Integracion/CLASE_02.md)

## Localizar la primera frontera donde cambia el resultado

Una operación integrada tiene pasos de cliente y servidor. El evento llama una función HTTP; la petición llega a controller; service decide reglas; repository obtiene o cambia datos; service prepara DTO; la respuesta llega al cliente; el render actualiza DOM. No todas las operaciones consultan base, pero este recorrido permite seguir un CRUD persistente.

Usá los fundamentos de [eventos](../03_JavaScript/CLASE_09.md), [fetch](../03_JavaScript/CLASE_12.md) y [capas](../14_Spring/CLASE_06.md). En las herramientas de desarrollo del navegador, Red o Network muestra método, URL, cuerpo, estado y respuesta. Consola muestra errores del JavaScript. El log del servidor ayuda después de que la petición alcanzó backend.

## Investigar un caso concreto

Abre [el cliente de la API de apoyo](../Ejemplos/spring/README.md) tras iniciar el servidor. Crea un producto y observa el POST. Si no aparece solicitud, revisa listener y validación de formulario. Si llega400, compara cuerpo con ProductoRequest. Si201 trae DTO correcto y no se ve la tarjeta, sigue parseo, validación de forma y render antes de cambiar repository.

Si201 no trae el id esperado, revisa contrato/mapeo del backend. Si GET posterior no encuentra, investiga identidad usada, entorno y transacción. Cada evidencia acota la etapa; cambiar todas a la vez puede introducir nuevas causas.

Escribí un informe de caso: acción, datos, petición exacta, respuesta, salida esperada y observada. Un ejemplo mínimo conserva el fallo sin miles de archivos irrelevantes, como practicamos en [00.04](../00_Fundamentos/CLASE_04.md). No atribuyas automáticamente a CORS cualquier problema de red:404 o400 pueden tener otras causas concretas.

El diagrama inferior es ilustrativo y no se ejecuta. El proyecto local sí entrega cliente y backend coherentes, sin cuentas ni pagos. Para otros proyectos, verifica sus configuraciones y contratos antes de copiar este flujo.

## Ejemplo de la clase

```text
Botón → evento → función cliente HTTP → petición
→ Controller → Service → Repository → base
→ DTO → respuesta → cliente HTTP → render
```

[Abrir el fragmento como archivo](fragmentos/clase_01.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

No todas las operaciones consultan la base, pero este recorrido representa un CRUD persistente típico. Una respuesta útil incluye el id creado. Volver a consultar por ese id comprueba la persistencia mejor que solo mostrar un mensaje de éxito.

## Cambiar una decisión y explorar un límite

Detén servidor: hay un error de conexión previo a controller. Cambia solo un selector de render: HTTP puede seguir correcto y fallar pantalla. Cambia la ruta de cliente: el servidor puede responder404 sin llegar al método deseado.

## Confusión que conviene evitar

Resolver todo error cambiando CORS sin observar la respuesta o el evento.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_01.md). Las [soluciones razonadas](SOLUCIONES_01.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_12.md) · [Clase siguiente](../15_Integracion/CLASE_02.md)
