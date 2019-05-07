package com.seguranca.trabalho.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "FUNCIONARIO")
public class Funcionario {
	 
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	
    @ManyToOne
	@JoinColumn
	public Empresa empresa; //devo colocar @NotEmpty aqui ?
	
    @NotEmpty(message="Preenchimento do Primeiro nome é obrigatório")
    @Column(name = "primeiroNome")
    public String primeiroNome;
	
    @NotEmpty(message="Preenchimento do Segundo nome é obrigatório")
	@Column(name = "segundoNome")
	public String segundoNome;
    
   @NotEmpty(message="Preenchimento do Nome obrigatório") //vai precisar mesmo de primeiro nome, segundo nome e nome?
	@Column(name = "nome")
	public String nome;
    
	@NotEmpty(message="Preenchimento do RG é obrigatório")
	@Length(min=9, max=9, message=" O tamanho do RG deve ser de 9 caracteres")
	@Column(name = "rg")
	public String rg;
	
    @CPF
    @NotEmpty(message="Preenchimento do CPF é obrigatório")
	@Column(name = "cpf")
	public String cpf;
	
    @NotEmpty(message="Preenchimento do Setor é obrigatório")
	@Column(name = "setor")
	public String setor;
	
    @NotEmpty(message="Preenchimento do Cargo é obrigatório")
	@Column(name = "cargo")
	public String cargo;
	
    @NotEmpty(message="Preenchimento do Periodo é  obrigatório")
	@Column(name = "periodo")
	public String periodo;
	
    @NotEmpty(message="Preenchimento do sexo é obrigatório")
	@Column(name = "sexo")
	public String sexo;		
	
	@Column(name = "celular")
	public String celular;
	
	@Column(name = "telefone")
	public String telefone;

    @Email
    @NotEmpty(message="Preenchimento do E-mail obrigatório")
	@Column(name = "email")
	public String email;
	
	@OneToMany(targetEntity=PlanoTrabalho.class, mappedBy="funcionario")
	private List<PlanoTrabalho> planosTrabalho;
	
	@ManyToMany(mappedBy="funcionarios", fetch = FetchType.LAZY)	
	private List<Treinamento> treinamentos;

	public Funcionario() {
		
	}

	public Funcionario(Integer id, Empresa empresa, String nome, String rg,String primeiroNome, String segundoNome, String setor, String cargo ,String periodo,String sexo, String celular,String telefone) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.nome = nome;
		this.rg = rg;
		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
		this.setor = setor;
		this.cargo = cargo;
		this.periodo = periodo;
		this.sexo = sexo;
		this.celular = celular;
		this.telefone = telefone;
	}

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
		Funcionario other = (Funcionario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
	
}