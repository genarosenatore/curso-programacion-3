# Soluciones 12.02 · Entity, Table, Id, GeneratedValue y Column

[Clase](CLASE_02.md) · [Práctica](EJERCICIOS_02.md)

## 1. Razonamiento de la actividad guiada

@Column(nullable=false,precision=12,scale=2) private BigDecimal precio;. Validá el precio antes de guardar. Creá BigDecimal desde texto como new BigDecimal("2000.00") para evitar introducir un error de double.

## 2 y 3. Resolver y justificar las decisiones

Id identifica; GeneratedValue obtiene identidad al guardar; Column configura persistencia. En constructor o método validado comprobá precio!=null y compareTo(ZERO)>=0 antes de asignar.2000.00 pasa y -1.00 falla. La base debe mantener no nulidad y, si requiere garantía de signo para todos los clientes, una restricción correspondiente; nullable no la crea por sí sola. Documentá también escala y redondeo de cálculos.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
