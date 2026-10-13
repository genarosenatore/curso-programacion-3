# Soluciones 01.07 · Práctica: página personal, registro y blog

[Clase](CLASE_07.md) · [Práctica](EJERCICIOS_07.md)

## 1. Razonamiento de la actividad guiada

Una solución mínima contiene index.html con presentación, registro.html con formulario y blog.html con dos artículos y una tabla. En cada una, nav enlaza a las tres rutas. Usá un solo h1 por página, labels en el registro y caption en la tabla. El resultado se comprueba abriendo todos los enlaces y validando campos vacíos.

## 2 y 3. Resolver y justificar las decisiones

La portada usa h1, párrafo y ul, más `<a href="registro.html">Registro de demostración</a>`. El registro usa los campos de 01.06 y `<a href="index.html">Volver</a>`. Si ambos están en la misma carpeta no hace falta ../.

La tabla puede tener columnas Día y Horario con encabezados asociados. Verificá: enlace de ida, enlace de vuelta, asociación label/campo y rechazo del correo inválido. La apariencia no prueba ninguno de esos comportamientos. Un registro real necesita un backend que valide, decida reglas y guarde datos; HTML por sí solo no garantiza ese resultado.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
