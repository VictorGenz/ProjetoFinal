package com.example.maratona.controller;

import com.example.maratona.entity.Circuito;
import com.example.maratona.service.CircuitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Circuito")
public class CircuitoController {
    @Autowired
    CircuitoService circuitoService;

    @PostMapping("/cadastrar")
    public Circuito cadastrarCircuito(@RequestBody Circuito circuito){
        return circuitoService.salvarCircuito(circuito);
    }
}
