# Soluciones 15.03 · Estados de carga, error, resultado y CORS

[Clase](CLASE_03.md) · [Práctica](EJERCICIOS_03.md)

## 1. Razonamiento de la actividad guiada

boton.disabled=true antes de la petición y en finally boton.disabled=false. Mostrá error si falla y solo limpiá el formulario después de éxito. Conservá los datos ingresados para que la persona pueda corregirlos.

## 2 y 3. Resolver y justificar las decisiones

Deshabilita antes de try y restaura en finally; solo limpia formulario después de éxito.200[] indica carga válida vacía;404 pide revisar ruta/recurso; CORS se identifica por política de origen y mensajes específicos de navegador/preflight. no-cors no habilita lectura JSON; puede ocultar estado y cuerpo. La corrección requiere coherencia de orígenes/proxy y permisos del servidor según el caso.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
