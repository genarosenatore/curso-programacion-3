package curso;
import java.util.stream.Collectors;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
@RestControllerAdvice
public class Errores {
 public record ErrorDTO(String mensaje){}
 @ExceptionHandler(NoEncontrado.class) ResponseEntity<ErrorDTO> ausente(NoEncontrado error){return ResponseEntity.status(404).body(new ErrorDTO(error.getMessage()));}
 @ExceptionHandler(MethodArgumentNotValidException.class) ResponseEntity<ErrorDTO> invalido(MethodArgumentNotValidException error){String detalle=error.getBindingResult().getFieldErrors().stream().map(e->e.getField()+": "+e.getDefaultMessage()).collect(Collectors.joining("; "));return ResponseEntity.badRequest().body(new ErrorDTO(detalle));}
 @ExceptionHandler({HttpMessageNotReadableException.class,MethodArgumentTypeMismatchException.class}) ResponseEntity<ErrorDTO> formato(Exception error){return ResponseEntity.badRequest().body(new ErrorDTO("Formato de petición inválido"));}
}
