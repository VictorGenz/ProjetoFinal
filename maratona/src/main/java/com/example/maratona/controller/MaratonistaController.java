package com.example.maratona.controller;

import com.example.maratona.entity.Maratonista;
import com.example.maratona.service.MaratonaService;
import com.example.maratona.service.MaratonistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Maratonista")
public class MaratonistaController {
    @Autowired
    MaratonistaService maratonistaService;

    @PostMapping("/cadastrar")
    public Maratonista cadastrarMaratonista(@RequestBody Maratonista maratonista){
        return maratonistaService.salvarMaratonista(maratonista);
    }

}
