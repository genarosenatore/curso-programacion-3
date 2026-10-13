import { filtrar, cantidadValida, total } from "./calculos.js";
const catalogo=document.querySelector("#catalogo"), listaCarrito=document.querySelector("#carrito");
const estado=document.querySelector("#estado"), totalVista=document.querySelector("#total"), busqueda=document.querySelector("#busqueda");
let productos=[],carrito=[];
const clave="curso-programacion3-carrito";
const formato=new Intl.NumberFormat("es-AR",{style:"currency",currency:"ARS"});
function guardar(){try{localStorage.setItem(clave,JSON.stringify(carrito));}catch{estado.textContent="El carrito funciona, pero no se pudo guardar en el navegador.";}}
function recuperar(){
  try { const data=JSON.parse(localStorage.getItem(clave)??"[]");
    if(!Array.isArray(data))throw new Error("Formato");
    const ids=new Set();
    carrito=data.filter(item=>{if(!item||typeof item!=="object"||ids.has(item.productoId))return false;const p=productos.find(p=>p.id===item.productoId);if(!p||!cantidadValida(item.cantidad,p.stock))return false;ids.add(item.productoId);return true;});
  }catch{carrito=[];estado.textContent="Se reinició un carrito que no se podía leer.";}
}
function renderCarrito(){
  listaCarrito.replaceChildren();
  for(const item of carrito){const p=productos.find(p=>p.id===item.productoId);const li=document.createElement("li");li.textContent=`${p.nombre} × ${item.cantidad} `;const quitar=document.createElement("button");quitar.textContent="Quitar una";quitar.type="button";quitar.addEventListener("click",()=>{item.cantidad--;carrito=carrito.filter(i=>i.cantidad>0);guardar();renderCarrito();});li.append(quitar);listaCarrito.append(li);}
  if(carrito.length===0){const li=document.createElement("li");li.textContent="Carrito vacío";listaCarrito.append(li);}
  totalVista.textContent=`Total: ${formato.format(total(carrito,productos)/100)}`;
}
function agregar(p){const item=carrito.find(i=>i.productoId===p.id);const nueva=(item?.cantidad??0)+1;if(!cantidadValida(nueva,p.stock)){estado.textContent="No hay stock para agregar otra unidad.";return;}if(item)item.cantidad=nueva;else carrito.push({productoId:p.id,cantidad:1});estado.textContent=`Agregado: ${p.nombre}`;guardar();renderCarrito();}
function renderProductos(){catalogo.replaceChildren();const visibles=filtrar(productos,busqueda.value);for(const p of visibles){const article=document.createElement("article");article.className="tarjeta";const h=document.createElement("h3");h.textContent=p.nombre;const texto=document.createElement("p");texto.textContent=`${formato.format(p.precioCentavos/100)} · Stock: ${p.stock}`;const b=document.createElement("button");b.type="button";b.textContent=p.stock>0?"Agregar una":"Agotado";b.disabled=p.stock===0;b.addEventListener("click",()=>agregar(p));article.append(h,texto,b);catalogo.append(article);}if(!visibles.length){const p=document.createElement("p");p.textContent="Sin resultados";catalogo.append(p);}}
async function iniciar(){estado.textContent="Cargando...";try{const r=await fetch("./productos.json");if(!r.ok)throw new Error(`HTTP ${r.status}`);const data=await r.json();if(!Array.isArray(data)||!data.every(p=>p&&Number.isInteger(p.id)&&typeof p.nombre==="string"&&Number.isInteger(p.precioCentavos)&&p.precioCentavos>=0&&Number.isInteger(p.stock)&&p.stock>=0))throw new Error("Datos inválidos");productos=data;estado.textContent="";recuperar();renderProductos();renderCarrito();}catch{estado.textContent="No se pudo cargar. Revisá que el servidor local esté funcionando.";}}
busqueda.addEventListener("input",renderProductos);
document.querySelector("#vaciar").addEventListener("click",()=>{carrito=[];guardar();renderCarrito();});
iniciar();
