package com.example.maratona.controller;

import com.example.maratona.entity.Categoria;
import com.example.maratona.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Categoria")
public class CategoriaController {
@Autowired
    CategoriaService categoriaService;

@PostMapping("/cadastrar")
    public Categoria cadastrarCategoria(@RequestBody Categoria categoria){
    return categoriaService.salvarCategoria(categoria);
}

}
