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

import com.seguranca.trabalho.model.Empresa;
import com.seguranca.trabalho.service.EmpresaService;
import com.seguranca.trabalho.service.validator.MensagemValidacaoException;

@RestController
@RequestMapping
public class EmpresaController {

	@Autowired
	private EmpresaService service;
	
	@PostMapping("/empresa")
	public Empresa save(@Valid @RequestBody Empresa empresa) throws MensagemValidacaoException {
		// ver se temos que colocar o if com haserros
		return service.insert(empresa);
	}
	
	@GetMapping(value="/empresa/{id}")
	public Optional<Empresa> findById(@PathVariable("id")Integer id){
		return service.findById(id);
	}
	
	@GetMapping(value = "/empresas")
	public List<Empresa> findAll() {
		return service.findAll();
	}
}
