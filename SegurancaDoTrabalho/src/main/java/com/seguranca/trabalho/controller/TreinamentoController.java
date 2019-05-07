package com.seguranca.trabalho.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seguranca.trabalho.model.Treinamento;
import com.seguranca.trabalho.service.TreinamentoService;

@RestController
@RequestMapping(value="/workSecuriry")
public class TreinamentoController {
	
	@Autowired
	private TreinamentoService service;
	
	@PostMapping("/treinamento")
	public Treinamento save(@Valid @ RequestBody Treinamento treinamento) {
		return service.insert(treinamento);
	}
	
	@GetMapping(value="/treinamento/{id}")
	public Optional<Treinamento> findById(@PathVariable("id") Integer id){
		return service.findById(id);
	}
	
	@GetMapping(value="/treinamentos")
	public List<Treinamento> findAll(){
		return service.findAll();
	}
}
