export function subtotal(precioCentavos, cantidad) { return precioCentavos * cantidad; }
export function filtrar(productos, texto) { return productos.filter(p=>p.nombre.toLowerCase().includes(texto.trim().toLowerCase())); }
export function cantidadValida(cantidad, stock) { return Number.isInteger(cantidad)&&cantidad>0&&cantidad<=stock; }
export function total(carrito, productos) { return carrito.reduce((suma,item)=>{const p=productos.find(p=>p.id===item.productoId);return suma+(p?subtotal(p.precioCentavos,item.cantidad):0);},0); }
