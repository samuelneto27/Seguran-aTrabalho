package com.seguranca.trabalho.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "PESSOA")
public class HomeModel{
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	public String nome;
	
	@Column(name = "cnpj")
	public String cnpj;
	
	@Column(name = "razaoSocial")
	public String razaoSocial;
	
}
