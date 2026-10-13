# Soluciones 15.08 · Sesión didáctica y permisos: alcance del ejemplo

[Clase](CLASE_08.md) · [Ejercicios](EJERCICIOS_08.md)

## 1. Una solución explicada

La interfaz podría mostrar el panel, demostrando que esa bandera no protege operaciones. Un backend con autorización real rechazaría peticiones sin permisos válidos. El ejemplo educativo no permite afirmar esa protección.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La función decide si mostrar una región, no verifica permisos ante el servidor. El ejemplo integrado de apoyo trabaja sin cuentas y en datos locales. Al estudiar la consigna, anotaremos qué partes son simulación de flujo y qué haría falta para una aplicación con usuarios reales.

## 3. Qué conviene corregir

La confusión a evitar es: Llamar seguridad completa a una redirección basada solo en datos del navegador.

La consigna de Food Store describe una sesión básica con localStorage y sin módulo de seguridad. Eso sirve para practicar pantallas y flujos, pero no acredita identidad ni permisos frente a un servidor real.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
