package com.example.filtro_springboot.bicicletas.infraestructure;

import org.springframework.web.bind.annotation.RestController;

import com.example.filtro_springboot.bicicletas.domain.entity.Bicicleta;
import com.example.filtro_springboot.bicicletas.domain.service.BicicletaService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping(path = "api/v1/BICICLETA")
public class BicicletaController {

    @Autowired
    private BicicletaService bicicletaService;

    @GetMapping
    public List<Bicicleta> getAll(){
        return bicicletaService.getBicicletas();
    }

    @PostMapping
    public void saveUpdate(@RequestBody Bicicleta bicicleta) {
        bicicletaService.saveOrUpdate(bicicleta);
    }

    @DeleteMapping("/{BICICLETAID}")
    public void delete(@PathVariable("BICICLETAID") Long bicicletaId) {
        bicicletaService.delete(bicicletaId);
    }
    
    @GetMapping("/{BICICLETAID}")
    public Optional<Bicicleta> getById(@PathVariable("BICICLETAID") Long objectId) {
        return bicicletaService.getBicicletas(objectId);
    }
}

