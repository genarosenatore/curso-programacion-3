package curso;
import java.math.BigDecimal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class Aplicacion {
 public static void main(String[] args){SpringApplication.run(Aplicacion.class,args);}
 @Bean CommandLineRunner cargar(ProductoRepository productos,CategoriaRepository categorias){return args->{Categoria utiles=categorias.save(new Categoria("Útiles"));productos.save(new Producto("Cuaderno",new BigDecimal("2000.00"),3,utiles));productos.save(new Producto("Lapicera",new BigDecimal("800.00"),5,utiles));};}
}
