package com.example.maratona.service;

import com.example.maratona.entity.Maratona;
import com.example.maratona.repository.MaratonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaratonaService {
    @Autowired
    MaratonaRepository maratonaRepository;

    public Maratona salvarMaratona(Maratona maratona){
       return maratonaRepository.save(maratona);
    }

    public void excluirMaratona(Long id){
        maratonaRepository.deleteById(id);
    }

    public Maratona buscarMaratona(Long id){
        return maratonaRepository.findById(id).orElse(null);
    }

    public Maratona atualizarMaratona(Maratona maratona){
        return maratonaRepository.save(maratona);
    }

}
