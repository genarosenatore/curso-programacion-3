# Soluciones 13.08 · Práctica escalonada: los cinco niveles del TP grupal

[Clase](CLASE_08.md) · [Práctica](EJERCICIOS_08.md)

## 1. Razonamiento de la actividad guiada

Nivel 1: todas las facturas. Nivel 2: filtro estado e importe. Nivel 3: facturas por marca con distinct. Nivel 4: total por condición. Nivel 5: artículos nunca vendidos con NOT EXISTS. Las siete clases anteriores tienen las piezas y soluciones explicadas para cada mecanismo; contrastá cada ejercicio concreto con el modelo del campus.

## 2 y 3. Resolver y justificar las decisiones

Cliente emitido: origen FacturaVenta, WHERE cliente.id=:clienteId AND estado=:estado, selección f. IVA: selección denominación y SUM, GROUP BY id y denominación, sin join de detalles. Las otras formas están desarrolladas en las clases previas: select f; select numero,total; select distinct f join detalles filtrando marca; grupos por condición; artículos con NOT EXISTS correlacionado. Escribí datos donde una factura tenga dos detalles y otra el mismo total, para no aceptar deduplicación de importes como corrección de duplicación de cabeceras.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
