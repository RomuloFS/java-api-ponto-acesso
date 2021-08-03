package com.bootcamp.SistemaDeControleDePonto.repository;

import com.bootcamp.SistemaDeControleDePonto.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
