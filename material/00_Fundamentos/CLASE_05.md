# Clase 00.05 · Git y GitHub: guardar versiones y comprender un repositorio

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../00_Fundamentos/CLASE_04.md) · [Clase siguiente](../01_HTML/CLASE_01.md)

## Qué vas a aprender

Vamos a trabajar **git y github: guardar versiones y comprender un repositorio**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Git guarda versiones del proyecto en un repositorio local. GitHub es un servicio para alojar repositorios y colaborar; usar Git no obliga a publicar nada. Un commit registra un conjunto de cambios con un mensaje. El área de preparación permite elegir qué cambios formarán parte del próximo commit.

Una rama conserva una línea de trabajo. Al integrar ramas puede existir un conflicto si se modificaron partes incompatibles: hay que leer ambas versiones y decidir el contenido final. En esta práctica trabajamos en una carpeta nueva; no aplicamos comandos sobre los proyectos originales del campus.

## Ejemplo

```bash
git init
git status
git add index.html
git commit -m "Agregar primera pagina"
git log --oneline
```

[Abrir el fragmento como archivo](fragmentos/clase_05.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Este ejemplo describe pasos o uso de herramientas. Seguí las instrucciones de la explicación; los bloques de pseudocódigo no se ejecutan como programas.

## Leamos el ejemplo paso a paso

Desde la terminal situada en tu carpeta de práctica, init crea el repositorio; status muestra su estado; add prepara index.html; commit registra la versión; log permite verla. Creá y guardá index.html antes de add. El primer commit puede pedir tu nombre y correo de autor: configurarlos identifica los commits, no inicia sesión en GitHub. Publicar requiere otro paso que no hacemos aquí.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Explicá qué pasa si editás un archivo después del commit. ¿Cómo guardás esa nueva versión? ¿Qué ventaja tiene registrar cambios pequeños?

Abrí [los ejercicios y las pistas](EJERCICIOS_05.md). Las [soluciones explicadas](SOLUCIONES_05.md) están preparadas para consultar después de intentarlo.

## Error común

Pensar que guardar un archivo en el editor crea un commit o publica el proyecto.

## Resumen para repasar

Git guarda versiones del proyecto en un repositorio local. GitHub es un servicio para alojar repositorios y colaborar; usar Git no obliga a publicar nada.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **00.05** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../00_Fundamentos/CLASE_04.md) · [Clase siguiente](../01_HTML/CLASE_01.md)
