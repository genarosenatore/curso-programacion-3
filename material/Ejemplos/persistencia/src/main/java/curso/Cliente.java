package curso;
import jakarta.persistence.*;
@Entity
public class Cliente extends EntityId {
    @Column(nullable=false) private String denominacion;
    private String cuitCuil;
    protected Cliente() {}
    public Cliente(String denominacion,String cuitCuil){this.denominacion=denominacion;this.cuitCuil=cuitCuil;}
    public String getDenominacion(){return denominacion;}
}
