# Práctica 04.06 · Node.js, npm, package.json y scripts

[Clase](CLASE_06.md) · [Soluciones separadas](SOLUCIONES_06.md)

## 1. Actividad guiada

Explicá qué archivos del proyecto compartirías y por qué node_modules puede reconstruirse.

1. Leé scripts y dependencias de package.json.
2. Ubicá el bloqueo y la carpeta generada de paquetes.
3. Explicá cómo recrear dependencias sin perder fuente.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Leé package.json del ejemplo local e identificá qué comando ejecuta check y cuál build. Explicá cuándo se genera dist/main.js.

## 3. Combinar lo aprendido

Prepará un proyecto mínimo con TypeScript y un script check. Enumerá los archivos que conservarías para reproducirlo y el papel de cada uno. ¿Por qué copiar node_modules no explica el programa?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. scripts vincula un nombre con un comando.
2. check no emite salida.
3. El bloqueo conserva versiones; src conserva tus instrucciones.
