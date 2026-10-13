# Soluciones 14.05 · Configuración, starters y perfiles

[Clase](CLASE_05.md) · [Práctica](EJERCICIOS_05.md)

## 1. Razonamiento de la actividad guiada

Los datos se perderían. En un entorno persistente se definen migraciones y una base duradera con credenciales apropiadas. El ejemplo local usa una base descartable para aprender, no configura producción.

## 2 y 3. Resolver y justificar las decisiones

La URL indica H2 en memoria, ddl-auto el manejo de esquema y server.port dónde escucha. Un application-practica.properties puede poner server.port=8081 y activarse con el argumento --spring.profiles.active=practica. Comprueba log y respuesta en8081. Configuraciones con credenciales reales deben manejarse fuera del material público; el ejemplo usa datos locales descartables y no representa conexión de producción.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
