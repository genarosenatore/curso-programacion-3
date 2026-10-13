# Soluciones 14.05 · Configuración, starters y perfiles

[Clase](CLASE_05.md) · [Ejercicios](EJERCICIOS_05.md)

## 1. Una solución explicada

Los datos se perderían. En un entorno persistente se definen migraciones y una base duradera con credenciales apropiadas. El ejemplo local usa una base descartable para aprender, no configura producción.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La base vive en el proceso y los datos se reinician al apagar. open-in-view=false delimita acceso persistente fuera del servicio y motiva construir DTO dentro de la transacción. Si el puerto está ocupado, podés usar otro y cambiar la URL del frontend de manera coherente.

## 3. Qué conviene corregir

La confusión a evitar es: Cambiar el puerto del servidor y no cambiar el destino de las peticiones del frontend.

La configuración permite variar puertos, conexiones y otras propiedades sin reescribir lógica. Un perfil selecciona ajustes para un entorno.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
