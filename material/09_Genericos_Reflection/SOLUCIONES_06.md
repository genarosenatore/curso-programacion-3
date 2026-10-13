# Soluciones 09.06 · Práctica de Reflection y relación con frameworks

[Clase](CLASE_06.md) · [Práctica](EJERCICIOS_06.md)

## 1. Razonamiento de la actividad guiada

Caja<Cliente> caja=new Caja<>(new Cliente("Ana","ana@example.com")); Cliente cliente=caja.obtener(); Class<?> tipo=cliente.getClass();. El genérico asegura el tipo de obtener y Reflection permite consultar los metadatos de Cliente. No recupera automáticamente todos los parámetros genéricos borrados.

## 2 y 3. Resolver y justificar las decisiones

La caja devuelve Cliente y cliente.nombre() muestra Ana. El descriptor del componente muestra nombre y String, aunque el dato sea Ana o Luis. Para clase ordinaria usá getDeclaredFields o su contrato público, no asumas componentes de record. Caja<Cliente> conserva la relación de tipo del retorno al compilar; Reflection permite observar estructura sin reemplazarla.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
