interface Personaje { id:number; nombre:string; }
function esPersonaje(valor:unknown):valor is Personaje { return typeof valor==="object"&&valor!==null&&"id"in valor&&"nombre"in valor&&Number.isInteger(valor.id)&&typeof valor.nombre==="string"; }
function filtrar(personajes:Personaje[],texto:string):Personaje[]{return personajes.filter(p=>p.nombre.toLowerCase().includes(texto.trim().toLowerCase()));}
const busqueda=document.querySelector("#busqueda"), lista=document.querySelector("#personajes"), estado=document.querySelector("#estado");
async function iniciar(campo:HTMLInputElement,lista:HTMLElement,estado:HTMLElement):Promise<void>{
 let personajes:Personaje[]=[];
 function render():void { const visibles=filtrar(personajes,campo.value);lista.replaceChildren();for(const p of visibles){const li=document.createElement("li");li.textContent=p.nombre;lista.append(li);}estado.textContent=visibles.length?"":"Sin resultados"; }
 campo.disabled=true;estado.textContent="Cargando...";
 try {const respuesta=await fetch("./personajes.json");if(!respuesta.ok)throw new Error(`HTTP ${respuesta.status}`);const data:unknown=await respuesta.json();if(!Array.isArray(data)||!data.every(esPersonaje))throw new Error("Respuesta inválida");personajes=data;campo.addEventListener("input",render);render();campo.disabled=false;}catch{estado.textContent="No se pudo cargar el archivo local.";}
}
if(busqueda instanceof HTMLInputElement&&lista instanceof HTMLElement&&estado instanceof HTMLElement){void iniciar(busqueda,lista,estado);}
