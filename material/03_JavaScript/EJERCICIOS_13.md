# Práctica 03.13 · Módulos y práctica integradora

[Clase](CLASE_13.md) · [Soluciones separadas](SOLUCIONES_13.md)

## 1. Actividad guiada

Organizá un catálogo con datos, filtro por texto y render en módulos. Probá lista vacía y búsqueda sin coincidencias.

1. Separá datos, filtro y app en archivos reales.
2. Exportá e importá nombres mediante rutas relativas.
3. Probá lógica antes de conectar input y render.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Creá un módulo operaciones.js con export function doble y un app.js que la importe y muestre doble(5).

## 3. Combinar lo aprendido

Exportá un array de nombres y una función filtrarNombres(nombres,texto) desde dos módulos distintos. En app combiná ambos sin DOM y probá "la", "" y una búsqueda sin coincidencias. ¿Qué cambiaría al conectar una pantalla?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Separá realmente los archivos.
2. La función de filtro recibe datos, no importa app.
3. El render puede consumir el resultado sin cambiar la regla de filtro.
