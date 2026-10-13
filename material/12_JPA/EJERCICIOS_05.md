# Práctica 12.05 · EntityManager y ciclo de vida

[Clase](CLASE_05.md) · [Soluciones separadas](SOLUCIONES_05.md)

## 1. Actividad guiada

Explicá qué cambia si modificás el objeto después de cerrar el contexto.

1. Localiza find dentro del contexto.
2. Cambia un dato gestionado y sincroniza.
3. Cierra contexto y distingue modificación separada posterior.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Explicá nueva, gestionada y separada siguiendo persist, commit y cierre en el laboratorio.

## 3. Combinar lo aprendido

Modificá nombre en transacción, flush y rollback; verificá desde otro contexto. ¿Por qué un objeto con id puede no guardar una modificación posterior?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. flush envía cambios pendientes, no los confirma.
2. El contexto sigue solo sus instancias gestionadas.
3. La verificación necesita una recuperación nueva.
