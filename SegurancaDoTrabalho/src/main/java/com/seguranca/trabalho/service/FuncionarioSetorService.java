package com.seguranca.trabalho.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seguranca.trabalho.model.Funcionario;
import com.seguranca.trabalho.repository.FuncionarioSetorRepository;

@Service
@Transactional
public class FuncionarioSetorService {
	
	@Autowired
	private FuncionarioSetorRepository repository;

	
	public List<Funcionario> findFuncionarioByIdEmpresa(Integer id){
		return repository.findFuncionarioByIdEmpresa(id);
	}
	
//	public List<Setor> findSetoroByIdEmpresa(Integer id){
//		return repository.findSetorByIdEmpresa(id);
//		//mudar o repositoy para o do setor
//	}

}
