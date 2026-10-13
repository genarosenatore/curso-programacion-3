# Soluciones 09.05 · Inspección de campos, métodos y anotaciones

[Clase](CLASE_05.md) · [Ejercicios](EJERCICIOS_05.md)

## 1. Una solución explicada

@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.TYPE) @interface Marca {}. Aplicá @Marca a Cliente y consultá Cliente.class.isAnnotationPresent(Marca.class). Sin retención en ejecución, no obtendrías esa información de esta manera.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

getMethod busca el método público sin parámetros. invoke lo ejecuta sobre saludo y devuelve Object. Si el método lanza una excepción, Reflection puede envolverla en InvocationTargetException. Una llamada directa saludo.texto() es más clara cuando conocemos la operación al compilar.

## 3. Qué conviene corregir

La confusión a evitar es: Suponer que todas las anotaciones están disponibles mediante Reflection.

Un descriptor de método puede invocarse sobre una instancia con argumentos, pero esa operación puede fallar por acceso, firma o excepción de la implementación. Una anotación solo es consultable en ejecución si su retención lo permite, como RetentionPolicy.RUNTIME.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
