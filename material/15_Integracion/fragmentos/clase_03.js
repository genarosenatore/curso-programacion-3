async function cargar() {
  estado.textContent = "Cargando...";
  try {
    const respuesta = await fetch("/api/productos");
    if (!respuesta.ok) throw new Error(`HTTP ${respuesta.status}`);
    const datos = await respuesta.json();
    render(datos);
    estado.textContent = datos.length ? "" : "Sin productos";
  } catch {
    estado.textContent = "No se pudo cargar. Intentá nuevamente.";
  }
}
