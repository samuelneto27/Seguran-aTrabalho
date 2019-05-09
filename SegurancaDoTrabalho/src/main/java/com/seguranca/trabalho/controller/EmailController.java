package com.seguranca.trabalho.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seguranca.trabalho.mail.Mailer;
import com.seguranca.trabalho.mail.Mensagem;
import com.seguranca.trabalho.mail.SpringEmailMain;
import com.seguranca.trabalho.model.Usuario;
import com.seguranca.trabalho.service.UsuarioService;

@RestController
@RequestMapping(value = "/workSecurity")
public class EmailController {

	@Autowired
	private UsuarioService service;

	@GetMapping(value = "/usuario/{email}")
	public Usuario findByEmail(@PathVariable("email") String email) {

		Usuario usuario = service.findByEmail(email);
		this.enviarEmail(email, usuario);

		return usuario;


	}

	public void enviarEmail(String email, Usuario u) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringEmailMain.class.getPackage().getName());
//u = new Usuario();
		//System.out.println("Email: " + email);

		//System.out.println("Senha: " + u.senha);
		
		
		Mailer mailer = applicationContext.getBean(Mailer.class);
		mailer.enviar(new Mensagem("FSL Segurança do Trabalho <fslsegtrabalho@gmail.com>", Arrays.asList(email),
				"Teste de Envio de e-mail", "Sua senha é: " + u.senha));

		applicationContext.close();

		System.out.println("E-MAIL ENVIADO!");
	}

}
