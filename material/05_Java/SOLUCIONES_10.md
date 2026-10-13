# Soluciones 05.10 · Paquetes, dependencias y estructura de proyecto

[Clase](CLASE_10.md) · [Práctica](EJERCICIOS_10.md)

## 1. Razonamiento de la actividad guiada

Colocá los modelos en src/tienda/modelo y escribí package tienda.modelo. Inicio en src/tienda con package tienda importa esos modelos. En la raíz, compilá indicando el destino de clases y ejecutá el nombre cualificado tienda.Inicio si usás consola.

## 2 y 3. Resolver y justificar las decisiones

-d out define destino y -cp out lo usa como raíz al ejecutar. Con Inicio en tienda el comando es `java -cp out tienda.Inicio`. Modelos declaran package tienda.modelo e Inicio importa tienda.modelo.Producto y Cliente. Compilá todos los fuentes apropiados con javac -d out. import no instala; la biblioteca debe estar disponible mediante classpath o la herramienta de construcción.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
