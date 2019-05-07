package com.seguranca.trabalho.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seguranca.trabalho.model.Empresa;
import com.seguranca.trabalho.repository.EmpresaRepository;
import com.seguranca.trabalho.service.validator.EmpresaValidator;
import com.seguranca.trabalho.service.validator.MensagemValidacaoException;

@Service
@Transactional
public class EmpresaService {

	@Autowired
	private EmpresaRepository repository;

	public Empresa insert(Empresa empresa) throws MensagemValidacaoException {

		EmpresaValidator.getEmpresa(empresa);

		return repository.save(empresa);

	}

	public Optional<Empresa> findById(Integer id) {
		return repository.findById(id);
	}

	public List<Empresa> findAll() {
		return repository.findAll();
	}
}
