# Soluciones 12.06 · Persistencia, consulta, modificación y eliminación

[Clase](CLASE_06.md) · [Ejercicios](EJERCICIOS_06.md)

## 1. Una solución explicada

En transacción: find por id; si no existe, error de recurso ausente; si el nombre está vacío, rechazo; después setNombre. No permitas que un DTO de actualización cambie id o relaciones arbitrarias sin resolverlas.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Los objetos del ejemplo deben pertenecer al modelo configurado. persist registra nuevo; merge devuelve la copia gestionada; remove marca la gestionada para borrado. No es una receta para crear y borrar en una misma operación, sino una comparación de APIs.

## 3. Qué conviene corregir

La confusión a evitar es: Ignorar el objeto devuelto por merge y seguir modificando el objeto separado.

persist se usa para una entidad nueva. merge copia el estado de un objeto en una instancia gestionada y devuelve esa instancia; no vuelve gestionada necesariamente la referencia que le pasamos.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
