package com.henrique.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.henrique.petshop.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
