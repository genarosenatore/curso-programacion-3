# Soluciones 12.05 · EntityManager y ciclo de vida

[Clase](CLASE_05.md) · [Práctica](EJERCICIOS_05.md)

## 1. Razonamiento de la actividad guiada

La entidad está separada y la modificación no se guarda por sí sola. Para una actualización, conviene recuperar una entidad gestionada dentro de una transacción y aplicar los datos aceptados, en vez de asumir que cualquier objeto con id está conectado.

## 2 y 3. Resolver y justificar las decisiones

new crea nueva; persist la gestiona; commit confirma pero un contexto abierto puede seguir gestionándola; cerrar la separa. Tras flush y rollback el contexto nuevo ve el dato anterior confirmado. Una referencia separada no participa del seguimiento activo aunque tenga id; para guardar se recupera gestionada o se utiliza merge con su contrato, que estudiaremos enseguida.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
