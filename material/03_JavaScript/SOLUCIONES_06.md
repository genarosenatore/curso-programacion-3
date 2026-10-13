# Soluciones 03.06 · Strings, arrays y métodos de recorrido

[Clase](CLASE_06.md) · [Práctica](EJERCICIOS_06.md)

## 1. Razonamiento de la actividad guiada

const seleccion=precios.filter(p=>p>150); const dobles=seleccion.map(p=>p*2);. Resultados [200,300] y [400,600]. Comprobá que precios todavía sea [100,200,300].

## 2 y 3. Resolver y justificar las decisiones

`const dobles = numeros.map(n => n * 2);` da [6,16,2] y `const grandes = numeros.filter(n => n > 3);` da [8]. Un programa completo del combinado:

```javascript
function sumarMayores(precios, minimo) {
  let total = 0;
  for (const precio of precios) {
    if (precio > minimo) total = total + precio;
  }
  return total;
}
console.log(sumarMayores([100,200,300],150)); // 500
console.log(sumarMayores([],150)); // 0
```

filter conviene cuando necesitás conservar una lista de seleccionados; un acumulador basta para obtener solo una suma. Crear una lista intermedia puede ser legible, pero no es un requisito del cálculo. El caso vacío confirma que hay resultado aun sin vueltas.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
