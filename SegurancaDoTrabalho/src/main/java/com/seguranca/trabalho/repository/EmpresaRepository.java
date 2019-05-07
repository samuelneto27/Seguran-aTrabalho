package com.seguranca.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seguranca.trabalho.model.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa,Integer>{

}
