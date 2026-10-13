import java.util.*;
public class U06Igualdad {
 static final class Producto {
  private final String codigo;
  Producto(String codigo){this.codigo=Objects.requireNonNull(codigo);}
  @Override public boolean equals(Object otro){return this==otro||(otro instanceof Producto p&&codigo.equals(p.codigo));}
  @Override public int hashCode(){return codigo.hashCode();}
  @Override public String toString(){return "Producto{codigo='"+codigo+"'}";}
 }
 public static void main(String[] args){Producto a=new Producto("P01"),b=new Producto("P01");System.out.println("Identidad: "+(a==b));System.out.println("Igualdad: "+a.equals(b));System.out.println("Hash coherente: "+(a.hashCode()==b.hashCode()));Set<Producto> s=new HashSet<>();s.add(a);s.add(b);s.add(new Producto("P02"));System.out.println("Únicos: "+s.size());System.out.println("Contiene P01: "+s.contains(new Producto("P01")));}
}
