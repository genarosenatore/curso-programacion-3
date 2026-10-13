# Clase 03.08 · DOM: seleccionar, crear y modificar elementos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_07.md) · [Clase siguiente](../03_JavaScript/CLASE_09.md)

## De una página a objetos que podemos modificar

El navegador lee HTML y construye un árbol de nodos llamado **DOM**, modelo de objetos del documento. El árbol conserva relaciones: ul contiene li, y li contiene texto. JavaScript utiliza objetos para representar esos nodos y métodos para modificarlos. HTML es la descripción inicial; el DOM puede cambiar después sin editar el archivo original.

Necesitás [HTML](../01_HTML/CLASE_01.md), [funciones](CLASE_05.md) y [objetos](CLASE_07.md). `document` representa el documento abierto en el navegador; no existe en un programa Node normal. `querySelector` utiliza la sintaxis de selectores CSS: `#productos` busca un id y `.producto` una clase. Entrega la primera coincidencia o null. `querySelectorAll` entrega una colección de coincidencias, incluso si está vacía.

## Un documento ejecutable completo

Guardá esto como index.html y abrilo en el navegador. El script está después de la lista para que exista cuando se selecciona:

```html
<!doctype html>
<html lang="es">
<head><meta charset="UTF-8"><title>Lista</title></head>
<body>
  <h1>Productos</h1>
  <ul id="productos"></ul>
  <script>
    const lista = document.querySelector("#productos");
    const item = document.createElement("li");
    item.textContent = "Cuaderno";
    lista.append(item);
  </script>
</body>
</html>
```

Primero existe ul; después se obtiene su objeto. createElement crea un li separado que todavía no aparece. textContent coloca texto y append lo incorpora como hijo de ul. Solo entonces se muestra en la lista. En este documento sabemos que existe el id; en un fragmento reutilizable debemos comprobar null antes de usarlo, como hace el ejemplo inferior.

## Renderizar una colección

**Renderizar** aquí significa convertir datos en elementos visibles. Con un array de nombres, recorré sus valores, creá un li para cada uno, asigná textContent y agregalo. Antes de representar otra vez la misma lista, `lista.replaceChildren()` retira sus hijos; si solo agregás, duplicás elementos. No borra el array de datos: cambia el árbol visible.

textContent coloca texto literal. innerHTML interpreta marcado: un nombre como `<strong>Ana</strong>` se convertiría en elementos y, con datos externos, puede introducir contenido peligroso. Para nombres y mensajes usá texto. Los atributos pueden cambiar con setAttribute(nombre,valor) y las clases con classList.add o remove; estas operaciones afectan presentación o referencias, no reemplazan la validación de datos.

## Ejemplo de la clase

```javascript
// HTML: <ul id="productos"></ul>
const lista = document.querySelector("#productos");
if (lista) {
  const item = document.createElement("li");
  item.textContent = "Cuaderno";
  lista.append(item);
}
```

[Abrir el fragmento como archivo](fragmentos/clase_08.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La selección busca el id productos. El if evita actuar sobre null. li se crea, recibe texto y se añade a ul. Poné el script al final del body o usá un script externo con defer. En los ejemplos de la unidad se entrega el HTML necesario para ejecutar estas operaciones.

## Cambiar una decisión y explorar un límite

Cambiá el id HTML a catalogo sin cambiar el selector: lista será null y append no tendrá receptor válido. Cambiá solo el texto del elemento: aparece otro nombre sin alterar la estructura. Volvé a ejecutar un render sin limpiar: se acumulan hijos; limpiar una vez antes del recorrido conserva exactamente la representación de los datos.

## Confusión que conviene evitar

Reemplazar datos de usuario con innerHTML como si fuera una simple asignación de texto.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_08.md). Las [soluciones razonadas](SOLUCIONES_08.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_07.md) · [Clase siguiente](../03_JavaScript/CLASE_09.md)
