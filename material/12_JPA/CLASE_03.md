# Clase 12.03 · Relaciones, JoinColumn y lado propietario

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_02.md) · [Clase siguiente](../12_JPA/CLASE_04.md)

## Guardar una referencia de objeto como clave foránea

Una relación ManyToOne en Producto.categoria significa que varios productos pueden referenciar una categoría. En SQL se expresa con categoria_id en producto, como aprendimos en [11.03](../11_Bases_de_datos/CLASE_03.md). @JoinColumn nombra esa columna. El atributo guarda Categoria en Java, no solamente un número; el proveedor utiliza su identidad al guardar.

Una relación **bidireccional** también ofrece Categoria.productos para recorrer desde el otro lado. Son dos referencias Java a la misma asociación lógica, no dos claves foráneas distintas. El **propietario** determina la escritura de la relación: en este modelo es Producto.categoria. `mappedBy="categoria"` indica que la lista es el lado inverso y apunta a ese atributo Java.

## Mantener ambos recorridos coherentes

agregarProducto debe añadir a la lista y asignar categoria al producto. Si modificás solo la lista inversa, el propietario puede seguir sin categoría y no guardar la referencia esperada. Si asignás solo el propietario, la base puede quedar bien pero tu colección en memoria no reflejarlo todavía.

En [el laboratorio](../Ejemplos/persistencia/README.md), Categoria.agregar y Producto.asignar implementan un alta simple coherente. Su alcance inicial rechaza mover un producto a otra categoría; para permitir traslado habría que retirarlo de la anterior y añadirlo a la nueva. No escondas esa necesidad en un setter libre.

LAZY significa carga diferida, que desarrollaremos en 12.07. Aquí señala que consultar la relación puede necesitar obtener datos adicionales; no cambia quién es propietario. `optional=false` expresa relación requerida en objetos y `nullable=false` en JoinColumn la restricción física prevista. Una OneToOne puede requerir unicidad y una ManyToMany tabla de asociación; si la asociación tiene cantidad o precio propio, modelarla como entidad de detalle puede expresar mejor su función.

Los fragmentos inferiores van dentro de las dos entidades configuradas, no como declaraciones sueltas en main. Ejecutá el laboratorio y recuperá desde otro contexto para verificar el vínculo guardado, no solo la lista original.

## Ejemplo de la clase

```java
// En Producto:
@jakarta.persistence.ManyToOne(fetch=jakarta.persistence.FetchType.LAZY)
@jakarta.persistence.JoinColumn(name="categoria_id")
private Categoria categoria;

// En Categoria:
@jakarta.persistence.OneToMany(mappedBy="categoria")
private java.util.List<Producto> productos = new java.util.ArrayList<>();
```

[Abrir el fragmento como archivo](fragmentos/clase_03.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Producto tiene la columna categoria_id y es propietario en este modelo. Categoria.productos describe el otro lado usando mappedBy="categoria". Si añadís un producto solo a la lista pero no asignás su categoria, podrías no persistir la relación como esperás.

## Cambiar una decisión y explorar un límite

Usar mappedBy="categoria_id" busca un atributo Java inexistente y puede impedir arrancar el modelo. Agregar solo a productos no escribe la clave del propietario. Cambiar fetch no corrige ninguno de esos desacuerdos.

## Confusión que conviene evitar

Escribir mappedBy="categoria_id" cuando el atributo de Producto se llama categoria.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_03.md). Las [soluciones razonadas](SOLUCIONES_03.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_02.md) · [Clase siguiente](../12_JPA/CLASE_04.md)
