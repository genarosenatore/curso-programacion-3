interface Producto { id:number; nombre:string; categoriaId:number; precioCentavos:number; stock:number; }
function seleccionar(productos:Producto[], texto:string, categoriaId:number|null) {
  const busqueda=texto.trim().toLowerCase();
  return productos.filter(p => p.nombre.toLowerCase().includes(busqueda)
    && (categoriaId===null || p.categoriaId===categoriaId));
}
