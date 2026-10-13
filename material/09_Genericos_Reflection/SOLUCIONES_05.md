# Soluciones 09.05 · Inspección de campos, métodos y anotaciones

[Clase](CLASE_05.md) · [Práctica](EJERCICIOS_05.md)

## 1. Razonamiento de la actividad guiada

@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.TYPE) @interface Marca {}. Aplicá @Marca a Cliente y consultá Cliente.class.isAnnotationPresent(Marca.class). Sin retención en ejecución, no obtendrías esa información de esta manera.

## 2 y 3. Resolver y justificar las decisiones

Ambas llamadas devuelven Hola. Reflection requiere búsqueda por cadena y puede fallar posteriormente; la llamada directa expresa el contrato al compilar. `@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.TYPE) @interface Marca {}` y @Marca sobre Cliente permite consultar true. Importá los tres tipos de anotaciones o utilizá sus nombres completos. La marca es información, no código que se ejecute por estar escrita.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
