# Soluciones 09.06 · Práctica de Reflection y relación con frameworks

[Clase](CLASE_06.md) · [Ejercicios](EJERCICIOS_06.md)

## 1. Una solución explicada

Caja<Cliente> caja=new Caja<>(new Cliente("Ana","ana@example.com")); Cliente cliente=caja.obtener(); Class<?> tipo=cliente.getClass();. El genérico asegura el tipo de obtener y Reflection permite consultar los metadatos de Cliente. No recupera automáticamente todos los parámetros genéricos borrados.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Muestra nombre:String y correo:String. Para records, getRecordComponents expresa sus componentes directamente. Para una clase común usaríamos campos o métodos según el objetivo. El código observa nombres y tipos; no conoce valores de un cliente concreto.

## 3. Qué conviene corregir

La confusión a evitar es: Pretender usar Reflection para reemplazar toda comprobación de tipos en código ordinario.

Vamos a conectar los dos temas sin confundirlos: los genéricos comprueban relaciones de tipos principalmente durante compilación y Reflection observa estructura en ejecución. Un listado de atributos puede servir como ejercicio de exploración; un contenedor genérico sirve para conservar seguridad de tipos.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
