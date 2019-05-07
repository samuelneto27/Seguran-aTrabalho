package com.seguranca.trabalho.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seguranca.trabalho.model.PlanoTrabalho;
import com.seguranca.trabalho.repository.PlanoTrabalhoRepository;
import com.seguranca.trabalho.service.validator.MensagemValidacaoException;
import com.seguranca.trabalho.service.validator.PlanoTrabalhoValidador;

@Service
@Transactional
public class PlanoTrabalhoService {

	@Autowired
	private PlanoTrabalhoRepository repository;
	
	public PlanoTrabalho insert(PlanoTrabalho planoTrabalho) throws MensagemValidacaoException {
		
		PlanoTrabalhoValidador.getPlanoTrabalho(planoTrabalho);
		
		return repository.save(planoTrabalho);
	}
	
	public Optional<PlanoTrabalho> findById(Integer id){
		return repository.findById(id);
	}
}
