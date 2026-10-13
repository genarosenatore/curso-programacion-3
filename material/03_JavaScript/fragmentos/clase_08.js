// HTML: <ul id="productos"></ul>
const lista = document.querySelector("#productos");
if (lista) {
  const item = document.createElement("li");
  item.textContent = "Cuaderno";
  lista.append(item);
}
