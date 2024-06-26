package com.example.maratona.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder

public enum Categoria{
    PEQUENO, MEDIO, AVANCADO
    }

