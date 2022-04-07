package com.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.model.Time;

@Repository
public interface TimeRepository extends JpaRepository<Time, Long> {

}
