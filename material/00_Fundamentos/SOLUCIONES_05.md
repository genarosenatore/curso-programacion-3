# Soluciones 00.05 · Git y GitHub: guardar versiones y comprender un repositorio

[Clase](CLASE_05.md) · [Práctica](EJERCICIOS_05.md)

## 1. Razonamiento de la actividad guiada

git status muestra el archivo modificado. git add prepara su versión actual y git commit registra otro cambio con un mensaje concreto. Los cambios pequeños facilitan entender y revertir una decisión. Un commit no sube archivos automáticamente a GitHub.

## 2 y 3. Resolver y justificar las decisiones

Tras editar: modificado en la carpeta. Tras add: preparado, con posibilidad de nuevas ediciones posteriores. Tras commit: incluido en la historia. Si solo preparás index.html, el otro archivo queda pendiente aunque lo hayas guardado. Usá status y diff --staged para comprobarlo. Dividir cambios permite entender qué decisión tomó cada versión y facilita revisar su resultado.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
