import java.lang.reflect.*;
public class U09Genericos {
 static class Caja<T>{private final T valor;Caja(T valor){this.valor=valor;}T obtener(){return valor;}}
 record Cliente(String nombre,String correo){}
 public static void main(String[] args){Caja<Cliente> caja=new Caja<>(new Cliente("Ana","ana@example.com"));System.out.println(caja.obtener().nombre());for(RecordComponent c:Cliente.class.getRecordComponents())System.out.println(c.getName()+": "+c.getType().getSimpleName());}
}
