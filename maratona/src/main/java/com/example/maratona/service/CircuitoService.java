package com.example.maratona.service;

import com.example.maratona.entity.Circuito;
import com.example.maratona.repository.CircuitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class CircuitoService {
    @Autowired
    CircuitoRepository circuitoRepository;
public Circuito salvarCircuito(Circuito circuito) {
    return circuitoRepository.save(circuito);
}

public void excluirCircuito(Long id) {
    circuitoRepository.deleteById(id);
}

public Circuito buscarCircuito(Long id) {
return circuitoRepository.findById(id).orElse(null);
}

public Circuito atualizarCircuito(Circuito circuito) {
    return circuitoRepository.save(circuito);
}

}
