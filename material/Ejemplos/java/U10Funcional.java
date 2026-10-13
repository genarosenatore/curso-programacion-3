import java.util.*;import java.util.stream.*;
public class U10Funcional {
 record Venta(String categoria,int importeCentavos){}
 public static void main(String[] args){List<Venta> ventas=List.of(new Venta("Útiles",10000),new Venta("Útiles",20000),new Venta("Libros",50000));Map<String,Integer> totales=ventas.stream().collect(Collectors.groupingBy(Venta::categoria,TreeMap::new,Collectors.summingInt(Venta::importeCentavos)));System.out.println(totales);System.out.println(totales.entrySet().stream().filter(e->e.getValue()>40000).map(Map.Entry::getKey).toList());System.out.println(List.<Integer>of().stream().reduce(0,Integer::sum));}
}
