package com.example.maratona.service;

import com.example.maratona.entity.Maratonista;
import com.example.maratona.repository.MaratonistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaratonistaService {
    @Autowired
    MaratonistaRepository maratonistaRepository;

    public Maratonista salvarMaratonista(Maratonista maratonista){
        return maratonistaRepository.save(maratonista);
    }
}
