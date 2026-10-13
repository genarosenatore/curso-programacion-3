package curso;
import jakarta.persistence.*;
import java.util.*;
import java.text.SimpleDateFormat;

/** Programa completo de consola; no inicia un servidor Spring. */
public class PersistenciaDemo {
    static Date fecha(String iso) throws java.text.ParseException {
        SimpleDateFormat formato=new SimpleDateFormat("yyyy-MM-dd");
        formato.setTimeZone(TimeZone.getTimeZone("UTC"));
        return formato.parse(iso);
    }
    static void comprobar(boolean condicion,String mensaje){
        if(!condicion)throw new IllegalStateException("Falló: "+mensaje);
        System.out.println("OK: "+mensaje);
    }
    static void consulta(EntityManager em,String etiqueta,String jpql,Map<String,?> parametros){
        Query query=em.createQuery(jpql);
        parametros.forEach(query::setParameter);
        System.out.println(etiqueta);
        for(Object fila:query.getResultList())
            System.out.println(fila instanceof Object[] valores?Arrays.toString(valores):fila instanceof FacturaVenta f?"Factura "+f.getNumero():fila instanceof Articulo?"Artículo existente":fila);
    }
    public static void main(String[] args) throws Exception {
        EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("curso");
        try {
            EntityManager em=fabrica.createEntityManager();
            Long productoId;
            try {
                em.getTransaction().begin();
                Categoria utiles=new Categoria("Útiles"); em.persist(utiles);
                Producto producto=new Producto("Cuaderno"); utiles.agregar(producto); em.persist(producto);
                Cliente ana=new Cliente("Ana","20-123"),luis=new Cliente("Luis","27-456");em.persist(ana);em.persist(luis);
                PuntoVenta uno=new PuntoVenta(1,"Centro"),dos=new PuntoVenta(2,"Norte");em.persist(uno);em.persist(dos);
                CondicionIva iva=new CondicionIva("Condición A");em.persist(iva);
                Marca marca=new Marca("Marca A");em.persist(marca);
                Articulo cuaderno=new Articulo("Cuaderno",marca),lapicera=new Articulo("Lapicera",marca),regla=new Articulo("Regla",null);
                em.persist(cuaderno);em.persist(lapicera);em.persist(regla);
                ListaPrecioArticulo a=new ListaPrecioArticulo(cuaderno,2000),b=new ListaPrecioArticulo(lapicera,800);em.persist(a);em.persist(b);
                SimpleDateFormat formato=new SimpleDateFormat("yyyy-MM-dd");formato.setTimeZone(TimeZone.getTimeZone("UTC"));
                FacturaVenta f1=new FacturaVenta(1L,formato.parse("2026-10-01"),ana,uno,iva);f1.agregar(a,5,2000);em.persist(f1);
                FacturaVenta f2=new FacturaVenta(2L,formato.parse("2026-10-02"),ana,uno,iva);f2.agregar(a,25,2000);em.persist(f2);
                FacturaVenta f3=new FacturaVenta(3L,formato.parse("2026-10-03"),luis,dos,iva);f3.agregar(a,25,2000);f3.agregar(b,1,1);em.persist(f3);
                em.getTransaction().commit();productoId=producto.getId();
                comprobar(productoId!=null,"id generado");
            } catch(RuntimeException error){if(em.getTransaction().isActive())em.getTransaction().rollback();throw error;}
            finally{em.close();}
            em=fabrica.createEntityManager();
            try {
                em.getTransaction().begin();
                Producto p=em.find(Producto.class,productoId);
                comprobar(p==em.find(Producto.class,productoId),"identidad dentro del contexto");
                comprobar(p.getCategoria().getNombre().equals("Útiles"),"relación recuperada");
                p.setNombre("Cambio que se revierte");em.flush();em.getTransaction().rollback();
            }finally{em.close();}
            em=fabrica.createEntityManager();
            try {
                comprobar(em.find(Producto.class,productoId).getNombre().equals("Cuaderno"),"flush no equivale a commit");
                Map<String,Object> sin=Map.of();
                consulta(em,"Entidades y parámetro","select f from FacturaVenta f where f.estado=:estado order by f.numero",Map.of("estado","EMITIDA"));
                consulta(em,"Proyección DTO","select new curso.FacturaResumen(f.numero,f.importeTotal) from FacturaVenta f order by f.numero",sin);
                consulta(em,"Fechas","select f.numero from FacturaVenta f where f.fechaEmision>=:desde and f.fechaEmision<:hastaExclusiva and f.fechaAnulacion is null order by f.numero",Map.of("desde",fecha("2026-10-01"),"hastaExclusiva",fecha("2026-11-01")));
                consulta(em,"Texto","select c.denominacion from Cliente c where lower(c.denominacion) like :patron",Map.of("patron","%ana%"));
                consulta(em,"IN","select p.numero from PuntoVenta p where p.numero in :numeros order by p.numero",Map.of("numeros",List.of(1,2)));
                consulta(em,"Estados distinct","select distinct f.estado from FacturaVenta f order by f.estado",sin);
                consulta(em,"LEFT JOIN","select a.denominacion,m.denominacion from Articulo a left join a.marca m order by a.denominacion",sin);
                List<FacturaVenta> distintas=em.createQuery("select distinct f from FacturaVenta f join f.detalles d where d.listaPrecioArticulo.articulo.marca.id=:marcaId",FacturaVenta.class).setParameter("marcaId",em.createQuery("select m.id from Marca m",Long.class).getSingleResult()).getResultList();
                comprobar(distintas.size()==3,"facturas por marca sin duplicación de cabecera");
                consulta(em,"Grupos HAVING","select f.puntoVenta.descripcion,count(f),sum(f.importeTotal) from FacturaVenta f group by f.puntoVenta.id,f.puntoVenta.descripcion having count(f)>:minimo order by f.puntoVenta.descripcion",Map.of("minimo",1L));
                consulta(em,"Promedio y conteo","select f.estado,count(f),avg(f.importeTotal) from FacturaVenta f group by f.estado",sin);
                consulta(em,"Total IVA","select f.condicionIva.denominacion,sum(f.importeTotal) from FacturaVenta f group by f.condicionIva.id,f.condicionIva.denominacion",sin);
                consulta(em,"Subconsulta global","select f.numero from FacturaVenta f where f.importeTotal>(select avg(otra.importeTotal) from FacturaVenta otra) order by f.numero",sin);
                consulta(em,"Subconsulta correlacionada","select f.numero from FacturaVenta f where f.importeTotal>(select avg(otra.importeTotal) from FacturaVenta otra where otra.cliente=f.cliente)",sin);
                consulta(em,"Nunca vendidos","select a.denominacion from Articulo a where not exists(select d.id from FacturaVentaDetalle d where d.listaPrecioArticulo.articulo=a)",sin);
                consulta(em,"CASE","select f.numero,f.importeTotal,case when f.importeTotal>50000 then 'ALTO VALOR' when f.importeTotal>=10000 then 'MEDIO VALOR' else 'BAJO VALOR' end from FacturaVenta f order by f.importeTotal desc",sin);
                comprobar(em.createQuery("select f from FacturaVenta f where f.estado=:estado",FacturaVenta.class).setParameter("estado","INEXISTENTE").getResultList().isEmpty(),"lista sin coincidencias");
                em.getTransaction().begin();
                Producto temporal=new Producto("Temporal");em.persist(temporal);em.getTransaction().commit();Long temporalId=temporal.getId();
                em.getTransaction().begin();em.remove(temporal);em.getTransaction().commit();em.clear();
                comprobar(em.find(Producto.class,temporalId)==null,"eliminación confirmada");
                em.getTransaction().begin();
                FacturaVenta factura=em.createQuery("select f from FacturaVenta f where f.numero=3",FacturaVenta.class).getSingleResult();
                factura.quitarPrimero();em.flush();em.getTransaction().rollback();em.clear();
                comprobar(em.createQuery("select count(d) from FacturaVentaDetalle d",Long.class).getSingleResult()==4L,"rollback de eliminación de huérfano");
            }finally{if(em.getTransaction().isActive())em.getTransaction().rollback();em.close();}
        }finally{fabrica.close();}
    }
}
