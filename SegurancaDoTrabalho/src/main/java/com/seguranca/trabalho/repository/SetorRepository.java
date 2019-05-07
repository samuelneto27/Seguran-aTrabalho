package com.seguranca.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seguranca.trabalho.model.Setor;

@Repository
public interface SetorRepository extends JpaRepository<Setor,Integer>{

}
