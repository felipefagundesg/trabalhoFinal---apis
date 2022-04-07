package com.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.model.Partidas;

@Repository
public interface PartidasRepository extends JpaRepository<Partidas, Long> {

}
