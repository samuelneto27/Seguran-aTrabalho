package com.seguranca.trabalho.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "USUARIO")
public class Usuario{
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	
	@NotNull
	@Column(name = "email")
	public String email;
	
	@NotNull
	@Column(name = "primeiroNome")
	public String primeiroNome;
	
	@NotNull
	@Column(name = "segundoNome")
	public String segundoNome;
	
	@NotNull
	@Column(name = "cpf")
	public String cpf;
	
	@NotNull
	@Column(name = "rg")
	public String rg;
	
	@NotNull
	@Column(name = "celular")
	public String celular;
	
	@NotNull
	@Column(name = "senha")
	public String senha;

	
	
}