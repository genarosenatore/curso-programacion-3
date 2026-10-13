# Clase 15.08 · Sesión didáctica y permisos: alcance del ejemplo

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_07.md) · [Clase siguiente](../15_Integracion/CLASE_09.md)

## Distinguir una vista de sesión de una identidad comprobada

Una sesión didáctica en localStorage permite recordar un nombre y role para practicar navegación. La persona puede modificarla. No demuestra quién llama al servidor ni que tenga permiso. **Autenticación** comprueba identidad mediante un mecanismo definido; **autorización** decide acciones o datos permitidos para esa identidad. Son preguntas distintas.

El tipo SesionVista describe datos que la pantalla usa. muestraPanelAdmin compara sesion?.role con admin: el encadenamiento opcional produce undefined si no hay sesión y la comparación da false. La función solo decide mostrar una región, no realiza autenticación ni llama al servidor.

## Seguir un cambio de rol local

Con role cliente no aparece panel. Si alguien edita storage a admin, la pantalla podría mostrarlo. Esa prueba demuestra el alcance limitado, no que se haya conseguido permiso real. Un backend con autorización debe comprobar identidad y permisos en cada operación protegida y puede rechazar con401 o403 según contrato.

Un permiso sobre una factura también puede depender de propiedad del recurso, no solo del rol: un cliente podría consultar las suyas pero no otras. Cambiar id en URL es una petición que servidor debe evaluar. Ocultar enlaces no conserva esa regla por sí mismo.

La consigna describe una simulación básica sin módulo de seguridad; esta clase enseña sus límites sin inventar un requisito de implementar un sistema completo. No guarda contraseñas en storage ni promete protección que el ejemplo de apoyo no implementa. Si una aplicación con usuarios reales lo necesita, se diseña el mecanismo de seguridad por separado y se prueba sin depender de la UI.

Para practicar, compila función y tres valores locales: null, cliente y admin. No necesitas credenciales reales ni publicar nada. La prueba de representación es suficiente para esta función; una prueba de seguridad tendría que verificar respuestas del servidor con identidades diferentes.

## Ejemplo de la clase

```typescript
interface SesionVista { id:number; nombre:string; role:"admin"|"cliente"; }
function muestraPanelAdmin(sesion:SesionVista|null):boolean {
  return sesion?.role === "admin";
}
```

[Abrir el fragmento como archivo](fragmentos/clase_08.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La función decide si mostrar una región, no verifica permisos ante el servidor. El ejemplo integrado de apoyo trabaja sin cuentas y en datos locales. Al estudiar la consigna, anotaremos qué partes son simulación de flujo y qué haría falta para una aplicación con usuarios reales.

## Cambiar una decisión y explorar un límite

Cambiar role a admin altera el dato de vista y puede mostrar un panel. El efecto no acredita acceso real. Un usuario que no ve botón puede igualmente intentar la URL; si el servidor no controla, la interfaz no lo protege.

## Confusión que conviene evitar

Llamar seguridad completa a una redirección basada solo en datos del navegador.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_08.md). Las [soluciones razonadas](SOLUCIONES_08.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_07.md) · [Clase siguiente](../15_Integracion/CLASE_09.md)
