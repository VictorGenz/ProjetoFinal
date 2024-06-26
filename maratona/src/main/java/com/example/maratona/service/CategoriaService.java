package com.example.maratona.service;

import com.example.maratona.entity.Categoria;
import com.example.maratona.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;

public Categoria salvarCategoria(Categoria categoria) {
    return categoriaRepository.save(categoria);
}

}
