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
	@Column(name = "nomeCompleto")
	public String nomeCompleto;
	
	@NotNull
	@Column(name = "senha")
	public String senha;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}