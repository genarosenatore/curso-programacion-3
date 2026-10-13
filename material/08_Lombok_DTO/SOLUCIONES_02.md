# Soluciones 08.02 · Lombok: getters, setters, constructores y builder

[Clase](CLASE_02.md) · [Práctica](EJERCICIOS_02.md)

## 1. Razonamiento de la actividad guiada

@Getter solo añade consultas. @Data incorpora, entre otros, setter, representación e igualdad basadas en campos, y podría recorrer relaciones. No lo aplicamos indiscriminadamente a JPA; elegimos qué generar y excluimos relaciones cuando corresponda.

## 2 y 3. Resolver y justificar las decisiones

El builder produce nombre Cuaderno y precio 200000; getNombre y getPrecioCentavos consultan. La alternativa manual usa constructor y esos dos métodos. Getter solo agrega consultas; Data puede agregar mutación, representación e igualdad que incluyan campos no adecuados. Revisá equals/hashCode por código y toString sin ciclos. Para un nombre obligatorio, incorporá validación explícita en una construcción elegida; omitirlo no debe aceptarse solo porque build terminó.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
