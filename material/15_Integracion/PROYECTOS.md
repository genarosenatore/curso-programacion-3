# Proyectos para integrar el recorrido

[Unidad](GUIA.md) · [Inicio](../INICIO.md)

Trabajá en una copia del material. Primero leé la consigna original y anotá sus requisitos: esta guía ayuda a organizar el trabajo y no reemplaza las condiciones de evaluación.

## Proyecto 1: Food Store

1. Dibujá las pantallas y definí qué datos representa cada una.
2. Prepará HTML semántico y CSS adaptable. Comprobá navegación y formularios con teclado.
3. Cargá un catálogo local con identificador, nombre, precio y stock. Mostrá estados de carga, lista vacía y error.
4. Implementá búsqueda y carrito. Al agregar verificá stock; al eliminar recalculá el total. Probá cantidad cero, negativa y superior al stock.
5. Definí interfaces TypeScript y validá datos externos. El compilador comprueba tipos del código; la validación comprueba respuestas reales.
6. Creá entidades, DTO, repositorios y servicios. La lógica y validación del servidor deben funcionar aunque no se use tu pantalla.
7. Conectá el frontend con HTTP. Tratá respuestas correctas, errores y DELETE con cuerpo vacío.
8. Compará cada requisito de la consigna con una prueba concreta antes de darlo por terminado.

El [ejemplo JavaScript](../Ejemplos/javascript/index.html) resuelve catálogo y carrito locales. El [ejemplo Spring](../Ejemplos/spring/README.md) resuelve un CRUD de productos. Ambos sirven como referencia para construir la integración; Food Store requiere desarrollar los requisitos restantes de la consigna.

## Proyecto 2: facturación y consultas

1. Revisá el modelo original: FacturaVenta tiene detalles; cada detalle referencia listaPrecioArticulo, que conduce al artículo y su marca.
2. Identificá claves y relaciones. Dibujá quién conserva cada clave foránea antes de elegir anotaciones.
3. Prepará casos de prueba: cliente sin facturas, factura con varios detalles, dos marcas, factura anulada y resultados vacíos.
4. Escribí cada consulta primero en palabras. Indicá qué entidad devuelve y qué relaciones recorre.
5. Implementá filtros, joins, agrupaciones y DTO según la consigna. No cambies nombres o tipos del modelo sin ajustar la consulta.
6. Compará el resultado con un cálculo manual para detectar duplicados causados por joins.
7. Probá persistir, consultar y revertir una operación dentro de una transacción.

## Checklist antes de cerrar

- [ ] Puedo explicar el recorrido navegador → controlador → servicio → repositorio → base.
- [ ] Tengo una lista verificable de requisitos de la consigna original.
- [ ] Compila el proyecto con las versiones que declara su configuración.
- [ ] La pantalla distingue carga, éxito, vacío y error.
- [ ] El servidor valida datos y no depende de la validación del navegador.
- [ ] Probé identificador inexistente, datos inválidos y restricciones del stock.
- [ ] Las operaciones que deben ser atómicas están dentro de una transacción.
- [ ] Verifiqué totales, conteos y resultados vacíos con datos conocidos.
- [ ] Puedo iniciar el proyecto siguiendo mi README desde una carpeta limpia.
- [ ] Puedo explicar cada archivo importante sin repetir una definición de memoria.

Si aparece una duda, anotá clase, requisito, ejemplo mínimo, resultado esperado y mensaje obtenido. Es suficiente para que retomemos juntos ese punto.
