package com.example.maratona.controller;

import com.example.maratona.entity.Inscricao;
import com.example.maratona.service.IncricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Inscricao")
public class InscricaoController {
    @Autowired
    IncricaoService incricaoService;

    @PostMapping("/cadastrar")
    public Inscricao cadastrarInscricao(@RequestBody Inscricao inscricao){
        return incricaoService.salvarInscricao(inscricao);
    }

}
