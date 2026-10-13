# Clase 00.01 · Qué es programar y cómo funciona una web

[Inicio](../INICIO.md) · [Guía de fundamentos](GUIA.md) · [Ejercicios](EJERCICIOS_01.md)

## Empezar sin conocimientos previos

Programar es escribir instrucciones que una computadora puede ejecutar para obtener un resultado. La computadora no entiende una intención como «cobrá lo que corresponde»: necesita datos y reglas concretas. Un **dato** representa algo que conocemos, como el precio de una lapicera; un **resultado** representa algo que calculamos, como el importe de cuatro lapiceras. Un **programa** es el conjunto de instrucciones escritas en un lenguaje que una herramienta puede interpretar o traducir.

El problema no empieza en el código. Si una compra cuesta 800 pesos por unidad y lleva cuatro unidades, queremos 3200 pesos. La **entrada** es la información inicial: 800 y 4. El **proceso** es multiplicar precio por cantidad. La **salida** es mostrar 3200. Multiplicar es adecuado porque cada unidad agrega el mismo precio; sumar 800 + 4 mezclaría dinero con un conteo.

## Un algoritmo que podés seguir a mano

Un algoritmo es una secuencia precisa de pasos para resolver una tarea. Podemos expresarlo en lenguaje cotidiano o en **pseudocódigo**, una notación para pensar que no se ejecuta directamente:

```text
Recibir el precio de una unidad.
Recibir cuántas unidades se compran.
Multiplicar el precio por la cantidad y llamar total al resultado.
Mostrar el total con su unidad: pesos.
```

Para hacer una **prueba de escritorio**, simulá esos pasos en una hoja: anotá precio = 800, cantidad = 4 y total = 3200. Si cambiás cantidad a 2, solo cambia el tercer paso: total = 1600. Si el precio no está disponible, el algoritmo todavía no tiene los datos necesarios. Identificar esa falta es parte de diseñar una solución, no un detalle de sintaxis.

## Del archivo a una página web

Una web es un conjunto de documentos y recursos que un **navegador**, como Firefox o Chrome, interpreta y muestra. Un archivo HTML puede estar en tu computadora o llegar por una red. Un **servidor** es un programa que recibe solicitudes y devuelve respuestas. Para una página remota, el navegador pide un recurso, el servidor responde con su contenido y el navegador lo interpreta. Una dirección o **URL** identifica el recurso solicitado.

**HTML** describe el contenido: títulos, párrafos, campos y botones. **CSS** describe su presentación: color, tamaño y posición. **JavaScript** expresa comportamiento: leer una cantidad, calcular y actualizar el resultado. Una página puede empezar con HTML solamente; después agregaremos cada responsabilidad cuando la comprendamos.

El **frontend** es la parte con la que interactuás en el navegador. El **backend** procesa operaciones en el servidor. Una **base de datos** organiza información que queremos conservar, por ejemplo los productos. Para ver un catálogo: el frontend solicita productos, el backend consulta los datos y responde, y el frontend los muestra. Cambiar el color de un botón no necesita consultar la base; registrar una compra sí requiere reglas que el servidor debe comprobar.

Empezaremos por archivos y estructura antes de pedirte código. Esta clase utiliza razonamiento y pseudocódigo; no necesitás instalar un lenguaje ni pegar sus bloques en una consola.

## Cambiar una decisión y explorar un límite

Con cantidad cero, el cálculo da cero. Decidir si una compra vacía se permite es una regla del problema. Con cantidad negativa, la multiplicación sigue teniendo un resultado matemático, pero no representa esta compra. No confundas «se puede calcular» con «el dato tiene sentido». Si el precio cambia entre verlo y comprar, el servidor debe confirmar el precio vigente antes de registrar el pedido.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_01.md). Las [soluciones razonadas](SOLUCIONES_01.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Guía de fundamentos](GUIA.md) · [Ejercicios](EJERCICIOS_01.md)
