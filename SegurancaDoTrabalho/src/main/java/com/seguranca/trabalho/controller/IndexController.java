package com.seguranca.trabalho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index() {
		return "BemVindo fulano";
	}
	
	@RequestMapping("/t")
	public String indexa() {
		return "Usuario Antenticado";
	}

}
