const producto = { nombre: "Cuaderno", precio: 2000, stock: 3 };
const copia = { ...producto, stock: 5 };
console.log(producto.stock, copia.stock);
class Producto {
  constructor(nombre, precio) { this.nombre = nombre; this.precio = precio; }
}
console.log(new Producto("Lapicera", 800).nombre);
