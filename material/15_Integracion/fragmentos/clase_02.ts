// Respuesta del proyecto de productos:
interface ProductoDTO { id: number; nombre: string; precio: number; stock: number; }
interface ProductoRequest { nombre: string; precio: number; stock: number; }
// Un request no necesita el id generado; una respuesta sí lo incluye.
