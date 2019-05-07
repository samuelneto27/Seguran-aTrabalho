package com.seguranca.trabalho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seguranca.trabalho.model.FuncionarioSetorVO;
import com.seguranca.trabalho.service.FuncionarioSetorService;

@RestController
@RequestMapping(value = "workSecutiry")
public class FuncSetorVoController {

	@Autowired
	private FuncionarioSetorService service;

	@GetMapping(value = "/funcionariosetor/{idEmpresa}")
	public FuncionarioSetorVO getFuncionarioSetor(@PathVariable("idEmpresa") Integer idEmpresa) {

		FuncionarioSetorVO vo = new FuncionarioSetorVO();

		vo.listFuncionario = service.findFuncionarioByIdEmpresa(idEmpresa);

		return vo;

	}

}
