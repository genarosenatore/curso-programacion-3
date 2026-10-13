# Soluciones 15.02 · Alinear interfaces TypeScript y DTO Java

[Clase](CLASE_02.md) · [Práctica](EJERCICIOS_02.md)

## 1. Razonamiento de la actividad guiada

function adaptar(dto:{id:number;denominacion:string}){return {id:dto.id,nombre:dto.denominacion};}. Validá primero el JSON y luego adaptá. No uses as para fingir que ya se renombró el campo.

## 2 y 3. Resolver y justificar las decisiones

El adaptador produce {id:1,nombre:"Cuaderno"} mediante lectura y nueva propiedad. Id grande puede ser string decimal validada; fecha de calendario puede ser string YYYY-MM-DD con validación; precioCentavos entero seguro no negativo. No convierte el id a Number si pierde precisión ni interpreta calendario como instante sin zona acordada. Al mostrar dinero divide centavos por100, manteniendo cálculo interno coherente.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
