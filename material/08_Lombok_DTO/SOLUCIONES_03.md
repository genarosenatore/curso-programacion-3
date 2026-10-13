# Soluciones 08.03 · DTO: diferencia con entidad y modelo de pantalla

[Clase](CLASE_03.md) · [Práctica](EJERCICIOS_03.md)

## 1. Razonamiento de la actividad guiada

Entrada: nombre, correo y un dato de credencial si la operación lo requiere. Salida: id, nombre y correo. No devuelvas la credencial ni su hash. En nuestro curso no implementamos seguridad real a partir del ejemplo de sesión del campus.

## 2 y 3. Resolver y justificar las decisiones

ClienteSalida puede ser record(long id,String nombre,String correo). SolicitarPrestamo recibe libroId y cantidad; PrestamoSalida contiene id y cantidad confirmada, más los campos que el contrato realmente necesite. El cliente no decide stock restante: el servidor consulta existencia, valida cantidad y modifica su estado. Transportar datos no sustituye comprobar reglas.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
