function primero<T>(valores: T[]): T | undefined {
  return valores[0];
}
const nombre = primero(["Ana", "Luis"]);
function esTexto(valor: unknown): valor is string {
  return typeof valor === "string";
}
