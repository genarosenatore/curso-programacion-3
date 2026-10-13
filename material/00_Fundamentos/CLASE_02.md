# Clase 00.02 · Archivos, carpetas, extensiones y editor de código

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../00_Fundamentos/CLASE_01.md) · [Clase siguiente](../00_Fundamentos/CLASE_03.md)

## Qué vas a aprender

Vamos a trabajar **archivos, carpetas, extensiones y editor de código**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un archivo guarda contenido y tiene un nombre. La extensión es la terminación del nombre: .html, .css o .js. Ayuda a reconocer su función; cambiar la extensión de una imagen no transforma sus datos. Una carpeta agrupa archivos. Una ruta indica dónde está algo: una ruta absoluta parte de una ubicación completa y una relativa se interpreta desde un punto de referencia.

El editor sirve para escribir archivos de texto; el navegador interpreta la página. Guardar un cambio en el editor y recargar la página son acciones distintas. En Windows activá la visualización de extensiones desde el Explorador si aparecen ocultas. Podés usar el editor que ya tengas; el campus menciona Visual Studio Code.

## Ejemplo

```text
mi-tienda/
  index.html
  css/
    estilos.css
  imagenes/
    producto.png
```

[Abrir el fragmento como archivo](fragmentos/clase_02.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Este ejemplo describe pasos o uso de herramientas. Seguí las instrucciones de la explicación; los bloques de pseudocódigo no se ejecutan como programas.

## Leamos el ejemplo paso a paso

index.html está en la raíz de mi-tienda. Para referirse a la imagen desde ese archivo, la ruta relativa es imagenes/producto.png. Desde css/estilos.css, la misma imagen está un nivel arriba: ../imagenes/producto.png. Los dos puntos indican subir una carpeta. Para practicar, creá una carpeta nueva para tus ejercicios y archivos vacíos con esos nombres; todavía no hace falta completar su contenido.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Dibujá una carpeta biblioteca con index.html y una subcarpeta paginas que contenga contacto.html. Indicá la ruta desde index.html a contacto.html y la ruta de vuelta.

Abrí [los ejercicios y las pistas](EJERCICIOS_02.md). Las [soluciones explicadas](SOLUCIONES_02.md) están preparadas para consultar después de intentarlo.

## Error común

Guardar index.html.txt por tener ocultas las extensiones: el navegador puede tratarlo como texto. Verificá el nombre completo.

## Resumen para repasar

Un archivo guarda contenido y tiene un nombre. La extensión es la terminación del nombre: .html, .css o .js.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **00.02** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../00_Fundamentos/CLASE_01.md) · [Clase siguiente](../00_Fundamentos/CLASE_03.md)
