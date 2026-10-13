interface Producto {
  readonly id: number;
  nombre: string;
  precio: number;
}
const producto: Producto = { id: 1, nombre: "Cuaderno", precio: 2000 };
console.log(producto.nombre);
