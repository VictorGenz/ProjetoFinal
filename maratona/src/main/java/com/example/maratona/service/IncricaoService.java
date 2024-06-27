package com.example.maratona.service;

import com.example.maratona.entity.Circuito;
import com.example.maratona.entity.Inscricao;
import com.example.maratona.entity.Maratonista;
import com.example.maratona.repository.CircuitoRepository;
import com.example.maratona.repository.InscricaoRepository;
import com.example.maratona.repository.MaratonistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.maratona.entity.Categoria.MEDIO;
import static com.example.maratona.entity.Categoria.PEQUENO;

@Service
public class IncricaoService {
    @Autowired
    InscricaoRepository inscricaoRepository;
    @Autowired
    MaratonistaRepository maratonistaRepository;
    @Autowired
    CircuitoRepository circuitoRepository;

    public Inscricao salvarInscricao(Inscricao inscricao){
        return inscricaoRepository.save(inscricao);
    }

    public void excluirInscricao(Long id){
        inscricaoRepository.deleteById(id);
    }

    public Inscricao buscarInscricao(Long id){
        return inscricaoRepository.findById(id).orElse(null);
    }

    public Inscricao atualizarInscricao(Inscricao inscricao){
        return inscricaoRepository.save(inscricao);
    }
    public Inscricao criarInscricao(Inscricao inscricao)throws Exception{
        Double valorInscricao = calcularValorInscricao(inscricao);
        if(valorInscricao == inscricao.getValorInscricao()){
        inscricao.setValorInscricao(valorInscricao);
        return inscricaoRepository.save(inscricao);
        }else{
            throw new Exception("Valor de inscricao incorreto");
        }
    }




    private double calcularValorInscricao(Inscricao inscricao) throws Exception {
        Maratonista maratonista = maratonistaRepository.findById(inscricao.getMaratonista().getId()).get();
        Circuito circuito = circuitoRepository.findById(inscricao.getCircuito().getId()).get();
        if (maratonista.getIdade() < 18) {
            switch (circuito.getCategoria()) {
                case PEQUENO:
                    return 1300;
                case MEDIO:
                    return 2000.0;
                default:
                    throw new Exception("Não é permitido fazer inscrição para menores nesta categoria");
            }
        } else {
            switch (circuito.getCategoria()) {
                case PEQUENO:
                    return 1500;
                case MEDIO:
                    return 2300.0;
                default:
                    return 2800.0;
            }
}

}
