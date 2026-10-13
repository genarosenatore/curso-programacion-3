# Tu aula · Programación 3

Curso de apoyo con 134 clases, 16 unidades y 64 preguntas autocorregibles. Incluye teoría, prácticas, soluciones y ejemplos propios. No es un sitio oficial de la UTN. Las notas corresponden a cuestionarios de práctica, no a evaluaciones oficiales.

## Revisar esta copia local

Esta versión incorpora la revisión de las 134 clases solicitada el 13 de octubre de 2026. La publicación en GitHub fue autorizada posteriormente por el estudiante. La versión anterior se conserva en el historial del repositorio.

Pendientes pedagógicos: profundizar el recorrido de ejecución en clases avanzadas, especialmente relaciones JPA e inyección de dependencias en Spring, y ampliar la evaluación de comprensión (actualmente cuatro preguntas por unidad). La cobertura de todas las clases y las pruebas técnicas no implican que el material ya sea suficiente para aprender cada tema desde cero sin ayuda.

Abrí `INICIAR_REVISION.cmd` y entrá a http://127.0.0.1:8766, o desde esta carpeta ejecutá `node tools/servidor.mjs`. El menú **Revisión y límites** muestra el registro por unidad. [REVISION_POR_UNIDAD.md](material/REVISION_POR_UNIDAD.md) documenta mejoras y alcance; [VERIFICACION.md](material/VERIFICACION.md) distingue pruebas realizadas y pendientes.

Se conservan los identificadores y el formato de progreso. Si estudiabas desde otro puerto, dominio o navegador, exportá tu avance desde allí e importalo en esta copia; la compatibilidad del archivo no comparte automáticamente almacenamiento entre orígenes.

## Mantener Markdown y web sincronizados

La página sigue cargando `course.json`; los Markdown son su fuente. Para regenerar después de editar, desde `tools` instalá la dependencia declarada y ejecutá:

```text
npm install --ignore-scripts
npm run build
npm run verify
```

Build incorpora teoría, prácticas, soluciones y documentos auxiliares. Verify compara el JSON con una construcción nueva y revisa clases, banco, enlaces y lógica del progreso. Estas herramientas no son necesarias para abrir el sitio ya generado ni ejecutan las prácticas del estudiante.

## Publicar con GitHub Pages

1. Creá un repositorio público, por ejemplo `curso-programacion-3`.
2. Subí **el contenido de esta carpeta a la raíz del repositorio**. `index.html`, `.nojekyll`, `app.js`, `course.json` y la carpeta `material` deben quedar en la raíz. No subas el ZIP como un único archivo ni pongas todo dentro de otra subcarpeta.
3. En **Settings → Pages → Build and deployment**, seleccioná **Deploy from a branch**.
4. Elegí la rama **main**, carpeta **/(root)**, y guardá.
5. Esperá a que GitHub complete la publicación y usá la dirección que muestra Pages. Normalmente será `https://TU_USUARIO.github.io/curso-programacion-3/`.

El sitio no necesita Node, un servidor propio ni un proceso de compilación. `.nojekyll` conserva los archivos y rutas del material tal como están. Si tenés muchos archivos, usá Git para subir la carpeta; la interfaz de carga web puede necesitar varias tandas.

Documentación oficial: https://docs.github.com/en/pages/getting-started-with-github-pages/creating-a-github-pages-site

## Avance y notas

Cada visitante guarda su avance en su navegador. No se envían respuestas a un servidor. Se puede exportar e importar un respaldo JSON. Los datos de la versión local no aparecen automáticamente online: exportá el avance local e importalo en la página publicada.

El avance depende del navegador y del origen de la página. Incógnito, borrar datos o cambiar de dispositivo puede impedir recuperarlo sin un respaldo. Las prácticas de código se realizan fuera de la página; los cuestionarios sí se corrigen automáticamente.

## Contenido publicado

Se incluyen las clases y ejemplos de apoyo que preparamos. No se incluyen PDFs, ZIP, RAR, proyectos descargados ni otros archivos originales del campus. Las referencias correspondientes indican que hay que consultar el campus con acceso propio. Los enlaces externos de consulta siguen disponibles.

## Probar antes de publicar

Podés servir esta carpeta con cualquier servidor estático. No abras index.html directamente como archivo porque el sitio carga datos con fetch. El código usa rutas relativas para funcionar dentro del nombre de un repositorio de GitHub Pages.
