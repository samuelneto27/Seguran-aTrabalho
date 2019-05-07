package com.seguranca.trabalho.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.seguranca.trabalho.model.HomeModel;
import com.seguranca.trabalho.service.HomeService;

@RestController
@RequestMapping(value="/workSecutiry")
public class Homecontroller {
		
	@Autowired
	private HomeService service;
	
	@PostMapping("/HomeModel")
	public HomeModel save(@Valid @RequestBody HomeModel model) {
		
		return service.insert(model);
	}
	
	@RequestMapping(value = "/home/{id}", method = RequestMethod.GET)
	public Optional<HomeModel> findById(@PathVariable("id")Long id) {
		return service.findById(id);
	}	
	
}
