interface Personaje { id: number; nombre: string; }
function filtrar(personajes: Personaje[], texto: string): Personaje[] {
  const busqueda = texto.trim().toLowerCase();
  return personajes.filter(p => p.nombre.toLowerCase().includes(busqueda));
}
console.log(filtrar([{id:1,nombre:"Lisa"},{id:2,nombre:"Bart"}],"li"));
