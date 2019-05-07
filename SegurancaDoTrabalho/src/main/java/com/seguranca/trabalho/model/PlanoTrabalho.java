package com.seguranca.trabalho.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PLANO_TRABALHO")
public class PlanoTrabalho {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	
	@NotEmpty(message="Preenchimento do campo de grupo de risco é obrigatório")
	@Column(name = "grupoRisco",nullable = false)
	public String grupoRisco;
	
	@NotEmpty(message="Preenchimento do campo de risco é obrigatório")
	@Column(name = "risco",nullable = false)
	public String risco;
	 
	@NotEmpty(message="Preenchimento do campo de setor é obrigatório")
	@Column(name = "setor",nullable = false)
	public String setor;

	@NotEmpty(message="Preenchimento do campo de estratégia é obrigatório")
	@Column(name = "estrategia")
	public String estrategia;
	
	@NotEmpty(message="Preenchimento do campo de responsavel é obrigatório")
	@Column(name = "responsavel",nullable = false)
	public String responsavel;
	
	@NotEmpty(message="Preenchimento do campo de data inicial é obrigatório")
	@Column(name = "dataInicial",nullable = false)
	public String dataInicial;
	
	@NotEmpty(message="Preenchimento do campo de data final é obrigatório")
	@Column(name = "dataFinal",nullable = false)
	public String dataFinal;
		
	@ManyToOne
	@JoinColumn(name="id_Funcionario")
	private Funcionario funcionario;

	@ManyToOne
	@JoinColumn(name="id_Empresa")
	public Empresa empresa;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataFinal == null) ? 0 : dataFinal.hashCode());
		result = prime * result + ((dataInicial == null) ? 0 : dataInicial.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((estrategia == null) ? 0 : estrategia.hashCode());
		result = prime * result + ((funcionario == null) ? 0 : funcionario.hashCode());
		result = prime * result + ((grupoRisco == null) ? 0 : grupoRisco.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((responsavel == null) ? 0 : responsavel.hashCode());
		result = prime * result + ((risco == null) ? 0 : risco.hashCode());
		result = prime * result + ((setor == null) ? 0 : setor.hashCode());
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
		PlanoTrabalho other = (PlanoTrabalho) obj;
		if (dataFinal == null) {
			if (other.dataFinal != null)
				return false;
		} else if (!dataFinal.equals(other.dataFinal))
			return false;
		if (dataInicial == null) {
			if (other.dataInicial != null)
				return false;
		} else if (!dataInicial.equals(other.dataInicial))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (estrategia == null) {
			if (other.estrategia != null)
				return false;
		} else if (!estrategia.equals(other.estrategia))
			return false;
		if (funcionario == null) {
			if (other.funcionario != null)
				return false;
		} else if (!funcionario.equals(other.funcionario))
			return false;
		if (grupoRisco == null) {
			if (other.grupoRisco != null)
				return false;
		} else if (!grupoRisco.equals(other.grupoRisco))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (responsavel == null) {
			if (other.responsavel != null)
				return false;
		} else if (!responsavel.equals(other.responsavel))
			return false;
		if (risco == null) {
			if (other.risco != null)
				return false;
		} else if (!risco.equals(other.risco))
			return false;
		if (setor == null) {
			if (other.setor != null)
				return false;
		} else if (!setor.equals(other.setor))
			return false;
		return true;
	}
}
