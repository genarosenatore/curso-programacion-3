package curso;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface ProductoRepository extends JpaRepository<Producto,Long>{
 List<Producto> findByNombreContainingIgnoreCaseOrderByIdAsc(String nombre);
 List<Producto> findByStockGreaterThan(int stock);
 @Query("select p from Producto p left join fetch p.categoria order by p.id")
 List<Producto> listarConCategoria();
}
