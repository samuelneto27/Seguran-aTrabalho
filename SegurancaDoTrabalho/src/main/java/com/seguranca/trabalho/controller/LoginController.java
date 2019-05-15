package com.seguranca.trabalho.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seguranca.trabalho.model.Usuario;
import com.seguranca.trabalho.repository.UsuarioRepository;

@RestController
@RequestMapping(value = "/workSecurity/login")
public class LoginController {

	@Autowired
	UsuarioRepository ur;

	@RequestMapping("/loginForm") 
	public String loginForm() {
		return "formulario-login";
	}

	@PostMapping("/efetuaLogin")
	public boolean efetuaLogin(@Valid @RequestBody Usuario usuario) {

		if (!ur.checkLogin(usuario.email,usuario.senha).isEmpty()) {
			System.out.println("Logado Com Sucesso!");
			return true;
		} else {
			System.out.println("Erro AO Logar");
			return false;
		}
		

	}

	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:loginForm";
	}

}
