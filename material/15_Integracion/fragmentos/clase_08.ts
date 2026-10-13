interface SesionVista { id:number; nombre:string; role:"admin"|"cliente"; }
function muestraPanelAdmin(sesion:SesionVista|null):boolean {
  return sesion?.role === "admin";
}
