# Soluciones 04.09 · Práctica: API de Los Simpsons

[Clase](CLASE_09.md) · [Práctica](EJERCICIOS_09.md)

## 1. Razonamiento de la actividad guiada

Al cargar, validá el array local; escuchá input del buscador; renderizá filtrar(personajes,campo.value) con textContent. Si el array queda vacío, mostrás Sin resultados. Una búsqueda vacía debe conservar ambos. Antes de cambiar al servicio, revisá el contrato y sus límites de paginación.

## 2 y 3. Resolver y justificar las decisiones

Las salidas son [Lisa], ambos y []. En pantalla guardá personajes después de validarlos; input llama filtrar(personajes,campo.value) y el render reemplaza hijos. Si carga falla, mostrá «No se pudo cargar»; si una selección válida queda vacía, «Sin resultados». Para una API revisá envoltorio, nombres de propiedades y cómo solicitar páginas. No afirmes que un filtro local examina personajes aún no descargados.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
