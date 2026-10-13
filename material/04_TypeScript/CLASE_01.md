# Clase 04.01 · JavaScript y TypeScript: compilación y tipos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_13.md) · [Clase siguiente](../04_TypeScript/CLASE_02.md)

## Comprobar un programa antes de ejecutarlo

JavaScript permite asignar texto a una variable que antes contenía un número. Esa flexibilidad puede esconder errores hasta que ejecutamos cierta operación. TypeScript agrega un sistema de tipos para detectar usos incompatibles al escribir o compilar. Necesitás comprender [valores](../03_JavaScript/CLASE_01.md), [funciones](../03_JavaScript/CLASE_05.md) y [objetos](../03_JavaScript/CLASE_07.md): TypeScript no reemplaza esas ideas.

**Compilar** transforma código fuente en otra representación. Aquí `tsc` comprueba TypeScript y genera JavaScript. Una **anotación** como `:number` indica qué valores admite un nombre; se elimina de la salida. El navegador ejecuta el JavaScript resultante, no utiliza esa anotación para comprobar una respuesta de red.

## Seguir la transformación

Con `let precio:number = 800`, el compilador conserva `let precio = 800` al generar. Si luego escribís precio = "gratis", informa incompatibilidad. Cambiarlo a Number("800") es una conversión real que genera una operación; escribir `as number` es una afirmación al compilador que no convierte nada. Esa diferencia determina qué comprobación sigue faltando en ejecución.

Para practicar, usá [el proyecto TypeScript local](../EJEMPLOS.md): contiene src/main.ts, package.json y tsconfig.json. Si todavía no tenés herramientas instaladas, leé primero el procedimiento de [04.06](CLASE_06.md); esa clase explica Node y npm sin depender de nuevos tipos. El archivo viene compilado para observar la página, pero modificar un .ts exige volver a generar su salida.

Con la herramienta preparada, guardá el fragmento en un archivo de práctica y ejecutá `npx tsc ejemplo.ts --strict --noEmitOnError --target ES2022` desde su carpeta; después `node ejemplo.js` para un ejemplo sin DOM. strict habilita comprobaciones más exigentes y noEmitOnError evita generar ante errores. Un programa puede compilar y tener un error lógico, como sumar precio y cantidad: los tipos no demuestran la regla del negocio.

## Ejemplo de la clase

```typescript
const precio: number = 800;
const nombre: string = "Lapicera";
console.log(nombre, precio * 2);
// precio = "ochocientos"; // No es un number y además precio es const.
```

[Abrir el fragmento como archivo](fragmentos/clase_01.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Las anotaciones :number y :string indican tipos. El JavaScript generado conserva los valores y el console.log, pero elimina las anotaciones. Un error del compilador describe una incompatibilidad; corregirlo debería mejorar el modelo y no silenciarlo con cualquier conversión.

## Cambiar una decisión y explorar un límite

Usá let precio:number para probar una asignación textual: así aislás el error de tipo sin mezclarlo con la prohibición de reasignar const del ejemplo inferior. Si recibís JSON con precio:"gratis", ninguna anotación modifica ese dato remoto. Validarlo requiere código ejecutable.

## Confusión que conviene evitar

Usar una anotación o as para afirmar que los datos externos ya fueron comprobados.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_01.md). Las [soluciones razonadas](SOLUCIONES_01.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_13.md) · [Clase siguiente](../04_TypeScript/CLASE_02.md)
