interface Producto { id: number; nombre: string; precio: number; stock: number; }
interface ItemCarrito { producto: Producto; cantidad: number; }
function total(items: ItemCarrito[]): number {
  return items.reduce((suma, item) => suma + item.producto.precio * item.cantidad, 0);
}
