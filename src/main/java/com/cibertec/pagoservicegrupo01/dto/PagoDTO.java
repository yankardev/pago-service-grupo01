package com.cibertec.pagoservicegrupo01.dto;

import java.time.LocalDateTime;

public class PagoDTO {
    private Long idPago;
    private Long idPedido;
    private String metodoPago; // Ej: 'TARJETA_CREDITO', 'TRANSFERENCIA'
    private Double montoPagado;
    private LocalDateTime fechaPago;
    private String codigoAutorizacion;
    private String estadoPago; // Ej: 'APROBADO', 'RECHAZADO'
    private Long clienteId; // Atributo auxiliar para filtrar por cliente en memoria

    public PagoDTO() {}

    public PagoDTO(Long idPago, Long idPedido, String metodoPago, Double montoPagado,
                   LocalDateTime fechaPago, String codigoAutorizacion, String estadoPago, Long clienteId) {
        this.idPago = idPago;
        this.idPedido = idPedido;
        this.metodoPago = metodoPago;
        this.montoPagado = montoPagado;
        this.fechaPago = fechaPago;
        this.codigoAutorizacion = codigoAutorizacion;
        this.estadoPago = estadoPago;
        this.clienteId = clienteId;
    }

    // Getters y Setters
    public Long getIdPago() { return idPago; }
    public void setIdPago(Long idPago) { this.idPago = idPago; }

    public Long getIdPedido() { return idPedido; }
    public void setIdPedido(Long idPedido) { this.idPedido = idPedido; }

    public String getMetodoPago() { return metodoPago; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }

    public Double getMontoPagado() { return montoPagado; }
    public void setMontoPagado(Double montoPagado) { this.montoPagado = montoPagado; }

    public LocalDateTime getFechaPago() { return fechaPago; }
    public void setFechaPago(LocalDateTime fechaPago) { this.fechaPago = fechaPago; }

    public String getCodigoAutorizacion() { return codigoAutorizacion; }
    public void setCodigoAutorizacion(String codigoAutorizacion) { this.codigoAutorizacion = codigoAutorizacion; }

    public String getEstadoPago() { return estadoPago; }
    public void setEstadoPago(String estadoPago) { this.estadoPago = estadoPago; }

    public Long getClienteId() { return clienteId; }
    public void setClienteId(Long clienteId) { this.clienteId = clienteId; }
}