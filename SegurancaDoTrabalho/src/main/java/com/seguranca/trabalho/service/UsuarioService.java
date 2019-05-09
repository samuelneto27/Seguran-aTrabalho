package com.seguranca.trabalho.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seguranca.trabalho.model.Usuario;
import com.seguranca.trabalho.repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioService { 
	@Autowired 
	private UsuarioRepository repository;

	public Usuario insert(@Valid Usuario usuario) {
		return repository.save(usuario);
	}
	
	public Usuario findByEmail(String email) {
		return repository.findByEmail(email);
	}

}
