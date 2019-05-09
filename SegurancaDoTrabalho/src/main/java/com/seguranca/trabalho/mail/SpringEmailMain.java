package com.seguranca.trabalho.mail;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEmailMain {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringEmailMain.class.getPackage().getName());
		
		Mailer mailer = applicationContext.getBean(Mailer.class);
		mailer.enviar(new Mensagem("FSL Segurança do Trabalho <fslsegtrabalho@gmail.com>",
				Arrays.asList("Samuel Neto <samudemolay27@gmail.com>"),
				"Teste de Envio de e-mail",
				"Sua senha é: Fuck!"));
		
		applicationContext.close();
		
		System.out.println("E-MAIL ENVIADO!");
			
		
	}

}
