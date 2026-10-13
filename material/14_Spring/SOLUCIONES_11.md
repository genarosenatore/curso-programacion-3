# Soluciones 14.11 · Spring Data JPA, H2 y transacciones

[Clase](CLASE_11.md) · [Práctica](EJERCICIOS_11.md)

## 1. Razonamiento de la actividad guiada

List<Producto> findByStockGreaterThan(int stock);. Con cero recupera productos disponibles según esa regla. El servicio puede mapearlos a DTO dentro de una transacción de lectura. No cambies el tipo del id del repositorio si la entidad utiliza Long.

## 2 y 3. Resolver y justificar las decisiones

JpaRepository usa Producto y Long; la consulta con categoría prepara lo requerido para DTO. actualizar busca dentro de @Transactional y aplica cambios al objeto gestionado, que se sincroniza al confirmar. Validación rechaza nombre inválido antes de ese resultado. readOnly no decide qué usuario puede consultar ni modificar; autorización necesita política separada. DTO no es entidad gestionada, por lo que modificarlo no guarda.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
