// HTML: <form id="compra"><input name="cantidad" type="number" min="1" required><button>Calcular</button></form><p id="resultado"></p>
const formulario = document.querySelector("#compra");
const resultado = document.querySelector("#resultado");
formulario?.addEventListener("submit", event => {
  event.preventDefault();
  const campo = formulario.querySelector("[name=cantidad]");
  const cantidad = Number(campo.value);
  resultado.textContent = `Total: ${cantidad * 800}`;
});
