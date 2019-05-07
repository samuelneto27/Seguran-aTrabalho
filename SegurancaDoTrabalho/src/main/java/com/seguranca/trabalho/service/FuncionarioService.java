package com.seguranca.trabalho.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityExistsException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seguranca.trabalho.model.Funcionario;
import com.seguranca.trabalho.repository.FuncionarioRepository;
import com.seguranca.trabalho.service.validator.FuncionarioValidator;
import com.seguranca.trabalho.service.validator.MensagemValidacaoException;

@Service
@Transactional
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository repository;

	public List<Funcionario> insert(List<Funcionario> listfuncionario) throws MensagemValidacaoException {

		FuncionarioValidator.getFuncionario(listfuncionario);
		
		return repository.saveAll(listfuncionario);

	}

	public Funcionario update(Funcionario funcionario) {
		if (funcionario.id != null && repository.existsById(funcionario.id)) {
			throw new EntityExistsException("Mensagem");
		}
		return repository.save(funcionario);
	}

	public Optional<Funcionario> findById(Integer id) {
		return repository.findById(id);
	}

	public List<Funcionario> findAll() {
		return repository.findAll();
	}

	public void delete(Funcionario funcionario) {
		repository.delete(funcionario);
	}
}
