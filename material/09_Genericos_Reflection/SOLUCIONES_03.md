# Soluciones 09.03 · Prácticas de genéricos del campus

[Clase](CLASE_03.md) · [Práctica](EJERCICIOS_03.md)

## 1. Razonamiento de la actividad guiada

Contenedor<String> c=new ContenedorSimple<>(); c.guardar("Ana"); String nombre=c.obtener();. c.guardar(3) no compila. Podés cambiar obtener a Optional<T> con Optional.ofNullable(valor) si querés ausencia explícita.

## 2 y 3. Resolver y justificar las decisiones

La secuencia es null → Ana → Luis. `if(valor==null) throw new IllegalArgumentException("Contenido requerido"); this.valor=valor;` conserva Luis si se intenta null después. T exige compatibilidad de tipo para guardar y obtener; la condición exige existencia. Para varios nombres, una List<T> o un contrato de colección expresaría agregar y recorrer, en vez de reemplazar un único contenido.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
