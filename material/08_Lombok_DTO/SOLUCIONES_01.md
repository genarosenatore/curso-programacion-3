# Soluciones 08.01 · Anotaciones y código repetitivo

[Clase](CLASE_01.md) · [Práctica](EJERCICIOS_01.md)

## 1. Razonamiento de la actividad guiada

Getter y asignación del constructor son repetitivos. Si el nombre no puede estar vacío, esa validación debe permanecer en un constructor o fábrica apropiada. Generar un setter no valida automáticamente una condición del negocio.

## 2 y 3. Resolver y justificar las decisiones

El constructor asigna this.nombre; getNombre retorna nombre. Agregá `if(nombre==null||nombre.isBlank()) throw new IllegalArgumentException("Nombre requerido");` antes de la asignación. Esa condición expresa dominio, no se obtiene solo con generar accesores. Algunas anotaciones se usan durante compilación y no permanecen consultables; desarrollaremos la retención en Reflection.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
