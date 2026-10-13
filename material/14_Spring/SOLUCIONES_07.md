# Soluciones 14.07 · Endpoints GET y parámetros

[Clase](CLASE_07.md) · [Práctica](EJERCICIOS_07.md)

## 1. Razonamiento de la actividad guiada

Listado sin coincidencias: 200 y []. Producto por id no encontrado: 404. Id mal formado: 400 en el manejo configurado. Agregá mensajes que ayuden a corregir la petición y probá cada ruta local.

## 2 y 3. Resolver y justificar las decisiones

Listado vacío200 []; /999404; /abc400 en el proyecto. abc falla al convertir Long y no llega a buscar;999 llega al servicio y falla por ausencia. En cliente: `const params=new URLSearchParams({nombre:"Cuaderno grande"}); fetch("/api/productos?"+params.toString());`. No cambies la forma JSON del DTO para arreglar una ruta o entrada numérica incorrecta.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
