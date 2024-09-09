package com.example.filtro_springboot.ciudades.domain.entity;

import com.example.filtro_springboot.paises.domain.entity.Pais;

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
@Table(name = "CIUDAD")
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(length = 100, nullable = false)
    private String NOMBRE;

    @ManyToOne
    @JoinColumn(name = "PAIS_ID", nullable = false)
    private Pais PAIS;
}
