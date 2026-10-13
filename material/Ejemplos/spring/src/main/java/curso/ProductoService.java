package curso;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class ProductoService {
 private final ProductoRepository repositorio;
 public ProductoService(ProductoRepository repositorio){this.repositorio=repositorio;}
 private Producto buscar(Long id){return repositorio.findById(id).orElseThrow(()->new NoEncontrado("Producto inexistente"));}
 private ProductoDTO aDTO(Producto p){return new ProductoDTO(p.getId(),p.getNombre(),p.getPrecio(),p.getStock(),p.getCategoria()==null?null:p.getCategoria().getNombre());}
 @Transactional(readOnly=true) public List<ProductoDTO> listar(String nombre){return (nombre==null||nombre.isBlank()?repositorio.listarConCategoria():repositorio.findByNombreContainingIgnoreCaseOrderByIdAsc(nombre.trim())).stream().map(this::aDTO).toList();}
 @Transactional(readOnly=true) public ProductoDTO obtener(Long id){return aDTO(buscar(id));}
 @Transactional public ProductoDTO crear(ProductoRequest entrada){Producto p=new Producto(entrada.nombre().trim(),entrada.precio(),entrada.stock(),null);return aDTO(repositorio.save(p));}
 @Transactional public ProductoDTO actualizar(Long id,ProductoRequest entrada){Producto p=buscar(id);p.actualizar(entrada.nombre().trim(),entrada.precio(),entrada.stock());return aDTO(p);}
 @Transactional public void eliminar(Long id){repositorio.delete(buscar(id));}
}
