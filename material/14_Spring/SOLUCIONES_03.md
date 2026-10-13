# Soluciones 14.03 · Spring, Spring Boot y primer proyecto

[Clase](CLASE_03.md) · [Ejercicios](EJERCICIOS_03.md)

## 1. Una solución explicada

Aplicacion inicia; pom.xml fija versiones y starters; application.properties configura base local y puerto. La clase de inicio no contiene toda la lógica: se reparte en componentes.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La clase se ubica en el paquete raíz curso para detectar componentes debajo. SpringApplication inicia el contexto y la aplicación web si las dependencias lo indican. En el proyecto de apoyo, pom.xml declara web, validation, data-jpa y H2. Su README explica Maven y arranque.

## 3. Qué conviene corregir

La confusión a evitar es: Copiar una clase Spring a un proyecto Java vacío y esperar que sus imports existan.

Spring organiza componentes y dependencias. Spring Boot añade configuración automática, starters y un arranque práctico.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
