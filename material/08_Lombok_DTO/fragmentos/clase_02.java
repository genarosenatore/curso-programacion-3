import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
class ProductoVista {
    private String nombre;
    private int precioCentavos;
}
// ProductoVista.builder().nombre("Cuaderno").precioCentavos(200000).build();
