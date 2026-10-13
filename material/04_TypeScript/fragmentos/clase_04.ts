type Estado = "pendiente" | "entregado";
interface Pedido { estado: Estado; nota?: string; }
function mostrarNota(pedido: Pedido): string {
  return pedido.nota ?? "Sin nota";
}
function longitud(valor: string | null): number {
  return valor === null ? 0 : valor.length;
}
