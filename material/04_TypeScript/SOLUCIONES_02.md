# Soluciones 04.02 · Tipos básicos, inferencia, arrays y funciones

[Clase](CLASE_02.md) · [Práctica](EJERCICIOS_02.md)

## 1. Razonamiento de la actividad guiada

function saludar(nombre:string):string { return `Hola, ${nombre}`; }. saludar("Ana") devuelve Hola, Ana. Una función que solo imprime podría tener retorno void en vez de string.

## 2 y 3. Resolver y justificar las decisiones

cuadrado devuelve 0 y 16. mostrarCuadrado puede tener retorno void y llamar console.log(cuadrado(numero)); no entrega 16 para otro cálculo. sumar usa let total=0, for...of y return total, como en JavaScript, con los tipos del contrato. [] devuelve 0 y [-1,2] también es un number[] válido; para cantidades permitidas se agrega validación.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
