# Soluciones 14.04 · Beans, ApplicationContext e inyección de dependencias

[Clase](CLASE_04.md) · [Práctica](EJERCICIOS_04.md)

## 1. Razonamiento de la actividad guiada

El controlador declara lo que necesita y Spring lo proporciona. Así se respeta configuración y gestión. En una prueba se puede entregar un colaborador de prueba por el constructor sin depender de una búsqueda global.

## 2 y 3. Resolver y justificar las decisiones

El contenedor entrega servicio al controller y repositorio al servicio. pedidoActual compartido puede ser sobrescrito por otra llamada y mezclar usuarios. Pasá pedido como parámetro y usa variables locales dentro del método, conservando persistencia con identidad apropiada. Inyección permite entregar una implementación de prueba que cumpla el contrato sin que la clase consumidora busque globalmente ni construya dependencias rígidas.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
