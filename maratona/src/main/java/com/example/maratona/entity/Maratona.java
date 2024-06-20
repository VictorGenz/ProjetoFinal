package com.example.maratona.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Maratona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Size (max= 100, min = 2,message = "Nome inválido")
    private String nome;
    @OneToMany(mappedBy = "maratona")
    private List<Circuito> circuitos;
}
