# Soluciones 04.06 · Node.js, npm, package.json y scripts

[Clase](CLASE_06.md) · [Práctica](EJERCICIOS_06.md)

## 1. Razonamiento de la actividad guiada

Compartí código fuente, package.json y package-lock.json. node_modules contiene los paquetes instalados y normalmente no se agrega al repositorio; npm ci puede recrearlos usando el bloqueo. Una dependencia del servidor que se usa al ejecutar es distinta de una herramienta de compilación.

## 2 y 3. Resolver y justificar las decisiones

check invoca tsc --noEmit y build invoca la compilación que genera dist/main.js según tsconfig. Conservá package.json para tareas y dependencias, package-lock.json para resoluciones, tsconfig para opciones y src para el código. node_modules puede recrearse con npm ci; no reemplaza tus archivos. Una página puede seguir mostrando JavaScript anterior si modificaste TS sin ejecutar build.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
