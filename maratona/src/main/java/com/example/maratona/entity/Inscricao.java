package com.example.maratona.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Inscricao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Min(value = 0)
    @Max(value = 2800)
    private Double valorInscricao;

     @ManyToOne
    private Maratonista maratonista;
    @ManyToOne
     private Circuito circuito;
}
