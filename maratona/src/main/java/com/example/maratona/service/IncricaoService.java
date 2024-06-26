package com.example.maratona.service;

import com.example.maratona.entity.Inscricao;
import com.example.maratona.repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncricaoService {
    @Autowired
    InscricaoRepository inscricaoRepository;

    public Inscricao salvarInscricao(Inscricao inscricao){
        return inscricaoRepository.save(inscricao);
    }

}
