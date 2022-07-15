package cl.escuelainformatica.julio15.controller;

import cl.escuelainformatica.julio15.entidad.Factura;
import cl.escuelainformatica.julio15.repo.FacturaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/factura")
public class FacturaController {

    @Autowired
    private FacturaRepo facturaRepo;

    @GetMapping("/listar") // http://localhost:8082/factura/listar
    public Iterable<Factura> listar() {
        return facturaRepo.findAll();
    }
}
