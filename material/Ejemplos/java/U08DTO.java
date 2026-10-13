public class U08DTO {
 record Producto(String codigo,String nombre,int precioCentavos,int stock){}
 record ProductoDTO(String codigo,String nombre,int precioCentavos,boolean disponible){}
 static ProductoDTO convertir(Producto p){return new ProductoDTO(p.codigo(),p.nombre(),p.precioCentavos(),p.stock()>0);}
 public static void main(String[] args){Producto p=new Producto("P01","Cuaderno",200000,3);ProductoDTO dto=convertir(p);System.out.println(dto);System.out.println("Disponible: "+dto.disponible());}
}
