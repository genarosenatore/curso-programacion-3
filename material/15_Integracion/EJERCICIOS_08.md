# Práctica 15.08 · Sesión didáctica y permisos: alcance del ejemplo

[Clase](CLASE_08.md) · [Soluciones separadas](SOLUCIONES_08.md)

## 1. Actividad guiada

Explicá qué pasa si alguien cambia role de cliente a admin en localStorage.

1. Cambia role local de cliente aadmin en una copia.
2. Observa la decisión de vista.
3. Explica por qué eso no acredita permiso de servidor.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Prueba muestraPanelAdmin con null, cliente y admin y explica cada booleano.

## 3. Combinar lo aprendido

Diseña una tabla de operaciones públicas y protegidas para una biblioteca, distinguiendo rol y propiedad del recurso. Explica qué parte puede simularse y cuál requiere comprobación del servidor.

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. La función compara datos de vista.
2. Identidad y permiso no son iguales.
3. Un recurso puede pertenecer a una persona específica.
