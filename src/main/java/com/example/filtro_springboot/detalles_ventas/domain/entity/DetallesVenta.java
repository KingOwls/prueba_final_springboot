package com.example.filtro_springboot.detalles_ventas.domain.entity;

import java.math.BigDecimal;

import com.example.filtro_springboot.bicicletas.domain.entity.Bicicleta;
import com.example.filtro_springboot.ventas.domain.entity.Venta;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "DETALLE_VENTA")
public class DetallesVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(nullable = false)
    private Integer CANTIDAD;

    @Column(nullable = false,precision = 10, scale = 2)
    private BigDecimal PRECIOUNITARIO;

    @ManyToOne
    @JoinColumn(name = "VENTA_ID", nullable = false)
    private Venta VENTA;

    @ManyToOne
    @JoinColumn(name = "BICICLETA_ID", nullable = false)
    private Bicicleta BICICLETA;

}
