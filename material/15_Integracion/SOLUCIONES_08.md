# Soluciones 15.08 · Sesión didáctica y permisos: alcance del ejemplo

[Clase](CLASE_08.md) · [Práctica](EJERCICIOS_08.md)

## 1. Razonamiento de la actividad guiada

La interfaz podría mostrar el panel, demostrando que esa bandera no protege operaciones. Un backend con autorización real rechazaría peticiones sin permisos válidos. El ejemplo educativo no permite afirmar esa protección.

## 2 y 3. Resolver y justificar las decisiones

Las salidas son false,false,true. Catálogo puede ser público; préstamo propio requiere identidad y propiedad; administración requiere permiso apropiado. La pantalla puede simular navegación por rol para aprender, pero solo servidor puede hacer cumplir acceso al recibir solicitudes. La tabla debe aclarar su alcance y no presentar storage editable como garantía de identidad.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
