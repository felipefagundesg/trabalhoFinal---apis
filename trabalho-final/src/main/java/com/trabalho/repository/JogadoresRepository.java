package com.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.model.Jogadores;

@Repository
public interface JogadoresRepository extends JpaRepository<Jogadores, Long> {

}
