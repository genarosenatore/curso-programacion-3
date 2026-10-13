# Soluciones 02.01 · Conectar CSS y usar selectores

[Clase](CLASE_01.md) · [Práctica](EJERCICIOS_01.md)

## 1. Razonamiento de la actividad guiada

.aviso { background-color: #fef08a; color: #1f2937; }. En ambos párrafos usá class="aviso". Confirmá que un tercer párrafo sin esa clase no reciba el fondo.

## 2 y 3. Resolver y justificar las decisiones

En estilos.css: `.nota { color: #075985; background-color: #e0f2fe; }` y `.tarjeta p { color: #334155; }`. El párrafo sin nota no recibe ese fondo. Los article comparten class="tarjeta", por lo que se pueden repetir sin quebrar la unicidad de id. Agregá `a:focus-visible { outline: 3px solid #075985; }` y recorré con Tab. El estado de foco permite ubicar el enlace antes de activarlo.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
