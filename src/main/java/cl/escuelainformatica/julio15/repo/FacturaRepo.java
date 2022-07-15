package cl.escuelainformatica.julio15.repo;

import cl.escuelainformatica.julio15.entidad.Factura;
import org.springframework.data.repository.CrudRepository;

public interface FacturaRepo extends CrudRepository<Factura,Integer> {
}
