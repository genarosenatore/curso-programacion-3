# Soluciones 15.04 · Recorrido del proyecto de facturación descomprimido

[Clase](CLASE_04.md) · [Ejercicios](EJERCICIOS_04.md)

## 1. Una solución explicada

Anotá numeroFactura, clienteDenominacion, condicionIva, fechaDesde y fechaHasta según los archivos. Luego verificá tipos y formato esperado, especialmente fechas y números. Podés seguir los enlaces del inventario original para ubicar los proyectos descomprimidos.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El archivo de API revisado utiliza localhost:8080/api/facturas. El controller expone operaciones sobre esa ruta. Que coincidan rutas no garantiza que todos los DTO sean idénticos a la consigna nueva: compará también los campos y si el identificador representa id o numeroFactura.

## 3. Qué conviene corregir

La confusión a evitar es: Confundir número de factura de negocio con id técnico al actualizar o borrar.

El ZIP de frontend del campus contiene AppNodeJS con public, src y dependencias. public aporta HTML y src código TypeScript.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
