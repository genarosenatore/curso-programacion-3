package curso;
import java.math.BigDecimal;
public record ProductoDTO(Long id,String nombre,BigDecimal precio,int stock,String categoria){}
