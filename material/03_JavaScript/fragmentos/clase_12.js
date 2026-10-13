async function cargarProductos() {
  try {
    const respuesta = await fetch("./productos.json");
    if (!respuesta.ok) throw new Error(`HTTP ${respuesta.status}`);
    const productos = await respuesta.json();
    console.log(productos);
  } catch (error) {
    console.error("No se pudieron cargar los productos", error);
  }
}
cargarProductos();
