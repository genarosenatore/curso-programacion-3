interface Item { productoId:number; cantidad:number; }
function cantidadValida(cantidad:number,stock:number) {
  return Number.isInteger(cantidad) && cantidad>0 && cantidad<=stock;
}
// Al agregar un producto ya presente, validá cantidadActual + cantidadNueva.
