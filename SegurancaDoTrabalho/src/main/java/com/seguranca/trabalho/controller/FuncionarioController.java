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

import com.seguranca.trabalho.model.Funcionario;
import com.seguranca.trabalho.service.FuncionarioService;
import com.seguranca.trabalho.service.validator.MensagemValidacaoException;

@RestController
@RequestMapping(value="/workSecurity")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService service;
	
	@PostMapping("/funcionario")
	public List<Funcionario> save(@Valid @RequestBody List<Funcionario> funcionarios) throws MensagemValidacaoException {
		return service.insert(funcionarios);
	}
	
	@GetMapping(value="/funcionario/{id}")
	public Optional<Funcionario> findById(@PathVariable("id") Integer id){
		return service.findById(id);
	}
}
