package com.seguranca.trabalho.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.seguranca.trabalho.model.Funcionario;
import com.seguranca.trabalho.model.Setor;

public interface FuncionarioSetorRepository extends JpaRepository<Funcionario,Integer> {
	
	
	@Query(value = "SELECT * FROM funcionario f WHERE f.id_empresa_id = :idempresa",
			nativeQuery = true
			
	)
	List<Funcionario> findFuncionarioByIdEmpresa(@Param("idempresa") Integer idEmpresa);
	
	
	@Query(value = "SELECT * FROM setor f WHERE f.id_empresa_id = :idempresa",
			nativeQuery = true
	)
	
	List<Setor> findSetorByIdEmpresa(@Param("idempresa") Integer idEmpresa);
}
