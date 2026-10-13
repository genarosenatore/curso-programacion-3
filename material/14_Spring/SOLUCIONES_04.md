# Soluciones 14.04 · Beans, ApplicationContext e inyección de dependencias

[Clase](CLASE_04.md) · [Ejercicios](EJERCICIOS_04.md)

## 1. Una solución explicada

El controlador declara lo que necesita y Spring lo proporciona. Así se respeta configuración y gestión. En una prueba se puede entregar un colaborador de prueba por el constructor sin depender de una búsqueda global.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Spring crea el servicio y le entrega el repositorio gestionado. Con un único constructor no es necesario añadir @Autowired en este caso. final fija la referencia del colaborador. Crear el servicio con new por tu cuenta evita la gestión y puede omitir inyección y proxies.

## 3. Qué conviene corregir

La confusión a evitar es: Usar variables de instancia para datos de cada pedido en un singleton compartido.

Un bean es un objeto gestionado por el contenedor de Spring. ApplicationContext registra y proporciona componentes.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
