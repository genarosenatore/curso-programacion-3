package curso;
import java.math.BigDecimal;
import jakarta.validation.constraints.*;
public record ProductoRequest(
 @NotBlank String nombre,
 @NotNull @PositiveOrZero @Digits(integer=10,fraction=2) BigDecimal precio,
 @NotNull @Min(0) Integer stock) {}
