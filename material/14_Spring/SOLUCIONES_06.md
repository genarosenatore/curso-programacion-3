# Soluciones 14.06 · Capas: Controller, Service y Repository

[Clase](CLASE_06.md) · [Práctica](EJERCICIOS_06.md)

## 1. Razonamiento de la actividad guiada

Leer URL: Controller. Regla de stock: Service o dominio coordinado por él. Consulta: Repository. La validación estructural del request puede estar en Controller mediante Bean Validation y las reglas de negocio permanecen en el servicio.

## 2 y 3. Resolver y justificar las decisiones

URL en controller, consulta en repository y regla en service/dominio. Un campo JSON se revisa en DTO y su mapeo; una regla de cantidad se revisa antes de modificar estado en la operación. El servicio llama la consulta, mapea cada entidad y devuelve lista. Mantener ese recorrido permite localizar una falla por evidencia en vez de agregar cambios a todas las capas.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
