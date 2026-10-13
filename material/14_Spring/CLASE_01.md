# Clase 14.01 · HTTP: URL, petición, respuesta, JSON y códigos de estado

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_08.md) · [Clase siguiente](../14_Spring/CLASE_02.md)

## Un intercambio con partes identificables

HTTP es el protocolo que organiza peticiones y respuestas entre cliente y servidor. Una **URL** tiene esquema (http), host (127.0.0.1), puerto (8080), ruta (/api/productos/1) y opcionalmente consulta (?nombre=cuaderno). El host identifica dónde conectar; la ruta qué recurso o punto del programa solicita. Un puerto es una entrada numerada donde escucha un servicio.

Una petición incluye método, destino, cabeceras y a veces cuerpo. Una **cabecera** describe cómo interpretar el intercambio, como Content-Type: application/json. El cuerpo contiene datos, por ejemplo un producto. Una respuesta tiene código de estado, cabeceras y cuerpo opcional. JSON es un formato del cuerpo, no el protocolo ni un programa Java enviado para ejecutar.

## Seguir una consulta antes de crear

Para `GET http://127.0.0.1:8080/api/productos/1`, el cliente pide un producto. El servidor decide si existe, prepara sus datos y devuelve200 más JSON o404 según el contrato. Recibir404 demuestra respuesta HTTP, pero no éxito de la operación solicitada. fetch puede resolver en ambos y debe comprobar ok, como en [03.12](../03_JavaScript/CLASE_12.md).

POST del ejemplo inferior envía nombre, precio y stock para crear.201 indica creación y Location puede señalar la URL nueva;200 éxito con datos y204 éxito sin contenido.400 indica petición inválida,401 falta de autenticación válida,403 operación no permitida y500 fallo inesperado del servidor. Los últimos estados se enseñan para distinguir causas; el CRUD local no implementa cuentas ni autorización.

El bloque HTTP es una representación ilustrativa de petición y respuesta, no un archivo que se ejecute entero. Tras iniciar [el proyecto de apoyo](../Ejemplos/spring/README.md), podés abrir una URL GET en el navegador o ejecutar `curl.exe -i http://127.0.0.1:8080/api/productos/1` desde PowerShell. -i incluye cabeceras. Para crear usá peticiones.http en un cliente compatible o el formulario de la página del proyecto; el archivo no se envía solo al abrirse.

Una respuesta204 no lleva JSON y no debe pasar a json(). Elegir códigos y cuerpos coherentes permite que la interfaz informe qué ocurrió sin adivinarlo.

## Ejemplo de la clase

```http
POST /api/productos
Content-Type: application/json

{"nombre":"Cuaderno","precio":2000.00,"stock":3}

Respuesta esperada: 201 Created, Location y JSON del producto creado.
```

[Abrir el fragmento como archivo](fragmentos/clase_01.http) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El cliente no envía un programa Java, sino datos. El backend valida y crea una representación persistente. Location puede señalar el recurso recién creado. Una respuesta 204 no debería intentar parsearse como JSON porque no lleva cuerpo.

## Cambiar una decisión y explorar un límite

Consultá999:404. Detené servidor y consultá de nuevo: ahora falla la conexión y no hay respuesta404. Son causas distintas. Interpretar204 como JSON falla al leer cuerpo vacío, aunque DELETE haya sido exitoso.

## Confusión que conviene evitar

Confundir que la conexión respondió con que la operación del negocio salió bien.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_01.md). Las [soluciones razonadas](SOLUCIONES_01.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_08.md) · [Clase siguiente](../14_Spring/CLASE_02.md)
