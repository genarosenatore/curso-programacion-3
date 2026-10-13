# Práctica 08.05 · Records y datos de transporte

[Clase](CLASE_05.md) · [Soluciones separadas](SOLUCIONES_05.md)

## 1. Actividad guiada

Diseñá un record ListaDTO(List<String> nombres) que no conserve una lista mutable ajena.

1. Creá lista mutable de nombres.
2. Copiala en constructor compacto con List.copyOf.
3. Modificá original y comprobá contenido del DTO.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Creá dos ProductoDTO iguales y comparalos; intentá uno con nombre vacío manejando el rechazo.

## 3. Combinar lo aprendido

Implementá ListaDTO con copia de List<String> en el constructor compacto. Modificá la lista original después. ¿Por qué no es una copia profunda universal?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. equals se genera con componentes.
2. Asigná nombres=List.copyOf(nombres) en el constructor.
3. La estructura nueva puede compartir elementos.
