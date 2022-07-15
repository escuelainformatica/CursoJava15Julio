package cl.escuelainformatica.julio15.entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Setter
@Getter
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numFactura;
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "cli")
    private Cliente cli;

    @ManyToOne
    @JoinColumn(name = "com")
    private Comuna com;

    @OneToMany(mappedBy = "fact") // fact indica el campo de la relacion muchos es a uno de la clase DetalleFactura
    @JsonIgnoreProperties("fact") // evita la carga circular de datos
    private List<DetalleFactura> detFact;

}
