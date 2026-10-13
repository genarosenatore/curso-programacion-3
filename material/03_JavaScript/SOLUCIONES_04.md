# Soluciones 03.04 · Bucles y seguimiento paso a paso

[Clase](CLASE_04.md) · [Práctica](EJERCICIOS_04.md)

## 1. Razonamiento de la actividad guiada

Los parciales son 1, 3, 6, 10 y 15. Dos bucles anidados del 1 al 2 recorrerían cuatro pares: (1,1), (1,2), (2,1), (2,2). No confundas cantidad de iteraciones con valor final del contador.

## 2 y 3. Resolver y justificar las decisiones

El ejercicio simple termina en 15: acumulados 1, 3, 6, 10 y 15. El combinado es un programa completo:

```javascript
let suma = 0;
for (let numero = 1; numero <= 6; numero = numero + 1) {
  if (numero % 2 === 0) {
    suma = suma + numero;
  }
}
console.log(suma); // 12
```

Se añaden 2, 4 y 6. Con límite 0 no hay vueltas y el resultado 0 sigue definido. Reiniciar suma dentro borraría los aportes anteriores; el último valor no sería el total buscado. La tabla permite detectar el primer reinicio incorrecto.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
