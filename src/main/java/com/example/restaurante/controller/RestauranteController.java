package com.example.restaurante.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurante.exceptions.RestauranteSalvarException;
import com.example.restaurante.model.domain.Restaurante;
import com.example.restaurante.repository.RestauranteRepository;
import com.example.restaurante.service.RestauranteService;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {

    @Autowired
    private RestauranteService restauranteService;


    @PostMapping
    public Restaurante salvar(@Valid @RequestBody Restaurante restaurante) throws RestauranteSalvarException {
        return restauranteService.salvarRestaurante(restaurante);
    }

                            //TESTANDO O GIT GALERA, TESTE TBM E ESCREVA ABAIXO COM O NOME - BRENDO
                            // TESTANDO 2
                            //fsfefs
                            //fdfsfs iiiiiiiiiiiiii

    @GetMapping
    public List<Restaurante> listar() {
        return restauranteService.listarRestaurantes();
    }

}