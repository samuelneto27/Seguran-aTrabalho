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

import com.seguranca.trabalho.model.PlanoTrabalho;
import com.seguranca.trabalho.service.PlanoTrabalhoService;
import com.seguranca.trabalho.service.validator.MensagemValidacaoException;

@RestController
@RequestMapping(value="/workSecuriry")
public class PlanotrabalhoController {
	
	@Autowired
	private PlanoTrabalhoService service;
	
	@PostMapping("/planoTrabalho")
	public PlanoTrabalho save(@Valid @ RequestBody PlanoTrabalho planoTrabalho ) throws MensagemValidacaoException {
		return service.insert(planoTrabalho);
	}
	
	@GetMapping(value="/planoTrabalho/{id}")
	public Optional<PlanoTrabalho> findById(@PathVariable("id") Integer id){
		return service.findById(id);
	}
}
