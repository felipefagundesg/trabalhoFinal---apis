package com.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.model.Transferencias;

@Repository
public interface TransferenciasRepository extends JpaRepository<Transferencias, Long> {

}
