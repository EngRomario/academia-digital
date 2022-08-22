package com.projectee.academiadigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectee.academiadigital.entity.AvaliacaoFisica;

@Repository
public interface AvalicaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Long>{

}
