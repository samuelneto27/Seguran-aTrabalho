package com.seguranca.trabalho.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "TREINAMENTO")
public class Treinamento{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	
	@Column(name = "responsavel",nullable = false)
	public String responsavel;
	
	@Column(name = "dataInicial",nullable = false)
	public LocalDate dataInicial;
	 
	@Column(name = "dataFinal",nullable = false)
	public LocalDate dataFinal;	
	
	@ManyToOne
	@JoinColumn(name="id_empresa")
	public Empresa empresa;
	
	@ManyToMany
	@JoinTable(name="treinamento_funcionario", 
	joinColumns = @JoinColumn(name="id_treinamento"),
	inverseJoinColumns = @JoinColumn(name="id_funcionario"))
	@JsonIgnoreProperties("treinamentos")
	public List<Funcionario> funcionarios;
	
	public Treinamento() {
		this.funcionarios = new ArrayList<>();
	}
	
	public List<Funcionario> getFuncionarios() { return funcionarios; }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Treinamento other = (Treinamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	

}