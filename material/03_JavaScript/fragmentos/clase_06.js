const nombres = ["Cuaderno", "LAPICERA", "Mochila"];
const normalizados = nombres.map(nombre => nombre.toLowerCase());
const encontrados = normalizados.filter(nombre => nombre.includes("la"));
console.log(encontrados);
