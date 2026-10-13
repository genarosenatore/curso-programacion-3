const carrito = [{ id: 1, cantidad: 2 }];
localStorage.setItem("carrito", JSON.stringify(carrito));
const texto = localStorage.getItem("carrito");
const recuperado = texto ? JSON.parse(texto) : [];
console.log(recuperado);
