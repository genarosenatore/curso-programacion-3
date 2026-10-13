# Práctica 14.04 · Beans, ApplicationContext e inyección de dependencias

[Clase](CLASE_04.md) · [Soluciones separadas](SOLUCIONES_04.md)

## 1. Actividad guiada

Explicá por qué un Controller puede recibir ProductoService por constructor en lugar de crearlo con new.

1. Lee constructor de Controller con Service.
2. Sigue constructor de Service con Repository.
3. Explica cómo el contenedor entrega colaboradores.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Seguí la inyección Controller→Service→Repository en los constructores del proyecto.

## 3. Combinar lo aprendido

Explicá qué ocurre si un servicio guarda pedidoActual en un campo y recibe dos peticiones distintas. Proponé una alternativa con datos locales. ¿Por qué inyectar facilita probar colaboraciones?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. El constructor declara lo necesario.
2. El singleton puede recibir varias peticiones.
3. Una variable local pertenece a esa llamada.
