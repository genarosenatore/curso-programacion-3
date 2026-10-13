# Soluciones 03.08 · DOM: seleccionar, crear y modificar elementos

[Clase](CLASE_08.md) · [Práctica](EJERCICIOS_08.md)

## 1. Razonamiento de la actividad guiada

Para cada nombre, createElement("li"), textContent=nombre y lista.append(item). Antes de volver a renderizar podés usar lista.replaceChildren() para evitar duplicados. Confirmá que el número de elementos sea tres después de repetir el render.

## 2 y 3. Resolver y justificar las decisiones

Dentro del script, después de declarar lista:

```javascript
function mostrarNombres(nombres) {
  lista.replaceChildren();
  for (const nombre of nombres) {
    const item = document.createElement("li");
    item.textContent = nombre;
    lista.append(item);
  }
}
mostrarNombres(["A","B","C"]);
mostrarNombres(["A","B","C"]);
mostrarNombres([]);
```

Tras las dos primeras llamadas hay tres, no seis, porque cada render empieza vacío. Tras [] hay cero: no se añaden hijos. Un nombre con < sigue siendo texto literal. Si lista puede faltar, incorporá una comprobación al principio y comunicá el error de estructura; omitir silenciosamente todo puede dificultar depurar.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
