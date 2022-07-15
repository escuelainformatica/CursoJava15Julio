package cl.escuelainformatica.julio15.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Setter @Getter
@Entity
public class Cliente {
    @Id
    @Column(length = 12)
    private String rut;
    @Column(length = 100)
    private String nombre;
    @Column(length = 100)
    private String apellido;
}
