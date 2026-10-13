# Práctica 02.02 · Cascada, herencia y especificidad

[Clase](CLASE_02.md) · [Soluciones separadas](SOLUCIONES_02.md)

## 1. Actividad guiada

Predecí el color de <p id="mensaje" class="aviso">Hola</p> si añadís #mensaje { color: purple; }.

1. Listá los selectores que coinciden con mensaje.
2. Compará id, clase y etiqueta en el escenario normal.
3. Explicá por qué mover la regla de etiqueta no supera al id.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Para p con class="nota", predecí el color con p {color:green}, .nota {color:blue}, .nota {color:red}, en ese orden.

## 3. Combinar lo aprendido

Poné color morado en body y margin:20px. Quitá las tres reglas del párrafo. ¿Qué propiedad recibe el párrafo por herencia? Luego restaurá p verde: ¿por qué el padre no impone morado?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Filtrá las reglas que coinciden con el elemento.
2. Las dos clases empatan.
3. Un valor propio se utiliza antes que uno heredado.
