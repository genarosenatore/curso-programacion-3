# Soluciones 03.07 · Objetos y nociones de clases

[Clase](CLASE_07.md) · [Práctica](EJERCICIOS_07.md)

## 1. Razonamiento de la actividad guiada

const productos=[{nombre:"Cuaderno",precio:2000},{nombre:"Lapicera",precio:800}]; const elegido=productos.find(p=>p.nombre==="Lapicera");. elegido.precio es 800 si hubo coincidencia; si no, elegido es undefined y hay que comprobarlo antes de acceder.

## 2 y 3. Resolver y justificar las decisiones

La primera variable ve el nuevo número porque ambas referencian el mismo libro. El combinado, completo para consola:

```javascript
function buscarDisponible(libros, titulo) {
  const encontrado = libros.find(libro => libro.titulo === titulo);
  if (encontrado === undefined || encontrado.ejemplares <= 0) return null;
  return encontrado;
}
const libros = [{titulo:"A",ejemplares:2},{titulo:"B",ejemplares:0}];
console.log(buscarDisponible(libros,"A"));
console.log(buscarDisponible(libros,"B")); // null
console.log(buscarDisponible(libros,"C")); // null
```

El cortocircuito de || evita leer ejemplares de undefined. Devolver null expresa la ausencia intencional definida por el contrato. Dos literales nuevos contienen objetos distintos, aunque sus propiedades sean iguales: === comprueba identidad de referencia, no una comparación de campos.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
