function subtotal(precio: number, cantidad: number): number {
  return precio * cantidad;
}
const precios: number[] = [100, 200];
console.log(subtotal(precios[0], 3));
