# Clase 04.06 · Node.js, npm, package.json y scripts

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_05.md) · [Clase siguiente](../04_TypeScript/CLASE_07.md)

## Un entorno para las herramientas

El navegador ejecuta JavaScript con document y APIs de la página. **Node.js** lo ejecuta fuera del navegador para herramientas, servidores y scripts. **npm** administra paquetes y comandos de proyecto. Instalar Node permite usar el compilador TypeScript, pero no crea un DOM de navegador.

Abrí una terminal en una carpeta nueva de práctica. `node --version` y `npm --version` informan herramientas instaladas. `npm init -y` crea package.json con valores iniciales. Es un archivo JSON: claves entre comillas, sin comentarios ni coma final. `npm install --save-dev typescript` descarga y declara el compilador como dependencia de desarrollo. El primer uso necesita conexión.

## Leer los archivos creados

package.json declara nombre, dependencias y **scripts**, nombres para comandos. `"scripts":{"check":"tsc --noEmit","build":"tsc"}` permite npm run check para comprobar y npm run build para generar según tsconfig. `--noEmit` evita generar salida. El comando npx tsc usa el ejecutable disponible en el proyecto; si falta, npx puede proponer descargarlo, así que instalá conscientemente las herramientas declaradas.

node_modules contiene paquetes instalados; package-lock.json registra versiones resueltas. Compartí fuente, configuración y bloqueo para reproducir; `npm ci` instala siguiendo un bloqueo compatible. No hace falta copiar miles de archivos de dependencias del campus. Una dependencia usada al ejecutar el servidor cumple otro papel que una herramienta de compilación, aunque ambos sean paquetes.

Ejecutar desde la carpeta equivocada puede seleccionar otro package.json. El error «Missing script» suele indicar que el script no existe en ese archivo, no que TypeScript sea incapaz de compilar. Cuando Node o npm no se reconoce, revisá instalación y terminal antes del código. Usá una versión de Node compatible con las herramientas elegidas, documentada en sus requisitos.

## Ejemplo de la clase

```bash
node --version
npm --version
npm init -y
npm install --save-dev typescript
npx tsc --version
```

[Abrir el fragmento como archivo](fragmentos/clase_06.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

init -y crea package.json aceptando valores iniciales. install registra TypeScript como herramienta de desarrollo y crea o actualiza el archivo de bloqueo. npx ejecuta el compilador disponible en el proyecto. Estos comandos corresponden a tu carpeta de práctica, no a las dependencias copiadas del campus.

## Cambiar una decisión y explorar un límite

Creá el script check y ejecutalo desde otra carpeta: podés no encontrar el proyecto. Quitar un paquete de node_modules sin cambiar el bloqueo se puede resolver reinstalando, pero borrar un archivo fuente no lo reconstruye npm. Los paquetes y tu programa son contenidos diferentes.

## Confusión que conviene evitar

Esperar que document.querySelector funcione en Node como si hubiera una página abierta.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_06.md). Las [soluciones razonadas](SOLUCIONES_06.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_05.md) · [Clase siguiente](../04_TypeScript/CLASE_07.md)
