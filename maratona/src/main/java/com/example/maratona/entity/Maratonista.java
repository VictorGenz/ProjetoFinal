package com.example.maratona.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
public class Maratonista {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
    @Size(max= 100, min = 2,message = "Nome inválido")
private String nome;
    @Size (max= 100, min = 2,message = "Tipo sanguineo Invalido")
private String gruposanguineo;
    @Max(50)
    @Min(value = 0)
private int idade;
    @Size(max= 100, min = 2,message = "numeroCLL inválido")
private String numeroCelular;
    @Size(max= 100, min = 2,message = "numeroEME inválido")
private String numeroEmergencia;
    @Size(max= 100, min = 2,message = "RG inválido")
private String rg;
    @Size(max= 100, min = 2,message = "Sobrenome inválido")
private String sobrenome;

@OneToMany (mappedBy = "maratonista")
    private List<Inscricao> inscricoes;
}
