package com.seguranca.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seguranca.trabalho.model.Treinamento;

@Repository
public interface TreinamentoRepository extends JpaRepository<Treinamento,Integer>{

}
