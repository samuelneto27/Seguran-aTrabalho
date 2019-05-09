package com.seguranca.trabalho.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seguranca.trabalho.model.Usuario;
import com.seguranca.trabalho.repository.UsuarioRepository;

@Controller
public class LoginController {

	@Autowired
	UsuarioRepository ur;

	@RequestMapping("loginForm")
	public String loginForm() {
		return "formulario-login";
	}

	@RequestMapping("efetuaLogin")
	public String efetuaLogin(Usuario usuario, HttpSession session) {

		if (ur.findById(usuario.id) != null) {
			System.out.println("Logado Com Sucesso!");
			return "Logado Com Sucesso";
		} else {
			System.out.println("Erro AO Logar");
			return "Erro Ao Logar";
		}

	}

	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:loginForm";
	}

}
