# Clase 04.07 · Vite, módulos y estructura de proyecto

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_06.md) · [Clase siguiente](../04_TypeScript/CLASE_08.md)

## Servir y construir un frontend

Un servidor estático entrega archivos; Vite agrega procesamiento para desarrollar con módulos y TypeScript, recarga de cambios y una **construcción** de distribución. npm run dev mantiene un proceso local; npm run build produce archivos que se pueden servir después. El servidor de desarrollo no es la entrega construida.

Usá [Node y npm](CLASE_06.md) antes de los comandos. `npm create vite@latest mi-tienda -- --template vanilla-ts` descarga un creador: mi-tienda es el directorio y el argumento después de -- elige la plantilla TypeScript sin un framework de interfaz. cd cambia la carpeta actual. install prepara sus dependencias. dev muestra la URL y mantiene la terminal ocupada hasta Ctrl+C.

## Entender la estructura generada

index.html identifica la página y carga un módulo de src. src contiene el código que editás. package.json define tareas. tsconfig describe comprobación: strict agrega rigor, target indica nivel de sintaxis de salida y lib declara APIs conocidas por el compilador. Incluir DOM en lib permite conocer document, pero no lo crea en Node.

Vite transforma TS para mostrar la página; no asumas que eso equivale a una comprobación completa de tipos. Ejecutá tsc --noEmit por separado o como parte de build. Mirá scripts: algunas plantillas ya combinan tsc con vite build, otras requieren ajustarlo. Nunca dupliques comandos sin leer el archivo real.

dist es salida generada; editarla directamente pierde cambios al reconstruir. Guardá el código fuente y regenerá. Para publicar bajo una subruta hay que revisar la base de recursos del proyecto; esa decisión depende del destino y no se resuelve pegando rutas absolutas de tu disco.

## Ejemplo de la clase

```bash
npm create vite@latest mi-tienda -- --template vanilla-ts
cd mi-tienda
npm install
npm run dev
# En otra terminal, dentro del proyecto:
npx tsc --noEmit
```

[Abrir el fragmento como archivo](fragmentos/clase_07.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El creador prepara una estructura vanilla-ts sin framework de interfaz. Entrá en la carpeta antes de instalar o ejecutar. Abrí la dirección local indicada por la terminal; el puerto puede variar si está ocupado. Conservá la consola del servidor mientras trabajás y detenelo con Ctrl+C cuando termines.

## Cambiar una decisión y explorar un límite

Introducí una asignación de tipo incorrecto: la página de desarrollo puede mostrar algo mientras check informa el problema. Editar dist en vez de src parece funcionar temporalmente y se pierde al volver a build. Son fallos distintos de un import cuya ruta no existe.

## Confusión que conviene evitar

Tratar la carpeta dist como el lugar principal para editar código.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_07.md). Las [soluciones razonadas](SOLUCIONES_07.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_06.md) · [Clase siguiente](../04_TypeScript/CLASE_08.md)
