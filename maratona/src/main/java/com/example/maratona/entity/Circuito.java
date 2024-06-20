package com.example.maratona.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Circuito {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
@Min(value = 0)
@Max(value = 10000)
    private int distancia;

    private Categoria categoria;
@ManyToOne
    private Inscricao inscricoes;
@ManyToOne
private Maratona maratona;
}
