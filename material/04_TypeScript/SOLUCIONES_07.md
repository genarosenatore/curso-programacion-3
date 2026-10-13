# Soluciones 04.07 · Vite, módulos y estructura de proyecto

[Clase](CLASE_07.md) · [Práctica](EJERCICIOS_07.md)

## 1. Razonamiento de la actividad guiada

index.html carga el módulo de inicio; src contiene el código que editás; scripts.dev en package.json invoca Vite. El comando de tipos puede emitir errores aunque la página se esté mostrando. Hay que corregirlos antes de dar el trabajo por terminado.

## 2 y 3. Resolver y justificar las decisiones

index.html carga el módulo de entrada; dev ejecuta Vite según package.json. La función se escribe en src, check lee los .ts y build transforma la entrada en recursos de dist. El navegador abre los recursos servidos por dev o la salida construida, según el modo. lib DOM solo permite comprobar nombres del navegador; Node normal sigue sin una página ni document.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
