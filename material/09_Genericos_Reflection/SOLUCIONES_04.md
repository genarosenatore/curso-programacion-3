# Soluciones 09.04 · Class y metadatos de una clase

[Clase](CLASE_04.md) · [Práctica](EJERCICIOS_04.md)

## 1. Razonamiento de la actividad guiada

for(Field campo:Cliente.class.getDeclaredFields()){System.out.println(campo.getName()+": "+campo.getType().getSimpleName());}. Debés importar java.lang.reflect.Field o usar nombre cualificado. La enumeración no devuelve valores de una instancia.

## 2 y 3. Resolver y justificar las decisiones

El recorrido `for(var campo:Cliente.class.getDeclaredFields())` imprime campo.getName() y campo.getType().getSimpleName(), por ejemplo nombre:String y correo:String sin depender del orden. El nombre cualificado incluye paquete; el breve no. Métodos públicos heredados pueden incluir los de Object. Para leer un atributo se necesita la instancia elegida y permisos de acceso; el descriptor no decide qué cliente observar.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
