
package com.cibertec.pagoservicegrupo01.service;

import com.cibertec.pagoservicegrupo01.dto.PagoDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PagoService {

    private final List<PagoDTO> pagos = new ArrayList<>();

    public PagoService() {
        pagos.add(new PagoDTO(
                1L, 1L, "TRANSFERENCIA", 2600.00,
                LocalDateTime.now(), "AUT001", "APROBADO", 100L
        ));
        pagos.add(new PagoDTO(
                2L, 2L, "TARJETA_CREDITO", 180.00,
                LocalDateTime.now(), "AUT002", "APROBADO", 100L
        ));
        pagos.add(new PagoDTO(
                3L, 3L, "TRANSFERENCIA", 700.00,
                LocalDateTime.now(), "AUT003", "PENDIENTE", 200L
        ));
    }

    public Optional<PagoDTO> obtenerPorIdPedido(Long idPedido) {
        return pagos.stream()
                .filter(p -> idPedido.equals(p.getIdPedido()))
                .findFirst();
    }

    public List<PagoDTO> listarPorCliente(Long clienteId) {
        return pagos.stream()
                .filter(p -> clienteId.equals(p.getClienteId()))
                .toList();
    }
}
