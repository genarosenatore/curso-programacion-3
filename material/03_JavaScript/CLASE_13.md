# Clase 03.13 · Módulos y práctica integradora

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_12.md) · [Clase siguiente](../04_TypeScript/CLASE_01.md)

## Separar archivos por responsabilidad

Cuando un script concentra datos, cálculos y pantalla, encontrar una causa se vuelve difícil. Un **módulo** es un archivo con su propio alcance que puede exportar valores y funciones e importar los de otro. export hace disponible un nombre; import solicita ese nombre mediante una ruta. No copia y pega el texto del archivo ni convierte cada variable en global.

Para el ejemplo inferior creá calculos.js y app.js como archivos distintos. Las llaves de `import { subtotal }` indican una exportación nombrada, no crean un objeto de producto. La ruta `"./calculos.js"` parte del módulo importador y debe incluir un archivo existente. En index.html colocá `<script type="module" src="app.js"></script>`. Un archivo que contiene ambos bloques del ejemplo sin separarlos no es su forma de ejecución.

## Ejecutar por HTTP y seguir dependencias

Serví la carpeta como en [03.12](CLASE_12.md). El navegador carga app.js, resuelve su import y carga calculos.js; después puede ejecutar la llamada. Los módulos se ejecutan con alcance propio y comportamiento estricto. El script de módulo espera el análisis del documento por defecto; no necesita depender de variables globales de otro script clásico.

Empezá con una función pura subtotal(precio,cantidad), que no conoce document. Después un módulo de datos exporta un array de productos; otro de filtros exporta una función que recibe array y texto; app selecciona el DOM, registra eventos y representa la selección. La comunicación es explícita mediante argumentos y retornos, como enseñamos en [03.05](CLASE_05.md).

## Construir una integración pequeña

Primero probá subtotal con 800 y 2: 1600. Segundo probá el filtro con textos distintos y una lista vacía, sin pantalla. Tercero conectá input y render. Cuarto agregá mensajes para vacío y datos no disponibles. Si un import falla, investigá ruta y nombre antes del cálculo; si la lista duplica elementos, investigá el render y no el módulo de datos.

No hace falta dividir cada línea en un archivo. Los módulos convienen cuando aclaran tareas que pueden cambiar o comprobarse por separado. Evitá dependencias circulares donde app importa filtro y filtro importa app: la lógica puede recibir los datos necesarios sin depender de la interfaz.

## Ejemplo de la clase

```javascript
// calculos.js
export function subtotal(precio, cantidad) { return precio * cantidad; }

// app.js
import { subtotal } from "./calculos.js";
console.log(subtotal(800, 2));

// HTML: <script type="module" src="app.js"></script>
```

[Abrir el fragmento como archivo](fragmentos/clase_13.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

calculos.js expone la función; app.js la importa mediante ruta relativa y muestra 1600. El HTML carga el archivo de entrada y el navegador resuelve sus imports. Mantener nombres distintos por responsabilidad ayuda a seguir qué archivo hace cada tarea.

## Cambiar una decisión y explorar un límite

Renombrá la exportación subtotal a calcularSubtotal sin cambiar import: el nombre pedido deja de existir. Renombrar el archivo sin cambiar la ruta produce otro problema. Si cambias solo el cálculo, no debería ser necesario cambiar qué id usa la pantalla: esa independencia es el motivo de separar responsabilidades.

## Confusión que conviene evitar

Acoplar el cálculo a un id de pantalla cuando puede ser una función pura.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_13.md). Las [soluciones razonadas](SOLUCIONES_13.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_12.md) · [Clase siguiente](../04_TypeScript/CLASE_01.md)
