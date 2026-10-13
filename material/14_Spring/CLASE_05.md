# Clase 14.05 · Configuración, starters y perfiles

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_04.md) · [Clase siguiente](../14_Spring/CLASE_06.md)

## Qué vas a aprender

Vamos a trabajar **configuración, starters y perfiles**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

La configuración permite variar puertos, conexiones y otras propiedades sin reescribir lógica. Un perfil selecciona ajustes para un entorno. application.properties usa claves y valores; variables de entorno pueden aportar configuración externa. Un starter habilita capacidades y la autoconfiguración usa condiciones para preparar beans.

Para practicar, H2 en memoria se reconstruye al arrancar. create-drop genera y elimina el esquema dentro de ese entorno de prueba. No lo usamos para una base con datos que necesitemos conservar. Los secretos reales no van en repositorios de ejemplos.

## Ejemplo

```properties
spring.datasource.url=jdbc:h2:mem:curso
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.open-in-view=false
server.port=8080
```

[Abrir el fragmento como archivo](fragmentos/clase_05.properties) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los métodos y clases forman parte del proyecto Spring de apoyo, salvo que se indique el modelo FacturaVenta del campus. Los fragmentos no reemplazan pom.xml ni configuración.

## Leamos el ejemplo paso a paso

La base vive en el proceso y los datos se reinician al apagar. open-in-view=false delimita acceso persistente fuera del servicio y motiva construir DTO dentro de la transacción. Si el puerto está ocupado, podés usar otro y cambiar la URL del frontend de manera coherente.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Explicá por qué create-drop no sirve para conservar pedidos reales.

Abrí [los ejercicios y las pistas](EJERCICIOS_05.md). Las [soluciones explicadas](SOLUCIONES_05.md) están preparadas para consultar después de intentarlo.

## Error común

Cambiar el puerto del servidor y no cambiar el destino de las peticiones del frontend.

## Resumen para repasar

La configuración permite variar puertos, conexiones y otras propiedades sin reescribir lógica. Un perfil selecciona ajustes para un entorno.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **14.05** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_04.md) · [Clase siguiente](../14_Spring/CLASE_06.md)
