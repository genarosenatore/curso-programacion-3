const campo = document.querySelector("#busqueda");
if (campo instanceof HTMLInputElement) {
  campo.addEventListener("input", () => {
    console.log(campo.value.trim());
  });
}
