package com.seguranca.trabalho.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seguranca.trabalho.model.Treinamento;
import com.seguranca.trabalho.repository.TreinamentoRepository;

@Service
public class TreinamentoService {
	
	@Autowired
	private TreinamentoRepository repository;
		
	public Treinamento insert(Treinamento treinamento) {
		return repository.save(treinamento);
	}
	
	public Optional<Treinamento> findById(Integer id){
		return repository.findById(id);
	}
	
	public List<Treinamento> findAll() {
		return repository.findAll();
	}
}
