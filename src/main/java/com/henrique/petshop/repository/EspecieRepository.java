package com.henrique.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.henrique.petshop.domain.Especie;

@Repository
public interface EspecieRepository extends JpaRepository<Especie, Integer> {
}
