# Preparar las herramientas y ejecutar desde la carpeta correcta

[Inicio](INICIO.md) · [Ejemplos](EJEMPLOS.md)

HTML y CSS solo necesitan editor y navegador. Las primeras prácticas JavaScript pueden ejecutarse en la consola del navegador. Instalá las otras herramientas cuando llegues a los ejemplos que las utilizan; no son requisitos para empezar la primera clase.

## Terminal, carpeta y comando

Una terminal permite pedir operaciones escribiendo comandos. En Windows podés usar PowerShell. La carpeta actual es el punto desde donde se resuelven nombres de archivo. Abrí la carpeta de tu práctica en el Explorador, escribí `powershell` en su barra de dirección y ejecutá, o abrí una terminal en tu editor con esa carpeta seleccionada.

`Get-Location` muestra la carpeta actual en PowerShell. `Get-ChildItem` lista su contenido. `cd "ruta de tu carpeta"` cambia ubicación; reemplazá ese texto por una ruta real y conservá comillas si contiene espacios. No escribas los caracteres de indicación de consola, como `PS C:\...>`: solo el comando que sigue.

Un comando de terminal como `node app.js` no va en consola JavaScript ni dentro del archivo. Una instrucción `console.log(3)` sí pertenece al código o a la consola del navegador. Si la terminal queda ocupada por un servidor, abrí otra para nuevos comandos. Ctrl+C detiene el proceso iniciado allí.

## Node y npm

Comprobá `node --version` y `npm.cmd --version` en Windows. Si no existen, usá el instalador oficial para tu sistema y una versión LTS compatible con las herramientas del proyecto. Cerrá y reabrí terminal después de instalar. Node permite ejecutar `.js` sin DOM y usar herramientas; npm administra paquetes. En PowerShell, `npm.cmd` evita confundir el ejecutable con un script `.ps1` bloqueado por la política local. No cambies esa política solo para compilar el ejemplo. [Descarga oficial de Node](https://nodejs.org/en/download).

Para TypeScript entrá a `material/Ejemplos/typescript`: `npm.cmd install --ignore-scripts`, `npm.cmd run check` y `npm.cmd run build`. La primera descarga el compilador fijado en package.json; check comprueba y build genera el JavaScript. Para Vite revisá los requisitos de la versión elegida como explica la clase 04.07.

## Java

Necesitás JDK 21 para reproducir estos proyectos. Comprobá `java -version` y `javac -version`: ambos deben corresponder al JDK, no solo a un entorno de ejecución antiguo. Un IDE también debe seleccionar ese mismo JDK. Consultá la preparación y alternativas oficiales en [Aprender Java](https://dev.java/learn/).

Si existen varias versiones, ejecutar la herramienta mediante su ruta completa permite elegir una sin cambiar todo el sistema. En PowerShell, `& "ruta\al\jdk\bin\javac.exe" -encoding UTF-8 Hola.java` usa ese compilador; `&` indica invocar el programa cuyo camino está entre comillas. Reemplazá la ruta por la instalación real. El recorrido de fuente a bytecode y la ejecución están enseñados en 05.01.

## Maven para JPA y Spring

Maven lee pom.xml y prepara dependencias/construcción. Requiere JDK. Si `mvn -version` no existe, descargá la distribución binaria desde Apache y extraela. Su carpeta bin contiene `mvn.cmd`; podés invocarla con ruta completa o agregar bin a PATH y abrir una terminal nueva. Verificá qué Java informa Maven. [Instalación oficial de Maven](https://maven.apache.org/install.html).

PATH es la lista de lugares donde la terminal busca ejecutables; JAVA_HOME señala la carpeta del JDK para herramientas que la consultan. Si necesitás seleccionar JDK solo para esta terminal, usá `$env:JAVA_HOME="ruta real al JDK"`; ese valor debe apuntar a la carpeta principal, no a bin. No pegues una ruta inventada. Ejecutá Maven desde la carpeta donde está pom.xml y seguí el README del proyecto concreto.

La primera construcción requiere conexión para descargar bibliotecas. Que el servidor de dependencias no responda no es un error de tu entidad o DTO; guardá el mensaje y comprobá conexión antes de modificar código.

## Python como lanzador de SQL y del sitio

Python no es una unidad nueva de la materia: se usa para un servidor estático y SQLite incluido. Comprobá `python --version` o `py --version`. Si no está disponible, consultá [Python en Windows](https://docs.python.org/3/using/windows.html) y su instalación oficial. Si usás py en vez de python, reemplazá ese nombre en los comandos del lanzador.

Desde `material/Ejemplos/sql`, `python practicar.py` crea la base de prueba en memoria. Para servir el sitio, desde la raíz revisada podés usar `python -m http.server 8766 --bind 127.0.0.1`, o el servidor Node incluido con `node tools/servidor.mjs`. Abrí la URL indicada mientras el proceso siga activo.

## Si algo falla antes del programa

«Comando no reconocido» indica que falta herramienta o búsqueda de ejecutable. «Archivo no encontrado» exige comprobar ubicación y nombre. «Puerto ocupado» requiere elegir otro puerto coherente para servidor y URL. «No se puede conectar» exige que el proceso esté iniciado y escuchando. Después de resolver la preparación, recién evaluá las instrucciones del ejemplo. Conservá mensaje completo, comando y carpeta para consultar en el chat.
