# Clase 00.05 · Git y GitHub: guardar versiones y comprender un repositorio

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../00_Fundamentos/CLASE_04.md) · [Clase siguiente](../01_HTML/CLASE_01.md)

## Guardar historia, además de archivos

En [00.02](CLASE_02.md) guardamos archivos; eso conserva su estado actual. Git permite conservar versiones anteriores con una explicación. Un **repositorio** contiene archivos y la historia que Git mantiene en `.git`. Un **commit** es una versión registrada; tiene un identificador y un mensaje. GitHub aloja repositorios remotos: un commit local no los publica.

Git distingue tres lugares: la carpeta de trabajo, donde editás; el área de preparación, donde elegís los cambios; y la historia confirmada. `git add index.html` copia el estado actual de ese archivo al área de preparación. Si después lo editás otra vez, el commit puede incluir la versión preparada anterior. `git status` permite ver esa diferencia antes de registrar.

## Preparar la primera versión

Necesitás Git instalado. Abrí una terminal en una carpeta nueva de ejercicios, creá y guardá index.html y comprobá con `git --version` que el comando existe. La terminal ejecuta comandos desde una carpeta actual; no los pegues en la consola JavaScript del navegador. Ejecutá cada línea del ejemplo por separado y leé su salida.

`init` crea el repositorio local; `status` informa cambios; `add` elige el archivo; `commit -m` registra lo preparado y `-m` recibe un mensaje entre comillas; `log --oneline` muestra una línea por versión. Si Git pide identidad, usá en este repositorio `git config user.name "Tu nombre"` y `git config user.email "tu-correo"`, reemplazando los valores. Son datos de autoría, no una contraseña ni una sesión en GitHub.

Una **rama** es un nombre que sigue una línea de versiones. Tras el primer commit, `git switch -c practica` crea y cambia a una rama de trabajo. Permite experimentar conservando otra línea. Integrar puede producir un conflicto: Git indica partes que requieren decidir el contenido final. No lo resuelvas aceptando todo sin leer.

Los archivos generados y las contraseñas no deben formar parte del material de estudio. `.gitignore` puede omitir archivos todavía no registrados, como `node_modules/`; no borra secretos de la historia. En estas prácticas trabajá localmente en tu carpeta nueva.

## Ejemplo de la clase

```bash
git init
git status
git add index.html
git commit -m "Agregar primera pagina"
git log --oneline
```

[Abrir el fragmento como archivo](fragmentos/clase_05.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Desde la terminal situada en tu carpeta de práctica, init crea el repositorio; status muestra su estado; add prepara index.html; commit registra la versión; log permite verla. Creá y guardá index.html antes de add. El primer commit puede pedir tu nombre y correo de autor: configurarlos identifica los commits, no inicia sesión en GitHub. Publicar requiere otro paso que no hacemos aquí.

## Cambiar una decisión y explorar un límite

Editá index.html después del commit y ejecutá status: cambia la carpeta de trabajo, no la historia. Prepará y registrá un segundo commit. Si editás después de add, repetí add para incluir ese último estado. Inspeccionar con git diff y git diff --staged distingue cambios pendientes y preparados.

## Confusión que conviene evitar

Pensar que guardar un archivo en el editor crea un commit o publica el proyecto.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_05.md). Las [soluciones razonadas](SOLUCIONES_05.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../00_Fundamentos/CLASE_04.md) · [Clase siguiente](../01_HTML/CLASE_01.md)
