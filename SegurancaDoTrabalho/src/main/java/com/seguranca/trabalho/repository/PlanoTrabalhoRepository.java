package com.seguranca.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seguranca.trabalho.model.PlanoTrabalho;

@Repository
public interface PlanoTrabalhoRepository extends JpaRepository<PlanoTrabalho, Integer> {

}
