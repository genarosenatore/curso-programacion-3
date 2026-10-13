# Soluciones 15.02 · Alinear interfaces TypeScript y DTO Java

[Clase](CLASE_02.md) · [Ejercicios](EJERCICIOS_02.md)

## 1. Una solución explicada

function adaptar(dto:{id:number;denominacion:string}){return {id:dto.id,nombre:dto.denominacion};}. Validá primero el JSON y luego adaptá. No uses as para fingir que ya se renombró el campo.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El modelo educativo usa ids pequeños y precios con dos decimales. El carrito local guarda centavos enteros y convierte al mostrar. La consigna contable usa otros DTO: compará sus nombres y tipos antes de reutilizar. Una propiedad descripcion no equivale automáticamente a nombre.

## 3. Qué conviene corregir

La confusión a evitar es: Afirmar que Java y TypeScript tienen tipos idénticos para cualquier tamaño o formato.

El contrato entre frontend y backend debe coincidir en campos, tipos y significado. Un Long Java suele serializarse como número JSON, pero valores mayores que el entero seguro de JavaScript necesitan una política, como usar strings.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
