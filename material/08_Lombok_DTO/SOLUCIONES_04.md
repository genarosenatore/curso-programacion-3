# Soluciones 08.04 · Mapeo entre entidad y DTO

[Clase](CLASE_04.md) · [Práctica](EJERCICIOS_04.md)

## 1. Razonamiento de la actividad guiada

aDTO calcula disponible=producto.stock()>0 al construir el DTO. Probá stock 0 y 3. Es una decisión del contrato; no significa que ese valor no pueda cambiar antes de concretar una compra.

## 2 y 3. Resolver y justificar las decisiones

Con stock cero, disponible false; con tres, true. LibroVista puede ser record(String titulo,boolean disponible) y construirse desde libro.titulo() y libro.ejemplares()>0. Costo interno queda fuera porque el contrato no lo necesita. Una lista compartida puede cambiar por otra referencia; si la salida debe conservarla, usá una copia apropiada. El método solo crea objetos en memoria: no inicia almacenamiento.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
