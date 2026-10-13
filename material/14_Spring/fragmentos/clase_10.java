record ErrorDTO(String mensaje) {}
@org.springframework.web.bind.annotation.RestControllerAdvice
class Errores {
    @org.springframework.web.bind.annotation.ExceptionHandler(NoEncontrado.class)
    org.springframework.http.ResponseEntity<ErrorDTO> noEncontrado(NoEncontrado error) {
        return org.springframework.http.ResponseEntity.status(404).body(new ErrorDTO(error.getMessage()));
    }
}
