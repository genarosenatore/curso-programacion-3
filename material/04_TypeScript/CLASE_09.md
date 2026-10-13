# Clase 04.09 · Práctica: API de Los Simpsons

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_08.md) · [Clase siguiente](../04_TypeScript/CLASE_10.md)

## Qué vas a aprender

Vamos a trabajar **práctica: api de los simpsons**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

La práctica del campus pide consumir personajes de Los Simpsons y explicar configuración y scripts. Un servicio externo puede cambiar; primero implementaremos el flujo con un archivo local que imite una respuesta sencilla. Después compararemos el contrato real antes de conectar el endpoint de la consigna.

Separá cargar datos, validar, filtrar y renderizar. La interfaz necesita mostrar carga, resultados y error. No supongas que una respuesta siempre es un array directo: muchas APIs envuelven los resultados y agregan paginación.

## Ejemplo

```typescript
interface Personaje { id: number; nombre: string; }
function filtrar(personajes: Personaje[], texto: string): Personaje[] {
  const busqueda = texto.trim().toLowerCase();
  return personajes.filter(p => p.nombre.toLowerCase().includes(busqueda));
}
console.log(filtrar([{id:1,nombre:"Lisa"},{id:2,nombre:"Bart"}],"li"));
```

[Abrir el fragmento como archivo](fragmentos/clase_09.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

El código TypeScript necesita compilación. Los fragmentos de DOM requieren una página. El proyecto local enlazado incluye configuración y datos para practicar.

## Leamos el ejemplo paso a paso

Devuelve Lisa. El cálculo no depende de la red ni del DOM, así que se comprueba fácilmente. El JSON local usa la forma conocida por el ejemplo, que no se afirma idéntica a la API pública. Para conectar el servicio, observá sus campos y construí un adaptador si tienen otros nombres.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Construí una lista filtrable con dos personajes locales y un estado Sin resultados.

Abrí [los ejercicios y las pistas](EJERCICIOS_09.md). Las [soluciones explicadas](SOLUCIONES_09.md) están preparadas para consultar después de intentarlo.

## Error común

Copiar la URL de la consigna y asumir campos de otra API sin revisar la respuesta.

## Resumen para repasar

La práctica del campus pide consumir personajes de Los Simpsons y explicar configuración y scripts. Un servicio externo puede cambiar; primero implementaremos el flujo con un archivo local que imite una respuesta sencilla.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **04.09** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_08.md) · [Clase siguiente](../04_TypeScript/CLASE_10.md)
