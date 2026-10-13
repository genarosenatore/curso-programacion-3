# Soluciones 11.01 · Persistencia, tablas, filas y columnas

[Clase](CLASE_01.md) · [Práctica](EJERCICIOS_01.md)

## 1. Razonamiento de la actividad guiada

categoria(id INTEGER PRIMARY KEY,nombre TEXT NOT NULL). Si querés nombres no vacíos añadí una restricción acorde al motor o validación de aplicación. Una fila es una categoría, no una lista de nombres en una sola celda.

## 2 y 3. Resolver y justificar las decisiones

`CREATE TABLE categoria(id INTEGER PRIMARY KEY,nombre TEXT NOT NULL); INSERT INTO categoria(id,nombre) VALUES(1,'Útiles');`. Precio cero es válido bajo la restricción y negativo se rechaza. El esquema no cambia al agregar datos. Guardar varios ids como texto pierde comprobación individual y consultas de relaciones; usaremos filas relacionadas en vez de una lista comprimida en una celda.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
