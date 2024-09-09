package com.example.filtro_springboot.clientes.domain.entity;

import com.example.filtro_springboot.ciudades.domain.entity.Ciudad;

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
@Table(name = "CLIENTE")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(length = 100, nullable = false)
    private String NOMBRE;

    @Column(length = 100, nullable = false)
    private String EMAIL;

    @Column(nullable = false)
    private Long TELEFONO;

    @Column(length = 100, nullable = false)
    private String PASSWORD;

    @ManyToOne
    @JoinColumn(name = "CIUDAD_ID", nullable = false)
    private Ciudad CIUDAD;
}

