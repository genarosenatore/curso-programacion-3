# Clase 14.05 · Configuración, starters y perfiles

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_04.md) · [Clase siguiente](../14_Spring/CLASE_06.md)

## Separar el entorno de la regla del negocio

Una propiedad configura un recurso: puerto, URL de base o nivel de log. No debería cambiar la lógica de cómo validar una cantidad. application.properties utiliza `clave=valor`; una línea por propiedad y # para comentario. Es texto de configuración, no declaraciones de variables Java.

El ejemplo configura H2 **en memoria**, una base dentro del proceso. jdbc es el mecanismo Java de comunicación con bases mediante un driver; jdbc:h2:mem:curso identifica ese motor y ubicación. create-drop genera el esquema del modelo al iniciar y lo elimina al cerrar según el ciclo del entorno. No conserva pedidos tras reiniciar y no es una estrategia de producción.

## Condiciones y perfiles

Los starters reúnen dependencias y la autoconfiguración prepara beans cuando se cumplen condiciones de bibliotecas, propiedades y componentes existentes. No «adivina todo el proyecto». El starter data-jpa no incluye automáticamente cualquier driver de tu base: el ejemplo declara H2 aparte. La validación también tiene su starter explícito.

Un **perfil** selecciona configuración adicional, por ejemplo application-practica.properties cuando practica está activo. `spring.profiles.active=practica` o argumentos de arranque pueden activarlo. No copies secretos reales al repositorio; una configuración externa debe ubicarlos en el entorno apropiado. Mantener varios archivos no garantiza que el perfil deseado esté activo: mirá el log.

open-in-view=false evita depender de un contexto persistente mantenido durante toda la respuesta web; por eso el servicio prepara DTO dentro de transacción. No cambia las anotaciones de carga ni convierte EAGER en una sola consulta. La configuración enseña a delimitar responsabilidades.

Probá cambiar solo server.port en tu copia y usá esa URL nueva. Si el frontend utiliza una ruta relativa desde el mismo servidor, la sigue; si tiene puerto fijo, deberás actualizarlo. Configuración coherente entre cliente y servidor forma parte de la prueba.

## Ejemplo de la clase

```properties
spring.datasource.url=jdbc:h2:mem:curso
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.open-in-view=false
server.port=8080
```

[Abrir el fragmento como archivo](fragmentos/clase_05.properties) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La base vive en el proceso y los datos se reinician al apagar. open-in-view=false delimita acceso persistente fuera del servicio y motiva construir DTO dentro de la transacción. Si el puerto está ocupado, podés usar otro y cambiar la URL del frontend de manera coherente.

## Cambiar una decisión y explorar un límite

Cambiar mem a una URL de archivo cambia durabilidad y necesita revisar esquema y datos iniciales, no solo un nombre. create-drop puede borrar lo que querías conservar. Cambiar puerto sin destino del cliente produce petición a otro servicio o falla de conexión.

## Confusión que conviene evitar

Cambiar el puerto del servidor y no cambiar el destino de las peticiones del frontend.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_05.md). Las [soluciones razonadas](SOLUCIONES_05.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_04.md) · [Clase siguiente](../14_Spring/CLASE_06.md)
