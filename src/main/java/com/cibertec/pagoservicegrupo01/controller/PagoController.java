package com.cibertec.pagoservicegrupo01.controller;

import com.cibertec.pagoservicegrupo01.dto.PagoDTO;
import com.cibertec.pagoservicegrupo01.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pagos")
public class PagoController {

    @Autowired
    private PagoService pagoService;

    // GET /api/v1/pagos/pedido/{idPedido}
    @GetMapping("/pedido/{idPedido}")
    public ResponseEntity<PagoDTO> obtenerPagoPorPedido(@PathVariable Long idPedido) {
        return pagoService.obtenerPorIdPedido(idPedido)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // GET /api/v1/pagos/cliente/{clienteId}
    @GetMapping("/cliente/{clienteId}")
    public ResponseEntity<List<PagoDTO>> listarPagosPorCliente(@PathVariable Long clienteId) {
        List<PagoDTO> pagos = pagoService.listarPorCliente(clienteId);
        return ResponseEntity.ok(pagos);
    }
}