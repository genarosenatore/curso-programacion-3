# Clase 1 · Qué es programar y cómo funciona una página web

[Inicio](../INICIO.md) · [Guía de fundamentos](GUIA.md) · [Ejercicios](EJERCICIOS_01.md)

## Objetivo

Al terminar, vas a poder explicar qué es un programa, identificar entrada, proceso y salida, y distinguir las funciones de HTML, CSS y JavaScript. No necesitás escribir código ni instalar herramientas todavía.

## 1. Empecemos con un problema conocido

Imaginá que una tienda necesita calcular cuánto pagar por una compra. Una persona lleva tres cuadernos que cuestan 2.000 pesos cada uno.

Podemos resolverlo así:

1. Conocer el precio de un cuaderno: 2.000.
2. Conocer la cantidad: 3.
3. Multiplicar precio por cantidad: 2.000 × 3.
4. Mostrar el total: 6.000 pesos.

Acabamos de describir una solución mediante pasos. Un **algoritmo** es una secuencia definida de pasos para resolver un problema. Todavía no elegimos un lenguaje de programación.

**Programar** consiste en expresar una solución mediante instrucciones que una computadora pueda ejecutar. Un **programa** es el conjunto de instrucciones escrito para realizar una tarea. Un **lenguaje de programación** proporciona reglas para expresar esas instrucciones.

La computadora realiza las operaciones indicadas. Si escribimos una multiplicación cuando necesitábamos una suma, puede ejecutar correctamente la instrucción y producir un resultado equivocado para nuestro problema. Por eso necesitamos entender el problema y comprobar la solución.

## 2. Entrada, proceso y salida

Estas tres preguntas nos ayudan a organizar muchos problemas:

| Parte | Pregunta | En la compra |
|---|---|---|
| Entrada | ¿Qué datos recibimos? | Precio y cantidad |
| Proceso | ¿Qué hacemos con los datos? | Multiplicar precio por cantidad |
| Salida | ¿Qué resultado obtenemos? | Total de la compra |

Un **dato** es un valor con el que trabajamos: un precio, una cantidad, un nombre o una fecha. Un **resultado** es lo que obtenemos después de procesar los datos.

No toda entrada viene del teclado y no toda salida se muestra en pantalla. Un programa también puede recibir datos de otro programa o guardar su resultado en un archivo. Para comenzar usaremos ejemplos de entrada y salida sencillos.

### Ejemplo guiado

Una cafetería vende dos cafés a 1.500 pesos cada uno.

- Entrada: precio = 1.500; cantidad = 2.
- Proceso: 1.500 × 2.
- Salida: total = 3.000.

Si cambiamos la cantidad a cuatro, conservamos los mismos pasos y obtenemos 6.000. Esto muestra por qué un algoritmo puede servir para distintos datos.

## 3. Escribir los pasos sin aprender sintaxis todavía

La **sintaxis** es el conjunto de reglas para escribir instrucciones en un lenguaje. Primero podemos pensar con **pseudocódigo**: una forma de describir pasos parecida al lenguaje cotidiano. No se ejecuta directamente en la computadora y no tiene una única notación universal.

```text
INICIO
    LEER precio
    LEER cantidad
    CALCULAR total COMO precio POR cantidad
    MOSTRAR total
FIN
```

Leelo de arriba hacia abajo:

- LEER significa recibir un dato.
- CALCULAR indica la operación que necesitamos realizar.
- MOSTRAR indica qué resultado queremos comunicar.
- INICIO y FIN delimitan la secuencia.

En este ejemplo asumimos que precio y cantidad son datos válidos. Más adelante aprenderemos a comprobar que un precio no sea negativo y que una cantidad tenga sentido. No necesitamos resolver esas validaciones hoy.

## 4. Cómo comprobamos una solución

Una **prueba de escritorio** consiste en seguir los pasos manualmente para observar qué pasa con los datos.

| Paso | Qué sabemos después del paso |
|---|---|
| Recibir precio | precio = 1.500 |
| Recibir cantidad | cantidad = 2 |
| Calcular total | total = 3.000 |
| Mostrar total | La persona ve 3.000 |

Ahora imaginá que, por error, el proceso fuera precio + cantidad. Obtendríamos 1.502. La cuenta está bien hecha, pero la operación elegida no resuelve la compra. Eso es un **error de lógica**.

La idea es comprobar lo que hacemos con casos cuyo resultado podamos anticipar. Equivocarse forma parte del aprendizaje; el paso útil es localizar dónde se desvía el resultado.

## 5. Qué es una página web

Una página web es un documento que el **navegador**, por ejemplo Chrome o Edge, puede interpretar y mostrar. Una aplicación web puede reunir varias páginas y agregar funciones como buscar productos, guardar un carrito o crear pedidos.

Un **sitio web** es un conjunto de páginas y recursos relacionados. Un **servidor** es un sistema que recibe solicitudes y ofrece recursos o servicios. Puede estar en otra computadora o ejecutarse en la tuya durante el desarrollo.

Cuando visitás una web, un recorrido habitual es:

1. Ingresás una dirección en el navegador.
2. El navegador solicita al servidor la página y los recursos necesarios.
3. El servidor devuelve una respuesta.
4. El navegador interpreta el contenido y lo muestra.

Ese intercambio se realiza habitualmente mediante **HTTP**, un conjunto de reglas de comunicación. **HTTPS** añade protección al intercambio mediante cifrado. Más adelante veremos una petición real; por ahora alcanza con entender «solicitud y respuesta».

También podés abrir un archivo HTML guardado en tu computadora. En ese caso no hace falta que un servidor remoto envíe ese archivo.

## 6. HTML, CSS y JavaScript: tres funciones

Tomemos una tarjeta de producto con nombre, precio y un botón para agregar al carrito.

| Tecnología | Función | Ejemplo en la tarjeta |
|---|---|---|
| HTML | Describe el contenido y su estructura | Nombre, precio y botón |
| CSS | Define la presentación | Colores, tamaño y espacio entre elementos |
| JavaScript | Añade lógica y comportamiento | Al pulsar el botón, actualizar el carrito |

HTML es un lenguaje de marcado: utiliza etiquetas para describir contenido. CSS es un lenguaje de estilos. JavaScript es un lenguaje de programación. Los vamos a aprender en ese orden para construir primero algo que podamos ver y después darle comportamiento.

Una página simple puede funcionar sin CSS o JavaScript. Las tres herramientas cumplen funciones distintas y suelen trabajar juntas.

## 7. Frontend y backend

El **frontend** es la parte de la aplicación con la que la persona interactúa en el navegador. En nuestro recorrido usaremos HTML, CSS, JavaScript y TypeScript para construirlo.

El **backend** es la parte que procesa solicitudes en el servidor. Puede aplicar reglas y trabajar con una base de datos. En nuestro curso lo construiremos con Java y Spring Boot.

Una **base de datos** permite organizar y conservar información. Por ejemplo, los productos de una tienda y sus pedidos.

Considerá este recorrido:

```text
Persona pulsa «Ver productos»
            ↓
Frontend solicita los productos
            ↓
Backend consulta los datos
            ↓
Backend responde con los productos
            ↓
Frontend los muestra en la página
```

No todas las acciones necesitan consultar al backend: cambiar el color de un elemento puede resolverse completamente en el frontend. Tampoco toda respuesta requiere consultar una base de datos.

## 8. Práctica guiada

Queremos una página que calcule el total de una compra cuando la persona ingresa precio y cantidad.

Antes de ver una posible respuesta, pensá: ¿qué aporta cada tecnología?

Una forma de repartir el trabajo sería:

- HTML: dos campos para ingresar datos, un botón y un espacio para el resultado.
- CSS: organizar los campos y hacer legible el resultado.
- JavaScript: tomar los valores, multiplicarlos y mostrar el total.

El cálculo básico puede hacerse en el navegador. Si después esa compra crea un pedido, un backend puede comprobar los precios vigentes, validar el pedido y guardarlo.

## 9. Tu práctica

Abrí [los ejercicios de la clase](EJERCICIOS_01.md). Podés responder en el chat o en un archivo de texto. Empezá por los ejercicios 1 y 2 y pasame tus respuestas; los siguientes quedan disponibles para seguir cuando estés listo.

## 10. Resumen para repasar

- Un algoritmo describe una solución mediante pasos.
- Programar expresa esos pasos en instrucciones ejecutables.
- Entrada, proceso y salida ayudan a entender un problema.
- El pseudocódigo permite pensar antes de aprender una sintaxis concreta.
- Una prueba de escritorio ayuda a comprobar una solución.
- El navegador interpreta la página; un servidor puede entregarle recursos y responder solicitudes.
- HTML organiza, CSS presenta y JavaScript aporta comportamiento.
- El frontend interactúa con la persona; el backend procesa solicitudes del lado del servidor.

## 11. Cuándo seguimos

Podés avanzar si explicás con tus palabras qué es un algoritmo, identificás entrada/proceso/salida en un ejemplo y distinguís HTML, CSS y JavaScript. Si alguno de esos puntos cuesta, lo trabajamos con otro caso.

La próxima clase es [Archivos, carpetas, extensiones y editor de código](CLASE_02.md). Ya está preparada para continuar cuando quieras.

## Navegación del curso

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase siguiente](../00_Fundamentos/CLASE_02.md)
