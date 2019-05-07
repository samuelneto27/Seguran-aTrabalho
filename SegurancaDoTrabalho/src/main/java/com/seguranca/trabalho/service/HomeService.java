package com.seguranca.trabalho.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seguranca.trabalho.model.HomeModel;
import com.seguranca.trabalho.repository.HomeRepository;

@Service
@Transactional
public class HomeService {
	
	@Autowired
	private HomeRepository repository;
	
	public HomeModel insert(HomeModel model) {
		return repository.save(model);
	}
	
	public Optional<HomeModel> findById(Long id) {
		return repository.findById(id);
	}

}
