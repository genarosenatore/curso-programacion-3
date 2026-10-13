# Soluciones 15.04 · Recorrido del proyecto de facturación descomprimido

[Clase](CLASE_04.md) · [Práctica](EJERCICIOS_04.md)

## 1. Razonamiento de la actividad guiada

Anotá numeroFactura, clienteDenominacion, condicionIva, fechaDesde y fechaHasta según los archivos. Luego verificá tipos y formato esperado, especialmente fechas y números. Podés seguir los enlaces del inventario original para ubicar los proyectos descomprimidos.

## 2 y 3. Resolver y justificar las decisiones

Los filtros son numeroFactura,clienteDenominacion,condicionIva,fechaDesde,fechaHasta; URLSearchParams los codifica si tienen contenido. PUT lleva número en ruta y DTO en cuerpo; controller delega al servicio que busca por ese número y transforma. numero es la propiedad real de entidad e id otra identidad técnica. El manejador tipado no comprueba campos ni tipos externos: necesita validar/adaptar antes de usar como modelo confiable.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
