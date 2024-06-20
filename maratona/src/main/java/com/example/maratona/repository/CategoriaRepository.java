package com.example.maratona.repository;

import com.example.maratona.entity.Categoria;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long > {

}
