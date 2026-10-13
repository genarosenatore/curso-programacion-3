package curso;
import java.net.URI;
import java.util.List;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/productos")
public class ProductoController {
 private final ProductoService servicio;
 public ProductoController(ProductoService servicio){this.servicio=servicio;}
 @GetMapping public List<ProductoDTO> listar(@RequestParam(required=false) String nombre){return servicio.listar(nombre);}
 @GetMapping("/{id}") public ProductoDTO obtener(@PathVariable Long id){return servicio.obtener(id);}
 @PostMapping public ResponseEntity<ProductoDTO> crear(@Valid @RequestBody ProductoRequest entrada){ProductoDTO creado=servicio.crear(entrada);return ResponseEntity.created(URI.create("/api/productos/"+creado.id())).body(creado);}
 @PutMapping("/{id}") public ProductoDTO actualizar(@PathVariable Long id,@Valid @RequestBody ProductoRequest entrada){return servicio.actualizar(id,entrada);}
 @DeleteMapping("/{id}") public ResponseEntity<Void> eliminar(@PathVariable Long id){servicio.eliminar(id);return ResponseEntity.noContent().build();}
}
