public class U05Java {
 static class Producto {
  private final String nombre; private final int precioCentavos; private int stock;
  Producto(String nombre,int precioCentavos,int stock){if(nombre==null||nombre.isBlank()||precioCentavos<0||stock<0)throw new IllegalArgumentException("Datos inválidos");this.nombre=nombre;this.precioCentavos=precioCentavos;this.stock=stock;}
  int getStock(){return stock;}
  void descontarStock(int cantidad){if(cantidad<=0||cantidad>stock)throw new IllegalArgumentException("Cantidad inválida");stock-=cantidad;}
  int subtotalCentavos(int cantidad){if(cantidad<=0)throw new IllegalArgumentException("Cantidad inválida");return Math.multiplyExact(precioCentavos,cantidad);}
 }
 public static void main(String[] args){Producto p=new Producto("Cuaderno",200000,5);p.descontarStock(2);System.out.println("Stock: "+p.getStock());System.out.println("Subtotal: "+p.subtotalCentavos(2));try{p.descontarStock(6);}catch(IllegalArgumentException error){System.out.println(error.getMessage());}System.out.println("Stock después del rechazo: "+p.getStock());}
}
