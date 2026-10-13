type EstadoPedido = "pending" | "processing" | "completed" | "cancelled";
const permitidos:Record<EstadoPedido,EstadoPedido[]> = {
  pending:["processing","cancelled"],
  processing:["completed","cancelled"],
  completed:[],
  cancelled:[]
};
