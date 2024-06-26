package com.example.maratona.service;

import com.example.maratona.entity.Circuito;
import com.example.maratona.repository.CircuitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CircuitoService {
    @Autowired
    CircuitoRepository circuitoRepository;
public Circuito salvarCircuito(Circuito circuito) {
    return circuitoRepository.save(circuito);
}
}
