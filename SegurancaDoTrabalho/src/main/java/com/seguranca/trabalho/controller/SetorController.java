package com.seguranca.trabalho.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seguranca.trabalho.model.Setor;
import com.seguranca.trabalho.service.SetorService;
import com.seguranca.trabalho.service.validator.MensagemValidacaoException;

@RestController
@RequestMapping
public class SetorController {
	
	@Autowired
	private SetorService service;
	
	@PostMapping("/setor")
	public Setor save(@Valid @RequestBody Setor setor) throws MensagemValidacaoException {
		return service.Insert(setor);
	}
	
	@GetMapping(value="/setor/{id}")
	public Optional<Setor> findById(@PathVariable("id") Integer id){
		return service.findById(id);
	}
}
