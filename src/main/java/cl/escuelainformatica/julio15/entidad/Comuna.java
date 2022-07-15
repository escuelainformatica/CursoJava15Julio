package cl.escuelainformatica.julio15.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter @Getter
public class Comuna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numComuna;

    @Column(length = 150)
    private String nombre;
}
