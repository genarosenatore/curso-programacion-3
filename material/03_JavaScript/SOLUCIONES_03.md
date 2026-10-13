# Soluciones 03.03 · Condiciones y decisiones

[Clase](CLASE_03.md) · [Práctica](EJERCICIOS_03.md)

## 1. Razonamiento de la actividad guiada

if(stock===0){estado="agotado";} else if(stock<=3){estado="bajo";} else{estado="disponible";}. Antes, validá que stock sea entero no negativo si proviene de entrada. Probá 0, 1, 3 y 4.

## 2 y 3. Resolver y justificar las decisiones

Para el sencillo: `if (total >= 5000) { console.log("Gratis"); } else { console.log("Cuesta 500"); }`. 4999 cuesta 500; 5000 y 5001 son gratis.

Para combinar, usá el bloque de validación enseñado; dentro del else calculá `const subtotal = cantidad * 800;`, luego `const envio = subtotal >= 5000 ? 0 : 500;` y mostrá el resultado con `console.log(subtotal + envio);`. Con "2" da 2100; con "7" da 5600; vacío no llega al cálculo. El ternario elige un valor de envío y está explicado arriba. Dos if sobre stock = 0 y stock < 3 pueden mostrar dos mensajes; else if permite elegir uno.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
