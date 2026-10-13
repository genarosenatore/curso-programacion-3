# Soluciones 14.06 · Capas: Controller, Service y Repository

[Clase](CLASE_06.md) · [Ejercicios](EJERCICIOS_06.md)

## 1. Una solución explicada

Leer URL: Controller. Regla de stock: Service o dominio coordinado por él. Consulta: Repository. La validación estructural del request puede estar en Controller mediante Bean Validation y las reglas de negocio permanecen en el servicio.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

RestController escribe el retorno en la respuesta mediante conversión configurada. El controlador delega en el servicio y no arma SQL aquí. ProductoDTO y listar deben existir en el proyecto; el ejemplo completo incluye ambos y un repositorio.

## 3. Qué conviene corregir

La confusión a evitar es: Suponer que crear archivos con sufijos Controller y Service basta si todos duplican la misma lógica.

Controller interpreta HTTP y traduce datos de entrada y salida. Service aplica reglas y coordina la operación.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
