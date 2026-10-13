# Soluciones 11.02 · Claves primarias, foráneas y restricciones

[Clase](CLASE_02.md) · [Práctica](EJERCICIOS_02.md)

## 1. Razonamiento de la actividad guiada

El INSERT falla por integridad referencial. Primero se crea la categoría o se usa un id existente. No se resuelve escribiendo un nombre en el campo numérico. Al borrar una categoría, habrá que decidir una política para productos relacionados.

## 2 y 3. Resolver y justificar las decisiones

Los dos productos con categoría 1 se admiten: la clave foránea no es única. El de 99 se rechaza. Con NOT NULL, la ausencia también falla. El borrado normal de categoría referenciada se rechaza en este esquema. Para catálogo, puede elegirse reasignar productos antes o impedir borrar la categoría en uso; cascade delete eliminaría productos y debe responder a una regla real, no a comodidad.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
