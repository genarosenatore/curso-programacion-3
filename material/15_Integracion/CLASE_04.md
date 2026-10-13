# Clase 15.04 · Recorrido del proyecto de facturación descomprimido

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_03.md) · [Clase siguiente](../15_Integracion/CLASE_05.md)

## Leer un proyecto por un flujo concreto

El frontend original tiene public para HTML y src para TypeScript. facturaVentaApi.ts concentra solicitudes; facturaVentaDTO.ts describe contrato; facturas.ts y factura-form.ts conectan pantallas. package.json describe tareas y dependencias. No necesitas leer node_modules para entender una petición, igual que vimos en [04.06](../04_TypeScript/CLASE_06.md).

El archivo API revisado fija http://localhost:8080/api/facturas. construirQueryString usa URLSearchParams, excluye valores ausentes o blancos y agrega los restantes. obtenerFacturas hace GET; crear envía POST con JSON; actualizar PUT por numeroFactura de ruta y eliminar DELETE. El manejador contempla204 antes de json, pero sus afirmaciones genéricas no validan realmente la forma recibida.

## Comparar el contrato en backend

FacturaVentaController ofrece filtros numeroFactura, clienteDenominacion, condicionIva, fechaDesde y fechaHasta. DateTimeFormat pide yyyy-MM-dd para esas fechas de entrada. Buscar, actualizar y eliminar usan número de factura como identificador de negocio en sus métodos. La entidad, sin embargo, declara numero; id técnico se hereda de EntityId. DTO, ruta y entidad pueden usar nombres distintos con mapeo explícito.

Las clases contables inspeccionadas no traen mapeo JPA completo en varios casos. El proyecto de ejemplo no demuestra persistencia relacional integral de FacturaArca por tener Controller y Service. Para practicar JPA se añadió [laboratorio independiente](../Ejemplos/persistencia/README.md); para HTTP, [API de productos](../Ejemplos/spring/README.md). Ambos tienen sus propios modelos conocidos.

El material original no se incluye en esta copia de Pages. Usa tu carpeta local recopilada o campus para seguir nombres exactos; esta clase te entrega el mapa del flujo y los datos inspeccionados, sin inventar que un sistema completo ya funciona. El diagrama inferior es ilustrativo y no se ejecuta.

Para investigar una actualización, sigue número de ruta → búsqueda por número → mapeo DTO→entidad → resultado. No sustituyas número por id solo porque ambos son Long: su significado difiere.

## Ejemplo de la clase

```text
public/index.html
  ↓
src/facturas.ts
  ↓
src/facturaVentaApi.ts: obtenerFacturas
  ↓ GET /api/facturas
FacturaVentaController.java
  ↓
FacturaVentaService.java
```

[Abrir el fragmento como archivo](fragmentos/clase_04.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El archivo de API revisado utiliza localhost:8080/api/facturas. El controller expone operaciones sobre esa ruta. Que coincidan rutas no garantiza que todos los DTO sean idénticos a la consigna nueva: compará también los campos y si el identificador representa id o numeroFactura.

## Cambiar una decisión y explorar un límite

Enviar id técnico donde la ruta espera número de factura puede consultar otra cosa o no encontrar. Renombrar numeroFactura en un DTO no renombra FacturaVenta.numero ni reescribe JPQL. Un mismo JSON de éxito no demuestra los mapeos faltantes del modelo.

## Confusión que conviene evitar

Confundir número de factura de negocio con id técnico al actualizar o borrar.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_04.md). Las [soluciones razonadas](SOLUCIONES_04.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_03.md) · [Clase siguiente](../15_Integracion/CLASE_05.md)
