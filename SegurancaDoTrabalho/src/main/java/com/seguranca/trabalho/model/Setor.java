package com.seguranca.trabalho.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SETOR")
public class Setor {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public int id;
	
	@Column(name = "nome")
	public String nome;
	
	@ManyToOne
	@JoinColumn(name="id_empresa")
	public Empresa empresa;

}
