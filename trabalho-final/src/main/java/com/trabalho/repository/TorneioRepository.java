package com.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.model.Torneio;

@Repository
public interface TorneioRepository extends JpaRepository<Torneio, Long> {

}
