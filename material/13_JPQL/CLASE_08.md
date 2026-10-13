# Clase 13.08 · Práctica escalonada: los cinco niveles del TP grupal

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_07.md) · [Clase siguiente](../14_Spring/CLASE_01.md)

## Resolver los niveles por mecanismos, no por copia

El TP tiene cinco niveles y22 consultas. Nivel1 trabaja entidades, proyecciones y filtros simples. Nivel2 combina condiciones, texto, estados distintos y agregados. Nivel3 navega relaciones y subconsultas. Nivel4 agrupa y filtra grupos. Nivel5 requiere correlación, existencia y clasificación. Las clases13.01 a13.07 enseñan las piezas antes de combinarlas.

Para cada pregunta escribí una ficha: qué objeto o resumen debe salir, origen, caminos de relación, parámetros, tipos de resultado y datos que distingan correcto de incorrecto. «Compila» no comprueba que un JOIN no multiplique el total. Una prueba debe incluir una relación opcional, varios detalles o una igualdad exacta si ese es el riesgo.

## Desarrollar el total por condición de IVA

Si condición A tiene facturas100 y200 y B tiene50, esperamos A300 y B50. El origen son facturas, la clave de grupo condicionIva.id más denominacion y el agregado sum(importeTotal). No hace falta unir detalles, porque el valor solicitado ya está en la cabecera. Añadir ese join podría repetir sus100 por cada renglón y alterar el resumen.

En [el laboratorio](../Ejemplos/persistencia/README.md) se ejecutan ejemplos de cada mecanismo sobre un modelo propio conocido. Los22 pedidos del campus pueden abarcar campos como usuarioCarga o cuitCuil que exigen su mapeo real; el laboratorio no promete ser una reproducción integral. Para estudiar, primero obtené resultados de mecanismos pequeños y después adaptá las fichas a cada consigna original.

La copia inspeccionada usa numero y detalle.listaPrecioArticulo.articulo. Llevar esa verificación a tus consultas evita inventar f.numeroFactura o d.articulo. Para cada límite registrá unidad y tipo; los importes double del modelo original necesitan una política más robusta si se trasladan a contabilidad real.

Esta clase no requiere crear las22 consultas de memoria para avanzar: requiere poder justificar origen, selección, relación y caso límite de una consulta de cada nivel, y luego usar ese método para las restantes.

## Ejemplo de la clase

```text
Ficha de consulta
Pregunta: total por condición de IVA
Origen: FacturaVenta
Agrupación: condicionIva.id y condicionIva.denominacion
Salida: denominación y suma de importeTotal
Caso de prueba: dos facturas de la misma condición y una de otra
```

[Abrir el fragmento como archivo](fragmentos/clase_08.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Con totales 100 y 200 en condición A, y 50 en B, esperamos A=300 y B=50. La consulta es select f.condicionIva.denominacion,sum(f.importeTotal) ... group by id y denominación. Si antes unimos detalles y no compensamos duplicados, podemos sumar más de una vez cada cabecera.

## Cambiar una decisión y explorar un límite

SUM(DISTINCT importeTotal) no corrige una repetición por join cuando dos facturas distintas comparten total. Un dato de prueba con ambos totales100 demuestra la diferencia: deben aportar200, no100. Datos elegidos deliberadamente detectan errores que una lista aleatoria puede esconder.

## Confusión que conviene evitar

Evaluar una consulta sin datos que distingan sus casos correctos de los incorrectos.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_08.md). Las [soluciones razonadas](SOLUCIONES_08.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_07.md) · [Clase siguiente](../14_Spring/CLASE_01.md)
