import java.util.*;
public class U07Colecciones {
 public static void main(String[] args){List<String> nombres=new ArrayList<>(List.of("Eva","Ana","Luis","Ana"));Set<String> unicos=new HashSet<>(nombres);System.out.println("Lista: "+nombres.size()+", set: "+unicos.size());Map<String,Integer> conteos=new TreeMap<>();for(String nombre:nombres)conteos.merge(nombre,1,Integer::sum);System.out.println(conteos);nombres.sort(Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));System.out.println(nombres);nombres.removeIf(n->n.equals("Ana"));System.out.println(nombres);}
}
