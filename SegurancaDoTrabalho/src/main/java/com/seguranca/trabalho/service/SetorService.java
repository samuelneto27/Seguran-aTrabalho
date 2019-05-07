package com.seguranca.trabalho.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seguranca.trabalho.model.Setor;
import com.seguranca.trabalho.repository.SetorRepository;
import com.seguranca.trabalho.service.validator.MensagemValidacaoException;
import com.seguranca.trabalho.service.validator.SetorValidador;

@Service
public class SetorService {
	
	@Autowired
	private SetorRepository repository;
	
	public Setor Insert(Setor setor) throws MensagemValidacaoException {
		
		SetorValidador.getSetor(setor);
		
		return repository.save(setor);
	}
	
	public Optional<Setor> findById(Integer id){
		return repository.findById(id);
	}
	
	public List<Setor> findAll(){
		return repository.findAll();
	}

}
