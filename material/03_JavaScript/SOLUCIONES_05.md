# Soluciones 03.05 · Funciones, parámetros, retorno y alcance

[Clase](CLASE_05.md) · [Práctica](EJERCICIOS_05.md)

## 1. Razonamiento de la actividad guiada

function calcularDescuento(importe,porcentaje){return importe*(1-porcentaje/100);}. Con (1000,10) devuelve 900; con (1000,0), 1000. La variante flecha es const calcularDescuento=(importe,porcentaje)=>importe*(1-porcentaje/100);.

## 2 y 3. Resolver y justificar las decisiones

`function doble(numero) { return numero * 2; }` devuelve 0 y 10; `console.log(doble(5) + 3);` muestra 13. Para combinar:

```javascript
function sumarPares(limite) {
  let suma = 0;
  for (let numero = 1; numero <= limite; numero = numero + 1) {
    if (numero % 2 === 0) suma = suma + numero;
  }
  return suma;
}
console.log(sumarPares(6), sumarPares(0)); // 12 0
```

Cada llamada inicia su propio suma. return después del bucle entrega todos los aportes; dentro de la primera vuelta entregaría demasiado pronto, en este caso 0 porque uno no es par. El ejemplo supone un límite entero no negativo: definir otras entradas requiere agregar su regla de validación.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
