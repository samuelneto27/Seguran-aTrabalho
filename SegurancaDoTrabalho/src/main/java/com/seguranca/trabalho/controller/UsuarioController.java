package com.seguranca.trabalho.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.seguranca.trabalho.model.Usuario;
import com.seguranca.trabalho.service.UsuarioService;
import com.seguranca.trabalho.service.validator.MensagemValidacaoException;


@RestController
@RequestMapping(value="/workSecutiry")
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	@PostMapping("/usuario")
	public Usuario save(@Valid @RequestBody Usuario usuario) throws MensagemValidacaoException {
		return service.insert(usuario);
	}
	
	
	
}