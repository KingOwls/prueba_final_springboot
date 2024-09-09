package com.example.filtro_springboot.repuestos.domain.entity;

import java.math.BigDecimal;

import com.example.filtro_springboot.marca.domain.entity.Marca;
import com.example.filtro_springboot.modelo.domain.entity.Modelo;
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
@Table(name = "REPUESTO")
public class Repuesto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(length = 100, nullable = false)
    private String NOMBRE;

    @Column(length = 200)
    private String DESCRIPCION;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal PRECIO;

    @Column(nullable = false)
    private Integer STOCK;

    @ManyToOne
    @JoinColumn(name = "PROVEEDOR_ID", nullable = false)
    private Proveedor PROVEEDOR;

    @ManyToOne
    @JoinColumn(name = "MODELO_ID", nullable = false)
    private Modelo MODELO;

    @ManyToOne
    @JoinColumn(name = "MARCA_ID", nullable = false)
    private Marca MARCA;

}


