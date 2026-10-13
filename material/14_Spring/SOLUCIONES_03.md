# Soluciones 14.03 · Spring, Spring Boot y primer proyecto

[Clase](CLASE_03.md) · [Práctica](EJERCICIOS_03.md)

## 1. Razonamiento de la actividad guiada

Aplicacion inicia; pom.xml fija versiones y starters; application.properties configura base local y puerto. La clase de inicio no contiene toda la lógica: se reparte en componentes.

## 2 y 3. Resolver y justificar las decisiones

Aplicacion inicia y prepara datos; pom declara dependencias y versiones; properties define entorno. Antes de detener, el listado responde; después puede fallar conexión. Arrancar demuestra preparación básica del contexto, pero no que cada POST valide ni que cada actualización preserve reglas. Las pruebas HTTP de las clases siguientes verifican esas operaciones.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
