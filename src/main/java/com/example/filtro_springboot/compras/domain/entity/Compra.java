package com.example.filtro_springboot.compras.domain.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.example.filtro_springboot.proveedores.domain.entity.Proveedor;

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
@Table(name = "COMPRA")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(nullable = false)
    private Date FECHA;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal TOTAL;

    @ManyToOne
    @JoinColumn(name = "PROVEEDOR_ID", nullable = false)
    private Proveedor PROVEEDOR;
}

