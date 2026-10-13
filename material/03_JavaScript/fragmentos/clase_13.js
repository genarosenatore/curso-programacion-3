// calculos.js
export function subtotal(precio, cantidad) { return precio * cantidad; }

// app.js
import { subtotal } from "./calculos.js";
console.log(subtotal(800, 2));

// HTML: <script type="module" src="app.js"></script>
