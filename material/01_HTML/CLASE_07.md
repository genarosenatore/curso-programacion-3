# Clase 01.07 · Práctica: página personal, registro y blog

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_06.md) · [Clase siguiente](../02_CSS/CLASE_01.md)

## Integrar sin agregar tecnologías todavía

Una práctica integradora requiere repartir el problema en partes conocidas. Para una página personal necesitamos un documento, contenido organizado y enlaces. Para un registro de demostración necesitamos campos y etiquetas. Para un blog necesitamos entradas autónomas. Ya enseñamos cada herramienta en [01.01](CLASE_01.md) a [01.06](CLASE_06.md); esta clase decide cómo combinarlas.

Primero escribí una lista de contenido: presentación, intereses, contacto y lecturas. Segundo agrupá por función: header introduce, nav conecta, main contiene los temas y footer cierra. Tercero elegí elementos para cada dato: párrafo para presentación, lista para intereses, tabla solo si hay filas y columnas. Cuarto añadí enlaces y comprobá las rutas desde cada documento. Quinto prepará un formulario que aclare su alcance.

## Una entrega pequeña que podés revisar

Trabajá en una carpeta con index.html y registro.html, ambos documentos completos. La portada enlaza al registro y el registro vuelve a la portada. Incluí en la portada un h1, un main y dos artículos con títulos coherentes. En el registro, un nombre y un correo con label y required son suficientes para empezar. Abrí la portada desde el navegador y recorré todo usando también Tab y Enter.

La **verificación** no consiste solo en mirar la portada. Debe incluir activar cada enlace, confirmar que existe su destino, recorrer el formulario y comprobar vacío y dato válido. Mirar sin CSS permite evaluar si la estructura cuenta la historia por sí misma. Si una imagen no agrega información, no la uses para rellenar la práctica.

Una página estática puede presentar y validar formato, pero no crear una cuenta o conservar un préstamo en un servidor. Mostrar un mensaje de «cuenta creada» sin implementación confunde el alcance. Más adelante aprenderemos comportamiento y backend; ahora comprobamos estructura y navegación.

## Ejemplo de la clase

```html
<main>
  <h1>Mi página personal</h1>
  <p>Estoy aprendiendo desarrollo web.</p>
  <section><h2>Mis intereses</h2><ul><li>Programación</li></ul></section>
  <a href="registro.html">Abrir formulario de registro</a>
</main>
```

[Abrir el fragmento como archivo](fragmentos/clase_07.html) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Este fragmento se coloca dentro del body del documento base. registro.html debe existir al lado de index.html. Hacé una tabla de requisitos: elemento esperado, archivo donde está y cómo comprobarlo. Una página que se ve bien puede tener un enlace roto o un campo sin etiqueta; la revisión debe incluir comportamiento y estructura.

## Cambiar una decisión y explorar un límite

Agregá una carpeta paginas para registro.html: la portada debe enlazar paginas/registro.html y el regreso usar ../index.html. Si solo movés el archivo, rompés la navegación. Si un botón parece funcionar pero no hay un receptor que registre datos, la práctica sigue siendo un formulario de demostración.

## Confusión que conviene evitar

Copiar una solución entera sin poder explicar dónde se define cada requisito.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_07.md). Las [soluciones razonadas](SOLUCIONES_07.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_06.md) · [Clase siguiente](../02_CSS/CLASE_01.md)
