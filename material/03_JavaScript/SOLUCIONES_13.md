# Soluciones 03.13 · Módulos y práctica integradora

[Clase](CLASE_13.md) · [Práctica](EJERCICIOS_13.md)

## 1. Razonamiento de la actividad guiada

datos.js exporta productos; filtros.js exporta filtrar(productos,texto) usando trim, toLowerCase y filter; app.js importa ambos, escucha input y renderiza la selección con textContent. Cuando la selección está vacía, muestra Sin resultados. Consultá el ejemplo ejecutable de la unidad.

## 2 y 3. Resolver y justificar las decisiones

operaciones.js: `export function doble(n) { return n * 2; }`; app.js: `import { doble } from "./operaciones.js"; console.log(doble(5));`. El resultado es 10 al cargar app como módulo por HTTP.

En filtros.js, exportá `function filtrarNombres(nombres,texto) { const buscado=texto.trim().toLowerCase(); return nombres.filter(n => n.toLowerCase().includes(buscado)); }`. Con Cuaderno, Lapicera y Mochila, "la" devuelve las dos últimas, "" devuelve todas y "xyz" ninguna. El criterio de búsqueda vacía está definido conscientemente. Con pantalla, app leería el input y representaría ese array; filtros seguiría recibiendo valores y retornando valores.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
