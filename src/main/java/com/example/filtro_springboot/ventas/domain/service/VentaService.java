package com.example.filtro_springboot.ventas.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.filtro_springboot.ventas.application.VentaRepository;
import com.example.filtro_springboot.ventas.domain.entity.Venta;

@Service
public class VentaService {
    @Autowired
    VentaRepository ventaRepository;

    public List<Venta> getVentas(){
        return ventaRepository.findAll();
    }

    public void saveOrUpdate(Venta venta){
        ventaRepository.save(venta);
    }

    public Optional<Venta> getVenta(Long id){
        return ventaRepository.findById(id);
    }
    
    public void delete(Long id){
        ventaRepository.deleteById(id);
    }
}
