package com.example.filtro_springboot.detalles_compras.domain.entity;

import java.math.BigDecimal;

import com.example.filtro_springboot.compras.domain.entity.Compra;
import com.example.filtro_springboot.repuestos.domain.entity.Repuesto;

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
@Table(name = "DETALLE_COMPRA")
public class DetallesCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(nullable = false)
    private Integer CANTIDAD;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal PRECIOUNITARIO;

    @ManyToOne
    @JoinColumn(name = "COMPRA_ID", nullable = false)
    private Compra COMPRA;

    @ManyToOne
    @JoinColumn(name = "REPUESTO_ID", nullable = false)
    private Repuesto REPUESTO;
}
