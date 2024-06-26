package com.example.maratona.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity

public enum Categoria{
    PEQUENO, MEDIO, AVANCADO;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  id;
    }

