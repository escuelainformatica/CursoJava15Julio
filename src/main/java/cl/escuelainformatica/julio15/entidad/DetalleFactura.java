package cl.escuelainformatica.julio15.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter @Getter
public class DetalleFactura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int detalleFactura;
    @Column(length = 2000)
    private String descripcion;
    private int cantidad;
    private int precioUnitario;

    @ManyToOne()
    @JoinColumn(name = "fact")
    private Factura fact;

}
